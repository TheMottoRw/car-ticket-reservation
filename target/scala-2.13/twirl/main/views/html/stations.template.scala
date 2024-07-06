
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

object stations extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/layout/*1.8*/.main("Registered stations")/*1.36*/("Stations")/*1.48*/ {_display_(Seq[Any](format.raw/*1.50*/("""
    """),format.raw/*2.5*/("""<div class="container-fluid py-4">
        <div class="row">
            <div class="col-12">
                <div class="card mb-4">
                    <div class="card-header pb-0">
                        <h6>Available stations <a href=""""),_display_(/*7.58*/routes/*7.64*/.ViewController.stationAdd()),format.raw/*7.92*/("""" class="btn btn-dark btn-sm" style="margin-left:70% ">Add station</a></h6>
                    </div>
                    <div class="card-body px-0 pt-0 pb-2">
                        <div class="table-responsive p-0">
                            <div class="alert alert-success" id="responseSuccess" style="display: none"></div>
                            <div class="alert alert-danger" id="responseFail" style="display: none"></div>
                            <table class="table align-items-center mb-0">
                                <thead>
                                    <tr>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            #Count</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">
                                            Destination</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">
                                            Name</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            Previous station</th>
                                        <th class="text-secondary opacity-7">Action</th>
                                    </tr>
                                </thead>
                                <tbody id="table-data">
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        """),_display_(/*35.10*/commons/*35.17*/.footer()),format.raw/*35.26*/("""
    """),format.raw/*36.5*/("""</div>
    <script>
            window.addEventListener("DOMContentLoaded", function () """),format.raw/*38.69*/("""{"""),format.raw/*38.70*/("""
                """),format.raw/*39.17*/("""loadData();
            """),format.raw/*40.13*/("""}"""),format.raw/*40.14*/(""");

            async function loadData() """),format.raw/*42.39*/("""{"""),format.raw/*42.40*/("""
                """),format.raw/*43.17*/("""var requestOptions = """),format.raw/*43.38*/("""{"""),format.raw/*43.39*/("""
                    """),format.raw/*44.21*/("""method: 'GET',
                    headers: """),format.raw/*45.30*/("""{"""),format.raw/*45.31*/("""
                        """),format.raw/*46.25*/(""""Content-Type": "application/json",
                        "Authorization":`Bearer $"""),format.raw/*47.50*/("""{"""),format.raw/*47.51*/("""localStorage.getItem("token")"""),format.raw/*47.80*/("""}"""),format.raw/*47.81*/("""`
                    """),format.raw/*48.21*/("""}"""),format.raw/*48.22*/("""
                """),format.raw/*49.17*/("""}"""),format.raw/*49.18*/(""";
                const data = await fetch(`$"""),format.raw/*50.44*/("""{"""),format.raw/*50.45*/("""apiUrl"""),format.raw/*50.51*/("""}"""),format.raw/*50.52*/("""/stations`, requestOptions)
                        .then(response => response.json())
                        .then(result => result)
                        .catch(error => console.log('error', error));
                setContent(data);
            """),format.raw/*55.13*/("""}"""),format.raw/*55.14*/("""

            """),format.raw/*57.13*/("""function setContent(arr) """),format.raw/*57.38*/("""{"""),format.raw/*57.39*/("""
                """),format.raw/*58.17*/("""var data = '';
                for (var i = 0; i < arr.length; i++) """),format.raw/*59.54*/("""{"""),format.raw/*59.55*/("""

                    """),format.raw/*61.21*/("""data+=`<tr>

                        <td>
                            <p class="font-weight-bold mb-0 ml-2">$"""),format.raw/*64.68*/("""{"""),format.raw/*64.69*/("""i+1"""),format.raw/*64.72*/("""}"""),format.raw/*64.73*/("""</p>
                        </td>
                        <td>
                            <div class="d-flex px-2 py-1">
                                <div class="d-flex flex-column justify-content-center">
                                    <p class="mb-0 text-secondary">$"""),format.raw/*69.69*/("""{"""),format.raw/*69.70*/("""arr[i].destination.departure"""),format.raw/*69.98*/("""}"""),format.raw/*69.99*/("""-$"""),format.raw/*69.101*/("""{"""),format.raw/*69.102*/("""arr[i].destination.arrival"""),format.raw/*69.128*/("""}"""),format.raw/*69.129*/("""</p>
                                </div>
                            </div>
                        </td>
                        <td>
                            <p class="text-secondary mb-0">$"""),format.raw/*74.61*/("""{"""),format.raw/*74.62*/("""arr[i].name"""),format.raw/*74.73*/("""}"""),format.raw/*74.74*/("""</p>
                        </td>
                        <td>
                            <p class="text-secondary mb-0">$"""),format.raw/*77.61*/("""{"""),format.raw/*77.62*/("""arr[i].previous_station!=null?arr[i].previous_station.name:"""""),format.raw/*77.123*/("""}"""),format.raw/*77.124*/("""</p>
                        </td>
                        <td class="align-middle">
                            <a href="/station/$"""),format.raw/*80.48*/("""{"""),format.raw/*80.49*/("""arr[i].id"""),format.raw/*80.58*/("""}"""),format.raw/*80.59*/("""" class="text-secondary font-weight-bold text-xs" data-toggle="tooltip" data-original-title="Edit station">
                                Edit
                            </a>
                            <a href="#" class="text-danger font-weight-bold text-xs" data-toggle="tooltip" data-original-title="Delete station" data-id="$"""),format.raw/*83.155*/("""{"""),format.raw/*83.156*/("""arr[i].id"""),format.raw/*83.165*/("""}"""),format.raw/*83.166*/("""" onclick="confirmDelete(this)">
                                delete
                            </a>
                        </td>
                    </tr>`
                """),format.raw/*88.17*/("""}"""),format.raw/*88.18*/("""
                """),format.raw/*89.17*/("""document.querySelector("#table-data").innerHTML = data;
            """),format.raw/*90.13*/("""}"""),format.raw/*90.14*/("""

            """),format.raw/*92.13*/("""async function confirmDelete(obj) """),format.raw/*92.47*/("""{"""),format.raw/*92.48*/("""
                """),format.raw/*93.17*/("""isConfirmed = confirm(`Are you sure you want to deleting station`)
                if (!isConfirmed) console.log(`delete of $"""),format.raw/*94.59*/("""{"""),format.raw/*94.60*/("""obj.getAttribute('data-id')"""),format.raw/*94.87*/("""}"""),format.raw/*94.88*/(""" """),format.raw/*94.89*/("""cancelled`)
                if (isConfirmed) """),format.raw/*95.34*/("""{"""),format.raw/*95.35*/("""
                    """),format.raw/*96.21*/("""deleteData(obj.getAttribute("data-id"));
                """),format.raw/*97.17*/("""}"""),format.raw/*97.18*/("""
            """),format.raw/*98.13*/("""}"""),format.raw/*98.14*/("""

            """),format.raw/*100.13*/("""async function deleteData(id) """),format.raw/*100.43*/("""{"""),format.raw/*100.44*/("""
                """),format.raw/*101.17*/("""var requestOptions = """),format.raw/*101.38*/("""{"""),format.raw/*101.39*/("""
                    """),format.raw/*102.21*/("""method: 'POST',
                    body: JSON.stringify("""),format.raw/*103.42*/("""{"""),format.raw/*103.43*/("""user_id: localStorage.getItem("id")"""),format.raw/*103.78*/("""}"""),format.raw/*103.79*/("""),
                    headers: """),format.raw/*104.30*/("""{"""),format.raw/*104.31*/("""
                        """),format.raw/*105.25*/(""""Content-Type": "application/json",
                        "Authorization":`Bearer $"""),format.raw/*106.50*/("""{"""),format.raw/*106.51*/("""localStorage.getItem("token")"""),format.raw/*106.80*/("""}"""),format.raw/*106.81*/("""`
                    """),format.raw/*107.21*/("""}"""),format.raw/*107.22*/("""
                """),format.raw/*108.17*/("""}"""),format.raw/*108.18*/(""";
                console.log(requestOptions)
                let url = `$"""),format.raw/*110.29*/("""{"""),format.raw/*110.30*/("""apiUrl"""),format.raw/*110.36*/("""}"""),format.raw/*110.37*/("""/station/$"""),format.raw/*110.47*/("""{"""),format.raw/*110.48*/("""id"""),format.raw/*110.50*/("""}"""),format.raw/*110.51*/("""/delete`;
                const data = await fetch(url, requestOptions)
                        .then(response => response.json())
                        .then(result => result)
                        .catch(error => console.log('error', error));
                var el = "";
                if (data.status) """),format.raw/*116.34*/("""{"""),format.raw/*116.35*/("""
                    """),format.raw/*117.21*/("""el = document.getElementById("responseSuccess");
                    document.getElementById("responseFail").style.display = 'none';
                    loadData();
                """),format.raw/*120.17*/("""}"""),format.raw/*120.18*/(""" """),format.raw/*120.19*/("""else """),format.raw/*120.24*/("""{"""),format.raw/*120.25*/("""
                    """),format.raw/*121.21*/("""el = document.getElementById("responseFail");
                    document.getElementById("responseSuccess").style.display = 'none';
                """),format.raw/*123.17*/("""}"""),format.raw/*123.18*/("""
                """),format.raw/*124.17*/("""el.style = 'display:block';
                el.innerHTML = data.message;
            """),format.raw/*126.13*/("""}"""),format.raw/*126.14*/("""


    """),format.raw/*129.5*/("""</script>

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
                  SOURCE: app/views/stations.scala.html
                  HASH: 5188003b5a0b8d3edc7d2ae0803bac5d0ae2013d
                  MATRIX: 992->1|1005->7|1041->35|1061->47|1100->49|1131->54|1399->296|1413->302|1461->330|3243->2085|3259->2092|3289->2101|3321->2106|3437->2194|3466->2195|3511->2212|3563->2236|3592->2237|3662->2279|3691->2280|3736->2297|3785->2318|3814->2319|3863->2340|3935->2384|3964->2385|4017->2410|4130->2495|4159->2496|4216->2525|4245->2526|4295->2548|4324->2549|4369->2566|4398->2567|4471->2612|4500->2613|4534->2619|4563->2620|4842->2871|4871->2872|4913->2886|4966->2911|4995->2912|5040->2929|5136->2997|5165->2998|5215->3020|5352->3129|5381->3130|5412->3133|5441->3134|5748->3413|5777->3414|5833->3442|5862->3443|5893->3445|5923->3446|5978->3472|6008->3473|6234->3671|6263->3672|6302->3683|6331->3684|6483->3808|6512->3809|6602->3870|6632->3871|6792->4003|6821->4004|6858->4013|6887->4014|7248->4346|7278->4347|7316->4356|7346->4357|7552->4535|7581->4536|7626->4553|7722->4621|7751->4622|7793->4636|7855->4670|7884->4671|7929->4688|8082->4813|8111->4814|8166->4841|8195->4842|8224->4843|8297->4888|8326->4889|8375->4910|8460->4967|8489->4968|8530->4981|8559->4982|8602->4996|8661->5026|8691->5027|8737->5044|8787->5065|8817->5066|8867->5087|8953->5144|8983->5145|9047->5180|9077->5181|9138->5213|9168->5214|9222->5239|9336->5324|9366->5325|9424->5354|9454->5355|9505->5377|9535->5378|9581->5395|9611->5396|9714->5470|9744->5471|9779->5477|9809->5478|9848->5488|9878->5489|9909->5491|9939->5492|10279->5803|10309->5804|10359->5825|10569->6006|10599->6007|10629->6008|10663->6013|10693->6014|10743->6035|10921->6184|10951->6185|10997->6202|11111->6287|11141->6288|11176->6295
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|38->7|38->7|38->7|66->35|66->35|66->35|67->36|69->38|69->38|70->39|71->40|71->40|73->42|73->42|74->43|74->43|74->43|75->44|76->45|76->45|77->46|78->47|78->47|78->47|78->47|79->48|79->48|80->49|80->49|81->50|81->50|81->50|81->50|86->55|86->55|88->57|88->57|88->57|89->58|90->59|90->59|92->61|95->64|95->64|95->64|95->64|100->69|100->69|100->69|100->69|100->69|100->69|100->69|100->69|105->74|105->74|105->74|105->74|108->77|108->77|108->77|108->77|111->80|111->80|111->80|111->80|114->83|114->83|114->83|114->83|119->88|119->88|120->89|121->90|121->90|123->92|123->92|123->92|124->93|125->94|125->94|125->94|125->94|125->94|126->95|126->95|127->96|128->97|128->97|129->98|129->98|131->100|131->100|131->100|132->101|132->101|132->101|133->102|134->103|134->103|134->103|134->103|135->104|135->104|136->105|137->106|137->106|137->106|137->106|138->107|138->107|139->108|139->108|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|147->116|147->116|148->117|151->120|151->120|151->120|151->120|151->120|152->121|154->123|154->123|155->124|157->126|157->126|160->129
                  -- GENERATED --
              */
          