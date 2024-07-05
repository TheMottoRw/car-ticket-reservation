
package views.html

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

object destinations extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/layout/*1.8*/.main("Registered users")/*1.33*/("Destinations")/*1.49*/ {_display_(Seq[Any](format.raw/*1.51*/("""
    """),format.raw/*2.5*/("""<div class="container-fluid py-4">
        <div class="row">
            <div class="col-12">
                <div class="card mb-4">
                    <div class="card-header pb-0">
                        <h6>Available destinations</h6>
                    </div>
                    <div class="card-body px-0 pt-0 pb-2">
                        <div class="table-responsive p-0">
                            <table class="table align-items-center mb-0">
                                <thead>
                                    <tr>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            #Count</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">
                                            From</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            To</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            Price</th>
                                        <th class="text-secondary opacity-7">Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>

                                        <td>
                                            <p class="text-xs font-weight-bold mb-0 ml-2">1</p>
                                        </td>
                                        <td>
                                            <div class="d-flex px-2 py-1">
                                                <div class="d-flex flex-column justify-content-center">
                                                    <p class="mb-0 text-secondary">Kigali</p>
                                                </div>
                                            </div>
                                        </td>
                                        <td>
                                            <p class="text-secondary mb-0">Huye</p>
                                        </td>
                                        <td>
                                            <p class="text-secondary mb-0">3200 RWF</p>
                                        </td>
                                        <td class="align-middle">
                                            <a href="javascript:;" class="text-secondary font-weight-bold text-xs" data-toggle="tooltip" data-original-title="Edit user">
                                                Edit
                                            </a>
                                            <a href="javascript:;" class="text-danger font-weight-bold text-xs" data-toggle="tooltip" data-original-title="Delete user">
                                                delete
                                            </a>
                                        </td>
                                    </tr>
                                    <tr>

                                        <td>
                                            <p class="font-weight-bold mb-0 ml-2">1</p>
                                        </td>
                                        <td>
                                            <div class="d-flex px-2 py-1">
                                                <div class="d-flex flex-column justify-content-center">
                                                    <p class="mb-0 text-secondary">Muhanga</p>
                                                </div>
                                            </div>
                                        </td>
                                        <td>
                                            <p class="text-secondary mb-0">Ngororero</p>
                                        </td>
                                        <td>
                                            <p class="text-secondary mb-0">1700 RWF</p>
                                        </td>
                                        <td class="align-middle">
                                            <a href="javascript:;" class="text-secondary font-weight-bold text-xs" data-toggle="tooltip" data-original-title="Edit user">
                                                Edit
                                            </a>
                                            <a href="javascript:;" class="text-danger font-weight-bold text-xs" data-toggle="tooltip" data-original-title="Delete user">
                                                delete
                                            </a>
                                        </td>
                                    </tr>
                                    <tr>

                                        <td>
                                            <p class="font-weight-bold mb-0 ml-2">3</p>
                                        </td>
                                        <td>
                                            <div class="d-flex px-2 py-1">
                                                <div class="d-flex flex-column justify-content-center">
                                                    <p class="mb-0 text-secondary">Ruhango</p>
                                                </div>
                                            </div>
                                        </td>
                                        <td>
                                            <p class="mb-0 text-secondary">Nyanza</p>
                                        </td>
                                        <td>
                                            <p class="text-secondary mb-0">650 rwf</p>
                                        </td>
                                        <td class="align-middle">
                                            <a href="javascript:;" class="text-secondary font-weight-bold text-xs" data-toggle="tooltip" data-original-title="Edit user">
                                                Edit
                                            </a>
                                            <a href="javascript:;" class="text-danger font-weight-bold text-xs" data-toggle="tooltip" data-original-title="Delete user">
                                                delete
                                            </a>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        """),_display_(/*114.10*/commons/*114.17*/.footer()),format.raw/*114.26*/("""
    """),format.raw/*115.5*/("""</div>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/destinations.scala.html
                  HASH: 2aac88741fc6423ab00e2039025f5aae94085cc6
                  MATRIX: 996->1|1009->7|1042->32|1066->48|1105->50|1136->55|8073->6964|8090->6971|8121->6980|8154->6985
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|145->114|145->114|145->114|146->115
                  -- GENERATED --
              */
          