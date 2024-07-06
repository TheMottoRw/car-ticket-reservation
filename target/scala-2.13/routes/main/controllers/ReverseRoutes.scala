// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:66
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "static/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:55
  class ReverseSchedules(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/schedule")
    }
  
    // @LINE:59
    def delete(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/schedule/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:58
    def update(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/schedule/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:57
    def findById(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/schedule/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:56
    def find(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/schedules")
    }
  
  }

  // @LINE:24
  class ReverseUsers(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def lock(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/lock")
    }
  
    // @LINE:38
    def updatePassword(id:Integer): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)) + "/changepassword")
    }
  
    // @LINE:24
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user")
    }
  
    // @LINE:32
    def unlock(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/unlock")
    }
  
    // @LINE:33
    def verifyAccount(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/verify")
    }
  
    // @LINE:34
    def forgotPassword(): Call = {
    
      () match {
      
        // @LINE:34
        case ()  =>
          
          Call("POST", _prefix + { _defaultPrefix } + "api/user/forgot/password")
      
      }
    
    }
  
    // @LINE:37
    def resetPassword(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/reset/password")
    }
  
    // @LINE:30
    def delete(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:35
    def verifyResetCode(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/verify/code")
    }
  
    // @LINE:28
    def update(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:26
    def findById(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:25
    def find(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/users")
    }
  
    // @LINE:27
    def findByType(): Call = {
    
      () match {
      
        // @LINE:27
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "api/users/type")
      
      }
    
    }
  
    // @LINE:29
    def login(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/login")
    }
  
  }

  // @LINE:61
  class ReverseReservations(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:61
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/reserve")
    }
  
    // @LINE:62
    def find(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/reservations")
    }
  
    // @LINE:63
    def findById(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/reservation/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:64
    def cancel(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/reservation/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/cancel")
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
  
    // @LINE:20
    def schedules(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "schedules")
    }
  
    // @LINE:18
    def scheduleAdd(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "schedule")
    }
  
    // @LINE:21
    def reservations(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "reservations")
    }
  
    // @LINE:8
    def signup(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:10
    def companyAdd(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "company")
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
  
    // @LINE:7
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:48
  class ReverseStations(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/station")
    }
  
    // @LINE:48
    def findStationsByDestination(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/destination/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/stations")
    }
  
    // @LINE:53
    def delete(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/station/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:52
    def update(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/station/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:51
    def findById(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/station/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:50
    def find(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/stations")
    }
  
  }

  // @LINE:42
  class ReverseDestinations(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:42
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/destination")
    }
  
    // @LINE:46
    def delete(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/destination/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:45
    def update(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/destination/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:44
    def findById(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/destination/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:43
    def find(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/destinations")
    }
  
  }


}
