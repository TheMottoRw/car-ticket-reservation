
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

object header extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(page: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<nav class="navbar navbar-main navbar-expand-lg px-0 mx-4 shadow-none border-radius-xl" id="navbarBlur" navbar-scroll="true">
    <div class="container-fluid py-1 px-3">
        <nav aria-label="breadcrumb">
            <ol class="breadcrumb bg-transparent mb-0 pb-0 pt-1 px-0 me-sm-6 me-5">
                <li class="breadcrumb-item text-sm"><a class="opacity-5 text-dark" href="javascript:;">Pages</a></li>
                <li class="breadcrumb-item text-sm text-dark active" aria-current="page">"""),_display_(/*7.91*/page),format.raw/*7.95*/("""</li>
            </ol>
            <h6 class="font-weight-bolder mb-0">"""),_display_(/*9.50*/page),format.raw/*9.54*/("""</h6>
        </nav>
    </div>
</nav>"""))
      }
    }
  }

  def render(page:String): play.twirl.api.HtmlFormat.Appendable = apply(page)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (page) => apply(page)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/commons/header.scala.html
                  HASH: edcbcbb8313e9dc5c4b453206f2b5aedaa39510a
                  MATRIX: 916->1|1024->16|1550->516|1574->520|1673->593|1697->597
                  LINES: 27->1|32->2|37->7|37->7|39->9|39->9
                  -- GENERATED --
              */
          