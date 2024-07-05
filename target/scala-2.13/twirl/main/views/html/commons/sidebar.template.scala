
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
            <img src="../assets/img/logo-ct.png" class="navbar-brand-img h-100" alt="main_logo">
            <span class="ms-1 font-weight-bold">Ticket Reservation</span>
        </a>
    </div>
    <hr class="horizontal dark mt-0">
    <div class="collapse navbar-collapse  w-auto  max-height-vh-100 h-100" id="sidenav-collapse-main">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link  " href="../pages/tables.html">
                    <i class="bi bi-building"></i> Companies
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href=""""),_display_(/*18.44*/routes/*18.50*/.ViewController.destinations()),format.raw/*18.80*/("""">
                    <i class="bi bi-train-front"></i> Destinations
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href=""""),_display_(/*23.44*/routes/*23.50*/.ViewController.destinations()),format.raw/*23.80*/("""">
                    <i class="bi bi-clock-fill"></i> Schedules
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link " href=""""),_display_(/*28.45*/routes/*28.51*/.ViewController.destinations()),format.raw/*28.81*/("""">
                    <i class="bi bi-cash"></i> Reservations
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link  " href="../pages/billing.html">
                    <span class="nav-link-text ms-1">Billing</span>
                </a>
            </li>
            <li class="nav-item mt-3">
                <h6 class="ps-4 ms-2 text-uppercase text-xs font-weight-bolder opacity-6">Account pages</h6>
            </li>
            <li class="nav-item">
                <a class="nav-link  " href="../pages/sign-up.html">
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
                  HASH: 780aa274aa90378d444373bddac0430759470ee7
                  MATRIX: 999->0|2130->1104|2145->1110|2196->1140|2409->1326|2424->1332|2475->1362|2685->1545|2700->1551|2751->1581
                  LINES: 32->1|49->18|49->18|49->18|54->23|54->23|54->23|59->28|59->28|59->28
                  -- GENERATED --
              */
          