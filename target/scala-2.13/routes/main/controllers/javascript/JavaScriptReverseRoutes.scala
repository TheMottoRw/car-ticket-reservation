// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:66
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "static/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:55
  class ReverseSchedules(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Schedules.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/schedule"})
        }
      """
    )
  
    // @LINE:59
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Schedules.delete",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/schedule/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0)) + "/delete"})
        }
      """
    )
  
    // @LINE:58
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Schedules.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/schedule/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:57
    def findById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Schedules.findById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/schedule/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:56
    def find: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Schedules.find",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/schedules"})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseUsers(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def lock: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.lock",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0)) + "/lock"})
        }
      """
    )
  
    // @LINE:38
    def updatePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.updatePassword",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0)) + "/changepassword"})
        }
      """
    )
  
    // @LINE:24
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user"})
        }
      """
    )
  
    // @LINE:32
    def unlock: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.unlock",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0)) + "/unlock"})
        }
      """
    )
  
    // @LINE:33
    def verifyAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.verifyAccount",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0)) + "/verify"})
        }
      """
    )
  
    // @LINE:34
    def forgotPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.forgotPassword",
      """
        function() {
        
          if (true) {
            return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/forgot/password"})
          }
        
        }
      """
    )
  
    // @LINE:37
    def resetPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.resetPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/reset/password"})
        }
      """
    )
  
    // @LINE:30
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.delete",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0)) + "/delete"})
        }
      """
    )
  
    // @LINE:35
    def verifyResetCode: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.verifyResetCode",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/verify/code"})
        }
      """
    )
  
    // @LINE:28
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:26
    def findById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.findById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:25
    def find: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.find",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users"})
        }
      """
    )
  
    // @LINE:27
    def findByType: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.findByType",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users/type"})
          }
        
        }
      """
    )
  
    // @LINE:29
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Users.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/login"})
        }
      """
    )
  
  }

  // @LINE:61
  class ReverseReservations(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:61
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Reservations.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/reserve"})
        }
      """
    )
  
    // @LINE:62
    def find: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Reservations.find",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/reservations"})
        }
      """
    )
  
    // @LINE:63
    def findById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Reservations.findById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/reservation/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:64
    def cancel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Reservations.cancel",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/reservation/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0)) + "/cancel"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseViewController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def companies: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ViewController.companies",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "companies"})
        }
      """
    )
  
    // @LINE:19
    def scheduleUpdate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ViewController.scheduleUpdate",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "schedule/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:15
    def stationAdd: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ViewController.stationAdd",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "station"})
        }
      """
    )
  
    // @LINE:11
    def companyUpdate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ViewController.companyUpdate",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "company/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:16
    def stationUpdate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ViewController.stationUpdate",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "station/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:14
    def destinations: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ViewController.destinations",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "destinations"})
        }
      """
    )
  
    // @LINE:20
    def schedules: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ViewController.schedules",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "schedules"})
        }
      """
    )
  
    // @LINE:18
    def scheduleAdd: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ViewController.scheduleAdd",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "schedule"})
        }
      """
    )
  
    // @LINE:21
    def reservations: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ViewController.reservations",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reservations"})
        }
      """
    )
  
    // @LINE:8
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ViewController.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:10
    def companyAdd: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ViewController.companyAdd",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "company"})
        }
      """
    )
  
    // @LINE:12
    def destinationAdd: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ViewController.destinationAdd",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "destination"})
        }
      """
    )
  
    // @LINE:17
    def stations: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ViewController.stations",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stations"})
        }
      """
    )
  
    // @LINE:13
    def destinationUpdate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ViewController.destinationUpdate",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "destination/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ViewController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:7
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ViewController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:48
  class ReverseStations(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Stations.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/station"})
        }
      """
    )
  
    // @LINE:48
    def findStationsByDestination: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Stations.findStationsByDestination",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/destination/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0)) + "/stations"})
        }
      """
    )
  
    // @LINE:53
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Stations.delete",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/station/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0)) + "/delete"})
        }
      """
    )
  
    // @LINE:52
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Stations.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/station/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:51
    def findById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Stations.findById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/station/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:50
    def find: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Stations.find",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/stations"})
        }
      """
    )
  
  }

  // @LINE:42
  class ReverseDestinations(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:42
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Destinations.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/destination"})
        }
      """
    )
  
    // @LINE:46
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Destinations.delete",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/destination/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0)) + "/delete"})
        }
      """
    )
  
    // @LINE:45
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Destinations.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/destination/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:44
    def findById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Destinations.findById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/destination/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:43
    def find: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Destinations.find",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/destinations"})
        }
      """
    )
  
  }


}
