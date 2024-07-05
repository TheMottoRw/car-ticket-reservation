
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
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
    </head>
    <body class="g-sidenav-show  bg-gray-100">
        """),_display_(/*21.10*/commons/*21.17*/.sidebar()),format.raw/*21.27*/("""
        """),format.raw/*22.9*/("""<main class="main-content position-relative max-height-vh-100 h-100 mt-1 border-radius-lg ">
            """),_display_(/*23.14*/commons/*23.21*/.header()),format.raw/*23.30*/("""
                """),_display_(/*24.18*/content),format.raw/*24.25*/("""

        """),format.raw/*26.9*/("""</main>
    </body>
            <!-- plugins:js -->

        <script>
                window.addEventListener("DOMContentLoaded",function()"""),format.raw/*31.70*/("""{"""),format.raw/*31.71*/("""
                    """),format.raw/*32.21*/("""// routeGuard();
                """),format.raw/*33.17*/("""}"""),format.raw/*33.18*/(""")
                document.querySelector("#aLogout").onclick = (event) => """),format.raw/*34.73*/("""{"""),format.raw/*34.74*/("""
                    """),format.raw/*35.21*/("""event.preventDefault();
                    let isConfirmed = confirm("Are you sure you want to logout");
                    if (isConfirmed) """),format.raw/*37.38*/("""{"""),format.raw/*37.39*/("""
                        """),format.raw/*38.25*/("""localStorage.clear();
                        window.location = '/';
                    """),format.raw/*40.21*/("""}"""),format.raw/*40.22*/("""
                """),format.raw/*41.17*/("""}"""),format.raw/*41.18*/("""
        """),format.raw/*42.9*/("""</script>
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/layout/main.scala.html
                  HASH: 44a4672b3c63d39ae7741a2533b4e1e55dd31cbe
                  MATRIX: 918->1|1042->32|1294->258|1319->263|2110->1027|2126->1034|2157->1044|2193->1053|2326->1159|2342->1166|2372->1175|2417->1193|2445->1200|2482->1210|2649->1349|2678->1350|2727->1371|2788->1404|2817->1405|2919->1479|2948->1480|2997->1501|3168->1644|3197->1645|3250->1670|3367->1759|3396->1760|3441->1777|3470->1778|3506->1787
                  LINES: 27->1|32->2|38->8|38->8|51->21|51->21|51->21|52->22|53->23|53->23|53->23|54->24|54->24|56->26|61->31|61->31|62->32|63->33|63->33|64->34|64->34|65->35|67->37|67->37|68->38|70->40|70->40|71->41|71->41|72->42
                  -- GENERATED --
              */
          