
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

object schedules extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/layout/*1.8*/.main("Registered schedules")/*1.37*/("Schedules")/*1.50*/ {_display_(Seq[Any](format.raw/*1.52*/("""
    """),format.raw/*2.5*/("""<div class="container-fluid py-4">
        <div class="row">
            <div class="col-12">
                <div class="card mb-4">
                    <div class="card-header pb-0">
                        <h6>Available schedulers<a href=""""),_display_(/*7.59*/routes/*7.65*/.ViewController.scheduleAdd()),format.raw/*7.94*/("""" class="btn btn-dark btn-sm" style="margin-left:70% ">Add schedule</a></h6>
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
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            Bus</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            Passengers</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            Time</th>
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
        """),_display_(/*37.10*/commons/*37.17*/.footer()),format.raw/*37.26*/("""
    """),format.raw/*38.5*/("""</div>
    <script>
            window.addEventListener("DOMContentLoaded", function () """),format.raw/*40.69*/("""{"""),format.raw/*40.70*/("""
                """),format.raw/*41.17*/("""loadData();
            """),format.raw/*42.13*/("""}"""),format.raw/*42.14*/(""");

            async function loadData() """),format.raw/*44.39*/("""{"""),format.raw/*44.40*/("""
                """),format.raw/*45.17*/("""var requestOptions = """),format.raw/*45.38*/("""{"""),format.raw/*45.39*/("""
                    """),format.raw/*46.21*/("""method: 'GET',
                    headers: """),format.raw/*47.30*/("""{"""),format.raw/*47.31*/("""
                        """),format.raw/*48.25*/(""""Content-Type": "application/json",
                        "Authorization":`Bearer $"""),format.raw/*49.50*/("""{"""),format.raw/*49.51*/("""localStorage.getItem("token")"""),format.raw/*49.80*/("""}"""),format.raw/*49.81*/("""`
                    """),format.raw/*50.21*/("""}"""),format.raw/*50.22*/("""
                """),format.raw/*51.17*/("""}"""),format.raw/*51.18*/(""";
                const data = await fetch(`$"""),format.raw/*52.44*/("""{"""),format.raw/*52.45*/("""apiUrl"""),format.raw/*52.51*/("""}"""),format.raw/*52.52*/("""/schedules`, requestOptions)
                        .then(response => response.json())
                        .then(result => result)
                        .catch(error => console.log('error', error));
                setContent(data);
            """),format.raw/*57.13*/("""}"""),format.raw/*57.14*/("""

            """),format.raw/*59.13*/("""function setContent(arr) """),format.raw/*59.38*/("""{"""),format.raw/*59.39*/("""
                """),format.raw/*60.17*/("""var data = '';
                for (var i = 0; i < arr.length; i++) """),format.raw/*61.54*/("""{"""),format.raw/*61.55*/("""

                    """),format.raw/*63.21*/("""data+=`<tr>

                        <td>
                            <p class="font-weight-bold mb-0 ml-2">$"""),format.raw/*66.68*/("""{"""),format.raw/*66.69*/("""i+1"""),format.raw/*66.72*/("""}"""),format.raw/*66.73*/("""</p>
                        </td>
                        <td>
                            <div class="d-flex px-2 py-1">
                                <div class="d-flex flex-column justify-content-center">
                                    <p class="mb-0 text-secondary">$"""),format.raw/*71.69*/("""{"""),format.raw/*71.70*/("""arr[i].destination.departure"""),format.raw/*71.98*/("""}"""),format.raw/*71.99*/("""-$"""),format.raw/*71.101*/("""{"""),format.raw/*71.102*/("""arr[i].destination.arrival"""),format.raw/*71.128*/("""}"""),format.raw/*71.129*/("""</p>
                                </div>
                            </div>
                        </td>
                        <td>
                            <p class="text-secondary mb-0">$"""),format.raw/*76.61*/("""{"""),format.raw/*76.62*/("""arr[i].bus_plate_no"""),format.raw/*76.81*/("""}"""),format.raw/*76.82*/("""</p>
                        </td>
                        <td>
                            <p class="text-secondary mb-0">$"""),format.raw/*79.61*/("""{"""),format.raw/*79.62*/("""arr[i].passenger_limit"""),format.raw/*79.84*/("""}"""),format.raw/*79.85*/("""</p>
                        </td>
                        <td>
                            <p class="text-secondary mb-0">$"""),format.raw/*82.61*/("""{"""),format.raw/*82.62*/("""getDate(arr[i].departure_date)"""),format.raw/*82.92*/("""}"""),format.raw/*82.93*/("""</p>
                        </td>
                        <td class="align-middle">
                            <a href="/reservations/$"""),format.raw/*85.53*/("""{"""),format.raw/*85.54*/("""arr[i].id"""),format.raw/*85.63*/("""}"""),format.raw/*85.64*/("""" class="text-success font-weight-bold text-xs" data-toggle="tooltip" data-original-title="Reservations">
                                Reservations
                            </a>
                            <a href="/schedule/$"""),format.raw/*88.49*/("""{"""),format.raw/*88.50*/("""arr[i].id"""),format.raw/*88.59*/("""}"""),format.raw/*88.60*/("""" class="text-secondary font-weight-bold text-xs" data-toggle="tooltip" data-original-title="Edit destination">
                                Edit
                            </a>
                            <a href="#" class="text-danger font-weight-bold text-xs" data-toggle="tooltip" data-original-title="Delete schedule" data-id="$"""),format.raw/*91.156*/("""{"""),format.raw/*91.157*/("""arr[i].id"""),format.raw/*91.166*/("""}"""),format.raw/*91.167*/("""" onclick="confirmDelete(this)">
                                delete
                            </a>
                        </td>
                    </tr>`
                """),format.raw/*96.17*/("""}"""),format.raw/*96.18*/("""
                """),format.raw/*97.17*/("""document.querySelector("#table-data").innerHTML = data;
            """),format.raw/*98.13*/("""}"""),format.raw/*98.14*/("""

            """),format.raw/*100.13*/("""async function confirmDelete(obj) """),format.raw/*100.47*/("""{"""),format.raw/*100.48*/("""
                """),format.raw/*101.17*/("""isConfirmed = confirm(`Are you sure you want to deleting schedule`)
                if (!isConfirmed) console.log(`delete of $"""),format.raw/*102.59*/("""{"""),format.raw/*102.60*/("""obj.getAttribute('data-id')"""),format.raw/*102.87*/("""}"""),format.raw/*102.88*/(""" """),format.raw/*102.89*/("""cancelled`)
                if (isConfirmed) """),format.raw/*103.34*/("""{"""),format.raw/*103.35*/("""
                    """),format.raw/*104.21*/("""deleteData(obj.getAttribute("data-id"));
                """),format.raw/*105.17*/("""}"""),format.raw/*105.18*/("""
            """),format.raw/*106.13*/("""}"""),format.raw/*106.14*/("""

            """),format.raw/*108.13*/("""async function deleteData(id) """),format.raw/*108.43*/("""{"""),format.raw/*108.44*/("""
                """),format.raw/*109.17*/("""var requestOptions = """),format.raw/*109.38*/("""{"""),format.raw/*109.39*/("""
                    """),format.raw/*110.21*/("""method: 'POST',
                    body: JSON.stringify("""),format.raw/*111.42*/("""{"""),format.raw/*111.43*/("""user_id: localStorage.getItem("id")"""),format.raw/*111.78*/("""}"""),format.raw/*111.79*/("""),
                    headers: """),format.raw/*112.30*/("""{"""),format.raw/*112.31*/("""
                        """),format.raw/*113.25*/(""""Content-Type": "application/json",
                        "Authorization":`Bearer $"""),format.raw/*114.50*/("""{"""),format.raw/*114.51*/("""localStorage.getItem("token")"""),format.raw/*114.80*/("""}"""),format.raw/*114.81*/("""`
                    """),format.raw/*115.21*/("""}"""),format.raw/*115.22*/("""
                """),format.raw/*116.17*/("""}"""),format.raw/*116.18*/(""";
                console.log(requestOptions)
                let url = `$"""),format.raw/*118.29*/("""{"""),format.raw/*118.30*/("""apiUrl"""),format.raw/*118.36*/("""}"""),format.raw/*118.37*/("""/schedule/$"""),format.raw/*118.48*/("""{"""),format.raw/*118.49*/("""id"""),format.raw/*118.51*/("""}"""),format.raw/*118.52*/("""/delete`;
                const data = await fetch(url, requestOptions)
                        .then(response => response.json())
                        .then(result => result)
                        .catch(error => console.log('error', error));
                var el = "";
                if (data.status) """),format.raw/*124.34*/("""{"""),format.raw/*124.35*/("""
                    """),format.raw/*125.21*/("""el = document.getElementById("responseSuccess");
                    document.getElementById("responseFail").style.display = 'none';
                    loadData();
                """),format.raw/*128.17*/("""}"""),format.raw/*128.18*/(""" """),format.raw/*128.19*/("""else """),format.raw/*128.24*/("""{"""),format.raw/*128.25*/("""
                    """),format.raw/*129.21*/("""el = document.getElementById("responseFail");
                    document.getElementById("responseSuccess").style.display = 'none';
                """),format.raw/*131.17*/("""}"""),format.raw/*131.18*/("""
                """),format.raw/*132.17*/("""el.style = 'display:block';
                el.innerHTML = data.message;
            """),format.raw/*134.13*/("""}"""),format.raw/*134.14*/("""


    """),format.raw/*137.5*/("""</script>

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
                  SOURCE: app/views/schedules.scala.html
                  HASH: 43e997881f0e6721ad8bf0faeeaccae1d03341fc
                  MATRIX: 993->1|1006->7|1043->36|1064->49|1103->51|1134->56|1403->299|1417->305|1466->334|3412->2253|3428->2260|3458->2269|3490->2274|3606->2362|3635->2363|3680->2380|3732->2404|3761->2405|3831->2447|3860->2448|3905->2465|3954->2486|3983->2487|4032->2508|4104->2552|4133->2553|4186->2578|4299->2663|4328->2664|4385->2693|4414->2694|4464->2716|4493->2717|4538->2734|4567->2735|4640->2780|4669->2781|4703->2787|4732->2788|5012->3040|5041->3041|5083->3055|5136->3080|5165->3081|5210->3098|5306->3166|5335->3167|5385->3189|5522->3298|5551->3299|5582->3302|5611->3303|5918->3582|5947->3583|6003->3611|6032->3612|6063->3614|6093->3615|6148->3641|6178->3642|6404->3840|6433->3841|6480->3860|6509->3861|6661->3985|6690->3986|6740->4008|6769->4009|6921->4133|6950->4134|7008->4164|7037->4165|7202->4302|7231->4303|7268->4312|7297->4313|7557->4545|7586->4546|7623->4555|7652->4556|8018->4893|8048->4894|8086->4903|8116->4904|8322->5082|8351->5083|8396->5100|8492->5168|8521->5169|8564->5183|8627->5217|8657->5218|8703->5235|8858->5361|8888->5362|8944->5389|8974->5390|9004->5391|9078->5436|9108->5437|9158->5458|9244->5515|9274->5516|9316->5529|9346->5530|9389->5544|9448->5574|9478->5575|9524->5592|9574->5613|9604->5614|9654->5635|9740->5692|9770->5693|9834->5728|9864->5729|9925->5761|9955->5762|10009->5787|10123->5872|10153->5873|10211->5902|10241->5903|10292->5925|10322->5926|10368->5943|10398->5944|10501->6018|10531->6019|10566->6025|10596->6026|10636->6037|10666->6038|10697->6040|10727->6041|11067->6352|11097->6353|11147->6374|11357->6555|11387->6556|11417->6557|11451->6562|11481->6563|11531->6584|11709->6733|11739->6734|11785->6751|11899->6836|11929->6837|11964->6844
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|38->7|38->7|38->7|68->37|68->37|68->37|69->38|71->40|71->40|72->41|73->42|73->42|75->44|75->44|76->45|76->45|76->45|77->46|78->47|78->47|79->48|80->49|80->49|80->49|80->49|81->50|81->50|82->51|82->51|83->52|83->52|83->52|83->52|88->57|88->57|90->59|90->59|90->59|91->60|92->61|92->61|94->63|97->66|97->66|97->66|97->66|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|107->76|107->76|107->76|107->76|110->79|110->79|110->79|110->79|113->82|113->82|113->82|113->82|116->85|116->85|116->85|116->85|119->88|119->88|119->88|119->88|122->91|122->91|122->91|122->91|127->96|127->96|128->97|129->98|129->98|131->100|131->100|131->100|132->101|133->102|133->102|133->102|133->102|133->102|134->103|134->103|135->104|136->105|136->105|137->106|137->106|139->108|139->108|139->108|140->109|140->109|140->109|141->110|142->111|142->111|142->111|142->111|143->112|143->112|144->113|145->114|145->114|145->114|145->114|146->115|146->115|147->116|147->116|149->118|149->118|149->118|149->118|149->118|149->118|149->118|149->118|155->124|155->124|156->125|159->128|159->128|159->128|159->128|159->128|160->129|162->131|162->131|163->132|165->134|165->134|168->137
                  -- GENERATED --
              */
          