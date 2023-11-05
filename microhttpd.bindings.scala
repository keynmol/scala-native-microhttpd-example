package microhttpd

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object predef:
  private[microhttpd] trait CEnumU[T](using eq: T =:= UInt):
    given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
    extension (inline t: T)
      inline def int: CInt = eq.apply(t).toInt
      inline def uint: CUnsignedInt = eq.apply(t)
      inline def value: CUnsignedInt = eq.apply(t)

object enumerations:
  import predef.*

  /** MHD connection options. Given to #MHD_set_connection_option to set custom
    * options for a particular connection.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_CONNECTION_OPTION = CUnsignedInt
  object MHD_CONNECTION_OPTION extends CEnumU[MHD_CONNECTION_OPTION]:
    given _tag: Tag[MHD_CONNECTION_OPTION] = Tag.UInt
    inline def define(inline a: Long): MHD_CONNECTION_OPTION = a.toUInt
    val MHD_CONNECTION_OPTION_TIMEOUT = define(0)
    inline def getName(inline value: MHD_CONNECTION_OPTION): Option[String] =
      inline value match
        case MHD_CONNECTION_OPTION_TIMEOUT =>
          Some("MHD_CONNECTION_OPTION_TIMEOUT")
        case _ => None
    extension (a: MHD_CONNECTION_OPTION)
      inline def &(b: MHD_CONNECTION_OPTION): MHD_CONNECTION_OPTION = a & b
      inline def |(b: MHD_CONNECTION_OPTION): MHD_CONNECTION_OPTION = a | b
      inline def is(b: MHD_CONNECTION_OPTION): Boolean = (a & b) == b

  /** Values of this enum are used to specify what information about a
    * connection is desired.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_ConnectionInfoType = CUnsignedInt
  object MHD_ConnectionInfoType extends CEnumU[MHD_ConnectionInfoType]:
    given _tag: Tag[MHD_ConnectionInfoType] = Tag.UInt
    inline def define(inline a: Long): MHD_ConnectionInfoType = a.toUInt
    val MHD_CONNECTION_INFO_CIPHER_ALGO = define(0)
    val MHD_CONNECTION_INFO_PROTOCOL = define(1)
    val MHD_CONNECTION_INFO_CLIENT_ADDRESS = define(2)
    val MHD_CONNECTION_INFO_GNUTLS_SESSION = define(3)
    val MHD_CONNECTION_INFO_GNUTLS_CLIENT_CERT = define(4)
    val MHD_CONNECTION_INFO_DAEMON = define(5)
    val MHD_CONNECTION_INFO_CONNECTION_FD = define(6)
    val MHD_CONNECTION_INFO_SOCKET_CONTEXT = define(7)
    val MHD_CONNECTION_INFO_CONNECTION_SUSPENDED = define(8)
    val MHD_CONNECTION_INFO_CONNECTION_TIMEOUT = define(9)
    val MHD_CONNECTION_INFO_REQUEST_HEADER_SIZE = define(10)
    val MHD_CONNECTION_INFO_HTTP_STATUS = define(11)
    inline def getName(inline value: MHD_ConnectionInfoType): Option[String] =
      inline value match
        case MHD_CONNECTION_INFO_CIPHER_ALGO =>
          Some("MHD_CONNECTION_INFO_CIPHER_ALGO")
        case MHD_CONNECTION_INFO_PROTOCOL =>
          Some("MHD_CONNECTION_INFO_PROTOCOL")
        case MHD_CONNECTION_INFO_CLIENT_ADDRESS =>
          Some("MHD_CONNECTION_INFO_CLIENT_ADDRESS")
        case MHD_CONNECTION_INFO_GNUTLS_SESSION =>
          Some("MHD_CONNECTION_INFO_GNUTLS_SESSION")
        case MHD_CONNECTION_INFO_GNUTLS_CLIENT_CERT =>
          Some("MHD_CONNECTION_INFO_GNUTLS_CLIENT_CERT")
        case MHD_CONNECTION_INFO_DAEMON => Some("MHD_CONNECTION_INFO_DAEMON")
        case MHD_CONNECTION_INFO_CONNECTION_FD =>
          Some("MHD_CONNECTION_INFO_CONNECTION_FD")
        case MHD_CONNECTION_INFO_SOCKET_CONTEXT =>
          Some("MHD_CONNECTION_INFO_SOCKET_CONTEXT")
        case MHD_CONNECTION_INFO_CONNECTION_SUSPENDED =>
          Some("MHD_CONNECTION_INFO_CONNECTION_SUSPENDED")
        case MHD_CONNECTION_INFO_CONNECTION_TIMEOUT =>
          Some("MHD_CONNECTION_INFO_CONNECTION_TIMEOUT")
        case MHD_CONNECTION_INFO_REQUEST_HEADER_SIZE =>
          Some("MHD_CONNECTION_INFO_REQUEST_HEADER_SIZE")
        case MHD_CONNECTION_INFO_HTTP_STATUS =>
          Some("MHD_CONNECTION_INFO_HTTP_STATUS")
        case _ => None
    extension (a: MHD_ConnectionInfoType)
      inline def &(b: MHD_ConnectionInfoType): MHD_ConnectionInfoType = a & b
      inline def |(b: MHD_ConnectionInfoType): MHD_ConnectionInfoType = a | b
      inline def is(b: MHD_ConnectionInfoType): Boolean = (a & b) == b

  /** The `enum MHD_ConnectionNotificationCode` specifies types of connection
    * notifications.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_ConnectionNotificationCode = CUnsignedInt
  object MHD_ConnectionNotificationCode
      extends CEnumU[MHD_ConnectionNotificationCode]:
    given _tag: Tag[MHD_ConnectionNotificationCode] = Tag.UInt
    inline def define(inline a: Long): MHD_ConnectionNotificationCode = a.toUInt
    val MHD_CONNECTION_NOTIFY_STARTED = define(0)
    val MHD_CONNECTION_NOTIFY_CLOSED = define(1)
    inline def getName(
        inline value: MHD_ConnectionNotificationCode
    ): Option[String] =
      inline value match
        case MHD_CONNECTION_NOTIFY_STARTED =>
          Some("MHD_CONNECTION_NOTIFY_STARTED")
        case MHD_CONNECTION_NOTIFY_CLOSED =>
          Some("MHD_CONNECTION_NOTIFY_CLOSED")
        case _ => None
    extension (a: MHD_ConnectionNotificationCode)
      inline def &(
          b: MHD_ConnectionNotificationCode
      ): MHD_ConnectionNotificationCode = a & b
      inline def |(
          b: MHD_ConnectionNotificationCode
      ): MHD_ConnectionNotificationCode = a | b
      inline def is(b: MHD_ConnectionNotificationCode): Boolean = (a & b) == b

  /** Values of this enum are used to specify what information about a daemon is
    * desired.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_DaemonInfoType = CUnsignedInt
  object MHD_DaemonInfoType extends CEnumU[MHD_DaemonInfoType]:
    given _tag: Tag[MHD_DaemonInfoType] = Tag.UInt
    inline def define(inline a: Long): MHD_DaemonInfoType = a.toUInt
    val MHD_DAEMON_INFO_KEY_SIZE = define(0)
    val MHD_DAEMON_INFO_MAC_KEY_SIZE = define(1)
    val MHD_DAEMON_INFO_LISTEN_FD = define(2)
    val MHD_DAEMON_INFO_EPOLL_FD_LINUX_ONLY = define(3)
    val MHD_DAEMON_INFO_EPOLL_FD = define(3)
    val MHD_DAEMON_INFO_CURRENT_CONNECTIONS = define(4)
    val MHD_DAEMON_INFO_FLAGS = define(5)
    val MHD_DAEMON_INFO_BIND_PORT = define(6)
    inline def getName(inline value: MHD_DaemonInfoType): Option[String] =
      inline value match
        case MHD_DAEMON_INFO_KEY_SIZE => Some("MHD_DAEMON_INFO_KEY_SIZE")
        case MHD_DAEMON_INFO_MAC_KEY_SIZE =>
          Some("MHD_DAEMON_INFO_MAC_KEY_SIZE")
        case MHD_DAEMON_INFO_LISTEN_FD => Some("MHD_DAEMON_INFO_LISTEN_FD")
        case MHD_DAEMON_INFO_EPOLL_FD_LINUX_ONLY =>
          Some("MHD_DAEMON_INFO_EPOLL_FD_LINUX_ONLY")
        case MHD_DAEMON_INFO_EPOLL_FD => Some("MHD_DAEMON_INFO_EPOLL_FD")
        case MHD_DAEMON_INFO_CURRENT_CONNECTIONS =>
          Some("MHD_DAEMON_INFO_CURRENT_CONNECTIONS")
        case MHD_DAEMON_INFO_FLAGS     => Some("MHD_DAEMON_INFO_FLAGS")
        case MHD_DAEMON_INFO_BIND_PORT => Some("MHD_DAEMON_INFO_BIND_PORT")
        case _                         => None
    extension (a: MHD_DaemonInfoType)
      inline def &(b: MHD_DaemonInfoType): MHD_DaemonInfoType = a & b
      inline def |(b: MHD_DaemonInfoType): MHD_DaemonInfoType = a | b
      inline def is(b: MHD_DaemonInfoType): Boolean = (a & b) == b

  /** Which digest algorithm should MHD use for HTTP digest authentication?
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_DigestAuthAlgorithm = CUnsignedInt
  object MHD_DigestAuthAlgorithm extends CEnumU[MHD_DigestAuthAlgorithm]:
    given _tag: Tag[MHD_DigestAuthAlgorithm] = Tag.UInt
    inline def define(inline a: Long): MHD_DigestAuthAlgorithm = a.toUInt
    val MHD_DIGEST_ALG_AUTO = define(0)
    val MHD_DIGEST_ALG_MD5 = define(1)
    val MHD_DIGEST_ALG_SHA256 = define(2)
    inline def getName(inline value: MHD_DigestAuthAlgorithm): Option[String] =
      inline value match
        case MHD_DIGEST_ALG_AUTO   => Some("MHD_DIGEST_ALG_AUTO")
        case MHD_DIGEST_ALG_MD5    => Some("MHD_DIGEST_ALG_MD5")
        case MHD_DIGEST_ALG_SHA256 => Some("MHD_DIGEST_ALG_SHA256")
        case _                     => None
    extension (a: MHD_DigestAuthAlgorithm)
      inline def &(b: MHD_DigestAuthAlgorithm): MHD_DigestAuthAlgorithm = a & b
      inline def |(b: MHD_DigestAuthAlgorithm): MHD_DigestAuthAlgorithm = a | b
      inline def is(b: MHD_DigestAuthAlgorithm): Boolean = (a & b) == b

  /** Bitfield for the #MHD_OPTION_SERVER_INSANITY specifying which santiy
    * checks should be disabled.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_DisableSanityCheck = CUnsignedInt
  object MHD_DisableSanityCheck extends CEnumU[MHD_DisableSanityCheck]:
    given _tag: Tag[MHD_DisableSanityCheck] = Tag.UInt
    inline def define(inline a: Long): MHD_DisableSanityCheck = a.toUInt
    val MHD_DSC_SANE = define(0)
    inline def getName(inline value: MHD_DisableSanityCheck): Option[String] =
      inline value match
        case MHD_DSC_SANE => Some("MHD_DSC_SANE")
        case _            => None
    extension (a: MHD_DisableSanityCheck)
      inline def &(b: MHD_DisableSanityCheck): MHD_DisableSanityCheck = a & b
      inline def |(b: MHD_DisableSanityCheck): MHD_DisableSanityCheck = a | b
      inline def is(b: MHD_DisableSanityCheck): Boolean = (a & b) == b

  /** Types of information about MHD features, used by
    * #MHD_is_feature_supported().
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_FEATURE = CUnsignedInt
  object MHD_FEATURE extends CEnumU[MHD_FEATURE]:
    given _tag: Tag[MHD_FEATURE] = Tag.UInt
    inline def define(inline a: Long): MHD_FEATURE = a.toUInt
    val MHD_FEATURE_MESSAGES = define(1)
    val MHD_FEATURE_TLS = define(2)
    val MHD_FEATURE_SSL = define(2)
    val MHD_FEATURE_HTTPS_CERT_CALLBACK = define(3)
    val MHD_FEATURE_IPv6 = define(4)
    val MHD_FEATURE_IPv6_ONLY = define(5)
    val MHD_FEATURE_POLL = define(6)
    val MHD_FEATURE_EPOLL = define(7)
    val MHD_FEATURE_SHUTDOWN_LISTEN_SOCKET = define(8)
    val MHD_FEATURE_SOCKETPAIR = define(9)
    val MHD_FEATURE_TCP_FASTOPEN = define(10)
    val MHD_FEATURE_BASIC_AUTH = define(11)
    val MHD_FEATURE_DIGEST_AUTH = define(12)
    val MHD_FEATURE_POSTPROCESSOR = define(13)
    val MHD_FEATURE_HTTPS_KEY_PASSWORD = define(14)
    val MHD_FEATURE_LARGE_FILE = define(15)
    val MHD_FEATURE_THREAD_NAMES = define(16)
    val MHD_THREAD_NAMES = define(16)
    val MHD_FEATURE_UPGRADE = define(17)
    val MHD_FEATURE_RESPONSES_SHARED_FD = define(18)
    val MHD_FEATURE_AUTODETECT_BIND_PORT = define(19)
    val MHD_FEATURE_AUTOSUPPRESS_SIGPIPE = define(20)
    val MHD_FEATURE_SENDFILE = define(21)
    val MHD_FEATURE_THREADS = define(22)
    val MHD_FEATURE_HTTPS_CERT_CALLBACK2 = define(23)
    inline def getName(inline value: MHD_FEATURE): Option[String] =
      inline value match
        case MHD_FEATURE_MESSAGES => Some("MHD_FEATURE_MESSAGES")
        case MHD_FEATURE_TLS      => Some("MHD_FEATURE_TLS")
        case MHD_FEATURE_SSL      => Some("MHD_FEATURE_SSL")
        case MHD_FEATURE_HTTPS_CERT_CALLBACK =>
          Some("MHD_FEATURE_HTTPS_CERT_CALLBACK")
        case MHD_FEATURE_IPv6      => Some("MHD_FEATURE_IPv6")
        case MHD_FEATURE_IPv6_ONLY => Some("MHD_FEATURE_IPv6_ONLY")
        case MHD_FEATURE_POLL      => Some("MHD_FEATURE_POLL")
        case MHD_FEATURE_EPOLL     => Some("MHD_FEATURE_EPOLL")
        case MHD_FEATURE_SHUTDOWN_LISTEN_SOCKET =>
          Some("MHD_FEATURE_SHUTDOWN_LISTEN_SOCKET")
        case MHD_FEATURE_SOCKETPAIR    => Some("MHD_FEATURE_SOCKETPAIR")
        case MHD_FEATURE_TCP_FASTOPEN  => Some("MHD_FEATURE_TCP_FASTOPEN")
        case MHD_FEATURE_BASIC_AUTH    => Some("MHD_FEATURE_BASIC_AUTH")
        case MHD_FEATURE_DIGEST_AUTH   => Some("MHD_FEATURE_DIGEST_AUTH")
        case MHD_FEATURE_POSTPROCESSOR => Some("MHD_FEATURE_POSTPROCESSOR")
        case MHD_FEATURE_HTTPS_KEY_PASSWORD =>
          Some("MHD_FEATURE_HTTPS_KEY_PASSWORD")
        case MHD_FEATURE_LARGE_FILE   => Some("MHD_FEATURE_LARGE_FILE")
        case MHD_FEATURE_THREAD_NAMES => Some("MHD_FEATURE_THREAD_NAMES")
        case MHD_THREAD_NAMES         => Some("MHD_THREAD_NAMES")
        case MHD_FEATURE_UPGRADE      => Some("MHD_FEATURE_UPGRADE")
        case MHD_FEATURE_RESPONSES_SHARED_FD =>
          Some("MHD_FEATURE_RESPONSES_SHARED_FD")
        case MHD_FEATURE_AUTODETECT_BIND_PORT =>
          Some("MHD_FEATURE_AUTODETECT_BIND_PORT")
        case MHD_FEATURE_AUTOSUPPRESS_SIGPIPE =>
          Some("MHD_FEATURE_AUTOSUPPRESS_SIGPIPE")
        case MHD_FEATURE_SENDFILE => Some("MHD_FEATURE_SENDFILE")
        case MHD_FEATURE_THREADS  => Some("MHD_FEATURE_THREADS")
        case MHD_FEATURE_HTTPS_CERT_CALLBACK2 =>
          Some("MHD_FEATURE_HTTPS_CERT_CALLBACK2")
        case _ => None
    extension (a: MHD_FEATURE)
      inline def &(b: MHD_FEATURE): MHD_FEATURE = a & b
      inline def |(b: MHD_FEATURE): MHD_FEATURE = a | b
      inline def is(b: MHD_FEATURE): Boolean = (a & b) == b

  /** Flags for the `struct MHD_Daemon`.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_FLAG = CUnsignedInt
  object MHD_FLAG extends CEnumU[MHD_FLAG]:
    given _tag: Tag[MHD_FLAG] = Tag.UInt
    inline def define(inline a: Long): MHD_FLAG = a.toUInt
    val MHD_NO_FLAG = define(0)
    val MHD_USE_ERROR_LOG = define(1)
    val MHD_USE_DEBUG = define(1)
    val MHD_USE_TLS = define(2)
    val MHD_USE_SSL = define(2)
    val MHD_USE_THREAD_PER_CONNECTION = define(4)
    val MHD_USE_INTERNAL_POLLING_THREAD = define(8)
    val MHD_USE_SELECT_INTERNALLY = define(8)
    val MHD_USE_IPv6 = define(16)
    val MHD_USE_PEDANTIC_CHECKS = define(32)
    val MHD_USE_POLL = define(64)
    val MHD_USE_POLL_INTERNAL_THREAD = define(72)
    val MHD_USE_POLL_INTERNALLY = define(72)
    val MHD_USE_SUPPRESS_DATE_NO_CLOCK = define(128)
    val MHD_SUPPRESS_DATE_NO_CLOCK = define(128)
    val MHD_USE_NO_LISTEN_SOCKET = define(256)
    val MHD_USE_EPOLL = define(512)
    val MHD_USE_EPOLL_LINUX_ONLY = define(512)
    val MHD_USE_EPOLL_INTERNAL_THREAD = define(520)
    val MHD_USE_EPOLL_INTERNALLY = define(520)
    val MHD_USE_EPOLL_INTERNALLY_LINUX_ONLY = define(520)
    val MHD_USE_ITC = define(1024)
    val MHD_USE_PIPE_FOR_SHUTDOWN = define(1024)
    val MHD_USE_DUAL_STACK = define(2064)
    val MHD_USE_TURBO = define(4096)
    val MHD_USE_EPOLL_TURBO = define(4096)
    val MHD_ALLOW_SUSPEND_RESUME = define(9216)
    val MHD_USE_SUSPEND_RESUME = define(9216)
    val MHD_USE_TCP_FASTOPEN = define(16384)
    val MHD_ALLOW_UPGRADE = define(32768)
    val MHD_USE_AUTO = define(65536)
    val MHD_USE_AUTO_INTERNAL_THREAD = define(65544)
    val MHD_USE_POST_HANDSHAKE_AUTH_SUPPORT = define(131072)
    val MHD_USE_INSECURE_TLS_EARLY_DATA = define(262144)
    inline def getName(inline value: MHD_FLAG): Option[String] =
      inline value match
        case MHD_NO_FLAG       => Some("MHD_NO_FLAG")
        case MHD_USE_ERROR_LOG => Some("MHD_USE_ERROR_LOG")
        case MHD_USE_DEBUG     => Some("MHD_USE_DEBUG")
        case MHD_USE_TLS       => Some("MHD_USE_TLS")
        case MHD_USE_SSL       => Some("MHD_USE_SSL")
        case MHD_USE_THREAD_PER_CONNECTION =>
          Some("MHD_USE_THREAD_PER_CONNECTION")
        case MHD_USE_INTERNAL_POLLING_THREAD =>
          Some("MHD_USE_INTERNAL_POLLING_THREAD")
        case MHD_USE_SELECT_INTERNALLY => Some("MHD_USE_SELECT_INTERNALLY")
        case MHD_USE_IPv6              => Some("MHD_USE_IPv6")
        case MHD_USE_PEDANTIC_CHECKS   => Some("MHD_USE_PEDANTIC_CHECKS")
        case MHD_USE_POLL              => Some("MHD_USE_POLL")
        case MHD_USE_POLL_INTERNAL_THREAD =>
          Some("MHD_USE_POLL_INTERNAL_THREAD")
        case MHD_USE_POLL_INTERNALLY => Some("MHD_USE_POLL_INTERNALLY")
        case MHD_USE_SUPPRESS_DATE_NO_CLOCK =>
          Some("MHD_USE_SUPPRESS_DATE_NO_CLOCK")
        case MHD_SUPPRESS_DATE_NO_CLOCK => Some("MHD_SUPPRESS_DATE_NO_CLOCK")
        case MHD_USE_NO_LISTEN_SOCKET   => Some("MHD_USE_NO_LISTEN_SOCKET")
        case MHD_USE_EPOLL              => Some("MHD_USE_EPOLL")
        case MHD_USE_EPOLL_LINUX_ONLY   => Some("MHD_USE_EPOLL_LINUX_ONLY")
        case MHD_USE_EPOLL_INTERNAL_THREAD =>
          Some("MHD_USE_EPOLL_INTERNAL_THREAD")
        case MHD_USE_EPOLL_INTERNALLY => Some("MHD_USE_EPOLL_INTERNALLY")
        case MHD_USE_EPOLL_INTERNALLY_LINUX_ONLY =>
          Some("MHD_USE_EPOLL_INTERNALLY_LINUX_ONLY")
        case MHD_USE_ITC               => Some("MHD_USE_ITC")
        case MHD_USE_PIPE_FOR_SHUTDOWN => Some("MHD_USE_PIPE_FOR_SHUTDOWN")
        case MHD_USE_DUAL_STACK        => Some("MHD_USE_DUAL_STACK")
        case MHD_USE_TURBO             => Some("MHD_USE_TURBO")
        case MHD_USE_EPOLL_TURBO       => Some("MHD_USE_EPOLL_TURBO")
        case MHD_ALLOW_SUSPEND_RESUME  => Some("MHD_ALLOW_SUSPEND_RESUME")
        case MHD_USE_SUSPEND_RESUME    => Some("MHD_USE_SUSPEND_RESUME")
        case MHD_USE_TCP_FASTOPEN      => Some("MHD_USE_TCP_FASTOPEN")
        case MHD_ALLOW_UPGRADE         => Some("MHD_ALLOW_UPGRADE")
        case MHD_USE_AUTO              => Some("MHD_USE_AUTO")
        case MHD_USE_AUTO_INTERNAL_THREAD =>
          Some("MHD_USE_AUTO_INTERNAL_THREAD")
        case MHD_USE_POST_HANDSHAKE_AUTH_SUPPORT =>
          Some("MHD_USE_POST_HANDSHAKE_AUTH_SUPPORT")
        case MHD_USE_INSECURE_TLS_EARLY_DATA =>
          Some("MHD_USE_INSECURE_TLS_EARLY_DATA")
        case _ => None
    extension (a: MHD_FLAG)
      inline def &(b: MHD_FLAG): MHD_FLAG = a & b
      inline def |(b: MHD_FLAG): MHD_FLAG = a | b
      inline def is(b: MHD_FLAG): Boolean = (a & b) == b

  /** MHD options.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_OPTION = CUnsignedInt
  object MHD_OPTION extends CEnumU[MHD_OPTION]:
    given _tag: Tag[MHD_OPTION] = Tag.UInt
    inline def define(inline a: Long): MHD_OPTION = a.toUInt
    val MHD_OPTION_END = define(0)
    val MHD_OPTION_CONNECTION_MEMORY_LIMIT = define(1)
    val MHD_OPTION_CONNECTION_LIMIT = define(2)
    val MHD_OPTION_CONNECTION_TIMEOUT = define(3)
    val MHD_OPTION_NOTIFY_COMPLETED = define(4)
    val MHD_OPTION_PER_IP_CONNECTION_LIMIT = define(5)
    val MHD_OPTION_SOCK_ADDR = define(6)
    val MHD_OPTION_URI_LOG_CALLBACK = define(7)
    val MHD_OPTION_HTTPS_MEM_KEY = define(8)
    val MHD_OPTION_HTTPS_MEM_CERT = define(9)
    val MHD_OPTION_HTTPS_CRED_TYPE = define(10)
    val MHD_OPTION_HTTPS_PRIORITIES = define(11)
    val MHD_OPTION_LISTEN_SOCKET = define(12)
    val MHD_OPTION_EXTERNAL_LOGGER = define(13)
    val MHD_OPTION_THREAD_POOL_SIZE = define(14)
    val MHD_OPTION_ARRAY = define(15)
    val MHD_OPTION_UNESCAPE_CALLBACK = define(16)
    val MHD_OPTION_DIGEST_AUTH_RANDOM = define(17)
    val MHD_OPTION_NONCE_NC_SIZE = define(18)
    val MHD_OPTION_THREAD_STACK_SIZE = define(19)
    val MHD_OPTION_HTTPS_MEM_TRUST = define(20)
    val MHD_OPTION_CONNECTION_MEMORY_INCREMENT = define(21)
    val MHD_OPTION_HTTPS_CERT_CALLBACK = define(22)
    val MHD_OPTION_TCP_FASTOPEN_QUEUE_SIZE = define(23)
    val MHD_OPTION_HTTPS_MEM_DHPARAMS = define(24)
    val MHD_OPTION_LISTENING_ADDRESS_REUSE = define(25)
    val MHD_OPTION_HTTPS_KEY_PASSWORD = define(26)
    val MHD_OPTION_NOTIFY_CONNECTION = define(27)
    val MHD_OPTION_LISTEN_BACKLOG_SIZE = define(28)
    val MHD_OPTION_STRICT_FOR_CLIENT = define(29)
    val MHD_OPTION_GNUTLS_PSK_CRED_HANDLER = define(30)
    val MHD_OPTION_HTTPS_CERT_CALLBACK2 = define(31)
    val MHD_OPTION_SERVER_INSANITY = define(32)
    val MHD_OPTION_SIGPIPE_HANDLED_BY_APP = define(33)
    val MHD_OPTION_TLS_NO_ALPN = define(34)
    inline def getName(inline value: MHD_OPTION): Option[String] =
      inline value match
        case MHD_OPTION_END => Some("MHD_OPTION_END")
        case MHD_OPTION_CONNECTION_MEMORY_LIMIT =>
          Some("MHD_OPTION_CONNECTION_MEMORY_LIMIT")
        case MHD_OPTION_CONNECTION_LIMIT => Some("MHD_OPTION_CONNECTION_LIMIT")
        case MHD_OPTION_CONNECTION_TIMEOUT =>
          Some("MHD_OPTION_CONNECTION_TIMEOUT")
        case MHD_OPTION_NOTIFY_COMPLETED => Some("MHD_OPTION_NOTIFY_COMPLETED")
        case MHD_OPTION_PER_IP_CONNECTION_LIMIT =>
          Some("MHD_OPTION_PER_IP_CONNECTION_LIMIT")
        case MHD_OPTION_SOCK_ADDR        => Some("MHD_OPTION_SOCK_ADDR")
        case MHD_OPTION_URI_LOG_CALLBACK => Some("MHD_OPTION_URI_LOG_CALLBACK")
        case MHD_OPTION_HTTPS_MEM_KEY    => Some("MHD_OPTION_HTTPS_MEM_KEY")
        case MHD_OPTION_HTTPS_MEM_CERT   => Some("MHD_OPTION_HTTPS_MEM_CERT")
        case MHD_OPTION_HTTPS_CRED_TYPE  => Some("MHD_OPTION_HTTPS_CRED_TYPE")
        case MHD_OPTION_HTTPS_PRIORITIES => Some("MHD_OPTION_HTTPS_PRIORITIES")
        case MHD_OPTION_LISTEN_SOCKET    => Some("MHD_OPTION_LISTEN_SOCKET")
        case MHD_OPTION_EXTERNAL_LOGGER  => Some("MHD_OPTION_EXTERNAL_LOGGER")
        case MHD_OPTION_THREAD_POOL_SIZE => Some("MHD_OPTION_THREAD_POOL_SIZE")
        case MHD_OPTION_ARRAY            => Some("MHD_OPTION_ARRAY")
        case MHD_OPTION_UNESCAPE_CALLBACK =>
          Some("MHD_OPTION_UNESCAPE_CALLBACK")
        case MHD_OPTION_DIGEST_AUTH_RANDOM =>
          Some("MHD_OPTION_DIGEST_AUTH_RANDOM")
        case MHD_OPTION_NONCE_NC_SIZE => Some("MHD_OPTION_NONCE_NC_SIZE")
        case MHD_OPTION_THREAD_STACK_SIZE =>
          Some("MHD_OPTION_THREAD_STACK_SIZE")
        case MHD_OPTION_HTTPS_MEM_TRUST => Some("MHD_OPTION_HTTPS_MEM_TRUST")
        case MHD_OPTION_CONNECTION_MEMORY_INCREMENT =>
          Some("MHD_OPTION_CONNECTION_MEMORY_INCREMENT")
        case MHD_OPTION_HTTPS_CERT_CALLBACK =>
          Some("MHD_OPTION_HTTPS_CERT_CALLBACK")
        case MHD_OPTION_TCP_FASTOPEN_QUEUE_SIZE =>
          Some("MHD_OPTION_TCP_FASTOPEN_QUEUE_SIZE")
        case MHD_OPTION_HTTPS_MEM_DHPARAMS =>
          Some("MHD_OPTION_HTTPS_MEM_DHPARAMS")
        case MHD_OPTION_LISTENING_ADDRESS_REUSE =>
          Some("MHD_OPTION_LISTENING_ADDRESS_REUSE")
        case MHD_OPTION_HTTPS_KEY_PASSWORD =>
          Some("MHD_OPTION_HTTPS_KEY_PASSWORD")
        case MHD_OPTION_NOTIFY_CONNECTION =>
          Some("MHD_OPTION_NOTIFY_CONNECTION")
        case MHD_OPTION_LISTEN_BACKLOG_SIZE =>
          Some("MHD_OPTION_LISTEN_BACKLOG_SIZE")
        case MHD_OPTION_STRICT_FOR_CLIENT =>
          Some("MHD_OPTION_STRICT_FOR_CLIENT")
        case MHD_OPTION_GNUTLS_PSK_CRED_HANDLER =>
          Some("MHD_OPTION_GNUTLS_PSK_CRED_HANDLER")
        case MHD_OPTION_HTTPS_CERT_CALLBACK2 =>
          Some("MHD_OPTION_HTTPS_CERT_CALLBACK2")
        case MHD_OPTION_SERVER_INSANITY => Some("MHD_OPTION_SERVER_INSANITY")
        case MHD_OPTION_SIGPIPE_HANDLED_BY_APP =>
          Some("MHD_OPTION_SIGPIPE_HANDLED_BY_APP")
        case MHD_OPTION_TLS_NO_ALPN => Some("MHD_OPTION_TLS_NO_ALPN")
        case _                      => None
    extension (a: MHD_OPTION)
      inline def &(b: MHD_OPTION): MHD_OPTION = a & b
      inline def |(b: MHD_OPTION): MHD_OPTION = a | b
      inline def is(b: MHD_OPTION): Boolean = (a & b) == b

  /** The `enum MHD_RequestTerminationCode` specifies reasons why a request has
    * been terminated (or completed).
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_RequestTerminationCode = CUnsignedInt
  object MHD_RequestTerminationCode extends CEnumU[MHD_RequestTerminationCode]:
    given _tag: Tag[MHD_RequestTerminationCode] = Tag.UInt
    inline def define(inline a: Long): MHD_RequestTerminationCode = a.toUInt
    val MHD_REQUEST_TERMINATED_COMPLETED_OK = define(0)
    val MHD_REQUEST_TERMINATED_WITH_ERROR = define(1)
    val MHD_REQUEST_TERMINATED_TIMEOUT_REACHED = define(2)
    val MHD_REQUEST_TERMINATED_DAEMON_SHUTDOWN = define(3)
    val MHD_REQUEST_TERMINATED_READ_ERROR = define(4)
    val MHD_REQUEST_TERMINATED_CLIENT_ABORT = define(5)
    inline def getName(
        inline value: MHD_RequestTerminationCode
    ): Option[String] =
      inline value match
        case MHD_REQUEST_TERMINATED_COMPLETED_OK =>
          Some("MHD_REQUEST_TERMINATED_COMPLETED_OK")
        case MHD_REQUEST_TERMINATED_WITH_ERROR =>
          Some("MHD_REQUEST_TERMINATED_WITH_ERROR")
        case MHD_REQUEST_TERMINATED_TIMEOUT_REACHED =>
          Some("MHD_REQUEST_TERMINATED_TIMEOUT_REACHED")
        case MHD_REQUEST_TERMINATED_DAEMON_SHUTDOWN =>
          Some("MHD_REQUEST_TERMINATED_DAEMON_SHUTDOWN")
        case MHD_REQUEST_TERMINATED_READ_ERROR =>
          Some("MHD_REQUEST_TERMINATED_READ_ERROR")
        case MHD_REQUEST_TERMINATED_CLIENT_ABORT =>
          Some("MHD_REQUEST_TERMINATED_CLIENT_ABORT")
        case _ => None
    extension (a: MHD_RequestTerminationCode)
      inline def &(b: MHD_RequestTerminationCode): MHD_RequestTerminationCode =
        a & b
      inline def |(b: MHD_RequestTerminationCode): MHD_RequestTerminationCode =
        a | b
      inline def is(b: MHD_RequestTerminationCode): Boolean = (a & b) == b

  /** Flags for special handling of responses.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_ResponseFlags = CUnsignedInt
  object MHD_ResponseFlags extends CEnumU[MHD_ResponseFlags]:
    given _tag: Tag[MHD_ResponseFlags] = Tag.UInt
    inline def define(inline a: Long): MHD_ResponseFlags = a.toUInt
    val MHD_RF_NONE = define(0)
    val MHD_RF_HTTP_1_0_COMPATIBLE_STRICT = define(1)
    val MHD_RF_HTTP_VERSION_1_0_ONLY = define(1)
    val MHD_RF_HTTP_1_0_SERVER = define(2)
    val MHD_RF_HTTP_VERSION_1_0_RESPONSE = define(2)
    val MHD_RF_INSANITY_HEADER_CONTENT_LENGTH = define(4)
    val MHD_RF_SEND_KEEP_ALIVE_HEADER = define(8)
    inline def getName(inline value: MHD_ResponseFlags): Option[String] =
      inline value match
        case MHD_RF_NONE => Some("MHD_RF_NONE")
        case MHD_RF_HTTP_1_0_COMPATIBLE_STRICT =>
          Some("MHD_RF_HTTP_1_0_COMPATIBLE_STRICT")
        case MHD_RF_HTTP_VERSION_1_0_ONLY =>
          Some("MHD_RF_HTTP_VERSION_1_0_ONLY")
        case MHD_RF_HTTP_1_0_SERVER => Some("MHD_RF_HTTP_1_0_SERVER")
        case MHD_RF_HTTP_VERSION_1_0_RESPONSE =>
          Some("MHD_RF_HTTP_VERSION_1_0_RESPONSE")
        case MHD_RF_INSANITY_HEADER_CONTENT_LENGTH =>
          Some("MHD_RF_INSANITY_HEADER_CONTENT_LENGTH")
        case MHD_RF_SEND_KEEP_ALIVE_HEADER =>
          Some("MHD_RF_SEND_KEEP_ALIVE_HEADER")
        case _ => None
    extension (a: MHD_ResponseFlags)
      inline def &(b: MHD_ResponseFlags): MHD_ResponseFlags = a & b
      inline def |(b: MHD_ResponseFlags): MHD_ResponseFlags = a | b
      inline def is(b: MHD_ResponseFlags): Boolean = (a & b) == b

  /** Specification for how MHD should treat the memory buffer given for the
    * response.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_ResponseMemoryMode = CUnsignedInt
  object MHD_ResponseMemoryMode extends CEnumU[MHD_ResponseMemoryMode]:
    given _tag: Tag[MHD_ResponseMemoryMode] = Tag.UInt
    inline def define(inline a: Long): MHD_ResponseMemoryMode = a.toUInt
    val MHD_RESPMEM_PERSISTENT = define(0)
    val MHD_RESPMEM_MUST_FREE = define(1)
    val MHD_RESPMEM_MUST_COPY = define(2)
    inline def getName(inline value: MHD_ResponseMemoryMode): Option[String] =
      inline value match
        case MHD_RESPMEM_PERSISTENT => Some("MHD_RESPMEM_PERSISTENT")
        case MHD_RESPMEM_MUST_FREE  => Some("MHD_RESPMEM_MUST_FREE")
        case MHD_RESPMEM_MUST_COPY  => Some("MHD_RESPMEM_MUST_COPY")
        case _                      => None
    extension (a: MHD_ResponseMemoryMode)
      inline def &(b: MHD_ResponseMemoryMode): MHD_ResponseMemoryMode = a & b
      inline def |(b: MHD_ResponseMemoryMode): MHD_ResponseMemoryMode = a | b
      inline def is(b: MHD_ResponseMemoryMode): Boolean = (a & b) == b

  /** MHD options (for future extensions).
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_ResponseOptions = CUnsignedInt
  object MHD_ResponseOptions extends CEnumU[MHD_ResponseOptions]:
    given _tag: Tag[MHD_ResponseOptions] = Tag.UInt
    inline def define(inline a: Long): MHD_ResponseOptions = a.toUInt
    val MHD_RO_END = define(0)
    inline def getName(inline value: MHD_ResponseOptions): Option[String] =
      inline value match
        case MHD_RO_END => Some("MHD_RO_END")
        case _          => None
    extension (a: MHD_ResponseOptions)
      inline def &(b: MHD_ResponseOptions): MHD_ResponseOptions = a & b
      inline def |(b: MHD_ResponseOptions): MHD_ResponseOptions = a | b
      inline def is(b: MHD_ResponseOptions): Boolean = (a & b) == b

  /** Operational results from MHD calls.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_Result = CUnsignedInt
  object MHD_Result extends CEnumU[MHD_Result]:
    given _tag: Tag[MHD_Result] = Tag.UInt
    inline def define(inline a: Long): MHD_Result = a.toUInt
    val MHD_NO = define(0)
    val MHD_YES = define(1)
    inline def getName(inline value: MHD_Result): Option[String] =
      inline value match
        case MHD_NO  => Some("MHD_NO")
        case MHD_YES => Some("MHD_YES")
        case _       => None
    extension (a: MHD_Result)
      inline def &(b: MHD_Result): MHD_Result = a & b
      inline def |(b: MHD_Result): MHD_Result = a | b
      inline def is(b: MHD_Result): Boolean = (a & b) == b

  /** Enumeration for actions MHD should perform on the underlying socket of the
    * upgrade. This API is not finalized, and in particular the final set of
    * actions is yet to be decided. This is just an idea for what we might want.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_UpgradeAction = CUnsignedInt
  object MHD_UpgradeAction extends CEnumU[MHD_UpgradeAction]:
    given _tag: Tag[MHD_UpgradeAction] = Tag.UInt
    inline def define(inline a: Long): MHD_UpgradeAction = a.toUInt
    val MHD_UPGRADE_ACTION_CLOSE = define(0)
    val MHD_UPGRADE_ACTION_CORK_ON = define(1)
    val MHD_UPGRADE_ACTION_CORK_OFF = define(2)
    inline def getName(inline value: MHD_UpgradeAction): Option[String] =
      inline value match
        case MHD_UPGRADE_ACTION_CLOSE    => Some("MHD_UPGRADE_ACTION_CLOSE")
        case MHD_UPGRADE_ACTION_CORK_ON  => Some("MHD_UPGRADE_ACTION_CORK_ON")
        case MHD_UPGRADE_ACTION_CORK_OFF => Some("MHD_UPGRADE_ACTION_CORK_OFF")
        case _                           => None
    extension (a: MHD_UpgradeAction)
      inline def &(b: MHD_UpgradeAction): MHD_UpgradeAction = a & b
      inline def |(b: MHD_UpgradeAction): MHD_UpgradeAction = a | b
      inline def is(b: MHD_UpgradeAction): Boolean = (a & b) == b

  /** The `enum MHD_ValueKind` specifies the source of the key-value pairs in
    * the HTTP protocol.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_ValueKind = CUnsignedInt
  object MHD_ValueKind extends CEnumU[MHD_ValueKind]:
    given _tag: Tag[MHD_ValueKind] = Tag.UInt
    inline def define(inline a: Long): MHD_ValueKind = a.toUInt
    val MHD_RESPONSE_HEADER_KIND = define(0)
    val MHD_HEADER_KIND = define(1)
    val MHD_COOKIE_KIND = define(2)
    val MHD_POSTDATA_KIND = define(4)
    val MHD_GET_ARGUMENT_KIND = define(8)
    val MHD_FOOTER_KIND = define(16)
    inline def getName(inline value: MHD_ValueKind): Option[String] =
      inline value match
        case MHD_RESPONSE_HEADER_KIND => Some("MHD_RESPONSE_HEADER_KIND")
        case MHD_HEADER_KIND          => Some("MHD_HEADER_KIND")
        case MHD_COOKIE_KIND          => Some("MHD_COOKIE_KIND")
        case MHD_POSTDATA_KIND        => Some("MHD_POSTDATA_KIND")
        case MHD_GET_ARGUMENT_KIND    => Some("MHD_GET_ARGUMENT_KIND")
        case MHD_FOOTER_KIND          => Some("MHD_FOOTER_KIND")
        case _                        => None
    extension (a: MHD_ValueKind)
      inline def &(b: MHD_ValueKind): MHD_ValueKind = a & b
      inline def |(b: MHD_ValueKind): MHD_ValueKind = a | b
      inline def is(b: MHD_ValueKind): Boolean = (a & b) == b

object aliases:
  import _root_.microhttpd.enumerations.*
  import _root_.microhttpd.aliases.*
  import _root_.microhttpd.structs.*
  import _root_.microhttpd.unions.*

  /** Allow or deny a client to connect.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_AcceptPolicyCallback =
    CFuncPtr3[Ptr[Byte], Ptr[sockaddr], socklen_t, MHD_Result]
  object MHD_AcceptPolicyCallback:
    given _tag: Tag[MHD_AcceptPolicyCallback] =
      Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[sockaddr], socklen_t, MHD_Result]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], Ptr[sockaddr], socklen_t, MHD_Result]
    ): MHD_AcceptPolicyCallback = o
    extension (v: MHD_AcceptPolicyCallback)
      inline def value
          : CFuncPtr3[Ptr[Byte], Ptr[sockaddr], socklen_t, MHD_Result] = v

  /** A client has requested the given url using the given method
    * (#MHD_HTTP_METHOD_GET, #MHD_HTTP_METHOD_PUT, #MHD_HTTP_METHOD_DELETE,
    * #MHD_HTTP_METHOD_POST, etc).
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_AccessHandlerCallback = CFuncPtr8[Ptr[Byte], Ptr[
    MHD_Connection
  ], CString, CString, CString, CString, Ptr[size_t], Ptr[
    Ptr[Byte]
  ], MHD_Result]
  object MHD_AccessHandlerCallback:
    given _tag: Tag[MHD_AccessHandlerCallback] = Tag.materializeCFuncPtr8[Ptr[
      Byte
    ], Ptr[MHD_Connection], CString, CString, CString, CString, Ptr[
      size_t
    ], Ptr[Ptr[Byte]], MHD_Result]
    inline def apply(
        inline o: CFuncPtr8[Ptr[Byte], Ptr[
          MHD_Connection
        ], CString, CString, CString, CString, Ptr[size_t], Ptr[
          Ptr[Byte]
        ], MHD_Result]
    ): MHD_AccessHandlerCallback = o
    extension (v: MHD_AccessHandlerCallback)
      inline def value: CFuncPtr8[Ptr[Byte], Ptr[
        MHD_Connection
      ], CString, CString, CString, CString, Ptr[size_t], Ptr[
        Ptr[Byte]
      ], MHD_Result] = v

  /** Callback used by libmicrohttpd in order to obtain content.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_ContentReaderCallback =
    CFuncPtr4[Ptr[Byte], uint64_t, CString, size_t, ssize_t]
  object MHD_ContentReaderCallback:
    given _tag: Tag[MHD_ContentReaderCallback] =
      Tag.materializeCFuncPtr4[Ptr[Byte], uint64_t, CString, size_t, ssize_t]
    inline def apply(
        inline o: CFuncPtr4[Ptr[Byte], uint64_t, CString, size_t, ssize_t]
    ): MHD_ContentReaderCallback = o
    extension (v: MHD_ContentReaderCallback)
      inline def value
          : CFuncPtr4[Ptr[Byte], uint64_t, CString, size_t, ssize_t] = v

  /** This method is called by libmicrohttpd if we are done with a content
    * reader. It should be used to free resources associated with the content
    * reader.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_ContentReaderFreeCallback = CFuncPtr1[Ptr[Byte], Unit]
  object MHD_ContentReaderFreeCallback:
    given _tag: Tag[MHD_ContentReaderFreeCallback] =
      Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
    inline def apply(
        inline o: CFuncPtr1[Ptr[Byte], Unit]
    ): MHD_ContentReaderFreeCallback = o
    extension (v: MHD_ContentReaderFreeCallback)
      inline def value: CFuncPtr1[Ptr[Byte], Unit] = v

  /** Iterator over key-value pairs. This iterator can be used to iterate over
    * all of the cookies, headers, or POST-data fields of a request, and also to
    * iterate over the headers that have been added to a response.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_KeyValueIterator =
    CFuncPtr4[Ptr[Byte], MHD_ValueKind, CString, CString, MHD_Result]
  object MHD_KeyValueIterator:
    given _tag: Tag[MHD_KeyValueIterator] = Tag.materializeCFuncPtr4[Ptr[
      Byte
    ], MHD_ValueKind, CString, CString, MHD_Result]
    inline def apply(
        inline o: CFuncPtr4[Ptr[
          Byte
        ], MHD_ValueKind, CString, CString, MHD_Result]
    ): MHD_KeyValueIterator = o
    extension (v: MHD_KeyValueIterator)
      inline def value
          : CFuncPtr4[Ptr[Byte], MHD_ValueKind, CString, CString, MHD_Result] =
        v

  /** Iterator over key-value pairs with size parameters. This iterator can be
    * used to iterate over all of the cookies, headers, or POST-data fields of a
    * request, and also to iterate over the headers that have been added to a
    * response.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_KeyValueIteratorN = CFuncPtr6[Ptr[
    Byte
  ], MHD_ValueKind, CString, size_t, CString, size_t, MHD_Result]
  object MHD_KeyValueIteratorN:
    given _tag: Tag[MHD_KeyValueIteratorN] = Tag.materializeCFuncPtr6[Ptr[
      Byte
    ], MHD_ValueKind, CString, size_t, CString, size_t, MHD_Result]
    inline def apply(
        inline o: CFuncPtr6[Ptr[
          Byte
        ], MHD_ValueKind, CString, size_t, CString, size_t, MHD_Result]
    ): MHD_KeyValueIteratorN = o
    extension (v: MHD_KeyValueIteratorN)
      inline def value: CFuncPtr6[Ptr[
        Byte
      ], MHD_ValueKind, CString, size_t, CString, size_t, MHD_Result] = v

  /** Type of a callback function used for logging by MHD.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_LogCallback = CFuncPtr3[Ptr[Byte], CString, va_list, Unit]
  object MHD_LogCallback:
    given _tag: Tag[MHD_LogCallback] =
      Tag.materializeCFuncPtr3[Ptr[Byte], CString, va_list, Unit]
    inline def apply(
        inline o: CFuncPtr3[Ptr[Byte], CString, va_list, Unit]
    ): MHD_LogCallback = o
    extension (v: MHD_LogCallback)
      inline def value: CFuncPtr3[Ptr[Byte], CString, va_list, Unit] = v

  /** Signature of the callback used by MHD to notify the application about
    * started/stopped connections
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_NotifyConnectionCallback = CFuncPtr4[Ptr[Byte], Ptr[
    MHD_Connection
  ], Ptr[Ptr[Byte]], MHD_ConnectionNotificationCode, Unit]
  object MHD_NotifyConnectionCallback:
    given _tag: Tag[MHD_NotifyConnectionCallback] =
      Tag.materializeCFuncPtr4[Ptr[Byte], Ptr[MHD_Connection], Ptr[
        Ptr[Byte]
      ], MHD_ConnectionNotificationCode, Unit]
    inline def apply(
        inline o: CFuncPtr4[Ptr[Byte], Ptr[MHD_Connection], Ptr[
          Ptr[Byte]
        ], MHD_ConnectionNotificationCode, Unit]
    ): MHD_NotifyConnectionCallback = o
    extension (v: MHD_NotifyConnectionCallback)
      inline def value: CFuncPtr4[Ptr[Byte], Ptr[MHD_Connection], Ptr[
        Ptr[Byte]
      ], MHD_ConnectionNotificationCode, Unit] = v

  /** Callback for serious error condition. The default action is to print an
    * error message and `abort()`.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_PanicCallback =
    CFuncPtr4[Ptr[Byte], CString, CUnsignedInt, CString, Unit]
  object MHD_PanicCallback:
    given _tag: Tag[MHD_PanicCallback] =
      Tag.materializeCFuncPtr4[Ptr[Byte], CString, CUnsignedInt, CString, Unit]
    inline def apply(
        inline o: CFuncPtr4[Ptr[Byte], CString, CUnsignedInt, CString, Unit]
    ): MHD_PanicCallback = o
    extension (v: MHD_PanicCallback)
      inline def value
          : CFuncPtr4[Ptr[Byte], CString, CUnsignedInt, CString, Unit] = v

  /** Iterator over key-value pairs where the value may be made available in
    * increments and/or may not be zero-terminated. Used for processing POST
    * data.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_PostDataIterator = CFuncPtr9[Ptr[
    Byte
  ], MHD_ValueKind, CString, CString, CString, CString, CString, uint64_t, size_t, MHD_Result]
  object MHD_PostDataIterator:
    given _tag: Tag[MHD_PostDataIterator] = Tag.materializeCFuncPtr9[Ptr[
      Byte
    ], MHD_ValueKind, CString, CString, CString, CString, CString, uint64_t, size_t, MHD_Result]
    inline def apply(
        inline o: CFuncPtr9[Ptr[
          Byte
        ], MHD_ValueKind, CString, CString, CString, CString, CString, uint64_t, size_t, MHD_Result]
    ): MHD_PostDataIterator = o
    extension (v: MHD_PostDataIterator)
      inline def value: CFuncPtr9[Ptr[
        Byte
      ], MHD_ValueKind, CString, CString, CString, CString, CString, uint64_t, size_t, MHD_Result] =
        v

  /** Function called to lookup the pre shared key ( psk) for a given HTTP
    * connection based on the username.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_PskServerCredentialsCallback = CFuncPtr5[Ptr[Byte], Ptr[
    MHD_Connection
  ], CString, Ptr[Ptr[Byte]], Ptr[size_t], CInt]
  object MHD_PskServerCredentialsCallback:
    given _tag: Tag[MHD_PskServerCredentialsCallback] =
      Tag.materializeCFuncPtr5[Ptr[Byte], Ptr[MHD_Connection], CString, Ptr[
        Ptr[Byte]
      ], Ptr[size_t], CInt]
    inline def apply(
        inline o: CFuncPtr5[Ptr[Byte], Ptr[MHD_Connection], CString, Ptr[
          Ptr[Byte]
        ], Ptr[size_t], CInt]
    ): MHD_PskServerCredentialsCallback = o
    extension (v: MHD_PskServerCredentialsCallback)
      inline def value: CFuncPtr5[Ptr[Byte], Ptr[MHD_Connection], CString, Ptr[
        Ptr[Byte]
      ], Ptr[size_t], CInt] = v

  /** Signature of the callback used by MHD to notify the application about
    * completed requests.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_RequestCompletedCallback = CFuncPtr4[Ptr[Byte], Ptr[
    MHD_Connection
  ], Ptr[Ptr[Byte]], MHD_RequestTerminationCode, Unit]
  object MHD_RequestCompletedCallback:
    given _tag: Tag[MHD_RequestCompletedCallback] =
      Tag.materializeCFuncPtr4[Ptr[Byte], Ptr[MHD_Connection], Ptr[
        Ptr[Byte]
      ], MHD_RequestTerminationCode, Unit]
    inline def apply(
        inline o: CFuncPtr4[Ptr[Byte], Ptr[MHD_Connection], Ptr[
          Ptr[Byte]
        ], MHD_RequestTerminationCode, Unit]
    ): MHD_RequestCompletedCallback = o
    extension (v: MHD_RequestCompletedCallback)
      inline def value: CFuncPtr4[Ptr[Byte], Ptr[MHD_Connection], Ptr[
        Ptr[Byte]
      ], MHD_RequestTerminationCode, Unit] = v

  /** Function called after a protocol "upgrade" response was sent successfully
    * and the socket should now be controlled by some protocol other than HTTP.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_UpgradeHandler =
    CFuncPtr7[Ptr[Byte], Ptr[MHD_Connection], Ptr[
      Byte
    ], CString, size_t, MHD_socket, Ptr[MHD_UpgradeResponseHandle], Unit]
  object MHD_UpgradeHandler:
    given _tag: Tag[MHD_UpgradeHandler] =
      Tag.materializeCFuncPtr7[Ptr[Byte], Ptr[MHD_Connection], Ptr[
        Byte
      ], CString, size_t, MHD_socket, Ptr[MHD_UpgradeResponseHandle], Unit]
    inline def apply(
        inline o: CFuncPtr7[Ptr[Byte], Ptr[MHD_Connection], Ptr[
          Byte
        ], CString, size_t, MHD_socket, Ptr[MHD_UpgradeResponseHandle], Unit]
    ): MHD_UpgradeHandler = o
    extension (v: MHD_UpgradeHandler)
      inline def value: CFuncPtr7[Ptr[Byte], Ptr[MHD_Connection], Ptr[
        Byte
      ], CString, size_t, MHD_socket, Ptr[MHD_UpgradeResponseHandle], Unit] = v

  /** [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_socket = CInt
  object MHD_socket:
    given _tag: Tag[MHD_socket] = Tag.Int
    inline def apply(inline o: CInt): MHD_socket = o
    extension (v: MHD_socket) inline def value: CInt = v

  /** [bindgen] header:
    * /Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/usr/include/arm/_types.h
    */
  opaque type __darwin_intptr_t = CLongInt
  object __darwin_intptr_t:
    given _tag: Tag[__darwin_intptr_t] = Tag.Long
    inline def apply(inline o: CLongInt): __darwin_intptr_t = o
    extension (v: __darwin_intptr_t) inline def value: CLongInt = v

  type fd_set = posix.sys.select.fd_set
  object fd_set:
    val _tag: Tag[fd_set] = summon[Tag[posix.sys.select.fd_set]]
    inline def apply(inline o: posix.sys.select.fd_set): fd_set = o
    extension (v: fd_set) inline def value: posix.sys.select.fd_set = v

  type int32_t = scala.scalanative.unsafe.CInt
  object int32_t:
    val _tag: Tag[int32_t] = summon[Tag[scala.scalanative.unsafe.CInt]]
    inline def apply(inline o: scala.scalanative.unsafe.CInt): int32_t = o
    extension (v: int32_t) inline def value: scala.scalanative.unsafe.CInt = v

  /** [bindgen] header:
    * /Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/usr/include/sys/_types/_intptr_t.h
    */
  type intptr_t = __darwin_intptr_t
  object intptr_t:
    given _tag: Tag[intptr_t] = __darwin_intptr_t._tag
    inline def apply(inline o: __darwin_intptr_t): intptr_t = o
    extension (v: intptr_t) inline def value: __darwin_intptr_t = v

  type off_t = posix.unistd.off_t
  object off_t:
    val _tag: Tag[off_t] = summon[Tag[posix.unistd.off_t]]
    inline def apply(inline o: posix.unistd.off_t): off_t = o
    extension (v: off_t) inline def value: posix.unistd.off_t = v

  type size_t = libc.stddef.size_t
  object size_t:
    val _tag: Tag[size_t] = summon[Tag[libc.stddef.size_t]]
    inline def apply(inline o: libc.stddef.size_t): size_t = o
    extension (v: size_t) inline def value: libc.stddef.size_t = v

  type sockaddr = posix.sys.socket.sockaddr
  object sockaddr:
    val _tag: Tag[sockaddr] = summon[Tag[posix.sys.socket.sockaddr]]
    inline def apply(inline o: posix.sys.socket.sockaddr): sockaddr = o
    extension (v: sockaddr) inline def value: posix.sys.socket.sockaddr = v

  type socklen_t = posix.sys.socket.socklen_t
  object socklen_t:
    val _tag: Tag[socklen_t] = summon[Tag[posix.sys.socket.socklen_t]]
    inline def apply(inline o: posix.sys.socket.socklen_t): socklen_t = o
    extension (v: socklen_t) inline def value: posix.sys.socket.socklen_t = v

  type ssize_t = posix.sys.types.ssize_t
  object ssize_t:
    val _tag: Tag[ssize_t] = summon[Tag[posix.sys.types.ssize_t]]
    inline def apply(inline o: posix.sys.types.ssize_t): ssize_t = o
    extension (v: ssize_t) inline def value: posix.sys.types.ssize_t = v

  type uint16_t = scala.scalanative.unsigned.UShort
  object uint16_t:
    val _tag: Tag[uint16_t] = summon[Tag[scala.scalanative.unsigned.UShort]]
    inline def apply(inline o: scala.scalanative.unsigned.UShort): uint16_t = o
    extension (v: uint16_t)
      inline def value: scala.scalanative.unsigned.UShort = v

  type uint32_t = scala.scalanative.unsigned.UInt
  object uint32_t:
    val _tag: Tag[uint32_t] = summon[Tag[scala.scalanative.unsigned.UInt]]
    inline def apply(inline o: scala.scalanative.unsigned.UInt): uint32_t = o
    extension (v: uint32_t)
      inline def value: scala.scalanative.unsigned.UInt = v

  type uint64_t = scala.scalanative.unsigned.ULong
  object uint64_t:
    val _tag: Tag[uint64_t] = summon[Tag[scala.scalanative.unsigned.ULong]]
    inline def apply(inline o: scala.scalanative.unsigned.ULong): uint64_t = o
    extension (v: uint64_t)
      inline def value: scala.scalanative.unsigned.ULong = v

  type uint8_t = scala.scalanative.unsigned.UByte
  object uint8_t:
    val _tag: Tag[uint8_t] = summon[Tag[scala.scalanative.unsigned.UByte]]
    inline def apply(inline o: scala.scalanative.unsigned.UByte): uint8_t = o
    extension (v: uint8_t)
      inline def value: scala.scalanative.unsigned.UByte = v

  type va_list = unsafe.CVarArgList
  object va_list:
    val _tag: Tag[va_list] = summon[Tag[unsafe.CVarArgList]]
    inline def apply(inline o: unsafe.CVarArgList): va_list = o
    extension (v: va_list) inline def value: unsafe.CVarArgList = v

