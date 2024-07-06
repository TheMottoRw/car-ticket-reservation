
package views.html.commons

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object sidebar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<aside class="sidenav navbar navbar-vertical navbar-expand-xs border-0 border-radius-xl my-3 fixed-start ms-3 " id="sidenav-main">
    <div class="sidenav-header">
        <i class="fas fa-times p-3 cursor-pointer text-secondary opacity-5 position-absolute end-0 top-0 d-none d-xl-none" aria-hidden="true" id="iconSidenav"></i>
        <a class="navbar-brand m-0" href="https://demos.creative-tim.com/soft-ui-dashboard/pages/dashboard.html" target="_blank">
"""),format.raw/*5.101*/("""
            """),format.raw/*6.13*/("""<span class="ms-1 font-weight-bold">Ticket Reservation</span>
        </a>
    </div>
    <hr class="horizontal dark mt-0">
    <div class="collapse navbar-collapse  w-auto  max-height-vh-100 h-100" id="sidenav-collapse-main">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link  " href=""""),_display_(/*13.46*/routes/*13.52*/.ViewController.companies()),format.raw/*13.79*/("""">
                    <i class="bi bi-building"></i> Companies
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href=""""),_display_(/*18.44*/routes/*18.50*/.ViewController.destinations()),format.raw/*18.80*/("""">
                    <i class="bi bi-train-front"></i> Destinations
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href=""""),_display_(/*23.44*/routes/*23.50*/.ViewController.stations()),format.raw/*23.76*/("""">
                    <i class="bi bi-stack"></i> Stations
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href=""""),_display_(/*28.44*/routes/*28.50*/.ViewController.schedules()),format.raw/*28.77*/("""">
                    <i class="bi bi-clock-fill"></i> Schedules
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link " href=""""),_display_(/*33.45*/routes/*33.51*/.ViewController.reservations()),format.raw/*33.81*/("""">
                    <i class="bi bi-cash"></i> Reservations
                </a>
            </li>
"""),format.raw/*37.38*/("""
"""),format.raw/*38.72*/("""
"""),format.raw/*39.72*/("""
"""),format.raw/*40.25*/("""
"""),format.raw/*41.22*/("""
            """),format.raw/*42.13*/("""<li class="nav-item mt-3">
                <h6 class="ps-4 ms-2 text-uppercase text-xs font-weight-bolder opacity-6">Account pages</h6>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#" id="aLogout">
                    <span class="nav-link-text ms-1"><i class="ni-bold-down"></i>Sign out</span>
                </a>
            </li>
        </ul>
    </div>
</aside>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/commons/sidebar.scala.html
                  HASH: a100fb5b0834026a2e90f7212916df7ac52fc94c
                  MATRIX: 999->0|1485->558|1525->571|1890->909|1905->915|1953->942|2160->1122|2175->1128|2226->1158|2439->1344|2454->1350|2501->1376|2704->1552|2719->1558|2767->1585|2977->1768|2992->1774|3043->1804|3173->1943|3202->2015|3231->2087|3260->2112|3289->2134|3330->2147
                  LINES: 32->1|36->5|37->6|44->13|44->13|44->13|49->18|49->18|49->18|54->23|54->23|54->23|59->28|59->28|59->28|64->33|64->33|64->33|68->37|69->38|70->39|71->40|72->41|73->42
                  -- GENERATED --
              */
          