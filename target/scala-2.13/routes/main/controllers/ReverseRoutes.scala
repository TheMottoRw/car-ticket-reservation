// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:72
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:72
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "static/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:59
  class ReverseSchedules(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/schedule")
    }
  
    // @LINE:61
    def findUpcoming(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/schedules/upcoming")
    }
  
    // @LINE:64
    def delete(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/schedule/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:63
    def update(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/schedule/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:62
    def findById(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/schedule/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:60
    def find(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/schedules")
    }
  
  }

  // @LINE:27
  class ReverseUsers(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def lock(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/lock")
    }
  
    // @LINE:41
    def updatePassword(id:Integer): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)) + "/changepassword")
    }
  
    // @LINE:27
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user")
    }
  
    // @LINE:35
    def unlock(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/unlock")
    }
  
    // @LINE:36
    def verifyAccount(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/verify")
    }
  
    // @LINE:37
    def forgotPassword(): Call = {
    
      () match {
      
        // @LINE:37
        case ()  =>
          
          Call("POST", _prefix + { _defaultPrefix } + "api/user/forgot/password")
      
      }
    
    }
  
    // @LINE:40
    def resetPassword(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/reset/password")
    }
  
    // @LINE:33
    def delete(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:38
    def verifyResetCode(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/verify/code")
    }
  
    // @LINE:31
    def update(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:29
    def findById(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:28
    def find(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/users")
    }
  
    // @LINE:30
    def findByType(): Call = {
    
      () match {
      
        // @LINE:30
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "api/users/type")
      
      }
    
    }
  
    // @LINE:32
    def login(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/login")
    }
  
  }

  // @LINE:66
  class ReverseReservations(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/reserve")
    }
  
    // @LINE:70
    def cancel(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/reservation/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/cancel")
    }
  
    // @LINE:69
    def findBySchedule(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/schedule/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/reservations")
    }
  
    // @LINE:68
    def findById(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/reservation/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:67
    def find(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/reservations")
    }
  
  }

  // @LINE:6
  class ReverseViewController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def companies(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "companies")
    }
  
    // @LINE:19
    def scheduleUpdate(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "schedule/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:15
    def stationAdd(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "station")
    }
  
    // @LINE:11
    def companyUpdate(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "company/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:16
    def stationUpdate(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "station/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:14
    def destinations(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "destinations")
    }
  
    // @LINE:23
    def drivers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "drivers")
    }
  
    // @LINE:20
    def schedules(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "schedules")
    }
  
    // @LINE:18
    def scheduleAdd(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "schedule")
    }
  
    // @LINE:8
    def signup(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:21
    def driverAdd(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "driver")
    }
  
    // @LINE:10
    def companyAdd(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "company")
    }
  
    // @LINE:24
    def reservations(scheduleId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "reservations/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("scheduleId", scheduleId)))
    }
  
    // @LINE:12
    def destinationAdd(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "destination")
    }
  
    // @LINE:17
    def stations(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "stations")
    }
  
    // @LINE:13
    def destinationUpdate(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "destination/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:22
    def driverUpdate(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "driver/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:7
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:51
  class ReverseStations(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:52
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/station")
    }
  
    // @LINE:51
    def findStationsByDestination(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/destination/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/stations")
    }
  
    // @LINE:54
    def findStationsHierarchy(destinationId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/stations/hierarchy/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("destinationId", destinationId)))
    }
  
    // @LINE:57
    def delete(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/station/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:56
    def update(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/station/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:55
    def findById(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/station/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:53
    def find(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/stations")
    }
  
  }

  // @LINE:45
  class ReverseDestinations(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/destination")
    }
  
    // @LINE:49
    def delete(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/destination/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:48
    def update(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/destination/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:47
    def findById(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/destination/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:46
    def find(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/destinations")
    }
  
  }


}
