
package views.html.layout

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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(page: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
            <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>"""),_display_(/*8.17*/title),format.raw/*8.22*/("""</title>
            <!--     Fonts and icons     -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet" />
            <!-- Nucleo Icons -->
        <link href="/static/assets/css/nucleo-icons.css" rel="stylesheet" />
        <link href="/static/assets/css/nucleo-svg.css" rel="stylesheet" />
            <!-- Font Awesome Icons -->
        <script src="https://kit.fontawesome.com/42d5adcbca.js" crossorigin="anonymous"></script>
        <link href="/static/assets/css/nucleo-svg.css" rel="stylesheet" />
            <!-- CSS Files -->
        <link id="pagestyle" href="/static/assets/css/soft-ui-dashboard.css?v=1.0.3" rel="stylesheet" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css" rel="stylesheet" />
    <body class="g-sidenav-show  bg-gray-100">
        """),_display_(/*21.10*/commons/*21.17*/.sidebar()),format.raw/*21.27*/("""
        """),format.raw/*22.9*/("""<main class="main-content position-relative max-height-vh-100 h-100 mt-1 border-radius-lg ">
            """),_display_(/*23.14*/commons/*23.21*/.header(page)),format.raw/*23.34*/("""
                """),_display_(/*24.18*/content),format.raw/*24.25*/("""

        """),format.raw/*26.9*/("""</main>
    </body>
            <!-- plugins:js -->


    <script src="/static/helper/utils.js"></script>

    <script src="/static/helper/validators.js"></script>
    <script>
                window.addEventListener("DOMContentLoaded",function()"""),format.raw/*35.70*/("""{"""),format.raw/*35.71*/("""
                    """),format.raw/*36.21*/("""routeGuard();
                """),format.raw/*37.17*/("""}"""),format.raw/*37.18*/(""")
                document.querySelector("#aLogout").onclick = (event) => """),format.raw/*38.73*/("""{"""),format.raw/*38.74*/("""
                    """),format.raw/*39.21*/("""event.preventDefault();
                    let isConfirmed = confirm("Are you sure you want to logout");
                    if (isConfirmed) """),format.raw/*41.38*/("""{"""),format.raw/*41.39*/("""
                        """),format.raw/*42.25*/("""localStorage.clear();
                        window.location = '/';
                    """),format.raw/*44.21*/("""}"""),format.raw/*44.22*/("""
                """),format.raw/*45.17*/("""}"""),format.raw/*45.18*/("""
        """),format.raw/*46.9*/("""</script>
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,page:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(page)(content)

  def f:((String) => (String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (page) => (content) => apply(title)(page)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/layout/main.scala.html
                  HASH: 906d69add0c4ac908730b6274b026c1982597af3
                  MATRIX: 925->1|1063->46|1315->272|1340->277|2241->1152|2257->1159|2288->1169|2324->1178|2457->1284|2473->1291|2507->1304|2552->1322|2580->1329|2617->1339|2891->1585|2920->1586|2969->1607|3027->1637|3056->1638|3158->1712|3187->1713|3236->1734|3407->1877|3436->1878|3489->1903|3606->1992|3635->1993|3680->2010|3709->2011|3745->2020
                  LINES: 27->1|32->2|38->8|38->8|51->21|51->21|51->21|52->22|53->23|53->23|53->23|54->24|54->24|56->26|65->35|65->35|66->36|67->37|67->37|68->38|68->38|69->39|71->41|71->41|72->42|74->44|74->44|75->45|75->45|76->46
                  -- GENERATED --
              */
          