
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/playapps/playLab2017_crud-part3-delete/conf/routes
// @DATE:Thu Aug 24 15:59:27 IST 2017


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
