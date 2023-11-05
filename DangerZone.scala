import scala.collection.mutable.ListBuffer
import scala.scalanative.unsafe.*
import scala.scalanative.runtime.libc
import scala.scalanative.runtime.Intrinsics

class DangerZone private (private val ar: ListBuffer[Ptr[Byte]]) extends Zone:
  private var closed = false
  override def alloc(size: CSize): Ptr[Byte] =
    if closed then null
    else
      val ptr = scalanative.runtime.fromRawPtr[Byte](libc.malloc(size))
      ar.addOne(ptr)
      ptr

  override def close(): Unit = closed = true
  override def isClosed: Boolean = closed

object DangerZone:
  // Location of the Zone from the internal map 
  opaque type Token = Int
  object Token:
    given Tag[Token] = Tag.Int

    def fromPtr(ptr: Ptr[Byte]): Token =
      Intrinsics.castRawPtrToInt(scalanative.runtime.toRawPtr(ptr))

    extension (inline t: Token)
      inline def toPtr: Ptr[Byte] =
        scalanative.runtime.fromRawPtr[Byte](Intrinsics.castIntToRawPtr(t))

  private var curIdx = 0
  private val chains = collection.mutable.Map.empty[Int, DangerZone]

  def use[A](tok: Ptr[Token])(f: DangerZone ?=> A): A =
    val (buffer, token) = chains.synchronized:
      val newBuf = DangerZone(ListBuffer.empty[Ptr[Byte]])
      if chains.isEmpty then curIdx = 0
      chains.update(curIdx, newBuf)
      curIdx += 1
      (newBuf, curIdx - 1)

    !tok = token

    f(using buffer)

  def free(tok: Token) =
    chains.synchronized:
      if chains.contains(tok) then
        val chain = chains(tok)
        chain.ar.reverse.foreach(ptr =>
          libc.free(scalanative.runtime.toRawPtr(ptr))
        )
        chains.remove(tok)
        chain.close()
