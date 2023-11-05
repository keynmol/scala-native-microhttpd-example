//> using platform scala-native
//> using dep com.lihaoyi::upickle::3.1.3

import microhttpd.all.*
import scalanative.unsigned.*
import scalanative.unsafe.*
import microhttpd.aliases.MHD_AccessHandlerCallback
import scala.scalanative.runtime.libc
import scala.io.StdIn
import util.chaining.*
import scala.scalanative.runtime.Intrinsics
import scala.collection.mutable.ListBuffer
import upickle.default.{ReadWriter, write}
import microhttpd.aliases.MHD_ContentReaderFreeCallback

case class GreetUser(name: String) derives ReadWriter
case class Error(msg: String) derives ReadWriter

@main def hello =
  val handler = MHD_AccessHandlerCallback {
    (
        cls: Ptr[Byte],
        connection: Ptr[MHD_Connection],
        url: CString,
        method: CString,
        version: CString,
        uploadData: CString,
        uploadSize: Ptr[size_t],
        connCls: Ptr[Ptr[Byte]]
    ) =>
      val (code, response) =
        Option(
          MHD_lookup_connection_value(
            connection,
            MHD_ValueKind.MHD_GET_ARGUMENT_KIND,
            c"name"
          )
        ).map(fromCString(_)) match
          case Some(name) =>
            createJsonResponse(GreetUser(name), 200)

          case None =>
            createJsonResponse(
              Error("missing ?name query parameter"),
              400
            )

      val ret = MHD_queue_response(connection, code.toUInt, response);
      MHD_destroy_response(response)

      ret
  }

  val daemon = MHD_start_daemon(
    MHD_FLAG.MHD_USE_INTERNAL_POLLING_THREAD.uint,
    uint16_t(8888.toUShort),
    null.asInstanceOf,
    null,
    handler,
    null,
    MHD_OPTION.MHD_OPTION_END
  )

  if daemon == null then sys.error("server fucked up")
  else
    println("Server is ready at http://localhost:8888")

    StdIn.readLine()

    MHD_stop_daemon(daemon)

def createJsonResponse[A: upickle.default.Writer](page: A, code: Int) =
  val tok = stackalloc[DangerZone.Token]()

  DangerZone.use(tok):
    val buffer =
      toCString(write(page))

    val response = MHD_create_response_from_buffer_with_free_callback_cls(
      libc.strlen(buffer),
      buffer,
      MHD_ContentReaderFreeCallback { (bytes: Ptr[Byte]) =>
        DangerZone.free(DangerZone.Token.fromPtr(bytes))
      },
      (!tok).toPtr
    )

    MHD_add_response_header(response, c"Content-type", c"application/json")

    code -> response
