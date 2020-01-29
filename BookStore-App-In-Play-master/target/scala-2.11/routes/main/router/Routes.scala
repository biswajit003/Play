
// @GENERATOR:play-routes-compiler
// @SOURCE:F:/PlayFrameworkProjects/BookStore-App-In-Play-master/conf/routes
// @DATE:Wed Jan 29 01:48:53 IST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_3: controllers.AsyncController,
  // @LINE:12
  BooksController_2: controllers.BooksController,
  // @LINE:23
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_3: controllers.AsyncController,
    // @LINE:12
    BooksController_2: controllers.BooksController,
    // @LINE:23
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_1, CountController_0, AsyncController_3, BooksController_2, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, CountController_0, AsyncController_3, BooksController_2, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books""", """controllers.BooksController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/create""", """controllers.BooksController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/""" + "$" + """id<[^/]+>""", """controllers.BooksController.show(id:Integer)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/edit""", """controllers.BooksController.update()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/edit/""" + "$" + """id<[^/]+>""", """controllers.BooksController.edit(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/create""", """controllers.BooksController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/delete/""" + "$" + """id<[^/]+>""", """controllers.BooksController.destroy(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_0.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_3.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_BooksController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books")))
  )
  private[this] lazy val controllers_BooksController_index3_invoker = createInvoker(
    BooksController_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """books"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_BooksController_create4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/create")))
  )
  private[this] lazy val controllers_BooksController_create4_invoker = createInvoker(
    BooksController_2.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "create",
      Nil,
      "GET",
      """""",
      this.prefix + """books/create"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_BooksController_show5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_show5_invoker = createInvoker(
    BooksController_2.show(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """books/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_BooksController_update6_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/edit")))
  )
  private[this] lazy val controllers_BooksController_update6_invoker = createInvoker(
    BooksController_2.update(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "update",
      Nil,
      "PUT",
      """""",
      this.prefix + """books/edit"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_BooksController_edit7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_edit7_invoker = createInvoker(
    BooksController_2.edit(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "edit",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """books/edit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_BooksController_save8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/create")))
  )
  private[this] lazy val controllers_BooksController_save8_invoker = createInvoker(
    BooksController_2.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """books/create"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_BooksController_destroy9_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_destroy9_invoker = createInvoker(
    BooksController_2.destroy(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "destroy",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """books/delete/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:12
    case controllers_BooksController_index3_route(params) =>
      call { 
        controllers_BooksController_index3_invoker.call(BooksController_2.index())
      }
  
    // @LINE:13
    case controllers_BooksController_create4_route(params) =>
      call { 
        controllers_BooksController_create4_invoker.call(BooksController_2.create())
      }
  
    // @LINE:14
    case controllers_BooksController_show5_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BooksController_show5_invoker.call(BooksController_2.show(id))
      }
  
    // @LINE:15
    case controllers_BooksController_update6_route(params) =>
      call { 
        controllers_BooksController_update6_invoker.call(BooksController_2.update())
      }
  
    // @LINE:16
    case controllers_BooksController_edit7_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BooksController_edit7_invoker.call(BooksController_2.edit(id))
      }
  
    // @LINE:18
    case controllers_BooksController_save8_route(params) =>
      call { 
        controllers_BooksController_save8_invoker.call(BooksController_2.save())
      }
  
    // @LINE:19
    case controllers_BooksController_destroy9_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BooksController_destroy9_invoker.call(BooksController_2.destroy(id))
      }
  
    // @LINE:23
    case controllers_Assets_versioned10_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
