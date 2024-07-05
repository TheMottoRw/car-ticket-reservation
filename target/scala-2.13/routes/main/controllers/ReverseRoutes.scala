// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:50
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "static/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:40
  class ReverseSchedules(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/schedule")
    }
  
    // @LINE:41
    def find(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/schedules")
    }
  
    // @LINE:42
    def findById(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/schedule/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:43
    def update(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/schedule/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }

  // @LINE:14
  class ReverseUsers(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def lock(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/lock")
    }
  
    // @LINE:28
    def updatePassword(id:Integer): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)) + "/changepassword")
    }
  
    // @LINE:14
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user")
    }
  
    // @LINE:22
    def unlock(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/unlock")
    }
  
    // @LINE:23
    def verifyAccount(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/verify")
    }
  
    // @LINE:24
    def forgotPassword(): Call = {
    
      () match {
      
        // @LINE:24
        case ()  =>
          
          Call("POST", _prefix + { _defaultPrefix } + "api/user/forgot/password")
      
      }
    
    }
  
    // @LINE:27
    def resetPassword(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/reset/password")
    }
  
    // @LINE:20
    def delete(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:25
    def verifyResetCode(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/verify/code")
    }
  
    // @LINE:18
    def update(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:16
    def findById(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:15
    def find(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/users")
    }
  
    // @LINE:17
    def findByType(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/users/owners")
    }
  
    // @LINE:19
    def login(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/login")
    }
  
  }

  // @LINE:45
  class ReverseReservations(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/reserve")
    }
  
    // @LINE:46
    def find(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/reservations")
    }
  
    // @LINE:47
    def findById(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/reservation/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:48
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
  
    // @LINE:11
    def destinations(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "destinations")
    }
  
    // @LINE:8
    def signup(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:10
    def companyAdd(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "company")
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

  // @LINE:35
  class ReverseStations(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/station")
    }
  
    // @LINE:36
    def find(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/stations")
    }
  
    // @LINE:37
    def findById(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/station/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:38
    def update(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/station/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }

  // @LINE:30
  class ReverseDestinations(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/destination")
    }
  
    // @LINE:31
    def find(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/destinations")
    }
  
    // @LINE:32
    def findById(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/destination/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:33
    def update(id:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/destination/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }


}
