
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
                            <a href="/schedule/$"""),format.raw/*85.49*/("""{"""),format.raw/*85.50*/("""arr[i].id"""),format.raw/*85.59*/("""}"""),format.raw/*85.60*/("""" class="text-secondary font-weight-bold text-xs" data-toggle="tooltip" data-original-title="Edit destination">
                                Edit
                            </a>
                            <a href="#" class="text-danger font-weight-bold text-xs" data-toggle="tooltip" data-original-title="Delete schedule" data-id="$"""),format.raw/*88.156*/("""{"""),format.raw/*88.157*/("""arr[i].id"""),format.raw/*88.166*/("""}"""),format.raw/*88.167*/("""" onclick="confirmDelete(this)">
                                delete
                            </a>
                        </td>
                    </tr>`
                """),format.raw/*93.17*/("""}"""),format.raw/*93.18*/("""
                """),format.raw/*94.17*/("""document.querySelector("#table-data").innerHTML = data;
            """),format.raw/*95.13*/("""}"""),format.raw/*95.14*/("""

            """),format.raw/*97.13*/("""async function confirmDelete(obj) """),format.raw/*97.47*/("""{"""),format.raw/*97.48*/("""
                """),format.raw/*98.17*/("""isConfirmed = confirm(`Are you sure you want to deleting schedule`)
                if (!isConfirmed) console.log(`delete of $"""),format.raw/*99.59*/("""{"""),format.raw/*99.60*/("""obj.getAttribute('data-id')"""),format.raw/*99.87*/("""}"""),format.raw/*99.88*/(""" """),format.raw/*99.89*/("""cancelled`)
                if (isConfirmed) """),format.raw/*100.34*/("""{"""),format.raw/*100.35*/("""
                    """),format.raw/*101.21*/("""deleteData(obj.getAttribute("data-id"));
                """),format.raw/*102.17*/("""}"""),format.raw/*102.18*/("""
            """),format.raw/*103.13*/("""}"""),format.raw/*103.14*/("""

            """),format.raw/*105.13*/("""async function deleteData(id) """),format.raw/*105.43*/("""{"""),format.raw/*105.44*/("""
                """),format.raw/*106.17*/("""var requestOptions = """),format.raw/*106.38*/("""{"""),format.raw/*106.39*/("""
                    """),format.raw/*107.21*/("""method: 'POST',
                    body: JSON.stringify("""),format.raw/*108.42*/("""{"""),format.raw/*108.43*/("""user_id: localStorage.getItem("id")"""),format.raw/*108.78*/("""}"""),format.raw/*108.79*/("""),
                    headers: """),format.raw/*109.30*/("""{"""),format.raw/*109.31*/("""
                        """),format.raw/*110.25*/(""""Content-Type": "application/json",
                        "Authorization":`Bearer $"""),format.raw/*111.50*/("""{"""),format.raw/*111.51*/("""localStorage.getItem("token")"""),format.raw/*111.80*/("""}"""),format.raw/*111.81*/("""`
                    """),format.raw/*112.21*/("""}"""),format.raw/*112.22*/("""
                """),format.raw/*113.17*/("""}"""),format.raw/*113.18*/(""";
                console.log(requestOptions)
                let url = `$"""),format.raw/*115.29*/("""{"""),format.raw/*115.30*/("""apiUrl"""),format.raw/*115.36*/("""}"""),format.raw/*115.37*/("""/schedule/$"""),format.raw/*115.48*/("""{"""),format.raw/*115.49*/("""id"""),format.raw/*115.51*/("""}"""),format.raw/*115.52*/("""/delete`;
                const data = await fetch(url, requestOptions)
                        .then(response => response.json())
                        .then(result => result)
                        .catch(error => console.log('error', error));
                var el = "";
                if (data.status) """),format.raw/*121.34*/("""{"""),format.raw/*121.35*/("""
                    """),format.raw/*122.21*/("""el = document.getElementById("responseSuccess");
                    document.getElementById("responseFail").style.display = 'none';
                    loadData();
                """),format.raw/*125.17*/("""}"""),format.raw/*125.18*/(""" """),format.raw/*125.19*/("""else """),format.raw/*125.24*/("""{"""),format.raw/*125.25*/("""
                    """),format.raw/*126.21*/("""el = document.getElementById("responseFail");
                    document.getElementById("responseSuccess").style.display = 'none';
                """),format.raw/*128.17*/("""}"""),format.raw/*128.18*/("""
                """),format.raw/*129.17*/("""el.style = 'display:block';
                el.innerHTML = data.message;
            """),format.raw/*131.13*/("""}"""),format.raw/*131.14*/("""


    """),format.raw/*134.5*/("""</script>

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
                  HASH: 50fa994981583678051e88e5dd99c8d53cd6e611
                  MATRIX: 993->1|1006->7|1043->36|1064->49|1103->51|1134->56|1403->299|1417->305|1466->334|3412->2253|3428->2260|3458->2269|3490->2274|3606->2362|3635->2363|3680->2380|3732->2404|3761->2405|3831->2447|3860->2448|3905->2465|3954->2486|3983->2487|4032->2508|4104->2552|4133->2553|4186->2578|4299->2663|4328->2664|4385->2693|4414->2694|4464->2716|4493->2717|4538->2734|4567->2735|4640->2780|4669->2781|4703->2787|4732->2788|5012->3040|5041->3041|5083->3055|5136->3080|5165->3081|5210->3098|5306->3166|5335->3167|5385->3189|5522->3298|5551->3299|5582->3302|5611->3303|5918->3582|5947->3583|6003->3611|6032->3612|6063->3614|6093->3615|6148->3641|6178->3642|6404->3840|6433->3841|6480->3860|6509->3861|6661->3985|6690->3986|6740->4008|6769->4009|6921->4133|6950->4134|7008->4164|7037->4165|7198->4298|7227->4299|7264->4308|7293->4309|7659->4646|7689->4647|7727->4656|7757->4657|7963->4835|7992->4836|8037->4853|8133->4921|8162->4922|8204->4936|8266->4970|8295->4971|8340->4988|8494->5114|8523->5115|8578->5142|8607->5143|8636->5144|8710->5189|8740->5190|8790->5211|8876->5268|8906->5269|8948->5282|8978->5283|9021->5297|9080->5327|9110->5328|9156->5345|9206->5366|9236->5367|9286->5388|9372->5445|9402->5446|9466->5481|9496->5482|9557->5514|9587->5515|9641->5540|9755->5625|9785->5626|9843->5655|9873->5656|9924->5678|9954->5679|10000->5696|10030->5697|10133->5771|10163->5772|10198->5778|10228->5779|10268->5790|10298->5791|10329->5793|10359->5794|10699->6105|10729->6106|10779->6127|10989->6308|11019->6309|11049->6310|11083->6315|11113->6316|11163->6337|11341->6486|11371->6487|11417->6504|11531->6589|11561->6590|11596->6597
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|38->7|38->7|38->7|68->37|68->37|68->37|69->38|71->40|71->40|72->41|73->42|73->42|75->44|75->44|76->45|76->45|76->45|77->46|78->47|78->47|79->48|80->49|80->49|80->49|80->49|81->50|81->50|82->51|82->51|83->52|83->52|83->52|83->52|88->57|88->57|90->59|90->59|90->59|91->60|92->61|92->61|94->63|97->66|97->66|97->66|97->66|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|107->76|107->76|107->76|107->76|110->79|110->79|110->79|110->79|113->82|113->82|113->82|113->82|116->85|116->85|116->85|116->85|119->88|119->88|119->88|119->88|124->93|124->93|125->94|126->95|126->95|128->97|128->97|128->97|129->98|130->99|130->99|130->99|130->99|130->99|131->100|131->100|132->101|133->102|133->102|134->103|134->103|136->105|136->105|136->105|137->106|137->106|137->106|138->107|139->108|139->108|139->108|139->108|140->109|140->109|141->110|142->111|142->111|142->111|142->111|143->112|143->112|144->113|144->113|146->115|146->115|146->115|146->115|146->115|146->115|146->115|146->115|152->121|152->121|153->122|156->125|156->125|156->125|156->125|156->125|157->126|159->128|159->128|160->129|162->131|162->131|165->134
                  -- GENERATED --
              */
          