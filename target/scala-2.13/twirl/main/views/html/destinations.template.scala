
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


Seq[Any](_display_(/*1.2*/layout/*1.8*/.main("Registered destinations")/*1.40*/("Destinations")/*1.56*/ {_display_(Seq[Any](format.raw/*1.58*/("""
    """),format.raw/*2.5*/("""<div class="container-fluid py-4">
        <div class="row">
            <div class="col-12">
                <div class="card mb-4">
                    <div class="card-header pb-0">
                        <h6>Available destinations <a href=""""),_display_(/*7.62*/routes/*7.68*/.ViewController.destinationAdd()),format.raw/*7.100*/("""" class="btn btn-dark btn-sm" style="margin-left:70% ">Add destination</a></h6>
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
                                            From</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            To</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            Price</th>
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
        """),_display_(/*36.10*/commons/*36.17*/.footer()),format.raw/*36.26*/("""
    """),format.raw/*37.5*/("""</div>
    <script>
            window.addEventListener("DOMContentLoaded", function () """),format.raw/*39.69*/("""{"""),format.raw/*39.70*/("""
                """),format.raw/*40.17*/("""loadData();
            """),format.raw/*41.13*/("""}"""),format.raw/*41.14*/(""");

            async function loadData() """),format.raw/*43.39*/("""{"""),format.raw/*43.40*/("""
                """),format.raw/*44.17*/("""var requestOptions = """),format.raw/*44.38*/("""{"""),format.raw/*44.39*/("""
                    """),format.raw/*45.21*/("""method: 'GET',
                    headers: """),format.raw/*46.30*/("""{"""),format.raw/*46.31*/("""
                        """),format.raw/*47.25*/(""""Content-Type": "application/json",
                        "Authorization":`Bearer $"""),format.raw/*48.50*/("""{"""),format.raw/*48.51*/("""localStorage.getItem("token")"""),format.raw/*48.80*/("""}"""),format.raw/*48.81*/("""`
                    """),format.raw/*49.21*/("""}"""),format.raw/*49.22*/("""
                """),format.raw/*50.17*/("""}"""),format.raw/*50.18*/(""";
                const data = await fetch(`$"""),format.raw/*51.44*/("""{"""),format.raw/*51.45*/("""apiUrl"""),format.raw/*51.51*/("""}"""),format.raw/*51.52*/("""/destinations`, requestOptions)
                        .then(response => response.json())
                        .then(result => result)
                        .catch(error => console.log('error', error));
                setContent(data);
            """),format.raw/*56.13*/("""}"""),format.raw/*56.14*/("""

            """),format.raw/*58.13*/("""function setContent(arr) """),format.raw/*58.38*/("""{"""),format.raw/*58.39*/("""
                """),format.raw/*59.17*/("""var data = '';
                for (var i = 0; i < arr.length; i++) """),format.raw/*60.54*/("""{"""),format.raw/*60.55*/("""

                    """),format.raw/*62.21*/("""data+=`<tr>

                        <td>
                            <p class="font-weight-bold mb-0 ml-2">$"""),format.raw/*65.68*/("""{"""),format.raw/*65.69*/("""i+1"""),format.raw/*65.72*/("""}"""),format.raw/*65.73*/("""</p>
                        </td>
                        <td>
                            <div class="d-flex px-2 py-1">
                                <div class="d-flex flex-column justify-content-center">
                                    <p class="mb-0 text-secondary">$"""),format.raw/*70.69*/("""{"""),format.raw/*70.70*/("""arr[i].departure"""),format.raw/*70.86*/("""}"""),format.raw/*70.87*/("""</p>
                                </div>
                            </div>
                        </td>
                        <td>
                            <p class="text-secondary mb-0">$"""),format.raw/*75.61*/("""{"""),format.raw/*75.62*/("""arr[i].arrival"""),format.raw/*75.76*/("""}"""),format.raw/*75.77*/("""</p>
                        </td>
                        <td>
                            <p class="text-secondary mb-0">$"""),format.raw/*78.61*/("""{"""),format.raw/*78.62*/("""arr[i].price"""),format.raw/*78.74*/("""}"""),format.raw/*78.75*/(""" """),format.raw/*78.76*/("""RWF</p>
                        </td>
                        <td class="align-middle">
                            <a href="/destination/$"""),format.raw/*81.52*/("""{"""),format.raw/*81.53*/("""arr[i].id"""),format.raw/*81.62*/("""}"""),format.raw/*81.63*/("""" class="text-secondary font-weight-bold text-xs" data-toggle="tooltip" data-original-title="Edit destination">
                                Edit
                            </a>
                            <a href="#" class="text-danger font-weight-bold text-xs" data-toggle="tooltip" data-original-title="Delete destination" data-id="$"""),format.raw/*84.159*/("""{"""),format.raw/*84.160*/("""arr[i].id"""),format.raw/*84.169*/("""}"""),format.raw/*84.170*/("""" onclick="confirmDelete(this)">
                                delete
                            </a>
                        </td>
                    </tr>`
                """),format.raw/*89.17*/("""}"""),format.raw/*89.18*/("""
                """),format.raw/*90.17*/("""document.querySelector("#table-data").innerHTML = data;
            """),format.raw/*91.13*/("""}"""),format.raw/*91.14*/("""

            """),format.raw/*93.13*/("""async function confirmDelete(obj) """),format.raw/*93.47*/("""{"""),format.raw/*93.48*/("""
                """),format.raw/*94.17*/("""isConfirmed = confirm(`Are you sure you want to deleting destination`)
                if (!isConfirmed) console.log(`delete of $"""),format.raw/*95.59*/("""{"""),format.raw/*95.60*/("""obj.getAttribute('data-id')"""),format.raw/*95.87*/("""}"""),format.raw/*95.88*/(""" """),format.raw/*95.89*/("""cancelled`)
                if (isConfirmed) """),format.raw/*96.34*/("""{"""),format.raw/*96.35*/("""
                    """),format.raw/*97.21*/("""deleteData(obj.getAttribute("data-id"));
                """),format.raw/*98.17*/("""}"""),format.raw/*98.18*/("""
            """),format.raw/*99.13*/("""}"""),format.raw/*99.14*/("""

            """),format.raw/*101.13*/("""async function deleteData(id) """),format.raw/*101.43*/("""{"""),format.raw/*101.44*/("""
                """),format.raw/*102.17*/("""var requestOptions = """),format.raw/*102.38*/("""{"""),format.raw/*102.39*/("""
                    """),format.raw/*103.21*/("""method: 'POST',
                    body: JSON.stringify("""),format.raw/*104.42*/("""{"""),format.raw/*104.43*/("""user_id: localStorage.getItem("id")"""),format.raw/*104.78*/("""}"""),format.raw/*104.79*/("""),
                    headers: """),format.raw/*105.30*/("""{"""),format.raw/*105.31*/("""
                        """),format.raw/*106.25*/(""""Content-Type": "application/json",
                        "Authorization":`Bearer $"""),format.raw/*107.50*/("""{"""),format.raw/*107.51*/("""localStorage.getItem("token")"""),format.raw/*107.80*/("""}"""),format.raw/*107.81*/("""`
                    """),format.raw/*108.21*/("""}"""),format.raw/*108.22*/("""
                """),format.raw/*109.17*/("""}"""),format.raw/*109.18*/(""";
                console.log(requestOptions)
                let url = `$"""),format.raw/*111.29*/("""{"""),format.raw/*111.30*/("""apiUrl"""),format.raw/*111.36*/("""}"""),format.raw/*111.37*/("""/destination/$"""),format.raw/*111.51*/("""{"""),format.raw/*111.52*/("""id"""),format.raw/*111.54*/("""}"""),format.raw/*111.55*/("""/delete`;
                const data = await fetch(url, requestOptions)
                        .then(response => response.json())
                        .then(result => result)
                        .catch(error => console.log('error', error));
                var el = "";
                if (data.status) """),format.raw/*117.34*/("""{"""),format.raw/*117.35*/("""
                    """),format.raw/*118.21*/("""el = document.getElementById("responseSuccess");
                    document.getElementById("responseFail").style.display = 'none';
                    loadData();
                """),format.raw/*121.17*/("""}"""),format.raw/*121.18*/(""" """),format.raw/*121.19*/("""else """),format.raw/*121.24*/("""{"""),format.raw/*121.25*/("""
                    """),format.raw/*122.21*/("""el = document.getElementById("responseFail");
                    document.getElementById("responseSuccess").style.display = 'none';
                """),format.raw/*124.17*/("""}"""),format.raw/*124.18*/("""
                """),format.raw/*125.17*/("""el.style = 'display:block';
                el.innerHTML = data.message;
            """),format.raw/*127.13*/("""}"""),format.raw/*127.14*/("""


    """),format.raw/*130.5*/("""</script>
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
                  HASH: 39d231613c1902f8366204020096ad3eeb53c6be
                  MATRIX: 996->1|1009->7|1049->39|1073->55|1112->57|1143->62|1415->308|1429->314|1482->346|3244->2081|3260->2088|3290->2097|3322->2102|3438->2190|3467->2191|3512->2208|3564->2232|3593->2233|3663->2275|3692->2276|3737->2293|3786->2314|3815->2315|3864->2336|3936->2380|3965->2381|4018->2406|4131->2491|4160->2492|4217->2521|4246->2522|4296->2544|4325->2545|4370->2562|4399->2563|4472->2608|4501->2609|4535->2615|4564->2616|4847->2871|4876->2872|4918->2886|4971->2911|5000->2912|5045->2929|5141->2997|5170->2998|5220->3020|5357->3129|5386->3130|5417->3133|5446->3134|5753->3413|5782->3414|5826->3430|5855->3431|6081->3629|6110->3630|6152->3644|6181->3645|6333->3769|6362->3770|6402->3782|6431->3783|6460->3784|6627->3923|6656->3924|6693->3933|6722->3934|7091->4274|7121->4275|7159->4284|7189->4285|7395->4463|7424->4464|7469->4481|7565->4549|7594->4550|7636->4564|7698->4598|7727->4599|7772->4616|7929->4745|7958->4746|8013->4773|8042->4774|8071->4775|8144->4820|8173->4821|8222->4842|8307->4899|8336->4900|8377->4913|8406->4914|8449->4928|8508->4958|8538->4959|8584->4976|8634->4997|8664->4998|8714->5019|8800->5076|8830->5077|8894->5112|8924->5113|8985->5145|9015->5146|9069->5171|9183->5256|9213->5257|9271->5286|9301->5287|9352->5309|9382->5310|9428->5327|9458->5328|9561->5402|9591->5403|9626->5409|9656->5410|9699->5424|9729->5425|9760->5427|9790->5428|10130->5739|10160->5740|10210->5761|10420->5942|10450->5943|10480->5944|10514->5949|10544->5950|10594->5971|10772->6120|10802->6121|10848->6138|10962->6223|10992->6224|11027->6231
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|38->7|38->7|38->7|67->36|67->36|67->36|68->37|70->39|70->39|71->40|72->41|72->41|74->43|74->43|75->44|75->44|75->44|76->45|77->46|77->46|78->47|79->48|79->48|79->48|79->48|80->49|80->49|81->50|81->50|82->51|82->51|82->51|82->51|87->56|87->56|89->58|89->58|89->58|90->59|91->60|91->60|93->62|96->65|96->65|96->65|96->65|101->70|101->70|101->70|101->70|106->75|106->75|106->75|106->75|109->78|109->78|109->78|109->78|109->78|112->81|112->81|112->81|112->81|115->84|115->84|115->84|115->84|120->89|120->89|121->90|122->91|122->91|124->93|124->93|124->93|125->94|126->95|126->95|126->95|126->95|126->95|127->96|127->96|128->97|129->98|129->98|130->99|130->99|132->101|132->101|132->101|133->102|133->102|133->102|134->103|135->104|135->104|135->104|135->104|136->105|136->105|137->106|138->107|138->107|138->107|138->107|139->108|139->108|140->109|140->109|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|148->117|148->117|149->118|152->121|152->121|152->121|152->121|152->121|153->122|155->124|155->124|156->125|158->127|158->127|161->130
                  -- GENERATED --
              */
          