object structs:
  import _root_.microhttpd.enumerations.*
  import _root_.microhttpd.aliases.*
  import _root_.microhttpd.structs.*
  import _root_.microhttpd.unions.*

  /** Handle for a connection / HTTP request.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_Connection = CStruct0
  object MHD_Connection:
    given _tag: Tag[MHD_Connection] = Tag.materializeCStruct0Tag

  /** Handle for the daemon (listening on a socket for HTTP traffic).
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_Daemon = CStruct0
  object MHD_Daemon:
    given _tag: Tag[MHD_Daemon] = Tag.materializeCStruct0Tag

  /** I/O vector type. Provided for use with #MHD_create_response_from_iovec().
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_IoVec = CStruct2[Ptr[Byte], size_t]
  object MHD_IoVec:
    given _tag: Tag[MHD_IoVec] = Tag.materializeCStruct2Tag[Ptr[Byte], size_t]
    def apply()(using Zone): Ptr[MHD_IoVec] =
      scala.scalanative.unsafe.alloc[MHD_IoVec](1)
    def apply(iov_base: Ptr[Byte], iov_len: size_t)(using
        Zone
    ): Ptr[MHD_IoVec] =
      val ____ptr = apply()
      (!____ptr).iov_base = iov_base
      (!____ptr).iov_len = iov_len
      ____ptr
    extension (struct: MHD_IoVec)
      def iov_base: Ptr[Byte] = struct._1
      def iov_base_=(value: Ptr[Byte]): Unit = !struct.at1 = value
      def iov_len: size_t = struct._2
      def iov_len_=(value: size_t): Unit = !struct.at2 = value

  /** Entry in an #MHD_OPTION_ARRAY.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_OptionItem = CStruct3[MHD_OPTION, intptr_t, Ptr[Byte]]
  object MHD_OptionItem:
    given _tag: Tag[MHD_OptionItem] =
      Tag.materializeCStruct3Tag[MHD_OPTION, intptr_t, Ptr[Byte]]
    def apply()(using Zone): Ptr[MHD_OptionItem] =
      scala.scalanative.unsafe.alloc[MHD_OptionItem](1)
    def apply(option: MHD_OPTION, value: intptr_t, ptr_value: Ptr[Byte])(using
        Zone
    ): Ptr[MHD_OptionItem] =
      val ____ptr = apply()
      (!____ptr).option = option
      (!____ptr).value = value
      (!____ptr).ptr_value = ptr_value
      ____ptr
    extension (struct: MHD_OptionItem)
      def option: MHD_OPTION = struct._1
      def option_=(value: MHD_OPTION): Unit = !struct.at1 = value
      def value: intptr_t = struct._2
      def value_=(value: intptr_t): Unit = !struct.at2 = value
      def ptr_value: Ptr[Byte] = struct._3
      def ptr_value_=(value: Ptr[Byte]): Unit = !struct.at3 = value

  /** Handle for POST processing.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_PostProcessor = CStruct0
  object MHD_PostProcessor:
    given _tag: Tag[MHD_PostProcessor] = Tag.materializeCStruct0Tag

  /** Handle for a response.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_Response = CStruct0
  object MHD_Response:
    given _tag: Tag[MHD_Response] = Tag.materializeCStruct0Tag

  /** Handle given to the application to manage special actions relating to MHD
    * responses that "upgrade" the HTTP protocol (i.e. to WebSockets).
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_UpgradeResponseHandle = CStruct0
  object MHD_UpgradeResponseHandle:
    given _tag: Tag[MHD_UpgradeResponseHandle] = Tag.materializeCStruct0Tag

object unions:
  import _root_.microhttpd.enumerations.*
  import _root_.microhttpd.aliases.*
  import _root_.microhttpd.structs.*
  import _root_.microhttpd.unions.*

  /** Information about a connection.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_ConnectionInfo = CArray[Byte, Nat._8]
  object MHD_ConnectionInfo:
    given _tag: Tag[MHD_ConnectionInfo] =
      Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
    def apply()(using Zone): Ptr[MHD_ConnectionInfo] =
      val ___ptr = alloc[MHD_ConnectionInfo](1)
      ___ptr
    @scala.annotation.targetName("apply_cipher_algorithm")
    def apply(cipher_algorithm: CInt)(using Zone): Ptr[MHD_ConnectionInfo] =
      val ___ptr = alloc[MHD_ConnectionInfo](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[CInt]].update(0, cipher_algorithm)
      ___ptr
    @scala.annotation.targetName("apply_protocol")
    def apply(protocol: CInt)(using Zone): Ptr[MHD_ConnectionInfo] =
      val ___ptr = alloc[MHD_ConnectionInfo](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[CInt]].update(0, protocol)
      ___ptr
    @scala.annotation.targetName("apply_suspended")
    def apply(suspended: CInt)(using Zone): Ptr[MHD_ConnectionInfo] =
      val ___ptr = alloc[MHD_ConnectionInfo](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[CInt]].update(0, suspended)
      ___ptr
    @scala.annotation.targetName("apply_connection_timeout")
    def apply(connection_timeout: CUnsignedInt)(using
        Zone
    ): Ptr[MHD_ConnectionInfo] =
      val ___ptr = alloc[MHD_ConnectionInfo](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[CUnsignedInt]].update(0, connection_timeout)
      ___ptr
    @scala.annotation.targetName("apply_http_status")
    def apply(http_status: CUnsignedInt)(using Zone): Ptr[MHD_ConnectionInfo] =
      val ___ptr = alloc[MHD_ConnectionInfo](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[CUnsignedInt]].update(0, http_status)
      ___ptr
    @scala.annotation.targetName("apply_connect_fd")
    def apply(connect_fd: MHD_socket)(using Zone): Ptr[MHD_ConnectionInfo] =
      val ___ptr = alloc[MHD_ConnectionInfo](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[MHD_socket]].update(0, connect_fd)
      ___ptr
    @scala.annotation.targetName("apply_header_size")
    def apply(header_size: size_t)(using Zone): Ptr[MHD_ConnectionInfo] =
      val ___ptr = alloc[MHD_ConnectionInfo](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[size_t]].update(0, header_size)
      ___ptr
    @scala.annotation.targetName("apply_tls_session")
    def apply(tls_session: Ptr[Byte])(using Zone): Ptr[MHD_ConnectionInfo] =
      val ___ptr = alloc[MHD_ConnectionInfo](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[Ptr[Byte]]].update(0, tls_session)
      ___ptr
    @scala.annotation.targetName("apply_client_cert")
    def apply(client_cert: Ptr[Byte])(using Zone): Ptr[MHD_ConnectionInfo] =
      val ___ptr = alloc[MHD_ConnectionInfo](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[Ptr[Byte]]].update(0, client_cert)
      ___ptr
    @scala.annotation.targetName("apply_client_addr")
    def apply(client_addr: Ptr[sockaddr])(using Zone): Ptr[MHD_ConnectionInfo] =
      val ___ptr = alloc[MHD_ConnectionInfo](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[Ptr[sockaddr]]].update(0, client_addr)
      ___ptr
    @scala.annotation.targetName("apply_daemon")
    def apply(daemon: Ptr[MHD_Daemon])(using Zone): Ptr[MHD_ConnectionInfo] =
      val ___ptr = alloc[MHD_ConnectionInfo](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[Ptr[MHD_Daemon]]].update(0, daemon)
      ___ptr
    @scala.annotation.targetName("apply_socket_context")
    def apply(socket_context: Ptr[Byte])(using Zone): Ptr[MHD_ConnectionInfo] =
      val ___ptr = alloc[MHD_ConnectionInfo](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[Ptr[Byte]]].update(0, socket_context)
      ___ptr
    extension (struct: MHD_ConnectionInfo)
      def cipher_algorithm: CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
      def cipher_algorithm_=(value: CInt): Unit =
        !struct.at(0).asInstanceOf[Ptr[CInt]] = value
      def protocol: CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
      def protocol_=(value: CInt): Unit =
        !struct.at(0).asInstanceOf[Ptr[CInt]] = value
      def suspended: CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
      def suspended_=(value: CInt): Unit =
        !struct.at(0).asInstanceOf[Ptr[CInt]] = value
      def connection_timeout: CUnsignedInt =
        !struct.at(0).asInstanceOf[Ptr[CUnsignedInt]]
      def connection_timeout_=(value: CUnsignedInt): Unit =
        !struct.at(0).asInstanceOf[Ptr[CUnsignedInt]] = value
      def http_status: CUnsignedInt =
        !struct.at(0).asInstanceOf[Ptr[CUnsignedInt]]
      def http_status_=(value: CUnsignedInt): Unit =
        !struct.at(0).asInstanceOf[Ptr[CUnsignedInt]] = value
      def connect_fd: MHD_socket = !struct.at(0).asInstanceOf[Ptr[MHD_socket]]
      def connect_fd_=(value: MHD_socket): Unit =
        !struct.at(0).asInstanceOf[Ptr[MHD_socket]] = value
      def header_size: size_t = !struct.at(0).asInstanceOf[Ptr[size_t]]
      def header_size_=(value: size_t): Unit =
        !struct.at(0).asInstanceOf[Ptr[size_t]] = value
      def tls_session: Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
      def tls_session_=(value: Ptr[Byte]): Unit =
        !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def client_cert: Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
      def client_cert_=(value: Ptr[Byte]): Unit =
        !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]] = value
      def client_addr: Ptr[sockaddr] =
        !struct.at(0).asInstanceOf[Ptr[Ptr[sockaddr]]]
      def client_addr_=(value: Ptr[sockaddr]): Unit =
        !struct.at(0).asInstanceOf[Ptr[Ptr[sockaddr]]] = value
      def daemon: Ptr[MHD_Daemon] =
        !struct.at(0).asInstanceOf[Ptr[Ptr[MHD_Daemon]]]
      def daemon_=(value: Ptr[MHD_Daemon]): Unit =
        !struct.at(0).asInstanceOf[Ptr[Ptr[MHD_Daemon]]] = value
      def socket_context: Ptr[Byte] = !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]]
      def socket_context_=(value: Ptr[Byte]): Unit =
        !struct.at(0).asInstanceOf[Ptr[Ptr[Byte]]] = value

  /** Information about an MHD daemon.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  opaque type MHD_DaemonInfo = CArray[Byte, Nat._8]
  object MHD_DaemonInfo:
    given _tag: Tag[MHD_DaemonInfo] =
      Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
    def apply()(using Zone): Ptr[MHD_DaemonInfo] =
      val ___ptr = alloc[MHD_DaemonInfo](1)
      ___ptr
    @scala.annotation.targetName("apply_key_size")
    def apply(key_size: size_t)(using Zone): Ptr[MHD_DaemonInfo] =
      val ___ptr = alloc[MHD_DaemonInfo](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[size_t]].update(0, key_size)
      ___ptr
    @scala.annotation.targetName("apply_mac_key_size")
    def apply(mac_key_size: size_t)(using Zone): Ptr[MHD_DaemonInfo] =
      val ___ptr = alloc[MHD_DaemonInfo](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[size_t]].update(0, mac_key_size)
      ___ptr
    @scala.annotation.targetName("apply_listen_fd")
    def apply(listen_fd: MHD_socket)(using Zone): Ptr[MHD_DaemonInfo] =
      val ___ptr = alloc[MHD_DaemonInfo](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[MHD_socket]].update(0, listen_fd)
      ___ptr
    @scala.annotation.targetName("apply_port")
    def apply(port: uint16_t)(using Zone): Ptr[MHD_DaemonInfo] =
      val ___ptr = alloc[MHD_DaemonInfo](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[uint16_t]].update(0, port)
      ___ptr
    @scala.annotation.targetName("apply_epoll_fd")
    def apply(epoll_fd: CInt)(using Zone): Ptr[MHD_DaemonInfo] =
      val ___ptr = alloc[MHD_DaemonInfo](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[CInt]].update(0, epoll_fd)
      ___ptr
    @scala.annotation.targetName("apply_num_connections")
    def apply(num_connections: CUnsignedInt)(using Zone): Ptr[MHD_DaemonInfo] =
      val ___ptr = alloc[MHD_DaemonInfo](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[CUnsignedInt]].update(0, num_connections)
      ___ptr
    @scala.annotation.targetName("apply_flags")
    def apply(flags: MHD_FLAG)(using Zone): Ptr[MHD_DaemonInfo] =
      val ___ptr = alloc[MHD_DaemonInfo](1)
      val un = !___ptr
      un.at(0).asInstanceOf[Ptr[MHD_FLAG]].update(0, flags)
      ___ptr
    extension (struct: MHD_DaemonInfo)
      def key_size: size_t = !struct.at(0).asInstanceOf[Ptr[size_t]]
      def key_size_=(value: size_t): Unit =
        !struct.at(0).asInstanceOf[Ptr[size_t]] = value
      def mac_key_size: size_t = !struct.at(0).asInstanceOf[Ptr[size_t]]
      def mac_key_size_=(value: size_t): Unit =
        !struct.at(0).asInstanceOf[Ptr[size_t]] = value
      def listen_fd: MHD_socket = !struct.at(0).asInstanceOf[Ptr[MHD_socket]]
      def listen_fd_=(value: MHD_socket): Unit =
        !struct.at(0).asInstanceOf[Ptr[MHD_socket]] = value
      def port: uint16_t = !struct.at(0).asInstanceOf[Ptr[uint16_t]]
      def port_=(value: uint16_t): Unit =
        !struct.at(0).asInstanceOf[Ptr[uint16_t]] = value
      def epoll_fd: CInt = !struct.at(0).asInstanceOf[Ptr[CInt]]
      def epoll_fd_=(value: CInt): Unit =
        !struct.at(0).asInstanceOf[Ptr[CInt]] = value
      def num_connections: CUnsignedInt =
        !struct.at(0).asInstanceOf[Ptr[CUnsignedInt]]
      def num_connections_=(value: CUnsignedInt): Unit =
        !struct.at(0).asInstanceOf[Ptr[CUnsignedInt]] = value
      def flags: MHD_FLAG = !struct.at(0).asInstanceOf[Ptr[MHD_FLAG]]
      def flags_=(value: MHD_FLAG): Unit =
        !struct.at(0).asInstanceOf[Ptr[MHD_FLAG]] = value

@extern
private[microhttpd] object extern_functions:
  import _root_.microhttpd.enumerations.*
  import _root_.microhttpd.aliases.*
  import _root_.microhttpd.structs.*
  import _root_.microhttpd.unions.*

  /** Add another client connection to the set of connections managed by MHD.
    * This API is usually not needed (since MHD will accept inbound connections
    * on the server socket). Use this API in special cases, for example if your
    * HTTP server is behind NAT and needs to connect out to the HTTP client, or
    * if you are building a proxy.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_add_connection(
      daemon: Ptr[MHD_Daemon],
      client_socket: MHD_socket,
      addr: Ptr[sockaddr],
      addrlen: socklen_t
  ): MHD_Result = extern

  /** Add a footer line to the response.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_add_response_footer(
      response: Ptr[MHD_Response],
      footer: CString,
      content: CString
  ): MHD_Result = extern

  /** Add a header line to the response.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_add_response_header(
      response: Ptr[MHD_Response],
      header: CString,
      content: CString
  ): MHD_Result = extern

  /** Get the username and password from the basic authorization header sent by
    * the client
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_basic_auth_get_username_password(
      connection: Ptr[MHD_Connection],
      password: Ptr[CString]
  ): CString = extern

  /** Create a `struct MHD_PostProcessor`.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_create_post_processor(
      connection: Ptr[MHD_Connection],
      buffer_size: size_t,
      iter: MHD_PostDataIterator,
      iter_cls: Ptr[Byte]
  ): Ptr[MHD_PostProcessor] = extern

  /** Create a response object that can be used for 101 UPGRADE responses, for
    * example to implement WebSockets. After sending the response, control over
    * the data stream is given to the callback (which can then, for example,
    * start some bi-directional communication). If the response is queued for
    * multiple connections, the callback will be called for each connection. The
    * callback will ONLY be called after the response header was successfully
    * passed to the OS; if there are communication errors before, the usual MHD
    * connection error handling code will be performed.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_create_response_for_upgrade(
      upgrade_handler: MHD_UpgradeHandler,
      upgrade_handler_cls: Ptr[Byte]
  ): Ptr[MHD_Response] = extern

  /** Create a response object with the content of provided buffer used as the
    * response body.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_create_response_from_buffer(
      size: size_t,
      buffer: Ptr[Byte],
      mode: MHD_ResponseMemoryMode
  ): Ptr[MHD_Response] = extern

  /** Create a response object with the content of provided buffer used as the
    * response body.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_create_response_from_buffer_with_free_callback(
      size: size_t,
      buffer: Ptr[Byte],
      crfc: MHD_ContentReaderFreeCallback
  ): Ptr[MHD_Response] = extern

  /** Create a response object with the content of provided buffer used as the
    * response body.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_create_response_from_buffer_with_free_callback_cls(
      size: size_t,
      buffer: Ptr[Byte],
      crfc: MHD_ContentReaderFreeCallback,
      crfc_cls: Ptr[Byte]
  ): Ptr[MHD_Response] = extern

  /** Create a response object. The response object can be extended with header
    * information and then be used any number of times.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_create_response_from_callback(
      size: uint64_t,
      block_size: size_t,
      crc: MHD_ContentReaderCallback,
      crc_cls: Ptr[Byte],
      crfc: MHD_ContentReaderFreeCallback
  ): Ptr[MHD_Response] = extern

  /** Create a response object. The response object can be extended with header
    * information and then be used any number of times.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_create_response_from_data(
      size: size_t,
      data: Ptr[Byte],
      must_free: CInt,
      must_copy: CInt
  ): Ptr[MHD_Response] = extern

  /** Create a response object with the content of provided file used as the
    * response body.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_create_response_from_fd(size: size_t, fd: CInt): Ptr[MHD_Response] =
    extern

  /** Create a response object with the content of provided file used as the
    * response body.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_create_response_from_fd64(
      size: uint64_t,
      fd: CInt
  ): Ptr[MHD_Response] = extern

  /** Create a response object with the content of provided file with specified
    * offset used as the response body.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_create_response_from_fd_at_offset(
      size: size_t,
      fd: CInt,
      offset: off_t
  ): Ptr[MHD_Response] = extern

  /** Create a response object with the content of provided file with specified
    * offset used as the response body.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_create_response_from_fd_at_offset64(
      size: uint64_t,
      fd: CInt,
      offset: uint64_t
  ): Ptr[MHD_Response] = extern

  /** Create a response object with an array of memory buffers used as the
    * response body.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_create_response_from_iovec(
      iov: Ptr[MHD_IoVec],
      iovcnt: CUnsignedInt,
      free_cb: MHD_ContentReaderFreeCallback,
      cls: Ptr[Byte]
  ): Ptr[MHD_Response] = extern

  /** Create a response object with the response body created by reading the
    * provided pipe.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_create_response_from_pipe(fd: CInt): Ptr[MHD_Response] = extern

  /** Delete a header (or footer) line from the response.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_del_response_header(
      response: Ptr[MHD_Response],
      header: CString,
      content: CString
  ): MHD_Result = extern

  /** Release PostProcessor resources.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_destroy_post_processor(pp: Ptr[MHD_PostProcessor]): MHD_Result =
    extern

  /** Destroy a response object and associated resources. Note that
    * libmicrohttpd may keep some of the resources around if the response is
    * still in the queue for some clients, so the memory may not necessarily be
    * freed immediately.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_destroy_response(response: Ptr[MHD_Response]): Unit = extern

  /** Authenticates the authorization header sent by the client. Uses
    * #MHD_DIGEST_ALG_MD5 (for now, for backwards-compatibility). Note that this
    * MAY change to #MHD_DIGEST_ALG_AUTO in the future. If you want to be sure
    * you get MD5, use #MHD_digest_auth_check2() and specify MD5 explicitly.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_digest_auth_check(
      connection: Ptr[MHD_Connection],
      realm: CString,
      username: CString,
      password: CString,
      nonce_timeout: CUnsignedInt
  ): CInt = extern

  /** Authenticates the authorization header sent by the client.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_digest_auth_check2(
      connection: Ptr[MHD_Connection],
      realm: CString,
      username: CString,
      password: CString,
      nonce_timeout: CUnsignedInt,
      algo: MHD_DigestAuthAlgorithm
  ): CInt = extern

  /** Authenticates the authorization header sent by the client Uses
    * #MHD_DIGEST_ALG_MD5 (required, as digest is of fixed size).
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_digest_auth_check_digest(
      connection: Ptr[MHD_Connection],
      realm: CString,
      username: CString,
      digest: CArray[uint8_t, Nat.Digit2[Nat._1, Nat._6]],
      nonce_timeout: CUnsignedInt
  ): CInt = extern

  /** Authenticates the authorization header sent by the client.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_digest_auth_check_digest2(
      connection: Ptr[MHD_Connection],
      realm: CString,
      username: CString,
      digest: Ptr[uint8_t],
      digest_size: size_t,
      nonce_timeout: CUnsignedInt,
      algo: MHD_DigestAuthAlgorithm
  ): CInt = extern

  /** Get the username from the authorization header sent by the client
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_digest_auth_get_username(connection: Ptr[MHD_Connection]): CString =
    extern

  /** Free the memory given by ptr. Calls "free(ptr)". This function should be
    * used to free the username returned by #MHD_digest_auth_get_username().
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_free(ptr: Ptr[Byte]): Unit = extern

  /** Obtain information about the given connection.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_get_connection_info(
      connection: Ptr[MHD_Connection],
      info_type: MHD_ConnectionInfoType,
      rest: Any*
  ): Ptr[MHD_ConnectionInfo] = extern

  /** Get all of the headers from the request.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_get_connection_values(
      connection: Ptr[MHD_Connection],
      kind: MHD_ValueKind,
      iterator: MHD_KeyValueIterator,
      iterator_cls: Ptr[Byte]
  ): CInt = extern

  /** Get all of the headers from the request.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_get_connection_values_n(
      connection: Ptr[MHD_Connection],
      kind: MHD_ValueKind,
      iterator: MHD_KeyValueIteratorN,
      iterator_cls: Ptr[Byte]
  ): CInt = extern

  /** Obtain information about the given daemon (not fully implemented!).
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_get_daemon_info(
      daemon: Ptr[MHD_Daemon],
      info_type: MHD_DaemonInfoType,
      rest: Any*
  ): Ptr[MHD_DaemonInfo] = extern

  /** Obtain the `select()` sets for this daemon. Daemon's FDs will be added to
    * fd_sets. To get only daemon FDs in fd_sets, call FD_ZERO for each fd_set
    * before calling this function. FD_SETSIZE is assumed to be platform's
    * default.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_get_fdset(
      daemon: Ptr[MHD_Daemon],
      read_fd_set: Ptr[fd_set],
      write_fd_set: Ptr[fd_set],
      except_fd_set: Ptr[fd_set],
      max_fd: Ptr[MHD_socket]
  ): MHD_Result = extern

  /** Obtain the `select()` sets for this daemon. Daemon's FDs will be added to
    * fd_sets. To get only daemon FDs in fd_sets, call FD_ZERO for each fd_set
    * before calling this function.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_get_fdset2(
      daemon: Ptr[MHD_Daemon],
      read_fd_set: Ptr[fd_set],
      write_fd_set: Ptr[fd_set],
      except_fd_set: Ptr[fd_set],
      max_fd: Ptr[MHD_socket],
      fd_setsize: CUnsignedInt
  ): MHD_Result = extern

  /** Returns the string reason phrase for a response code.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_get_reason_phrase_for(code: CUnsignedInt): CString = extern

  /** Returns the length of the string reason phrase for a response code.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_get_reason_phrase_len_for(code: CUnsignedInt): size_t = extern

  /** Get a particular header (or footer) from the response.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_get_response_header(
      response: Ptr[MHD_Response],
      key: CString
  ): CString = extern

  /** Get all of the headers (and footers) added to a response.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_get_response_headers(
      response: Ptr[MHD_Response],
      iterator: MHD_KeyValueIterator,
      iterator_cls: Ptr[Byte]
  ): CInt = extern

  /** Obtain timeout value for polling function for this daemon.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_get_timeout(
      daemon: Ptr[MHD_Daemon],
      timeout: Ptr[CUnsignedLongLong]
  ): MHD_Result = extern

  /** Obtain the version of this library
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_get_version(): CString = extern

  /** Obtain the version of this library as a binary value.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_get_version_bin(): uint32_t = extern

  /** Process escape sequences ('%HH') Updates val in place; the result should
    * be UTF-8 encoded and cannot be larger than the input. The result must also
    * still be 0-terminated.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_http_unescape(`val`: CString): size_t = extern

  /** Get information about supported MHD features. Indicate that MHD was
    * compiled with or without support for particular feature. Some features
    * require additional support by kernel. Kernel support is not checked by
    * this function.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_is_feature_supported(feature: MHD_FEATURE): MHD_Result = extern

  /** Get a particular header value. If multiple values match the kind, return
    * any one of them.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_lookup_connection_value(
      connection: Ptr[MHD_Connection],
      kind: MHD_ValueKind,
      key: CString
  ): CString = extern

  /** Get a particular header value. If multiple values match the kind, return
    * any one of them.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_lookup_connection_value_n(
      connection: Ptr[MHD_Connection],
      kind: MHD_ValueKind,
      key: CString,
      key_size: size_t,
      value_ptr: Ptr[CString],
      value_size_ptr: Ptr[size_t]
  ): MHD_Result = extern

  /** Parse and process POST data. Call this function when POST data is
    * available (usually during an #MHD_AccessHandlerCallback) with the
    * "upload_data" and "upload_data_size". Whenever possible, this will then
    * cause calls to the #MHD_PostDataIterator.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_post_process(
      pp: Ptr[MHD_PostProcessor],
      post_data: CString,
      post_data_len: size_t
  ): MHD_Result = extern

  /** Queues a response to request authentication from the client For now uses
    * MD5 (for backwards-compatibility). Still, if you need to be sure, use
    * #MHD_queue_fail_auth_response2().
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_queue_auth_fail_response(
      connection: Ptr[MHD_Connection],
      realm: CString,
      opaque: CString,
      response: Ptr[MHD_Response],
      signal_stale: CInt
  ): MHD_Result = extern

  /** Queues a response to request authentication from the client
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_queue_auth_fail_response2(
      connection: Ptr[MHD_Connection],
      realm: CString,
      opaque: CString,
      response: Ptr[MHD_Response],
      signal_stale: CInt,
      algo: MHD_DigestAuthAlgorithm
  ): MHD_Result = extern

  /** Queues a response to request basic authentication from the client The
    * given response object is expected to include the payload for the response;
    * the "WWW-Authenticate" header will be added and the response queued with
    * the 'UNAUTHORIZED' status code.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_queue_basic_auth_fail_response(
      connection: Ptr[MHD_Connection],
      realm: CString,
      response: Ptr[MHD_Response]
  ): MHD_Result = extern

  /** Queue a response to be transmitted to the client (as soon as possible but
    * after #MHD_AccessHandlerCallback returns).
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_queue_response(
      connection: Ptr[MHD_Connection],
      status_code: CUnsignedInt,
      response: Ptr[MHD_Response]
  ): MHD_Result = extern

  /** Stop accepting connections from the listening socket. Allows clients to
    * continue processing, but stops accepting new connections. Note that the
    * caller is responsible for closing the returned socket; however, if MHD is
    * run using threads (anything but "external" sockets polling mode), it must
    * not be closed until AFTER #MHD_stop_daemon has been called (as it is
    * theoretically possible that an existing thread is still using it).
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_quiesce_daemon(daemon: Ptr[MHD_Daemon]): MHD_socket = extern

  /** Resume handling of network data for suspended connection. It is safe to
    * resume a suspended connection at any time. Calling this function on a
    * connection that was not previously suspended will result in undefined
    * behavior.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_resume_connection(connection: Ptr[MHD_Connection]): Unit = extern

  /** Run webserver operations (without blocking unless in client callbacks).
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_run(daemon: Ptr[MHD_Daemon]): MHD_Result = extern

  /** Run webserver operations. This method should be called by clients in
    * combination with #MHD_get_fdset and #MHD_get_timeout() if the
    * client-controlled select method is used.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_run_from_select(
      daemon: Ptr[MHD_Daemon],
      read_fd_set: Ptr[fd_set],
      write_fd_set: Ptr[fd_set],
      except_fd_set: Ptr[fd_set]
  ): MHD_Result = extern

  /** Run websever operation with possible blocking.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_run_wait(daemon: Ptr[MHD_Daemon], millisec: int32_t): MHD_Result =
    extern

  /** Set a custom option for the given connection, overriding defaults.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_set_connection_option(
      connection: Ptr[MHD_Connection],
      option: MHD_CONNECTION_OPTION,
      rest: Any*
  ): MHD_Result = extern

  /** This function can be used to add an entry to the HTTP headers of a
    * connection (so that the #MHD_get_connection_values function will return
    * them -- and the `struct MHD_PostProcessor` will also see them). This maybe
    * required in certain situations (see Mantis #1399) where (broken) HTTP
    * implementations fail to supply values
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_set_connection_value(
      connection: Ptr[MHD_Connection],
      kind: MHD_ValueKind,
      key: CString,
      value: CString
  ): MHD_Result = extern

  /** This function can be used to add an arbitrary entry to connection. This
    * function could add entry with binary zero, which is allowed for
    * #MHD_GET_ARGUMENT_KIND. For other kind on entries it is recommended to use
    * #MHD_set_connection_value.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_set_connection_value_n(
      connection: Ptr[MHD_Connection],
      kind: MHD_ValueKind,
      key: CString,
      key_size: size_t,
      value: CString,
      value_size: size_t
  ): MHD_Result = extern

  /** Sets the global error handler to a different implementation. cb will only
    * be called in the case of typically fatal, serious internal consistency
    * issues. These issues should only arise in the case of serious memory
    * corruption or similar problems with the architecture. While cb is allowed
    * to return and MHD will then try to continue, this is never safe.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_set_panic_func(cb: MHD_PanicCallback, cls: Ptr[Byte]): Unit = extern

  /** Set special flags and options for a response.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_set_response_options(
      response: Ptr[MHD_Response],
      flags: MHD_ResponseFlags,
      rest: Any*
  ): MHD_Result = extern

  /** Start a webserver on the given port. Variadic version of
    * #MHD_start_daemon_va.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_start_daemon(
      flags: CUnsignedInt,
      port: uint16_t,
      apc: MHD_AcceptPolicyCallback,
      apc_cls: Ptr[Byte],
      dh: MHD_AccessHandlerCallback,
      dh_cls: Ptr[Byte],
      rest: Any*
  ): Ptr[MHD_Daemon] = extern

  /** Start a webserver on the given port.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_start_daemon_va(
      flags: CUnsignedInt,
      port: uint16_t,
      apc: MHD_AcceptPolicyCallback,
      apc_cls: Ptr[Byte],
      dh: MHD_AccessHandlerCallback,
      dh_cls: Ptr[Byte],
      ap: va_list
  ): Ptr[MHD_Daemon] = extern

  /** Shutdown an HTTP daemon.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_stop_daemon(daemon: Ptr[MHD_Daemon]): Unit = extern

  /** Suspend handling of network data for a given connection. This can be used
    * to dequeue a connection from MHD's event loop (not applicable to
    * thread-per-connection!) for a while.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_suspend_connection(connection: Ptr[MHD_Connection]): Unit = extern

  /** This connection-specific callback is provided by MHD to applications
    * (unusual) during the #MHD_UpgradeHandler. It allows applications to
    * perform 'special' actions on the underlying socket from the upgrade.
    *
    * [bindgen] header:
    * /Users/velvetbaldmime/Library/Caches/sbt-vcpkg/vcpkg-install/arm64-osx/lib/pkgconfig/../../include/microhttpd.h
    */
  def MHD_upgrade_action(
      urh: Ptr[MHD_UpgradeResponseHandle],
      action: MHD_UpgradeAction,
      rest: Any*
  ): MHD_Result = extern

