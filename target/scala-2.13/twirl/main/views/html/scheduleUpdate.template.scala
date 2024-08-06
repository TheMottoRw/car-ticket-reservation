
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

object scheduleUpdate extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/layout/*1.8*/.main("Update travel")/*1.30*/("Update travel schedule")/*1.56*/ {_display_(Seq[Any](format.raw/*1.58*/("""
    """),format.raw/*2.5*/("""<div class="container-fluid py-4">
        <div class="row">
            <div class="col-6 offset-3">
                <div class="card z-index-0">
                    <div class="card-header text-center pt-4">
                        <h5>Update travel schedule</h5>
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
                                <button type="button" class="btn bg-gradient-dark w-100 my-4 mb-2" id="btnUpdate">Update</button>
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
                """),format.raw/*44.17*/("""const urlArr = getUrlParams();
                const id = urlArr[urlArr.length - 1];
                loadById();
                loadDestinations();
                loadDrivers();
                document.querySelector("#btnUpdate").onclick=()=>"""),format.raw/*49.66*/("""{"""),format.raw/*49.67*/("""
                    """),format.raw/*50.21*/("""save();
                """),format.raw/*51.17*/("""}"""),format.raw/*51.18*/("""
                """),format.raw/*52.17*/("""async function loadById() """),format.raw/*52.43*/("""{"""),format.raw/*52.44*/("""
                    """),format.raw/*53.21*/("""const res = await fetch(`$"""),format.raw/*53.47*/("""{"""),format.raw/*53.48*/("""apiUrl"""),format.raw/*53.54*/("""}"""),format.raw/*53.55*/("""/schedule/$"""),format.raw/*53.66*/("""{"""),format.raw/*53.67*/("""id"""),format.raw/*53.69*/("""}"""),format.raw/*53.70*/("""`)
                            .then(response => response.json())
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    if (!res.error) """),format.raw/*57.37*/("""{"""),format.raw/*57.38*/("""
                        """),format.raw/*58.25*/("""let obj = res;
                        document.querySelector("#bus_plate_no").value = obj.bus_plate_no;
                        document.querySelector("#passenger_limit").value = obj.passenger_limit;
                        document.querySelector("#departure_date").value = getDate(obj.departure_date)
                    """),format.raw/*62.21*/("""}"""),format.raw/*62.22*/("""
                """),format.raw/*63.17*/("""}"""),format.raw/*63.18*/("""

                """),format.raw/*65.17*/("""function validateForm(obj)"""),format.raw/*65.43*/("""{"""),format.raw/*65.44*/("""
                    """),format.raw/*66.21*/("""const elFail = document.querySelector("#responseFail"),
                            elSuccess = document.querySelector("#responseSuccess");
                    const passengerLimitValidation = isNaN(obj.passenger_limit) || obj.passenger_limit<=0?"""),format.raw/*68.107*/("""{"""),format.raw/*68.108*/("""status:false,message:"Invalid passenger lmit""""),format.raw/*68.153*/("""}"""),format.raw/*68.154*/(""":"""),format.raw/*68.155*/("""{"""),format.raw/*68.156*/("""status:true"""),format.raw/*68.167*/("""}"""),format.raw/*68.168*/(""",
                            busPlateNo = obj.bus_plate_no.length<4?"""),format.raw/*69.68*/("""{"""),format.raw/*69.69*/("""status:false,message:"Invalid bus plate numer location""""),format.raw/*69.124*/("""}"""),format.raw/*69.125*/(""":"""),format.raw/*69.126*/("""{"""),format.raw/*69.127*/("""status:true"""),format.raw/*69.138*/("""}"""),format.raw/*69.139*/(""",
                            departureValidation = obj.departure_date<new Date().getTime()/1000?"""),format.raw/*70.96*/("""{"""),format.raw/*70.97*/("""status:false,message:"Invalid departure time""""),format.raw/*70.142*/("""}"""),format.raw/*70.143*/(""":"""),format.raw/*70.144*/("""{"""),format.raw/*70.145*/("""status:true"""),format.raw/*70.156*/("""}"""),format.raw/*70.157*/(""";

                    if(!departureValidation.status)"""),format.raw/*72.52*/("""{"""),format.raw/*72.53*/("""
                        """),format.raw/*73.25*/("""elFail.innerHTML=departureValidation.message;
                    """),format.raw/*74.21*/("""}"""),format.raw/*74.22*/("""else if(!passengerLimitValidation.status)"""),format.raw/*74.63*/("""{"""),format.raw/*74.64*/("""
                        """),format.raw/*75.25*/("""elFail.innerHTML=passengerLimitValidation.message;
                    """),format.raw/*76.21*/("""}"""),format.raw/*76.22*/("""else
                    if(!busPlateNo.status) """),format.raw/*77.44*/("""{"""),format.raw/*77.45*/("""
                        """),format.raw/*78.25*/("""elFail.innerHTML = busPlateNo.message;
                    """),format.raw/*79.21*/("""}"""),format.raw/*79.22*/("""
                    """),format.raw/*80.21*/("""if(elFail.innerHTML!=="")"""),format.raw/*80.46*/("""{"""),format.raw/*80.47*/("""
                        """),format.raw/*81.25*/("""elFail.style.display ='block';
                        elSuccess.style.display ='none';
                        clearResponse();
                        return false;
                    """),format.raw/*85.21*/("""}"""),format.raw/*85.22*/("""
                    """),format.raw/*86.21*/("""return true;
                """),format.raw/*87.17*/("""}"""),format.raw/*87.18*/("""
                """),format.raw/*88.17*/("""async function loadDestinations() """),format.raw/*88.51*/("""{"""),format.raw/*88.52*/("""
                    """),format.raw/*89.21*/("""var options = "<option value='0'>Select destination</option>";
                    var requestOptions = """),format.raw/*90.42*/("""{"""),format.raw/*90.43*/("""
                        """),format.raw/*91.25*/("""method: 'GET',
                        headers: """),format.raw/*92.34*/("""{"""),format.raw/*92.35*/("""
                            """),format.raw/*93.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*94.54*/("""{"""),format.raw/*94.55*/("""localStorage.getItem("token")"""),format.raw/*94.84*/("""}"""),format.raw/*94.85*/("""`
                        """),format.raw/*95.25*/("""}"""),format.raw/*95.26*/("""
                    """),format.raw/*96.21*/("""}"""),format.raw/*96.22*/(""";
                    const data = await fetch(`$"""),format.raw/*97.48*/("""{"""),format.raw/*97.49*/("""apiUrl"""),format.raw/*97.55*/("""}"""),format.raw/*97.56*/("""/destinations`, requestOptions)
                            .then(response => """),format.raw/*98.47*/("""{"""),format.raw/*98.48*/("""
                                """),format.raw/*99.33*/("""if(response.status===401) """),format.raw/*99.59*/("""{"""),format.raw/*99.60*/("""localStorage.clear(); window.location='/login'"""),format.raw/*99.106*/("""}"""),format.raw/*99.107*/(""";
                                return response.json();
                            """),format.raw/*101.29*/("""}"""),format.raw/*101.30*/(""")
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    for(let i=0;i<data.length;i++)"""),format.raw/*104.51*/("""{"""),format.raw/*104.52*/("""
                        """),format.raw/*105.25*/("""options+=`<option value="$"""),format.raw/*105.51*/("""{"""),format.raw/*105.52*/("""data[i].id"""),format.raw/*105.62*/("""}"""),format.raw/*105.63*/("""">$"""),format.raw/*105.66*/("""{"""),format.raw/*105.67*/("""data[i].departure"""),format.raw/*105.84*/("""}"""),format.raw/*105.85*/("""-$"""),format.raw/*105.87*/("""{"""),format.raw/*105.88*/("""data[i].arrival"""),format.raw/*105.103*/("""}"""),format.raw/*105.104*/("""</option>`;
                    """),format.raw/*106.21*/("""}"""),format.raw/*106.22*/("""
                    """),format.raw/*107.21*/("""document.querySelector("#destination").innerHTML = options;

                """),format.raw/*109.17*/("""}"""),format.raw/*109.18*/("""
                """),format.raw/*110.17*/("""async function loadDrivers() """),format.raw/*110.46*/("""{"""),format.raw/*110.47*/("""
                    """),format.raw/*111.21*/("""var options = "<option value='0'>Select drivers</option>";
                    var requestOptions = """),format.raw/*112.42*/("""{"""),format.raw/*112.43*/("""
                        """),format.raw/*113.25*/("""method: 'GET',
                        headers: """),format.raw/*114.34*/("""{"""),format.raw/*114.35*/("""
                            """),format.raw/*115.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*116.54*/("""{"""),format.raw/*116.55*/("""localStorage.getItem("token")"""),format.raw/*116.84*/("""}"""),format.raw/*116.85*/("""`
                        """),format.raw/*117.25*/("""}"""),format.raw/*117.26*/("""
                    """),format.raw/*118.21*/("""}"""),format.raw/*118.22*/(""";
                    const data = await fetch(`$"""),format.raw/*119.48*/("""{"""),format.raw/*119.49*/("""apiUrl"""),format.raw/*119.55*/("""}"""),format.raw/*119.56*/("""/users/type?user_type=driver`, requestOptions)
                            .then(response => """),format.raw/*120.47*/("""{"""),format.raw/*120.48*/("""
                                """),format.raw/*121.33*/("""if(response.status===401) """),format.raw/*121.59*/("""{"""),format.raw/*121.60*/("""localStorage.clear(); window.location='/login'"""),format.raw/*121.106*/("""}"""),format.raw/*121.107*/(""";
                                return response.json();
                            """),format.raw/*123.29*/("""}"""),format.raw/*123.30*/(""")
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    for(let i=0;i<data.length;i++)"""),format.raw/*126.51*/("""{"""),format.raw/*126.52*/("""
                        """),format.raw/*127.25*/("""options+=`<option value="$"""),format.raw/*127.51*/("""{"""),format.raw/*127.52*/("""data[i].id"""),format.raw/*127.62*/("""}"""),format.raw/*127.63*/("""">$"""),format.raw/*127.66*/("""{"""),format.raw/*127.67*/("""data[i].name"""),format.raw/*127.79*/("""}"""),format.raw/*127.80*/(""" """),format.raw/*127.81*/("""($"""),format.raw/*127.83*/("""{"""),format.raw/*127.84*/("""data[i].phone"""),format.raw/*127.97*/("""}"""),format.raw/*127.98*/(""")</option>`;
                    """),format.raw/*128.21*/("""}"""),format.raw/*128.22*/("""
                    """),format.raw/*129.21*/("""document.querySelector("#driver").innerHTML = options;

                """),format.raw/*131.17*/("""}"""),format.raw/*131.18*/("""

                """),format.raw/*133.17*/("""async function save() """),format.raw/*133.39*/("""{"""),format.raw/*133.40*/("""
                    """),format.raw/*134.21*/("""const elFail = document.querySelector("#responseFail"),
                            elSuccess = document.querySelector("#responseSuccess");
                    const data = """),format.raw/*136.34*/("""{"""),format.raw/*136.35*/("""
                        """),format.raw/*137.25*/("""destination: document.querySelector("#destination").value,
                        driver: document.querySelector("#driver").value,
                        bus_plate_no: document.querySelector("#bus_plate_no").value,
                        passenger_limit: document.querySelector("#passenger_limit").value,
                        departure_date: new Date(document.querySelector("#departure_date").value).getTime()/1000,
                    """),format.raw/*142.21*/("""}"""),format.raw/*142.22*/("""
                    """),format.raw/*143.21*/("""console.log(validateForm(data));
                    if(!validateForm(data)) return;
                    var requestOptions = """),format.raw/*145.42*/("""{"""),format.raw/*145.43*/("""
                        """),format.raw/*146.25*/("""method: 'POST',
                        body: JSON.stringify(data),
                        headers: """),format.raw/*148.34*/("""{"""),format.raw/*148.35*/("""
                            """),format.raw/*149.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*150.54*/("""{"""),format.raw/*150.55*/("""localStorage.getItem("token")"""),format.raw/*150.84*/("""}"""),format.raw/*150.85*/("""`
                        """),format.raw/*151.25*/("""}"""),format.raw/*151.26*/("""
                    """),format.raw/*152.21*/("""}"""),format.raw/*152.22*/(""";
                    const res = await fetch(`$"""),format.raw/*153.47*/("""{"""),format.raw/*153.48*/("""apiUrl"""),format.raw/*153.54*/("""}"""),format.raw/*153.55*/("""/schedule/$"""),format.raw/*153.66*/("""{"""),format.raw/*153.67*/("""id"""),format.raw/*153.69*/("""}"""),format.raw/*153.70*/("""`, requestOptions)
                            .then(response => response.json())
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    if (res.status) """),format.raw/*157.37*/("""{"""),format.raw/*157.38*/("""
                        """),format.raw/*158.25*/("""elSuccess.setAttribute("style","display:block");
                        elFail.setAttribute("style","display:none");
                        elSuccess.innerHTML = res.message;
                    """),format.raw/*161.21*/("""}"""),format.raw/*161.22*/(""" """),format.raw/*161.23*/("""else """),format.raw/*161.28*/("""{"""),format.raw/*161.29*/("""
                        """),format.raw/*162.25*/("""elFail.setAttribute("style", "display:block");
                        elSuccess.setAttribute("style", "display:none");
                        elFail.innerHTML = res.message;
                    """),format.raw/*165.21*/("""}"""),format.raw/*165.22*/("""
                """),format.raw/*166.17*/("""}"""),format.raw/*166.18*/("""

            """),format.raw/*168.13*/("""}"""),format.raw/*168.14*/(""")
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
                  SOURCE: app/views/scheduleUpdate.scala.html
                  HASH: ddccf2a6f1b4020f072660fb26fa2d15701a63fd
                  MATRIX: 998->1|1011->7|1041->29|1075->55|1114->57|1145->62|3531->2421|3547->2428|3577->2437|3609->2442|3724->2529|3753->2530|3798->2547|4071->2792|4100->2793|4149->2814|4201->2838|4230->2839|4275->2856|4329->2882|4358->2883|4407->2904|4461->2930|4490->2931|4524->2937|4553->2938|4592->2949|4621->2950|4651->2952|4680->2953|4936->3181|4965->3182|5018->3207|5369->3530|5398->3531|5443->3548|5472->3549|5518->3567|5572->3593|5601->3594|5650->3615|5925->3861|5955->3862|6029->3907|6059->3908|6089->3909|6119->3910|6159->3921|6189->3922|6286->3991|6315->3992|6399->4047|6429->4048|6459->4049|6489->4050|6529->4061|6559->4062|6684->4159|6713->4160|6787->4205|6817->4206|6847->4207|6877->4208|6917->4219|6947->4220|7029->4274|7058->4275|7111->4300|7205->4366|7234->4367|7303->4408|7332->4409|7385->4434|7484->4505|7513->4506|7589->4554|7618->4555|7671->4580|7758->4639|7787->4640|7836->4661|7889->4686|7918->4687|7971->4712|8186->4899|8215->4900|8264->4921|8321->4950|8350->4951|8395->4968|8457->5002|8486->5003|8535->5024|8667->5128|8696->5129|8749->5154|8825->5202|8854->5203|8911->5232|9028->5321|9057->5322|9114->5351|9143->5352|9197->5378|9226->5379|9275->5400|9304->5401|9381->5450|9410->5451|9444->5457|9473->5458|9579->5536|9608->5537|9669->5570|9723->5596|9752->5597|9827->5643|9857->5644|9972->5730|10002->5731|10209->5909|10239->5910|10293->5935|10348->5961|10378->5962|10417->5972|10447->5973|10479->5976|10509->5977|10555->5994|10585->5995|10616->5997|10646->5998|10691->6013|10722->6014|10783->6046|10813->6047|10863->6068|10969->6145|10999->6146|11045->6163|11103->6192|11133->6193|11183->6214|11312->6314|11342->6315|11396->6340|11473->6388|11503->6389|11561->6418|11679->6507|11709->6508|11767->6537|11797->6538|11852->6564|11882->6565|11932->6586|11962->6587|12040->6636|12070->6637|12105->6643|12135->6644|12257->6737|12287->6738|12349->6771|12404->6797|12434->6798|12510->6844|12541->6845|12656->6931|12686->6932|12893->7110|12923->7111|12977->7136|13032->7162|13062->7163|13101->7173|13131->7174|13163->7177|13193->7178|13234->7190|13264->7191|13294->7192|13325->7194|13355->7195|13397->7208|13427->7209|13489->7242|13519->7243|13569->7264|13670->7336|13700->7337|13747->7355|13798->7377|13828->7378|13878->7399|14080->7572|14110->7573|14164->7598|14635->8040|14665->8041|14715->8062|14870->8188|14900->8189|14954->8214|15084->8315|15114->8316|15172->8345|15290->8434|15320->8435|15378->8464|15408->8465|15463->8491|15493->8492|15543->8513|15573->8514|15650->8562|15680->8563|15715->8569|15745->8570|15785->8581|15815->8582|15846->8584|15876->8585|16149->8829|16179->8830|16233->8855|16459->9052|16489->9053|16519->9054|16553->9059|16583->9060|16637->9085|16862->9281|16892->9282|16938->9299|16968->9300|17011->9314|17041->9315
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|71->40|71->40|71->40|72->41|74->43|74->43|75->44|80->49|80->49|81->50|82->51|82->51|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|88->57|88->57|89->58|93->62|93->62|94->63|94->63|96->65|96->65|96->65|97->66|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|100->69|100->69|100->69|100->69|100->69|100->69|100->69|100->69|101->70|101->70|101->70|101->70|101->70|101->70|101->70|101->70|103->72|103->72|104->73|105->74|105->74|105->74|105->74|106->75|107->76|107->76|108->77|108->77|109->78|110->79|110->79|111->80|111->80|111->80|112->81|116->85|116->85|117->86|118->87|118->87|119->88|119->88|119->88|120->89|121->90|121->90|122->91|123->92|123->92|124->93|125->94|125->94|125->94|125->94|126->95|126->95|127->96|127->96|128->97|128->97|128->97|128->97|129->98|129->98|130->99|130->99|130->99|130->99|130->99|132->101|132->101|135->104|135->104|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|136->105|137->106|137->106|138->107|140->109|140->109|141->110|141->110|141->110|142->111|143->112|143->112|144->113|145->114|145->114|146->115|147->116|147->116|147->116|147->116|148->117|148->117|149->118|149->118|150->119|150->119|150->119|150->119|151->120|151->120|152->121|152->121|152->121|152->121|152->121|154->123|154->123|157->126|157->126|158->127|158->127|158->127|158->127|158->127|158->127|158->127|158->127|158->127|158->127|158->127|158->127|158->127|158->127|159->128|159->128|160->129|162->131|162->131|164->133|164->133|164->133|165->134|167->136|167->136|168->137|173->142|173->142|174->143|176->145|176->145|177->146|179->148|179->148|180->149|181->150|181->150|181->150|181->150|182->151|182->151|183->152|183->152|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|188->157|188->157|189->158|192->161|192->161|192->161|192->161|192->161|193->162|196->165|196->165|197->166|197->166|199->168|199->168
                  -- GENERATED --
              */
          