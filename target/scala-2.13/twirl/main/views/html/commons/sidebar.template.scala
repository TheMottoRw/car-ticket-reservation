
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
            <li class="nav-item" id="menu-companies" style="display:none">
                <a class="nav-link  " href=""""),_display_(/*13.46*/routes/*13.52*/.ViewController.companies()),format.raw/*13.79*/("""">
                    <i class="bi bi-building"></i> Companies
                </a>
            </li>
            <li class="nav-item" id="menu-drivers" style="display:none">
                <a class="nav-link  " href=""""),_display_(/*18.46*/routes/*18.52*/.ViewController.drivers()),format.raw/*18.77*/("""">
                    <i class="bi bi-people"></i> Drivers
                </a>
            </li>
            <li class="nav-item" id="menu-destinations" style="display:none">
                <a class="nav-link" href=""""),_display_(/*23.44*/routes/*23.50*/.ViewController.destinations()),format.raw/*23.80*/("""">
                    <i class="bi bi-train-front"></i> Destinations
                </a>
            </li>
            <li class="nav-item" id="menu-stations" style="display:none">
                <a class="nav-link" href=""""),_display_(/*28.44*/routes/*28.50*/.ViewController.stations()),format.raw/*28.76*/("""">
                    <i class="bi bi-stack"></i> Stations
                </a>
            </li>
            <li class="nav-item" id="menu-schedules" style="display:none">
                <a class="nav-link" href=""""),_display_(/*33.44*/routes/*33.50*/.ViewController.schedules()),format.raw/*33.77*/("""">
                    <i class="bi bi-clock-fill"></i> Schedules
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#" id="aLogout">
                    <span class="nav-link-text ms-1"><i class="bi bi-box-arrow-in-left"></i> Sign out</span>
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
                  HASH: ac63591233d4a2df88949cd55d4e44496990ab42
                  MATRIX: 999->0|1485->558|1525->571|1931->950|1946->956|1994->983|2242->1204|2257->1210|2303->1235|2550->1455|2565->1461|2616->1491|2869->1717|2884->1723|2931->1749|3175->1966|3190->1972|3238->1999
                  LINES: 32->1|36->5|37->6|44->13|44->13|44->13|49->18|49->18|49->18|54->23|54->23|54->23|59->28|59->28|59->28|64->33|64->33|64->33
                  -- GENERATED --
              */
          