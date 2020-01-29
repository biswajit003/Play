
// @GENERATOR:play-routes-compiler
// @SOURCE:F:/PlayFrameworkProjects/BookStore-App-In-Play-master/conf/routes
// @DATE:Wed Jan 29 01:48:53 IST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
