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
  // @LINE:27
  Users_2: controllers.Users,
  // @LINE:45
  Destinations_6: controllers.Destinations,
  // @LINE:51
  Stations_1: controllers.Stations,
  // @LINE:59
  Schedules_0: controllers.Schedules,
  // @LINE:68
  Reservations_3: controllers.Reservations,
  // @LINE:74
  DrivingTracking_5: controllers.DrivingTracking,
  // @LINE:79
  Assets_7: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

  @javax.inject.Inject()
  def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ViewController_4: controllers.ViewController,
    // @LINE:27
    Users_2: controllers.Users,
    // @LINE:45
    Destinations_6: controllers.Destinations,
    // @LINE:51
    Stations_1: controllers.Stations,
    // @LINE:59
    Schedules_0: controllers.Schedules,
    // @LINE:68
    Reservations_3: controllers.Reservations,
    // @LINE:74
    DrivingTracking_5: controllers.DrivingTracking,
    // @LINE:79
    Assets_7: controllers.Assets
  ) = this(errorHandler, ViewController_4, Users_2, Destinations_6, Stations_1, Schedules_0, Reservations_3, DrivingTracking_5, Assets_7, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ViewController_4, Users_2, Destinations_6, Stations_1, Schedules_0, Reservations_3, DrivingTracking_5, Assets_7, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """driver""", """controllers.ViewController.driverAdd()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """driver/""" + "$" + """id<[^/]+>""", """controllers.ViewController.driverUpdate(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """drivers""", """controllers.ViewController.drivers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reservations/""" + "$" + """scheduleId<[^/]+>""", """controllers.ViewController.reservations(scheduleId:String)"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/stations/hierarchy/""" + "$" + """destinationId<[^/]+>""", """controllers.Stations.findStationsHierarchy(request:Request, destinationId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/station/""" + "$" + """id<[^/]+>""", """controllers.Stations.findById(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/station/""" + "$" + """id<[^/]+>""", """controllers.Stations.update(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/station/""" + "$" + """id<[^/]+>/delete""", """controllers.Stations.delete(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/schedule""", """controllers.Schedules.save(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/schedules""", """controllers.Schedules.find(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/schedules/upcoming""", """controllers.Schedules.findUpcoming(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/schedules/driver/upcoming""", """controllers.Schedules.findUpcomingByDriver(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/schedules/driver/history""", """controllers.Schedules.findHistoryByDriver(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/schedule/""" + "$" + """id<[^/]+>""", """controllers.Schedules.findById(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/schedule/""" + "$" + """id<[^/]+>""", """controllers.Schedules.update(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/schedule/""" + "$" + """id<[^/]+>/delete""", """controllers.Schedules.delete(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/reserve""", """controllers.Reservations.save(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/reservations""", """controllers.Reservations.find(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/reservation/""" + "$" + """id<[^/]+>""", """controllers.Reservations.findById(request:Request, id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/schedule/""" + "$" + """id<[^/]+>/reservations""", """controllers.Reservations.findBySchedule(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/reservation/""" + "$" + """id<[^/]+>/cancel""", """controllers.Reservations.cancel(request:Request, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/drive/start""", """controllers.DrivingTracking.startDriving(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/drive/track""", """controllers.DrivingTracking.track(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/drive/station/arrival""", """controllers.DrivingTracking.stationArrival(request:Request)"""),
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
  private[this] lazy val controllers_ViewController_driverAdd15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("driver")))
  )
  private[this] lazy val controllers_ViewController_driverAdd15_invoker = createInvoker(
    ViewController_4.driverAdd(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "driverAdd",
      Nil,
      "GET",
      this.prefix + """driver""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_ViewController_driverUpdate16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("driver/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ViewController_driverUpdate16_invoker = createInvoker(
    ViewController_4.driverUpdate(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "driverUpdate",
      Seq(classOf[String]),
      "GET",
      this.prefix + """driver/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ViewController_drivers17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("drivers")))
  )
  private[this] lazy val controllers_ViewController_drivers17_invoker = createInvoker(
    ViewController_4.drivers(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "drivers",
      Nil,
      "GET",
      this.prefix + """drivers""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ViewController_reservations18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reservations/"), DynamicPart("scheduleId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ViewController_reservations18_invoker = createInvoker(
    ViewController_4.reservations(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "reservations",
      Seq(classOf[String]),
      "GET",
      this.prefix + """reservations/""" + "$" + """scheduleId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Users_save19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user")))
  )
  private[this] lazy val controllers_Users_save19_invoker = createInvoker(
    
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

  // @LINE:28
  private[this] lazy val controllers_Users_find20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users")))
  )
  private[this] lazy val controllers_Users_find20_invoker = createInvoker(
    
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

  // @LINE:29
  private[this] lazy val controllers_Users_findById21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Users_findById21_invoker = createInvoker(
    
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

  // @LINE:30
  private[this] lazy val controllers_Users_findByType22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users/type")))
  )
  private[this] lazy val controllers_Users_findByType22_invoker = createInvoker(
    
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

  // @LINE:31
  private[this] lazy val controllers_Users_update23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Users_update23_invoker = createInvoker(
    
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

  // @LINE:32
  private[this] lazy val controllers_Users_login24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/login")))
  )
  private[this] lazy val controllers_Users_login24_invoker = createInvoker(
    
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

  // @LINE:33
  private[this] lazy val controllers_Users_delete25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Users_delete25_invoker = createInvoker(
    
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

  // @LINE:34
  private[this] lazy val controllers_Users_lock26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("id", """[^/]+""",true), StaticPart("/lock")))
  )
  private[this] lazy val controllers_Users_lock26_invoker = createInvoker(
    
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

  // @LINE:35
  private[this] lazy val controllers_Users_unlock27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("id", """[^/]+""",true), StaticPart("/unlock")))
  )
  private[this] lazy val controllers_Users_unlock27_invoker = createInvoker(
    
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

  // @LINE:36
  private[this] lazy val controllers_Users_verifyAccount28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("id", """[^/]+""",true), StaticPart("/verify")))
  )
  private[this] lazy val controllers_Users_verifyAccount28_invoker = createInvoker(
    
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

  // @LINE:37
  private[this] lazy val controllers_Users_forgotPassword29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/forgot/password")))
  )
  private[this] lazy val controllers_Users_forgotPassword29_invoker = createInvoker(
    
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

  // @LINE:38
  private[this] lazy val controllers_Users_verifyResetCode30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/verify/code")))
  )
  private[this] lazy val controllers_Users_verifyResetCode30_invoker = createInvoker(
    
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

  // @LINE:39
  private[this] lazy val controllers_Users_forgotPassword31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/resend/code")))
  )
  private[this] lazy val controllers_Users_forgotPassword31_invoker = createInvoker(
    
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

  // @LINE:40
  private[this] lazy val controllers_Users_resetPassword32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/reset/password")))
  )
  private[this] lazy val controllers_Users_resetPassword32_invoker = createInvoker(
    
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

  // @LINE:41
  private[this] lazy val controllers_Users_updatePassword33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("id", """[^/]+""",true), StaticPart("/changepassword")))
  )
  private[this] lazy val controllers_Users_updatePassword33_invoker = createInvoker(
    
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

  // @LINE:43
  private[this] lazy val controllers_Users_findByType34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/companies")))
  )
  private[this] lazy val controllers_Users_findByType34_invoker = createInvoker(
    
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

  // @LINE:45
  private[this] lazy val controllers_Destinations_save35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/destination")))
  )
  private[this] lazy val controllers_Destinations_save35_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Destinations_6.save(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:46
  private[this] lazy val controllers_Destinations_find36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/destinations")))
  )
  private[this] lazy val controllers_Destinations_find36_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Destinations_6.find(fakeValue[play.mvc.Http.Request]),
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

  // @LINE:47
  private[this] lazy val controllers_Destinations_findById37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/destination/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Destinations_findById37_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Destinations_6.findById(fakeValue[play.mvc.Http.Request], fakeValue[String]),
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

  // @LINE:48
  private[this] lazy val controllers_Destinations_update38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/destination/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Destinations_update38_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Destinations_6.update(fakeValue[play.mvc.Http.Request], fakeValue[String]),
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

  // @LINE:49
  private[this] lazy val controllers_Destinations_delete39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/destination/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Destinations_delete39_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Destinations_6.delete(fakeValue[play.mvc.Http.Request], fakeValue[String]),
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

  // @LINE:51
  private[this] lazy val controllers_Stations_findStationsByDestination40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/destination/"), DynamicPart("id", """[^/]+""",true), StaticPart("/stations")))
  )
  private[this] lazy val controllers_Stations_findStationsByDestination40_invoker = createInvoker(
    
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

  // @LINE:52
  private[this] lazy val controllers_Stations_save41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/station")))
  )
  private[this] lazy val controllers_Stations_save41_invoker = createInvoker(
    
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

  // @LINE:53
  private[this] lazy val controllers_Stations_find42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/stations")))
  )
  private[this] lazy val controllers_Stations_find42_invoker = createInvoker(
    
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

  // @LINE:54
  private[this] lazy val controllers_Stations_findStationsHierarchy43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/stations/hierarchy/"), DynamicPart("destinationId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stations_findStationsHierarchy43_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Stations_1.findStationsHierarchy(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Stations",
      "findStationsHierarchy",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """api/stations/hierarchy/""" + "$" + """destinationId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_Stations_findById44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/station/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stations_findById44_invoker = createInvoker(
    
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

  // @LINE:56
  private[this] lazy val controllers_Stations_update45_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/station/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Stations_update45_invoker = createInvoker(
    
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

  // @LINE:57
  private[this] lazy val controllers_Stations_delete46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/station/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Stations_delete46_invoker = createInvoker(
    
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

  // @LINE:59
  private[this] lazy val controllers_Schedules_save47_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/schedule")))
  )
  private[this] lazy val controllers_Schedules_save47_invoker = createInvoker(
    
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

  // @LINE:60
  private[this] lazy val controllers_Schedules_find48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/schedules")))
  )
  private[this] lazy val controllers_Schedules_find48_invoker = createInvoker(
    
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

  // @LINE:61
  private[this] lazy val controllers_Schedules_findUpcoming49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/schedules/upcoming")))
  )
  private[this] lazy val controllers_Schedules_findUpcoming49_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Schedules_0.findUpcoming(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Schedules",
      "findUpcoming",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/schedules/upcoming""",
      """""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_Schedules_findUpcomingByDriver50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/schedules/driver/upcoming")))
  )
  private[this] lazy val controllers_Schedules_findUpcomingByDriver50_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Schedules_0.findUpcomingByDriver(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Schedules",
      "findUpcomingByDriver",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/schedules/driver/upcoming""",
      """""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_Schedules_findHistoryByDriver51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/schedules/driver/history")))
  )
  private[this] lazy val controllers_Schedules_findHistoryByDriver51_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Schedules_0.findHistoryByDriver(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Schedules",
      "findHistoryByDriver",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/schedules/driver/history""",
      """""",
      Seq()
    )
  )

  // @LINE:64
  private[this] lazy val controllers_Schedules_findById52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/schedule/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Schedules_findById52_invoker = createInvoker(
    
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

  // @LINE:65
  private[this] lazy val controllers_Schedules_update53_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/schedule/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Schedules_update53_invoker = createInvoker(
    
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

  // @LINE:66
  private[this] lazy val controllers_Schedules_delete54_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/schedule/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Schedules_delete54_invoker = createInvoker(
    
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

  // @LINE:68
  private[this] lazy val controllers_Reservations_save55_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/reserve")))
  )
  private[this] lazy val controllers_Reservations_save55_invoker = createInvoker(
    
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

  // @LINE:69
  private[this] lazy val controllers_Reservations_find56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/reservations")))
  )
  private[this] lazy val controllers_Reservations_find56_invoker = createInvoker(
    
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

  // @LINE:70
  private[this] lazy val controllers_Reservations_findById57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/reservation/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Reservations_findById57_invoker = createInvoker(
    
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

  // @LINE:71
  private[this] lazy val controllers_Reservations_findBySchedule58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/schedule/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reservations")))
  )
  private[this] lazy val controllers_Reservations_findBySchedule58_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      Reservations_3.findBySchedule(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Reservations",
      "findBySchedule",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """api/schedule/""" + "$" + """id<[^/]+>/reservations""",
      """""",
      Seq()
    )
  )

  // @LINE:72
  private[this] lazy val controllers_Reservations_cancel59_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/reservation/"), DynamicPart("id", """[^/]+""",true), StaticPart("/cancel")))
  )
  private[this] lazy val controllers_Reservations_cancel59_invoker = createInvoker(
    
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

  // @LINE:74
  private[this] lazy val controllers_DrivingTracking_startDriving60_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/drive/start")))
  )
  private[this] lazy val controllers_DrivingTracking_startDriving60_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      DrivingTracking_5.startDriving(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DrivingTracking",
      "startDriving",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/drive/start""",
      """""",
      Seq()
    )
  )

  // @LINE:75
  private[this] lazy val controllers_DrivingTracking_track61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/drive/track")))
  )
  private[this] lazy val controllers_DrivingTracking_track61_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      DrivingTracking_5.track(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DrivingTracking",
      "track",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/drive/track""",
      """""",
      Seq()
    )
  )

  // @LINE:76
  private[this] lazy val controllers_DrivingTracking_stationArrival62_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/drive/station/arrival")))
  )
  private[this] lazy val controllers_DrivingTracking_stationArrival62_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      DrivingTracking_5.stationArrival(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DrivingTracking",
      "stationArrival",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/drive/station/arrival""",
      """""",
      Seq()
    )
  )

  // @LINE:79
  private[this] lazy val controllers_Assets_at63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("static/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at63_invoker = createInvoker(
    Assets_7.at(fakeValue[String], fakeValue[String]),
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
    case controllers_ViewController_driverAdd15_route(params@_) =>
      call { 
        controllers_ViewController_driverAdd15_invoker.call(ViewController_4.driverAdd())
      }
  
    // @LINE:22
    case controllers_ViewController_driverUpdate16_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ViewController_driverUpdate16_invoker.call(ViewController_4.driverUpdate(id))
      }
  
    // @LINE:23
    case controllers_ViewController_drivers17_route(params@_) =>
      call { 
        controllers_ViewController_drivers17_invoker.call(ViewController_4.drivers())
      }
  
    // @LINE:24
    case controllers_ViewController_reservations18_route(params@_) =>
      call(params.fromPath[String]("scheduleId", None)) { (scheduleId) =>
        controllers_ViewController_reservations18_invoker.call(ViewController_4.reservations(scheduleId))
      }
  
    // @LINE:27
    case controllers_Users_save19_route(params@_) =>
      call { 
        controllers_Users_save19_invoker.call(
          req => Users_2.save(req))
      }
  
    // @LINE:28
    case controllers_Users_find20_route(params@_) =>
      call { 
        controllers_Users_find20_invoker.call(
          req => Users_2.find(req))
      }
  
    // @LINE:29
    case controllers_Users_findById21_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Users_findById21_invoker.call(
          req => Users_2.findById(req, id))
      }
  
    // @LINE:30
    case controllers_Users_findByType22_route(params@_) =>
      call { 
        controllers_Users_findByType22_invoker.call(
          req => Users_2.findByType(req))
      }
  
    // @LINE:31
    case controllers_Users_update23_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Users_update23_invoker.call(
          req => Users_2.update(req, id))
      }
  
    // @LINE:32
    case controllers_Users_login24_route(params@_) =>
      call { 
        controllers_Users_login24_invoker.call(
          req => Users_2.login(req))
      }
  
    // @LINE:33
    case controllers_Users_delete25_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Users_delete25_invoker.call(
          req => Users_2.delete(req, id))
      }
  
    // @LINE:34
    case controllers_Users_lock26_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Users_lock26_invoker.call(
          req => Users_2.lock(req, id))
      }
  
    // @LINE:35
    case controllers_Users_unlock27_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Users_unlock27_invoker.call(
          req => Users_2.unlock(req, id))
      }
  
    // @LINE:36
    case controllers_Users_verifyAccount28_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Users_verifyAccount28_invoker.call(
          req => Users_2.verifyAccount(req, id))
      }
  
    // @LINE:37
    case controllers_Users_forgotPassword29_route(params@_) =>
      call { 
        controllers_Users_forgotPassword29_invoker.call(
          req => Users_2.forgotPassword(req))
      }
  
    // @LINE:38
    case controllers_Users_verifyResetCode30_route(params@_) =>
      call { 
        controllers_Users_verifyResetCode30_invoker.call(
          req => Users_2.verifyResetCode(req))
      }
  
    // @LINE:39
    case controllers_Users_forgotPassword31_route(params@_) =>
      call { 
        controllers_Users_forgotPassword31_invoker.call(
          req => Users_2.forgotPassword(req))
      }
  
    // @LINE:40
    case controllers_Users_resetPassword32_route(params@_) =>
      call { 
        controllers_Users_resetPassword32_invoker.call(
          req => Users_2.resetPassword(req))
      }
  
    // @LINE:41
    case controllers_Users_updatePassword33_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_Users_updatePassword33_invoker.call(
          req => Users_2.updatePassword(req, id))
      }
  
    // @LINE:43
    case controllers_Users_findByType34_route(params@_) =>
      call { 
        controllers_Users_findByType34_invoker.call(
          req => Users_2.findByType(req))
      }
  
    // @LINE:45
    case controllers_Destinations_save35_route(params@_) =>
      call { 
        controllers_Destinations_save35_invoker.call(
          req => Destinations_6.save(req))
      }
  
    // @LINE:46
    case controllers_Destinations_find36_route(params@_) =>
      call { 
        controllers_Destinations_find36_invoker.call(
          req => Destinations_6.find(req))
      }
  
    // @LINE:47
    case controllers_Destinations_findById37_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Destinations_findById37_invoker.call(
          req => Destinations_6.findById(req, id))
      }
  
    // @LINE:48
    case controllers_Destinations_update38_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Destinations_update38_invoker.call(
          req => Destinations_6.update(req, id))
      }
  
    // @LINE:49
    case controllers_Destinations_delete39_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Destinations_delete39_invoker.call(
          req => Destinations_6.delete(req, id))
      }
  
    // @LINE:51
    case controllers_Stations_findStationsByDestination40_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Stations_findStationsByDestination40_invoker.call(
          req => Stations_1.findStationsByDestination(req, id))
      }
  
    // @LINE:52
    case controllers_Stations_save41_route(params@_) =>
      call { 
        controllers_Stations_save41_invoker.call(
          req => Stations_1.save(req))
      }
  
    // @LINE:53
    case controllers_Stations_find42_route(params@_) =>
      call { 
        controllers_Stations_find42_invoker.call(
          req => Stations_1.find(req))
      }
  
    // @LINE:54
    case controllers_Stations_findStationsHierarchy43_route(params@_) =>
      call(params.fromPath[String]("destinationId", None)) { (destinationId) =>
        controllers_Stations_findStationsHierarchy43_invoker.call(
          req => Stations_1.findStationsHierarchy(req, destinationId))
      }
  
    // @LINE:55
    case controllers_Stations_findById44_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Stations_findById44_invoker.call(
          req => Stations_1.findById(req, id))
      }
  
    // @LINE:56
    case controllers_Stations_update45_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Stations_update45_invoker.call(
          req => Stations_1.update(req, id))
      }
  
    // @LINE:57
    case controllers_Stations_delete46_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Stations_delete46_invoker.call(
          req => Stations_1.delete(req, id))
      }
  
    // @LINE:59
    case controllers_Schedules_save47_route(params@_) =>
      call { 
        controllers_Schedules_save47_invoker.call(
          req => Schedules_0.save(req))
      }
  
    // @LINE:60
    case controllers_Schedules_find48_route(params@_) =>
      call { 
        controllers_Schedules_find48_invoker.call(
          req => Schedules_0.find(req))
      }
  
    // @LINE:61
    case controllers_Schedules_findUpcoming49_route(params@_) =>
      call { 
        controllers_Schedules_findUpcoming49_invoker.call(
          req => Schedules_0.findUpcoming(req))
      }
  
    // @LINE:62
    case controllers_Schedules_findUpcomingByDriver50_route(params@_) =>
      call { 
        controllers_Schedules_findUpcomingByDriver50_invoker.call(
          req => Schedules_0.findUpcomingByDriver(req))
      }
  
    // @LINE:63
    case controllers_Schedules_findHistoryByDriver51_route(params@_) =>
      call { 
        controllers_Schedules_findHistoryByDriver51_invoker.call(
          req => Schedules_0.findHistoryByDriver(req))
      }
  
    // @LINE:64
    case controllers_Schedules_findById52_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Schedules_findById52_invoker.call(
          req => Schedules_0.findById(req, id))
      }
  
    // @LINE:65
    case controllers_Schedules_update53_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Schedules_update53_invoker.call(
          req => Schedules_0.update(req, id))
      }
  
    // @LINE:66
    case controllers_Schedules_delete54_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Schedules_delete54_invoker.call(
          req => Schedules_0.delete(req, id))
      }
  
    // @LINE:68
    case controllers_Reservations_save55_route(params@_) =>
      call { 
        controllers_Reservations_save55_invoker.call(
          req => Reservations_3.save(req))
      }
  
    // @LINE:69
    case controllers_Reservations_find56_route(params@_) =>
      call { 
        controllers_Reservations_find56_invoker.call(
          req => Reservations_3.find(req))
      }
  
    // @LINE:70
    case controllers_Reservations_findById57_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Reservations_findById57_invoker.call(
          req => Reservations_3.findById(req, id))
      }
  
    // @LINE:71
    case controllers_Reservations_findBySchedule58_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Reservations_findBySchedule58_invoker.call(
          req => Reservations_3.findBySchedule(req, id))
      }
  
    // @LINE:72
    case controllers_Reservations_cancel59_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Reservations_cancel59_invoker.call(
          req => Reservations_3.cancel(req, id))
      }
  
    // @LINE:74
    case controllers_DrivingTracking_startDriving60_route(params@_) =>
      call { 
        controllers_DrivingTracking_startDriving60_invoker.call(
          req => DrivingTracking_5.startDriving(req))
      }
  
    // @LINE:75
    case controllers_DrivingTracking_track61_route(params@_) =>
      call { 
        controllers_DrivingTracking_track61_invoker.call(
          req => DrivingTracking_5.track(req))
      }
  
    // @LINE:76
    case controllers_DrivingTracking_stationArrival62_route(params@_) =>
      call { 
        controllers_DrivingTracking_stationArrival62_invoker.call(
          req => DrivingTracking_5.stationArrival(req))
      }
  
    // @LINE:79
    case controllers_Assets_at63_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at63_invoker.call(Assets_7.at(path, file))
      }
  }
}