object functions:
  import _root_.microhttpd.enumerations.*
  import _root_.microhttpd.aliases.*
  import _root_.microhttpd.structs.*
  import _root_.microhttpd.unions.*

  import extern_functions.*
  export extern_functions.*

object types:
  export _root_.microhttpd.structs.*
  export _root_.microhttpd.aliases.*
  export _root_.microhttpd.unions.*
  export _root_.microhttpd.enumerations.*

object all:
  export _root_.microhttpd.enumerations.MHD_CONNECTION_OPTION
  export _root_.microhttpd.enumerations.MHD_ConnectionInfoType
  export _root_.microhttpd.enumerations.MHD_ConnectionNotificationCode
  export _root_.microhttpd.enumerations.MHD_DaemonInfoType
  export _root_.microhttpd.enumerations.MHD_DigestAuthAlgorithm
  export _root_.microhttpd.enumerations.MHD_DisableSanityCheck
  export _root_.microhttpd.enumerations.MHD_FEATURE
  export _root_.microhttpd.enumerations.MHD_FLAG
  export _root_.microhttpd.enumerations.MHD_OPTION
  export _root_.microhttpd.enumerations.MHD_RequestTerminationCode
  export _root_.microhttpd.enumerations.MHD_ResponseFlags
  export _root_.microhttpd.enumerations.MHD_ResponseMemoryMode
  export _root_.microhttpd.enumerations.MHD_ResponseOptions
  export _root_.microhttpd.enumerations.MHD_Result
  export _root_.microhttpd.enumerations.MHD_UpgradeAction
  export _root_.microhttpd.enumerations.MHD_ValueKind
  export _root_.microhttpd.aliases.MHD_AcceptPolicyCallback
  export _root_.microhttpd.aliases.MHD_AccessHandlerCallback
  export _root_.microhttpd.aliases.MHD_ContentReaderCallback
  export _root_.microhttpd.aliases.MHD_ContentReaderFreeCallback
  export _root_.microhttpd.aliases.MHD_KeyValueIterator
  export _root_.microhttpd.aliases.MHD_KeyValueIteratorN
  export _root_.microhttpd.aliases.MHD_LogCallback
  export _root_.microhttpd.aliases.MHD_NotifyConnectionCallback
  export _root_.microhttpd.aliases.MHD_PanicCallback
  export _root_.microhttpd.aliases.MHD_PostDataIterator
  export _root_.microhttpd.aliases.MHD_PskServerCredentialsCallback
  export _root_.microhttpd.aliases.MHD_RequestCompletedCallback
  export _root_.microhttpd.aliases.MHD_UpgradeHandler
  export _root_.microhttpd.aliases.MHD_socket
  export _root_.microhttpd.aliases.__darwin_intptr_t
  export _root_.microhttpd.aliases.fd_set
  export _root_.microhttpd.aliases.int32_t
  export _root_.microhttpd.aliases.intptr_t
  export _root_.microhttpd.aliases.off_t
  export _root_.microhttpd.aliases.size_t
  export _root_.microhttpd.aliases.sockaddr
  export _root_.microhttpd.aliases.socklen_t
  export _root_.microhttpd.aliases.ssize_t
  export _root_.microhttpd.aliases.uint16_t
  export _root_.microhttpd.aliases.uint32_t
  export _root_.microhttpd.aliases.uint64_t
  export _root_.microhttpd.aliases.uint8_t
  export _root_.microhttpd.aliases.va_list
  export _root_.microhttpd.structs.MHD_Connection
  export _root_.microhttpd.structs.MHD_Daemon
  export _root_.microhttpd.structs.MHD_IoVec
  export _root_.microhttpd.structs.MHD_OptionItem
  export _root_.microhttpd.structs.MHD_PostProcessor
  export _root_.microhttpd.structs.MHD_Response
  export _root_.microhttpd.structs.MHD_UpgradeResponseHandle
  export _root_.microhttpd.unions.MHD_ConnectionInfo
  export _root_.microhttpd.unions.MHD_DaemonInfo
  export _root_.microhttpd.functions.MHD_add_connection
  export _root_.microhttpd.functions.MHD_add_response_footer
  export _root_.microhttpd.functions.MHD_add_response_header
  export _root_.microhttpd.functions.MHD_basic_auth_get_username_password
  export _root_.microhttpd.functions.MHD_create_post_processor
  export _root_.microhttpd.functions.MHD_create_response_for_upgrade
  export _root_.microhttpd.functions.MHD_create_response_from_buffer
  export _root_.microhttpd.functions.MHD_create_response_from_buffer_with_free_callback
  export _root_.microhttpd.functions.MHD_create_response_from_buffer_with_free_callback_cls
  export _root_.microhttpd.functions.MHD_create_response_from_callback
  export _root_.microhttpd.functions.MHD_create_response_from_data
  export _root_.microhttpd.functions.MHD_create_response_from_fd
  export _root_.microhttpd.functions.MHD_create_response_from_fd64
  export _root_.microhttpd.functions.MHD_create_response_from_fd_at_offset
  export _root_.microhttpd.functions.MHD_create_response_from_fd_at_offset64
  export _root_.microhttpd.functions.MHD_create_response_from_iovec
  export _root_.microhttpd.functions.MHD_create_response_from_pipe
  export _root_.microhttpd.functions.MHD_del_response_header
  export _root_.microhttpd.functions.MHD_destroy_post_processor
  export _root_.microhttpd.functions.MHD_destroy_response
  export _root_.microhttpd.functions.MHD_digest_auth_check
  export _root_.microhttpd.functions.MHD_digest_auth_check2
  export _root_.microhttpd.functions.MHD_digest_auth_check_digest
  export _root_.microhttpd.functions.MHD_digest_auth_check_digest2
  export _root_.microhttpd.functions.MHD_digest_auth_get_username
  export _root_.microhttpd.functions.MHD_free
  export _root_.microhttpd.functions.MHD_get_connection_info
  export _root_.microhttpd.functions.MHD_get_connection_values
  export _root_.microhttpd.functions.MHD_get_connection_values_n
  export _root_.microhttpd.functions.MHD_get_daemon_info
  export _root_.microhttpd.functions.MHD_get_fdset
  export _root_.microhttpd.functions.MHD_get_fdset2
  export _root_.microhttpd.functions.MHD_get_reason_phrase_for
  export _root_.microhttpd.functions.MHD_get_reason_phrase_len_for
  export _root_.microhttpd.functions.MHD_get_response_header
  export _root_.microhttpd.functions.MHD_get_response_headers
  export _root_.microhttpd.functions.MHD_get_timeout
  export _root_.microhttpd.functions.MHD_get_version
  export _root_.microhttpd.functions.MHD_get_version_bin
  export _root_.microhttpd.functions.MHD_http_unescape
  export _root_.microhttpd.functions.MHD_is_feature_supported
  export _root_.microhttpd.functions.MHD_lookup_connection_value
  export _root_.microhttpd.functions.MHD_lookup_connection_value_n
  export _root_.microhttpd.functions.MHD_post_process
  export _root_.microhttpd.functions.MHD_queue_auth_fail_response
  export _root_.microhttpd.functions.MHD_queue_auth_fail_response2
  export _root_.microhttpd.functions.MHD_queue_basic_auth_fail_response
  export _root_.microhttpd.functions.MHD_queue_response
  export _root_.microhttpd.functions.MHD_quiesce_daemon
  export _root_.microhttpd.functions.MHD_resume_connection
  export _root_.microhttpd.functions.MHD_run
  export _root_.microhttpd.functions.MHD_run_from_select
  export _root_.microhttpd.functions.MHD_run_wait
  export _root_.microhttpd.functions.MHD_set_connection_option
  export _root_.microhttpd.functions.MHD_set_connection_value
  export _root_.microhttpd.functions.MHD_set_connection_value_n
  export _root_.microhttpd.functions.MHD_set_panic_func
  export _root_.microhttpd.functions.MHD_set_response_options
  export _root_.microhttpd.functions.MHD_start_daemon
  export _root_.microhttpd.functions.MHD_start_daemon_va
  export _root_.microhttpd.functions.MHD_stop_daemon
  export _root_.microhttpd.functions.MHD_suspend_connection
  export _root_.microhttpd.functions.MHD_upgrade_action
