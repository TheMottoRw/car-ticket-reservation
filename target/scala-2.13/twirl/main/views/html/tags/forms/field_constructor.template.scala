
package views.html.tags.forms

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

object field_constructor extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements : helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import views.tags.forms.FormHelper.addClassValue

def /*5.2*/input/*5.7*/ = {{
  if(elements.hasErrors) {
    addClassValue(elements.input.toString(), "form-control is-invalid")
  } else {
    addClassValue(elements.input.toString(), "form-control")
  }
}};
Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*11.2*/("""

"""),format.raw/*13.1*/("""<label for=""""),_display_(/*13.14*/elements/*13.22*/.id),format.raw/*13.25*/("""">"""),_display_(/*13.28*/elements/*13.36*/.label),format.raw/*13.42*/("""</label>
<div id="input-for-"""),_display_(/*14.21*/elements/*14.29*/.id),format.raw/*14.32*/("""" class="input">
  """),_display_(/*15.4*/Html(input)),format.raw/*15.15*/("""
  """),format.raw/*16.3*/("""<span class="invalid-feedback">"""),_display_(/*16.35*/elements/*16.43*/.errors.mkString(", ")),format.raw/*16.65*/("""</span>
  <small class="form-text text-muted">"""),_display_(/*17.40*/elements/*17.48*/.infos.mkString(", ")),format.raw/*17.69*/("""</small>
</div>

"""))
      }
    }
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/tags/forms/field_constructor.scala.html
                  HASH: f9ed96931e60acbf5e0845386797cbe85c1da8f5
                  MATRIX: 944->1|1050->37|1111->88|1123->93|1334->35|1361->86|1389->275|1418->277|1458->290|1475->298|1499->301|1529->304|1546->312|1573->318|1629->347|1646->355|1670->358|1716->378|1748->389|1778->392|1837->424|1854->432|1897->454|1971->501|1988->509|2030->530
                  LINES: 27->1|30->3|32->5|32->5|39->2|40->4|41->11|43->13|43->13|43->13|43->13|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|46->16|46->16|46->16|46->16|47->17|47->17|47->17
                  -- GENERATED --
              */
          