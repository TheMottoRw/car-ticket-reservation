
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

object scheduleAdd extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/layout/*1.8*/.main("Register travel")/*1.32*/("Add new scheduled travel")/*1.60*/ {_display_(Seq[Any](format.raw/*1.62*/("""
    """),format.raw/*2.5*/("""<div class="container-fluid py-4">
        <div class="row">
            <div class="col-6 offset-3">
                <div class="card z-index-0">
                    <div class="card-header text-center pt-4">
                        <h5>Add new travel schedule</h5>
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
                                <select class="form-control" id="driver" aria-label="driver" aria-describedby="driver-addon">
                                    <option>Select driver</option>
                                </select>
                            </div>
                            <div class="mb-3">
                                <input type="text" class="form-control" placeholder="Plate number" id="bus_plate_no" aria-label="bus_plate_no" aria-describedby="email-addon">
                            </div>
                            <div class="mb-3">
                                <input type="text" class="form-control" placeholder="Passenger limit" id="passenger_limit" aria-label="passenger_limit" aria-describedby="email-addon">
                            </div>
                            <div class="mb-3">
                                <input type="datetime-local" class="form-control" id="departure_date" aria-label="departure_date" aria-describedby="phone-addon">
                            </div>
                            <div class="text-center">
                                <button type="button" class="btn bg-gradient-dark w-100 my-4 mb-2" id="btnSave">Save</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        """),_display_(/*40.10*/commons/*40.17*/.footer()),format.raw/*40.26*/("""
    """),format.raw/*41.5*/("""</div>
    <script>
            window.addEventListener("DOMContentLoaded",function () """),format.raw/*43.68*/("""{"""),format.raw/*43.69*/("""
                """),format.raw/*44.17*/("""loadDestinations();
                loadDrivers();
                document.querySelector("#btnSave").onclick=()=>"""),format.raw/*46.64*/("""{"""),format.raw/*46.65*/("""
                    """),format.raw/*47.21*/("""save();
                """),format.raw/*48.17*/("""}"""),format.raw/*48.18*/("""
                """),format.raw/*49.17*/("""function validateForm(obj)"""),format.raw/*49.43*/("""{"""),format.raw/*49.44*/("""
                    """),format.raw/*50.21*/("""const elFail = document.querySelector("#responseFail"),
                            elSuccess = document.querySelector("#responseSuccess");
                    const passengerLimitValidation = isNaN(obj.passenger_limit) || obj.passenger_limit<=0?"""),format.raw/*52.107*/("""{"""),format.raw/*52.108*/("""status:false,message:"Invalid passenger lmit""""),format.raw/*52.153*/("""}"""),format.raw/*52.154*/(""":"""),format.raw/*52.155*/("""{"""),format.raw/*52.156*/("""status:true"""),format.raw/*52.167*/("""}"""),format.raw/*52.168*/(""",
                            busPlateNo = obj.bus_plate_no.length<4?"""),format.raw/*53.68*/("""{"""),format.raw/*53.69*/("""status:false,message:"Invalid bus plate numer location""""),format.raw/*53.124*/("""}"""),format.raw/*53.125*/(""":"""),format.raw/*53.126*/("""{"""),format.raw/*53.127*/("""status:true"""),format.raw/*53.138*/("""}"""),format.raw/*53.139*/(""",
                            departureValidation = obj.departure_date<new Date().getTime()/1000?"""),format.raw/*54.96*/("""{"""),format.raw/*54.97*/("""status:false,message:"Invalid departure time""""),format.raw/*54.142*/("""}"""),format.raw/*54.143*/(""":"""),format.raw/*54.144*/("""{"""),format.raw/*54.145*/("""status:true"""),format.raw/*54.156*/("""}"""),format.raw/*54.157*/(""";

                    if(!departureValidation.status)"""),format.raw/*56.52*/("""{"""),format.raw/*56.53*/("""
                        """),format.raw/*57.25*/("""elFail.innerHTML=departureValidation.message;
                    """),format.raw/*58.21*/("""}"""),format.raw/*58.22*/("""else if(!passengerLimitValidation.status)"""),format.raw/*58.63*/("""{"""),format.raw/*58.64*/("""
                        """),format.raw/*59.25*/("""elFail.innerHTML=passengerLimitValidation.message;
                    """),format.raw/*60.21*/("""}"""),format.raw/*60.22*/("""else
                    if(!busPlateNo.status) """),format.raw/*61.44*/("""{"""),format.raw/*61.45*/("""
                        """),format.raw/*62.25*/("""elFail.innerHTML = busPlateNo.message;
                    """),format.raw/*63.21*/("""}"""),format.raw/*63.22*/("""
                    """),format.raw/*64.21*/("""if(elFail.innerHTML!=="")"""),format.raw/*64.46*/("""{"""),format.raw/*64.47*/("""
                        """),format.raw/*65.25*/("""elFail.style.display ='block';
                        elSuccess.style.display ='none';
                        clearResponse();
                        return false;
                    """),format.raw/*69.21*/("""}"""),format.raw/*69.22*/("""
                    """),format.raw/*70.21*/("""return true;
                """),format.raw/*71.17*/("""}"""),format.raw/*71.18*/("""
                """),format.raw/*72.17*/("""async function loadDestinations() """),format.raw/*72.51*/("""{"""),format.raw/*72.52*/("""
                    """),format.raw/*73.21*/("""var options = "<option value='0'>Select destination</option>";
                    var requestOptions = """),format.raw/*74.42*/("""{"""),format.raw/*74.43*/("""
                        """),format.raw/*75.25*/("""method: 'GET',
                        headers: """),format.raw/*76.34*/("""{"""),format.raw/*76.35*/("""
                            """),format.raw/*77.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*78.54*/("""{"""),format.raw/*78.55*/("""localStorage.getItem("token")"""),format.raw/*78.84*/("""}"""),format.raw/*78.85*/("""`
                        """),format.raw/*79.25*/("""}"""),format.raw/*79.26*/("""
                    """),format.raw/*80.21*/("""}"""),format.raw/*80.22*/(""";
                    const data = await fetch(`$"""),format.raw/*81.48*/("""{"""),format.raw/*81.49*/("""apiUrl"""),format.raw/*81.55*/("""}"""),format.raw/*81.56*/("""/destinations`, requestOptions)
                            .then(response => """),format.raw/*82.47*/("""{"""),format.raw/*82.48*/("""
                                """),format.raw/*83.33*/("""if(response.status===401) """),format.raw/*83.59*/("""{"""),format.raw/*83.60*/("""localStorage.clear(); window.location='/login'"""),format.raw/*83.106*/("""}"""),format.raw/*83.107*/(""";
                                return response.json();
                            """),format.raw/*85.29*/("""}"""),format.raw/*85.30*/(""")
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    for(let i=0;i<data.length;i++)"""),format.raw/*88.51*/("""{"""),format.raw/*88.52*/("""
                        """),format.raw/*89.25*/("""options+=`<option value="$"""),format.raw/*89.51*/("""{"""),format.raw/*89.52*/("""data[i].id"""),format.raw/*89.62*/("""}"""),format.raw/*89.63*/("""">$"""),format.raw/*89.66*/("""{"""),format.raw/*89.67*/("""data[i].departure"""),format.raw/*89.84*/("""}"""),format.raw/*89.85*/("""-$"""),format.raw/*89.87*/("""{"""),format.raw/*89.88*/("""data[i].arrival"""),format.raw/*89.103*/("""}"""),format.raw/*89.104*/("""</option>`;
                    """),format.raw/*90.21*/("""}"""),format.raw/*90.22*/("""
                    """),format.raw/*91.21*/("""document.querySelector("#destination").innerHTML = options;

                """),format.raw/*93.17*/("""}"""),format.raw/*93.18*/("""
                """),format.raw/*94.17*/("""async function loadDrivers() """),format.raw/*94.46*/("""{"""),format.raw/*94.47*/("""
                    """),format.raw/*95.21*/("""var options = "<option value='0'>Select drivers</option>";
                    var requestOptions = """),format.raw/*96.42*/("""{"""),format.raw/*96.43*/("""
                        """),format.raw/*97.25*/("""method: 'GET',
                        headers: """),format.raw/*98.34*/("""{"""),format.raw/*98.35*/("""
                            """),format.raw/*99.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*100.54*/("""{"""),format.raw/*100.55*/("""localStorage.getItem("token")"""),format.raw/*100.84*/("""}"""),format.raw/*100.85*/("""`
                        """),format.raw/*101.25*/("""}"""),format.raw/*101.26*/("""
                    """),format.raw/*102.21*/("""}"""),format.raw/*102.22*/(""";
                    const data = await fetch(`$"""),format.raw/*103.48*/("""{"""),format.raw/*103.49*/("""apiUrl"""),format.raw/*103.55*/("""}"""),format.raw/*103.56*/("""/users/type?user_type=driver`, requestOptions)
                            .then(response => """),format.raw/*104.47*/("""{"""),format.raw/*104.48*/("""
                                """),format.raw/*105.33*/("""if(response.status===401) """),format.raw/*105.59*/("""{"""),format.raw/*105.60*/("""localStorage.clear(); window.location='/login'"""),format.raw/*105.106*/("""}"""),format.raw/*105.107*/(""";
                                return response.json();
                            """),format.raw/*107.29*/("""}"""),format.raw/*107.30*/(""")
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    for(let i=0;i<data.length;i++)"""),format.raw/*110.51*/("""{"""),format.raw/*110.52*/("""
                        """),format.raw/*111.25*/("""options+=`<option value="$"""),format.raw/*111.51*/("""{"""),format.raw/*111.52*/("""data[i].id"""),format.raw/*111.62*/("""}"""),format.raw/*111.63*/("""">$"""),format.raw/*111.66*/("""{"""),format.raw/*111.67*/("""data[i].name"""),format.raw/*111.79*/("""}"""),format.raw/*111.80*/(""" """),format.raw/*111.81*/("""($"""),format.raw/*111.83*/("""{"""),format.raw/*111.84*/("""data[i].phone"""),format.raw/*111.97*/("""}"""),format.raw/*111.98*/(""")</option>`;
                    """),format.raw/*112.21*/("""}"""),format.raw/*112.22*/("""
                    """),format.raw/*113.21*/("""document.querySelector("#driver").innerHTML = options;

                """),format.raw/*115.17*/("""}"""),format.raw/*115.18*/("""

                """),format.raw/*117.17*/("""async function save() """),format.raw/*117.39*/("""{"""),format.raw/*117.40*/("""
                    """),format.raw/*118.21*/("""const elFail = document.querySelector("#responseFail"),
                            elSuccess = document.querySelector("#responseSuccess");
                    const data = """),format.raw/*120.34*/("""{"""),format.raw/*120.35*/("""
                        """),format.raw/*121.25*/("""destination: document.querySelector("#destination").value,
                        driver: document.querySelector("#driver").value,
                        bus_plate_no: document.querySelector("#bus_plate_no").value,
                        passenger_limit: document.querySelector("#passenger_limit").value,
                        departure_date: new Date(document.querySelector("#departure_date").value).getTime()/1000,
                    """),format.raw/*126.21*/("""}"""),format.raw/*126.22*/("""
                    """),format.raw/*127.21*/("""console.log(validateForm(data));
                    if(!validateForm(data)) return;
                    var requestOptions = """),format.raw/*129.42*/("""{"""),format.raw/*129.43*/("""
                        """),format.raw/*130.25*/("""method: 'POST',
                        body: JSON.stringify(data),
                        headers: """),format.raw/*132.34*/("""{"""),format.raw/*132.35*/("""
                            """),format.raw/*133.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*134.54*/("""{"""),format.raw/*134.55*/("""localStorage.getItem("token")"""),format.raw/*134.84*/("""}"""),format.raw/*134.85*/("""`
                        """),format.raw/*135.25*/("""}"""),format.raw/*135.26*/("""
                    """),format.raw/*136.21*/("""}"""),format.raw/*136.22*/(""";
                    const res = await fetch(`$"""),format.raw/*137.47*/("""{"""),format.raw/*137.48*/("""apiUrl"""),format.raw/*137.54*/("""}"""),format.raw/*137.55*/("""/schedule`, requestOptions)
                            .then(response => response.json())
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    if (res.status) """),format.raw/*141.37*/("""{"""),format.raw/*141.38*/("""
                        """),format.raw/*142.25*/("""elSuccess.setAttribute("style","display:block");
                        elFail.setAttribute("style","display:none");
                        elSuccess.innerHTML = res.message;
                        document.querySelector("#bus_plate_no").value="";
                        document.querySelector("#passenger_limit").value="";
                        document.querySelector("#departure_date").value="";
                    """),format.raw/*148.21*/("""}"""),format.raw/*148.22*/(""" """),format.raw/*148.23*/("""else """),format.raw/*148.28*/("""{"""),format.raw/*148.29*/("""
                        """),format.raw/*149.25*/("""elFail.setAttribute("style", "display:block");
                        elSuccess.setAttribute("style", "display:none");
                        elFail.innerHTML = res.message;
                    """),format.raw/*152.21*/("""}"""),format.raw/*152.22*/("""
                """),format.raw/*153.17*/("""}"""),format.raw/*153.18*/("""

            """),format.raw/*155.13*/("""}"""),format.raw/*155.14*/(""")
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
                  SOURCE: app/views/scheduleAdd.scala.html
                  HASH: 000284e5b723e805c5d3dbbf45c8892c9ff6a1b8
                  MATRIX: 995->1|1008->7|1040->31|1076->59|1115->61|1146->66|3529->2422|3545->2429|3575->2438|3607->2443|3722->2530|3751->2531|3796->2548|3938->2662|3967->2663|4016->2684|4068->2708|4097->2709|4142->2726|4196->2752|4225->2753|4274->2774|4549->3020|4579->3021|4653->3066|4683->3067|4713->3068|4743->3069|4783->3080|4813->3081|4910->3150|4939->3151|5023->3206|5053->3207|5083->3208|5113->3209|5153->3220|5183->3221|5308->3318|5337->3319|5411->3364|5441->3365|5471->3366|5501->3367|5541->3378|5571->3379|5653->3433|5682->3434|5735->3459|5829->3525|5858->3526|5927->3567|5956->3568|6009->3593|6108->3664|6137->3665|6213->3713|6242->3714|6295->3739|6382->3798|6411->3799|6460->3820|6513->3845|6542->3846|6595->3871|6810->4058|6839->4059|6888->4080|6945->4109|6974->4110|7019->4127|7081->4161|7110->4162|7159->4183|7291->4287|7320->4288|7373->4313|7449->4361|7478->4362|7535->4391|7652->4480|7681->4481|7738->4510|7767->4511|7821->4537|7850->4538|7899->4559|7928->4560|8005->4609|8034->4610|8068->4616|8097->4617|8203->4695|8232->4696|8293->4729|8347->4755|8376->4756|8451->4802|8481->4803|8595->4889|8624->4890|8830->5068|8859->5069|8912->5094|8966->5120|8995->5121|9033->5131|9062->5132|9093->5135|9122->5136|9167->5153|9196->5154|9226->5156|9255->5157|9299->5172|9329->5173|9389->5205|9418->5206|9467->5227|9572->5304|9601->5305|9646->5322|9703->5351|9732->5352|9781->5373|9909->5473|9938->5474|9991->5499|10067->5547|10096->5548|10153->5577|10271->5666|10301->5667|10359->5696|10389->5697|10444->5723|10474->5724|10524->5745|10554->5746|10632->5795|10662->5796|10697->5802|10727->5803|10849->5896|10879->5897|10941->5930|10996->5956|11026->5957|11102->6003|11133->6004|11248->6090|11278->6091|11485->6269|11515->6270|11569->6295|11624->6321|11654->6322|11693->6332|11723->6333|11755->6336|11785->6337|11826->6349|11856->6350|11886->6351|11917->6353|11947->6354|11989->6367|12019->6368|12081->6401|12111->6402|12161->6423|12262->6495|12292->6496|12339->6514|12390->6536|12420->6537|12470->6558|12672->6731|12702->6732|12756->6757|13227->7199|13257->7200|13307->7221|13462->7347|13492->7348|13546->7373|13676->7474|13706->7475|13764->7504|13882->7593|13912->7594|13970->7623|14000->7624|14055->7650|14085->7651|14135->7672|14165->7673|14242->7721|14272->7722|14307->7728|14337->7729|14619->7982|14649->7983|14703->8008|15156->8432|15186->8433|15216->8434|15250->8439|15280->8440|15334->8465|15559->8661|15589->8662|15635->8679|15665->8680|15708->8694|15738->8695
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|71->40|71->40|71->40|72->41|74->43|74->43|75->44|77->46|77->46|78->47|79->48|79->48|80->49|80->49|80->49|81->50|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|87->56|87->56|88->57|89->58|89->58|89->58|89->58|90->59|91->60|91->60|92->61|92->61|93->62|94->63|94->63|95->64|95->64|95->64|96->65|100->69|100->69|101->70|102->71|102->71|103->72|103->72|103->72|104->73|105->74|105->74|106->75|107->76|107->76|108->77|109->78|109->78|109->78|109->78|110->79|110->79|111->80|111->80|112->81|112->81|112->81|112->81|113->82|113->82|114->83|114->83|114->83|114->83|114->83|116->85|116->85|119->88|119->88|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|121->90|121->90|122->91|124->93|124->93|125->94|125->94|125->94|126->95|127->96|127->96|128->97|129->98|129->98|130->99|131->100|131->100|131->100|131->100|132->101|132->101|133->102|133->102|134->103|134->103|134->103|134->103|135->104|135->104|136->105|136->105|136->105|136->105|136->105|138->107|138->107|141->110|141->110|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|143->112|143->112|144->113|146->115|146->115|148->117|148->117|148->117|149->118|151->120|151->120|152->121|157->126|157->126|158->127|160->129|160->129|161->130|163->132|163->132|164->133|165->134|165->134|165->134|165->134|166->135|166->135|167->136|167->136|168->137|168->137|168->137|168->137|172->141|172->141|173->142|179->148|179->148|179->148|179->148|179->148|180->149|183->152|183->152|184->153|184->153|186->155|186->155
                  -- GENERATED --
              */
          