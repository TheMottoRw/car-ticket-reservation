// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ViewController_4: controllers.ViewController,
  // @LINE:24
  Users_2: controllers.Users,
  // @LINE:42
  Destinations_5: controllers.Destinations,
  // @LINE:48
  Stations_1: controllers.Stations,
  // @LINE:55
  Schedules_0: controllers.Schedules,
  // @LINE:61
  Reservations_3: controllers.Reservations,
  // @LINE:66
  Assets_6: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

  @javax.inject.Inject()
  def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ViewController_4: controllers.ViewController,
    // @LINE:24
    Users_2: controllers.Users,
    // @LINE:42
    Destinations_5: controllers.Destinations,
    // @LINE:48
    Stations_1: controllers.Stations,
    // @LINE:55
    Schedules_0: controllers.Schedules,
    // @LINE:61
    Reservations_3: controllers.Reservations,
    // @LINE:66
    Assets_6: controllers.Assets
  ) = this(errorHandler, ViewController_4, Users_2, Destinations_5, Stations_1, Schedules_0, Reservations_3, Assets_6, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ViewController_4, Users_2, Destinations_5, Stations_1, Schedules_0, Reservations_3, Assets_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ViewController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.ViewController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.ViewController.signup()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """companies""", """controllers.ViewController.companies()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """company""", """controllers.ViewController.companyAdd()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """company/""" + "$" + """id<[^/]+>""", """controllers.ViewController.companyUpdate(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """destination""", """controllers.ViewController.destinationAdd()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """destination/""" + "$" + """id<[^/]+>""", """controllers.ViewController.destinationUpdate(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """destinations""", """controllers.ViewController.destinations()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """station""", """controllers.ViewController.stationAdd()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """station/""" + "$" + """id<[^/]+>""", """controllers.ViewController.stationUpdate(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """stations""", """controllers.ViewController.stations()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """schedule""", """controllers.ViewController.scheduleAdd()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """schedule/""" + "$" + """id<[^/]+>""", """controllers.ViewController.scheduleUpdate(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """schedules""", """controllers.ViewController.schedules()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reservations""", """controllers.ViewController.reservations()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user""", """controllers.Users.save(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users""", """controllers.Users.find(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/""" + "$" + """id<[^/]+>""", """controllers.Users.findById(request:Request, id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users/type""", """controllers.Users.findByType(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/""" + "$" + """id<[^/]+>""", """controllers.Users.update(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/login""", """controllers.Users.login(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/""" + "$" + """id<[^/]+>/delete""", """controllers.Users.delete(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/""" + "$" + """id<[^/]+>/lock""", """controllers.Users.lock(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/""" + "$" + """id<[^/]+>/unlock""", """controllers.Users.unlock(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/""" + "$" + """id<[^/]+>/verify""", """controllers.Users.verifyAccount(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/forgot/password""", """controllers.Users.forgotPassword(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/verify/code""", """controllers.Users.verifyResetCode(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/resend/code""", """controllers.Users.forgotPassword(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/reset/password""", """controllers.Users.resetPassword(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/""" + "$" + """id<[^/]+>/changepassword""", """controllers.Users.updatePassword(request:Request, id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/companies""", """controllers.Users.findByType(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/destination""", """controllers.Destinations.save(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/destinations""", """controllers.Destinations.find(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/destination/""" + "$" + """id<[^/]+>""", """controllers.Destinations.findById(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/destination/""" + "$" + """id<[^/]+>""", """controllers.Destinations.update(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/destination/""" + "$" + """id<[^/]+>/delete""", """controllers.Destinations.delete(request:Request, id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/destination/""" + "$" + """id<[^/]+>/stations""", """controllers.Stations.findStationsByDestination(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/station""", """controllers.Stations.save(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/stations""", """controllers.Stations.find(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/station/""" + "$" + """id<[^/]+>""", """controllers.Stations.findById(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/station/""" + "$" + """id<[^/]+>""", """controllers.Stations.update(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/station/""" + "$" + """id<[^/]+>/delete""", """controllers.Stations.delete(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/schedule""", """controllers.Schedules.save(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/schedules""", """controllers.Schedules.find(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/schedule/""" + "$" + """id<[^/]+>""", """controllers.Schedules.findById(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/schedule/""" + "$" + """id<[^/]+>""", """controllers.Schedules.update(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/schedule/""" + "$" + """id<[^/]+>/delete""", """controllers.Schedules.delete(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/reserve""", """controllers.Reservations.save(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/reservations""", """controllers.Reservations.find(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/reservation/""" + "$" + """id<[^/]+>""", """controllers.Reservations.findById(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/reservation/""" + "$" + """id<[^/]+>/cancel""", """controllers.Reservations.cancel(request:Request, id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """static/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(Seq.empty[(String, String, String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String, String, String)]
    case l => s ++ l.asInstanceOf[List[(String, String, String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ViewController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ViewController_index0_invoker = createInvoker(
    ViewController_4.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Default path will just redirect to the computer list""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ViewController_login1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_ViewController_login1_invoker = createInvoker(
    ViewController_4.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ViewController_signup2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_ViewController_signup2_invoker = createInvoker(
    ViewController_4.signup(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "signup",
      Nil,
      "GET",
      this.prefix + """signup""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ViewController_companies3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("companies")))
  )
  private[this] lazy val controllers_ViewController_companies3_invoker = createInvoker(
    ViewController_4.companies(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "companies",
      Nil,
      "GET",
      this.prefix + """companies""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ViewController_companyAdd4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("company")))
  )
  private[this] lazy val controllers_ViewController_companyAdd4_invoker = createInvoker(
    ViewController_4.companyAdd(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "companyAdd",
      Nil,
      "GET",
      this.prefix + """company""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ViewController_companyUpdate5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("company/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ViewController_companyUpdate5_invoker = createInvoker(
    ViewController_4.companyUpdate(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "companyUpdate",
      Seq(classOf[String]),
      "GET",
      this.prefix + """company/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ViewController_destinationAdd6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("destination")))
  )
  private[this] lazy val controllers_ViewController_destinationAdd6_invoker = createInvoker(
    ViewController_4.destinationAdd(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "destinationAdd",
      Nil,
      "GET",
      this.prefix + """destination""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ViewController_destinationUpdate7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("destination/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ViewController_destinationUpdate7_invoker = createInvoker(
    ViewController_4.destinationUpdate(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "destinationUpdate",
      Seq(classOf[String]),
      "GET",
      this.prefix + """destination/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ViewController_destinations8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("destinations")))
  )
  private[this] lazy val controllers_ViewController_destinations8_invoker = createInvoker(
    ViewController_4.destinations(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "destinations",
      Nil,
      "GET",
      this.prefix + """destinations""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ViewController_stationAdd9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("station")))
  )
  private[this] lazy val controllers_ViewController_stationAdd9_invoker = createInvoker(
    ViewController_4.stationAdd(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "stationAdd",
      Nil,
      "GET",
      this.prefix + """station""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ViewController_stationUpdate10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("station/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ViewController_stationUpdate10_invoker = createInvoker(
    ViewController_4.stationUpdate(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "stationUpdate",
      Seq(classOf[String]),
      "GET",
      this.prefix + """station/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ViewController_stations11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stations")))
  )
  private[this] lazy val controllers_ViewController_stations11_invoker = createInvoker(
    ViewController_4.stations(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "stations",
      Nil,
      "GET",
      this.prefix + """stations""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ViewController_scheduleAdd12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("schedule")))
  )
  private[this] lazy val controllers_ViewController_scheduleAdd12_invoker = createInvoker(
    ViewController_4.scheduleAdd(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "scheduleAdd",
      Nil,
      "GET",
      this.prefix + """schedule""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ViewController_scheduleUpdate13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("schedule/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ViewController_scheduleUpdate13_invoker = createInvoker(
    ViewController_4.scheduleUpdate(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "scheduleUpdate",
      Seq(classOf[String]),
      "GET",
      this.prefix + """schedule/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ViewController_schedules14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("schedules")))
  )
  private[this] lazy val controllers_ViewController_schedules14_invoker = createInvoker(
    ViewController_4.schedules(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "schedules",
      Nil,
      "GET",
      this.prefix + """schedules""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ViewController_reservations15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reservations")))
  )
  private[this] lazy val controllers_ViewController_reservations15_invoker = createInvoker(
    ViewController_4.reservations(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "reservations",
      Nil,
      "GET",
      this.prefix + """reservations""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Users_save16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user")))
  )
  private[this] lazy val controllers_Users_save16_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Users_2.save(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "save",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/user""",
      """ API Routes""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Users_find17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users")))
  )
  private[this] lazy val controllers_Users_find17_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Users_2.find(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "find",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/users""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Users_findById18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Users_findById18_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Users_2.findById(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "findById",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """api/user/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Users_findByType19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users/type")))
  )
  private[this] lazy val controllers_Users_findByType19_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Users_2.findByType(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "findByType",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/users/type""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Users_update20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Users_update20_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Users_2.update(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "update",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "POST",
      this.prefix + """api/user/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Users_login21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/login")))
  )
  private[this] lazy val controllers_Users_login21_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Users_2.login(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "login",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/login""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Users_delete22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Users_delete22_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Users_2.delete(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "delete",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "POST",
      this.prefix + """api/user/""" + "$" + """id<[^/]+>/delete""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Users_lock23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("id", """[^/]+""",true), StaticPart("/lock")))
  )
  private[this] lazy val controllers_Users_lock23_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Users_2.lock(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "lock",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "POST",
      this.prefix + """api/user/""" + "$" + """id<[^/]+>/lock""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Users_unlock24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("id", """[^/]+""",true), StaticPart("/unlock")))
  )
  private[this] lazy val controllers_Users_unlock24_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Users_2.unlock(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "unlock",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "POST",
      this.prefix + """api/user/""" + "$" + """id<[^/]+>/unlock""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Users_verifyAccount25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("id", """[^/]+""",true), StaticPart("/verify")))
  )
  private[this] lazy val controllers_Users_verifyAccount25_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Users_2.verifyAccount(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "verifyAccount",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "POST",
      this.prefix + """api/user/""" + "$" + """id<[^/]+>/verify""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Users_forgotPassword26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/forgot/password")))
  )
  private[this] lazy val controllers_Users_forgotPassword26_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Users_2.forgotPassword(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "forgotPassword",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/user/forgot/password""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Users_verifyResetCode27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/verify/code")))
  )
  private[this] lazy val controllers_Users_verifyResetCode27_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Users_2.verifyResetCode(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "verifyResetCode",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/user/verify/code""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Users_forgotPassword28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/resend/code")))
  )
  private[this] lazy val controllers_Users_forgotPassword28_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Users_2.forgotPassword(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "forgotPassword",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/user/resend/code""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Users_resetPassword29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/reset/password")))
  )
  private[this] lazy val controllers_Users_resetPassword29_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Users_2.resetPassword(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "resetPassword",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/user/reset/password""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Users_updatePassword30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("id", """[^/]+""",true), StaticPart("/changepassword")))
  )
  private[this] lazy val controllers_Users_updatePassword30_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Users_2.updatePassword(fakeValue[play.mvc.Http.Request], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "updatePassword",
      Seq(classOf[play.mvc.Http.Request], classOf[Integer]),
      "POST",
      this.prefix + """api/user/""" + "$" + """id<[^/]+>/changepassword""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Users_findByType31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/companies")))
  )
  private[this] lazy val controllers_Users_findByType31_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Users_2.findByType(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Users",
      "findByType",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/companies""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_Destinations_save32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/destination")))
  )
  private[this] lazy val controllers_Destinations_save32_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Destinations_5.save(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Destinations",
      "save",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/destination""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Destinations_find33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/destinations")))
  )
  private[this] lazy val controllers_Destinations_find33_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Destinations_5.find(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Destinations",
      "find",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/destinations""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Destinations_findById34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/destination/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Destinations_findById34_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Destinations_5.findById(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Destinations",
      "findById",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """api/destination/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_Destinations_update35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/destination/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Destinations_update35_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Destinations_5.update(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Destinations",
      "update",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "POST",
      this.prefix + """api/destination/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_Destinations_delete36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/destination/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Destinations_delete36_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Destinations_5.delete(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Destinations",
      "delete",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "POST",
      this.prefix + """api/destination/""" + "$" + """id<[^/]+>/delete""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_Stations_findStationsByDestination37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/destination/"), DynamicPart("id", """[^/]+""",true), StaticPart("/stations")))
  )
  private[this] lazy val controllers_Stations_findStationsByDestination37_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Stations_1.findStationsByDestination(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Stations",
      "findStationsByDestination",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """api/destination/""" + "$" + """id<[^/]+>/stations""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_Stations_save38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/station")))
  )
  private[this] lazy val controllers_Stations_save38_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Stations_1.save(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Stations",
      "save",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/station""",
      """""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_Stations_find39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/stations")))
  )
  private[this] lazy val controllers_Stations_find39_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Stations_1.find(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Stations",
      "find",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/stations""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_Stations_findById40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/station/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stations_findById40_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Stations_1.findById(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Stations",
      "findById",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """api/station/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_Stations_update41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/station/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stations_update41_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Stations_1.update(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Stations",
      "update",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "POST",
      this.prefix + """api/station/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_Stations_delete42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/station/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Stations_delete42_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Stations_1.delete(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Stations",
      "delete",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "POST",
      this.prefix + """api/station/""" + "$" + """id<[^/]+>/delete""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_Schedules_save43_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/schedule")))
  )
  private[this] lazy val controllers_Schedules_save43_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Schedules_0.save(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Schedules",
      "save",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/schedule""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_Schedules_find44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/schedules")))
  )
  private[this] lazy val controllers_Schedules_find44_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Schedules_0.find(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Schedules",
      "find",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/schedules""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_Schedules_findById45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/schedule/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Schedules_findById45_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Schedules_0.findById(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Schedules",
      "findById",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """api/schedule/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_Schedules_update46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/schedule/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Schedules_update46_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Schedules_0.update(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Schedules",
      "update",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "POST",
      this.prefix + """api/schedule/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_Schedules_delete47_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/schedule/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Schedules_delete47_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Schedules_0.delete(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Schedules",
      "delete",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "POST",
      this.prefix + """api/schedule/""" + "$" + """id<[^/]+>/delete""",
      """""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_Reservations_save48_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/reserve")))
  )
  private[this] lazy val controllers_Reservations_save48_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Reservations_3.save(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Reservations",
      "save",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/reserve""",
      """""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_Reservations_find49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/reservations")))
  )
  private[this] lazy val controllers_Reservations_find49_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Reservations_3.find(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Reservations",
      "find",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/reservations""",
      """""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_Reservations_findById50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/reservation/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Reservations_findById50_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Reservations_3.findById(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Reservations",
      "findById",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """api/reservation/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:64
  private[this] lazy val controllers_Reservations_cancel51_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/reservation/"), DynamicPart("id", """[^/]+""",true), StaticPart("/cancel")))
  )
  private[this] lazy val controllers_Reservations_cancel51_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Reservations_3.cancel(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Reservations",
      "cancel",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "POST",
      this.prefix + """api/reservation/""" + "$" + """id<[^/]+>/cancel""",
      """""",
      Seq()
    )
  )

  // @LINE:66
  private[this] lazy val controllers_Assets_at52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("static/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at52_invoker = createInvoker(
    Assets_6.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """static/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ViewController_index0_route(params@_) =>
      call { 
        controllers_ViewController_index0_invoker.call(ViewController_4.index())
      }
  
    // @LINE:7
    case controllers_ViewController_login1_route(params@_) =>
      call { 
        controllers_ViewController_login1_invoker.call(ViewController_4.login())
      }
  
    // @LINE:8
    case controllers_ViewController_signup2_route(params@_) =>
      call { 
        controllers_ViewController_signup2_invoker.call(ViewController_4.signup())
      }
  
    // @LINE:9
    case controllers_ViewController_companies3_route(params@_) =>
      call { 
        controllers_ViewController_companies3_invoker.call(ViewController_4.companies())
      }
  
    // @LINE:10
    case controllers_ViewController_companyAdd4_route(params@_) =>
      call { 
        controllers_ViewController_companyAdd4_invoker.call(ViewController_4.companyAdd())
      }
  
    // @LINE:11
    case controllers_ViewController_companyUpdate5_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ViewController_companyUpdate5_invoker.call(ViewController_4.companyUpdate(id))
      }
  
    // @LINE:12
    case controllers_ViewController_destinationAdd6_route(params@_) =>
      call { 
        controllers_ViewController_destinationAdd6_invoker.call(ViewController_4.destinationAdd())
      }
  
    // @LINE:13
    case controllers_ViewController_destinationUpdate7_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ViewController_destinationUpdate7_invoker.call(ViewController_4.destinationUpdate(id))
      }
  
    // @LINE:14
    case controllers_ViewController_destinations8_route(params@_) =>
      call { 
        controllers_ViewController_destinations8_invoker.call(ViewController_4.destinations())
      }
  
    // @LINE:15
    case controllers_ViewController_stationAdd9_route(params@_) =>
      call { 
        controllers_ViewController_stationAdd9_invoker.call(ViewController_4.stationAdd())
      }
  
    // @LINE:16
    case controllers_ViewController_stationUpdate10_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ViewController_stationUpdate10_invoker.call(ViewController_4.stationUpdate(id))
      }
  
    // @LINE:17
    case controllers_ViewController_stations11_route(params@_) =>
      call { 
        controllers_ViewController_stations11_invoker.call(ViewController_4.stations())
      }
  
    // @LINE:18
    case controllers_ViewController_scheduleAdd12_route(params@_) =>
      call { 
        controllers_ViewController_scheduleAdd12_invoker.call(ViewController_4.scheduleAdd())
      }
  
    // @LINE:19
    case controllers_ViewController_scheduleUpdate13_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ViewController_scheduleUpdate13_invoker.call(ViewController_4.scheduleUpdate(id))
      }
  
    // @LINE:20
    case controllers_ViewController_schedules14_route(params@_) =>
      call { 
        controllers_ViewController_schedules14_invoker.call(ViewController_4.schedules())
      }
  
    // @LINE:21
    case controllers_ViewController_reservations15_route(params@_) =>
      call { 
        controllers_ViewController_reservations15_invoker.call(ViewController_4.reservations())
      }
  
    // @LINE:24
    case controllers_Users_save16_route(params@_) =>
      call { 
        controllers_Users_save16_invoker.call(
          req => Users_2.save(req))
      }
  
    // @LINE:25
    case controllers_Users_find17_route(params@_) =>
      call { 
        controllers_Users_find17_invoker.call(
          req => Users_2.find(req))
      }
  
    // @LINE:26
    case controllers_Users_findById18_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Users_findById18_invoker.call(
          req => Users_2.findById(req, id))
      }
  
    // @LINE:27
    case controllers_Users_findByType19_route(params@_) =>
      call { 
        controllers_Users_findByType19_invoker.call(
          req => Users_2.findByType(req))
      }
  
    // @LINE:28
    case controllers_Users_update20_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Users_update20_invoker.call(
          req => Users_2.update(req, id))
      }
  
    // @LINE:29
    case controllers_Users_login21_route(params@_) =>
      call { 
        controllers_Users_login21_invoker.call(
          req => Users_2.login(req))
      }
  
    // @LINE:30
    case controllers_Users_delete22_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Users_delete22_invoker.call(
          req => Users_2.delete(req, id))
      }
  
    // @LINE:31
    case controllers_Users_lock23_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Users_lock23_invoker.call(
          req => Users_2.lock(req, id))
      }
  
    // @LINE:32
    case controllers_Users_unlock24_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Users_unlock24_invoker.call(
          req => Users_2.unlock(req, id))
      }
  
    // @LINE:33
    case controllers_Users_verifyAccount25_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Users_verifyAccount25_invoker.call(
          req => Users_2.verifyAccount(req, id))
      }
  
    // @LINE:34
    case controllers_Users_forgotPassword26_route(params@_) =>
      call { 
        controllers_Users_forgotPassword26_invoker.call(
          req => Users_2.forgotPassword(req))
      }
  
    // @LINE:35
    case controllers_Users_verifyResetCode27_route(params@_) =>
      call { 
        controllers_Users_verifyResetCode27_invoker.call(
          req => Users_2.verifyResetCode(req))
      }
  
    // @LINE:36
    case controllers_Users_forgotPassword28_route(params@_) =>
      call { 
        controllers_Users_forgotPassword28_invoker.call(
          req => Users_2.forgotPassword(req))
      }
  
    // @LINE:37
    case controllers_Users_resetPassword29_route(params@_) =>
      call { 
        controllers_Users_resetPassword29_invoker.call(
          req => Users_2.resetPassword(req))
      }
  
    // @LINE:38
    case controllers_Users_updatePassword30_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Users_updatePassword30_invoker.call(
          req => Users_2.updatePassword(req, id))
      }
  
    // @LINE:40
    case controllers_Users_findByType31_route(params@_) =>
      call { 
        controllers_Users_findByType31_invoker.call(
          req => Users_2.findByType(req))
      }
  
    // @LINE:42
    case controllers_Destinations_save32_route(params@_) =>
      call { 
        controllers_Destinations_save32_invoker.call(
          req => Destinations_5.save(req))
      }
  
    // @LINE:43
    case controllers_Destinations_find33_route(params@_) =>
      call { 
        controllers_Destinations_find33_invoker.call(
          req => Destinations_5.find(req))
      }
  
    // @LINE:44
    case controllers_Destinations_findById34_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Destinations_findById34_invoker.call(
          req => Destinations_5.findById(req, id))
      }
  
    // @LINE:45
    case controllers_Destinations_update35_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Destinations_update35_invoker.call(
          req => Destinations_5.update(req, id))
      }
  
    // @LINE:46
    case controllers_Destinations_delete36_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Destinations_delete36_invoker.call(
          req => Destinations_5.delete(req, id))
      }
  
    // @LINE:48
    case controllers_Stations_findStationsByDestination37_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Stations_findStationsByDestination37_invoker.call(
          req => Stations_1.findStationsByDestination(req, id))
      }
  
    // @LINE:49
    case controllers_Stations_save38_route(params@_) =>
      call { 
        controllers_Stations_save38_invoker.call(
          req => Stations_1.save(req))
      }
  
    // @LINE:50
    case controllers_Stations_find39_route(params@_) =>
      call { 
        controllers_Stations_find39_invoker.call(
          req => Stations_1.find(req))
      }
  
    // @LINE:51
    case controllers_Stations_findById40_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Stations_findById40_invoker.call(
          req => Stations_1.findById(req, id))
      }
  
    // @LINE:52
    case controllers_Stations_update41_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Stations_update41_invoker.call(
          req => Stations_1.update(req, id))
      }
  
    // @LINE:53
    case controllers_Stations_delete42_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Stations_delete42_invoker.call(
          req => Stations_1.delete(req, id))
      }
  
    // @LINE:55
    case controllers_Schedules_save43_route(params@_) =>
      call { 
        controllers_Schedules_save43_invoker.call(
          req => Schedules_0.save(req))
      }
  
    // @LINE:56
    case controllers_Schedules_find44_route(params@_) =>
      call { 
        controllers_Schedules_find44_invoker.call(
          req => Schedules_0.find(req))
      }
  
    // @LINE:57
    case controllers_Schedules_findById45_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Schedules_findById45_invoker.call(
          req => Schedules_0.findById(req, id))
      }
  
    // @LINE:58
    case controllers_Schedules_update46_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Schedules_update46_invoker.call(
          req => Schedules_0.update(req, id))
      }
  
    // @LINE:59
    case controllers_Schedules_delete47_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Schedules_delete47_invoker.call(
          req => Schedules_0.delete(req, id))
      }
  
    // @LINE:61
    case controllers_Reservations_save48_route(params@_) =>
      call { 
        controllers_Reservations_save48_invoker.call(
          req => Reservations_3.save(req))
      }
  
    // @LINE:62
    case controllers_Reservations_find49_route(params@_) =>
      call { 
        controllers_Reservations_find49_invoker.call(
          req => Reservations_3.find(req))
      }
  
    // @LINE:63
    case controllers_Reservations_findById50_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Reservations_findById50_invoker.call(
          req => Reservations_3.findById(req, id))
      }
  
    // @LINE:64
    case controllers_Reservations_cancel51_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Reservations_cancel51_invoker.call(
          req => Reservations_3.cancel(req, id))
      }
  
    // @LINE:66
    case controllers_Assets_at52_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at52_invoker.call(Assets_6.at(path, file))
      }
  }
}
