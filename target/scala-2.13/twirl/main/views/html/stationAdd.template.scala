
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

object stationAdd extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/layout/*1.8*/.main("Register new station")/*1.37*/("New station")/*1.52*/ {_display_(Seq[Any](format.raw/*1.54*/("""
    """),format.raw/*2.5*/("""<div class="container-fluid py-4">
        <div class="row">
            <div class="col-6 offset-3">
                <div class="card z-index-0">
                    <div class="card-header text-center pt-4">
                        <h5>New station</h5>
                    </div>
                    <div class="card-body">

                        <div class="alert alert-success" id="responseSuccess" style="display: none"></div>
                        <div class="alert alert-danger" id="responseFail" style="display: none"></div>
                        <form role="form text-left">
                            <div class="mb-3">
                                <select class="form-control" id="destination" aria-label="destination" aria-describedby="email-addon">
                                    <option>Select destination</option>
                                </select>
                            </div>
                            <div class="mb-3">
                                <input type="text" class="form-control" placeholder="Station name" id="name" aria-label="name" aria-describedby="email-addon">
                            </div>
                            <div class="mb-3">
                                <select class="form-control" id="previous" aria-label="previous" aria-describedby="email-addon">
                                    <option>Select previous station</option>
                                </select>
                            </div>
                            <div class="text-center">
                                <button type="button" class="btn bg-gradient-dark w-100 my-4 mb-2" id="btnSave">Save</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        """),_display_(/*35.10*/commons/*35.17*/.footer()),format.raw/*35.26*/("""
    """),format.raw/*36.5*/("""</div>
    <script>
            window.addEventListener("DOMContentLoaded",function () """),format.raw/*38.68*/("""{"""),format.raw/*38.69*/("""
                """),format.raw/*39.17*/("""loadDestinations();

                document.querySelector("#destination").onchange=()=>"""),format.raw/*41.69*/("""{"""),format.raw/*41.70*/("""
                    """),format.raw/*42.21*/("""loadStations(document.querySelector("#destination").value);
                """),format.raw/*43.17*/("""}"""),format.raw/*43.18*/("""
                """),format.raw/*44.17*/("""document.querySelector("#btnSave").onclick=()=>"""),format.raw/*44.64*/("""{"""),format.raw/*44.65*/("""
                    """),format.raw/*45.21*/("""save();
                """),format.raw/*46.17*/("""}"""),format.raw/*46.18*/("""
                """),format.raw/*47.17*/("""async function loadDestinations() """),format.raw/*47.51*/("""{"""),format.raw/*47.52*/("""
                    """),format.raw/*48.21*/("""var options = "<option value='0'>Select destination</option>";
                    var requestOptions = """),format.raw/*49.42*/("""{"""),format.raw/*49.43*/("""
                        """),format.raw/*50.25*/("""method: 'GET',
                        headers: """),format.raw/*51.34*/("""{"""),format.raw/*51.35*/("""
                            """),format.raw/*52.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*53.54*/("""{"""),format.raw/*53.55*/("""localStorage.getItem("token")"""),format.raw/*53.84*/("""}"""),format.raw/*53.85*/("""`
                        """),format.raw/*54.25*/("""}"""),format.raw/*54.26*/("""
                    """),format.raw/*55.21*/("""}"""),format.raw/*55.22*/(""";
                    const data = await fetch(`$"""),format.raw/*56.48*/("""{"""),format.raw/*56.49*/("""apiUrl"""),format.raw/*56.55*/("""}"""),format.raw/*56.56*/("""/destinations`, requestOptions)
                            .then(response => """),format.raw/*57.47*/("""{"""),format.raw/*57.48*/("""
                                """),format.raw/*58.33*/("""if(response.status===401) """),format.raw/*58.59*/("""{"""),format.raw/*58.60*/("""localStorage.clear(); window.location='/login'"""),format.raw/*58.106*/("""}"""),format.raw/*58.107*/(""";
                                return response.json();
                            """),format.raw/*60.29*/("""}"""),format.raw/*60.30*/(""")
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    for(let i=0;i<data.length;i++)"""),format.raw/*63.51*/("""{"""),format.raw/*63.52*/("""
                        """),format.raw/*64.25*/("""options+=`<option value="$"""),format.raw/*64.51*/("""{"""),format.raw/*64.52*/("""data[i].id"""),format.raw/*64.62*/("""}"""),format.raw/*64.63*/("""">$"""),format.raw/*64.66*/("""{"""),format.raw/*64.67*/("""data[i].departure"""),format.raw/*64.84*/("""}"""),format.raw/*64.85*/("""-$"""),format.raw/*64.87*/("""{"""),format.raw/*64.88*/("""data[i].arrival"""),format.raw/*64.103*/("""}"""),format.raw/*64.104*/("""</option>`;
                    """),format.raw/*65.21*/("""}"""),format.raw/*65.22*/("""
                    """),format.raw/*66.21*/("""document.querySelector("#destination").innerHTML = options;

                """),format.raw/*68.17*/("""}"""),format.raw/*68.18*/("""
                """),format.raw/*69.17*/("""async function loadStations(destinationId) """),format.raw/*69.60*/("""{"""),format.raw/*69.61*/("""
                    """),format.raw/*70.21*/("""var options = "<option value='0'>Select previous station</option>";
                    var requestOptions = """),format.raw/*71.42*/("""{"""),format.raw/*71.43*/("""
                        """),format.raw/*72.25*/("""method: 'GET',
                        headers: """),format.raw/*73.34*/("""{"""),format.raw/*73.35*/("""
                            """),format.raw/*74.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*75.54*/("""{"""),format.raw/*75.55*/("""localStorage.getItem("token")"""),format.raw/*75.84*/("""}"""),format.raw/*75.85*/("""`
                        """),format.raw/*76.25*/("""}"""),format.raw/*76.26*/("""
                    """),format.raw/*77.21*/("""}"""),format.raw/*77.22*/(""";
                    const data = await fetch(`$"""),format.raw/*78.48*/("""{"""),format.raw/*78.49*/("""apiUrl"""),format.raw/*78.55*/("""}"""),format.raw/*78.56*/("""/destination/$"""),format.raw/*78.70*/("""{"""),format.raw/*78.71*/("""destinationId"""),format.raw/*78.84*/("""}"""),format.raw/*78.85*/("""/stations`, requestOptions)
                            .then(response => response.json())
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    for(let i=0;i<data.length;i++)"""),format.raw/*82.51*/("""{"""),format.raw/*82.52*/("""
                        """),format.raw/*83.25*/("""options+=`<option value="$"""),format.raw/*83.51*/("""{"""),format.raw/*83.52*/("""data[i].id"""),format.raw/*83.62*/("""}"""),format.raw/*83.63*/("""">$"""),format.raw/*83.66*/("""{"""),format.raw/*83.67*/("""data[i].name"""),format.raw/*83.79*/("""}"""),format.raw/*83.80*/("""</option>`;
                    """),format.raw/*84.21*/("""}"""),format.raw/*84.22*/("""
                    """),format.raw/*85.21*/("""document.querySelector("#previous").innerHTML = options;
                """),format.raw/*86.17*/("""}"""),format.raw/*86.18*/("""

                """),format.raw/*88.17*/("""function validateForm(obj)"""),format.raw/*88.43*/("""{"""),format.raw/*88.44*/("""
                    """),format.raw/*89.21*/("""const elFail = document.querySelector("#responseFail"),
                            elSuccess = document.querySelector("#responseSuccess");
                    const nameValidation = obj.name.length<2?"""),format.raw/*91.62*/("""{"""),format.raw/*91.63*/("""status:false,message:"Invalid station name""""),format.raw/*91.106*/("""}"""),format.raw/*91.107*/(""":"""),format.raw/*91.108*/("""{"""),format.raw/*91.109*/("""status:true"""),format.raw/*91.120*/("""}"""),format.raw/*91.121*/(""",
                            destinationValidation = obj.destination.length<=0?"""),format.raw/*92.79*/("""{"""),format.raw/*92.80*/("""status:false,message:"Select destination is mandatory""""),format.raw/*92.134*/("""}"""),format.raw/*92.135*/(""":"""),format.raw/*92.136*/("""{"""),format.raw/*92.137*/("""status:true"""),format.raw/*92.148*/("""}"""),format.raw/*92.149*/(""";

                    if(!nameValidation.status)"""),format.raw/*94.47*/("""{"""),format.raw/*94.48*/("""
                        """),format.raw/*95.25*/("""elFail.innerHTML=nameValidation.message;
                    """),format.raw/*96.21*/("""}"""),format.raw/*96.22*/("""else if(!destinationValidation.status)"""),format.raw/*96.60*/("""{"""),format.raw/*96.61*/("""
                        """),format.raw/*97.25*/("""elFail.innerHTML=destinationValidation.message;
                    """),format.raw/*98.21*/("""}"""),format.raw/*98.22*/("""
                    """),format.raw/*99.21*/("""if(elFail.innerHTML!=="")"""),format.raw/*99.46*/("""{"""),format.raw/*99.47*/("""
                        """),format.raw/*100.25*/("""elFail.style.display ='block';
                        elSuccess.style.display ='none';
                        clearResponse();
                        return false;
                    """),format.raw/*104.21*/("""}"""),format.raw/*104.22*/("""
                    """),format.raw/*105.21*/("""return true;
                """),format.raw/*106.17*/("""}"""),format.raw/*106.18*/("""

                """),format.raw/*108.17*/("""async function save() """),format.raw/*108.39*/("""{"""),format.raw/*108.40*/("""
                    """),format.raw/*109.21*/("""const elFail = document.querySelector("#responseFail"),
                            elSuccess = document.querySelector("#responseSuccess");
                    const data = """),format.raw/*111.34*/("""{"""),format.raw/*111.35*/("""
                        """),format.raw/*112.25*/("""destination: document.querySelector("#destination").value,
                        name: document.querySelector("#name").value,
                    """),format.raw/*114.21*/("""}"""),format.raw/*114.22*/("""
                    """),format.raw/*115.21*/("""if(document.querySelector("#previous")!=='0')"""),format.raw/*115.66*/("""{"""),format.raw/*115.67*/("""
                        """),format.raw/*116.25*/("""data.previous = document.querySelector("#previous").value;
                    """),format.raw/*117.21*/("""}"""),format.raw/*117.22*/("""
                    """),format.raw/*118.21*/("""if(!validateForm(data)) return;
                    var requestOptions = """),format.raw/*119.42*/("""{"""),format.raw/*119.43*/("""
                        """),format.raw/*120.25*/("""method: 'POST',
                        body: JSON.stringify(data),
                        headers: """),format.raw/*122.34*/("""{"""),format.raw/*122.35*/("""
                            """),format.raw/*123.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*124.54*/("""{"""),format.raw/*124.55*/("""localStorage.getItem("token")"""),format.raw/*124.84*/("""}"""),format.raw/*124.85*/("""`
                        """),format.raw/*125.25*/("""}"""),format.raw/*125.26*/("""
                    """),format.raw/*126.21*/("""}"""),format.raw/*126.22*/(""";
                    const res = await fetch(`$"""),format.raw/*127.47*/("""{"""),format.raw/*127.48*/("""apiUrl"""),format.raw/*127.54*/("""}"""),format.raw/*127.55*/("""/station`, requestOptions)
                            .then(response => response.json())
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    if (res.status) """),format.raw/*131.37*/("""{"""),format.raw/*131.38*/("""
                        """),format.raw/*132.25*/("""elSuccess.setAttribute("style","display:block");
                        elFail.setAttribute("style","display:none");
                        elSuccess.innerHTML = res.message;
                        document.querySelector("#name").value="";
                    """),format.raw/*136.21*/("""}"""),format.raw/*136.22*/(""" """),format.raw/*136.23*/("""else """),format.raw/*136.28*/("""{"""),format.raw/*136.29*/("""
                        """),format.raw/*137.25*/("""elFail.setAttribute("style", "display:block");
                        elSuccess.setAttribute("style", "display:none");
                        elFail.innerHTML = res.message;
                    """),format.raw/*140.21*/("""}"""),format.raw/*140.22*/("""
                """),format.raw/*141.17*/("""}"""),format.raw/*141.18*/("""

            """),format.raw/*143.13*/("""}"""),format.raw/*143.14*/(""")
    </script>

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
                  SOURCE: app/views/stationAdd.scala.html
                  HASH: ef7f49f1041310c86973bc013a0dbe0529f38407
                  MATRIX: 994->1|1007->7|1044->36|1067->51|1106->53|1137->58|2996->1890|3012->1897|3042->1906|3074->1911|3189->1998|3218->1999|3263->2016|3380->2105|3409->2106|3458->2127|3562->2203|3591->2204|3636->2221|3711->2268|3740->2269|3789->2290|3841->2314|3870->2315|3915->2332|3977->2366|4006->2367|4055->2388|4187->2492|4216->2493|4269->2518|4345->2566|4374->2567|4431->2596|4548->2685|4577->2686|4634->2715|4663->2716|4717->2742|4746->2743|4795->2764|4824->2765|4901->2814|4930->2815|4964->2821|4993->2822|5099->2900|5128->2901|5189->2934|5243->2960|5272->2961|5347->3007|5377->3008|5491->3094|5520->3095|5726->3273|5755->3274|5808->3299|5862->3325|5891->3326|5929->3336|5958->3337|5989->3340|6018->3341|6063->3358|6092->3359|6122->3361|6151->3362|6195->3377|6225->3378|6285->3410|6314->3411|6363->3432|6468->3509|6497->3510|6542->3527|6613->3570|6642->3571|6691->3592|6828->3701|6857->3702|6910->3727|6986->3775|7015->3776|7072->3805|7189->3894|7218->3895|7275->3924|7304->3925|7358->3951|7387->3952|7436->3973|7465->3974|7542->4023|7571->4024|7605->4030|7634->4031|7676->4045|7705->4046|7746->4059|7775->4060|8070->4327|8099->4328|8152->4353|8206->4379|8235->4380|8273->4390|8302->4391|8333->4394|8362->4395|8402->4407|8431->4408|8491->4440|8520->4441|8569->4462|8670->4535|8699->4536|8745->4554|8799->4580|8828->4581|8877->4602|9106->4803|9135->4804|9207->4847|9237->4848|9267->4849|9297->4850|9337->4861|9367->4862|9475->4942|9504->4943|9587->4997|9617->4998|9647->4999|9677->5000|9717->5011|9747->5012|9824->5061|9853->5062|9906->5087|9995->5148|10024->5149|10090->5187|10119->5188|10172->5213|10268->5281|10297->5282|10346->5303|10399->5328|10428->5329|10482->5354|10698->5541|10728->5542|10778->5563|10836->5592|10866->5593|10913->5611|10964->5633|10994->5634|11044->5655|11246->5828|11276->5829|11330->5854|11507->6002|11537->6003|11587->6024|11661->6069|11691->6070|11745->6095|11853->6174|11883->6175|11933->6196|12035->6269|12065->6270|12119->6295|12249->6396|12279->6397|12337->6426|12455->6515|12485->6516|12543->6545|12573->6546|12628->6572|12658->6573|12708->6594|12738->6595|12815->6643|12845->6644|12880->6650|12910->6651|13191->6903|13221->6904|13275->6929|13567->7192|13597->7193|13627->7194|13661->7199|13691->7200|13745->7225|13970->7421|14000->7422|14046->7439|14076->7440|14119->7454|14149->7455
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|66->35|66->35|66->35|67->36|69->38|69->38|70->39|72->41|72->41|73->42|74->43|74->43|75->44|75->44|75->44|76->45|77->46|77->46|78->47|78->47|78->47|79->48|80->49|80->49|81->50|82->51|82->51|83->52|84->53|84->53|84->53|84->53|85->54|85->54|86->55|86->55|87->56|87->56|87->56|87->56|88->57|88->57|89->58|89->58|89->58|89->58|89->58|91->60|91->60|94->63|94->63|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|96->65|96->65|97->66|99->68|99->68|100->69|100->69|100->69|101->70|102->71|102->71|103->72|104->73|104->73|105->74|106->75|106->75|106->75|106->75|107->76|107->76|108->77|108->77|109->78|109->78|109->78|109->78|109->78|109->78|109->78|109->78|113->82|113->82|114->83|114->83|114->83|114->83|114->83|114->83|114->83|114->83|114->83|115->84|115->84|116->85|117->86|117->86|119->88|119->88|119->88|120->89|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|123->92|123->92|123->92|123->92|123->92|123->92|123->92|123->92|125->94|125->94|126->95|127->96|127->96|127->96|127->96|128->97|129->98|129->98|130->99|130->99|130->99|131->100|135->104|135->104|136->105|137->106|137->106|139->108|139->108|139->108|140->109|142->111|142->111|143->112|145->114|145->114|146->115|146->115|146->115|147->116|148->117|148->117|149->118|150->119|150->119|151->120|153->122|153->122|154->123|155->124|155->124|155->124|155->124|156->125|156->125|157->126|157->126|158->127|158->127|158->127|158->127|162->131|162->131|163->132|167->136|167->136|167->136|167->136|167->136|168->137|171->140|171->140|172->141|172->141|174->143|174->143
                  -- GENERATED --
              */
          