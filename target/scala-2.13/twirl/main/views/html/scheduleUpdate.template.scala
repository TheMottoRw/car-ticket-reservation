
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
                        busPlateNo = obj.bus_plate_no.length<4?"""),format.raw/*69.64*/("""{"""),format.raw/*69.65*/("""status:false,message:"Invalid bus plate number""""),format.raw/*69.112*/("""}"""),format.raw/*69.113*/(""":"""),format.raw/*69.114*/("""{"""),format.raw/*69.115*/("""status:true"""),format.raw/*69.126*/("""}"""),format.raw/*69.127*/(""",
                        driverValidation = obj.driver=="0"?"""),format.raw/*70.60*/("""{"""),format.raw/*70.61*/("""status:false,message:"You must select driver""""),format.raw/*70.106*/("""}"""),format.raw/*70.107*/(""":"""),format.raw/*70.108*/("""{"""),format.raw/*70.109*/("""status:true"""),format.raw/*70.120*/("""}"""),format.raw/*70.121*/(""",
                        departureValidation = obj.departure_date<new Date().getTime()/1000?"""),format.raw/*71.92*/("""{"""),format.raw/*71.93*/("""status:false,message:"Invalid departure time""""),format.raw/*71.138*/("""}"""),format.raw/*71.139*/(""":"""),format.raw/*71.140*/("""{"""),format.raw/*71.141*/("""status:true"""),format.raw/*71.152*/("""}"""),format.raw/*71.153*/(""";

                    if(!departureValidation.status)"""),format.raw/*73.52*/("""{"""),format.raw/*73.53*/("""
                        """),format.raw/*74.25*/("""elFail.innerHTML=departureValidation.message;
                    """),format.raw/*75.21*/("""}"""),format.raw/*75.22*/("""else if(!passengerLimitValidation.status)"""),format.raw/*75.63*/("""{"""),format.raw/*75.64*/("""
                        """),format.raw/*76.25*/("""elFail.innerHTML=passengerLimitValidation.message;
                    """),format.raw/*77.21*/("""}"""),format.raw/*77.22*/("""else if(!driverValidation.status)"""),format.raw/*77.55*/("""{"""),format.raw/*77.56*/("""
                        """),format.raw/*78.25*/("""elFail.innerHTML=driverValidation.message;
                    """),format.raw/*79.21*/("""}"""),format.raw/*79.22*/("""else
                    if(!busPlateNo.status) """),format.raw/*80.44*/("""{"""),format.raw/*80.45*/("""
                        """),format.raw/*81.25*/("""elFail.innerHTML = busPlateNo.message;
                    """),format.raw/*82.21*/("""}"""),format.raw/*82.22*/("""
                    """),format.raw/*83.21*/("""if(elFail.innerHTML!=="")"""),format.raw/*83.46*/("""{"""),format.raw/*83.47*/("""
                        """),format.raw/*84.25*/("""elFail.style.display ='block';
                        elSuccess.style.display ='none';
                        clearResponse();
                        return false;
                    """),format.raw/*88.21*/("""}"""),format.raw/*88.22*/("""
                    """),format.raw/*89.21*/("""return true;
                """),format.raw/*90.17*/("""}"""),format.raw/*90.18*/("""
                """),format.raw/*91.17*/("""async function loadDestinations() """),format.raw/*91.51*/("""{"""),format.raw/*91.52*/("""
                    """),format.raw/*92.21*/("""var options = "<option value='0'>Select destination</option>";
                    var requestOptions = """),format.raw/*93.42*/("""{"""),format.raw/*93.43*/("""
                        """),format.raw/*94.25*/("""method: 'GET',
                        headers: """),format.raw/*95.34*/("""{"""),format.raw/*95.35*/("""
                            """),format.raw/*96.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*97.54*/("""{"""),format.raw/*97.55*/("""localStorage.getItem("token")"""),format.raw/*97.84*/("""}"""),format.raw/*97.85*/("""`
                        """),format.raw/*98.25*/("""}"""),format.raw/*98.26*/("""
                    """),format.raw/*99.21*/("""}"""),format.raw/*99.22*/(""";
                    const data = await fetch(`$"""),format.raw/*100.48*/("""{"""),format.raw/*100.49*/("""apiUrl"""),format.raw/*100.55*/("""}"""),format.raw/*100.56*/("""/destinations`, requestOptions)
                            .then(response => """),format.raw/*101.47*/("""{"""),format.raw/*101.48*/("""
                                """),format.raw/*102.33*/("""if(response.status===401) """),format.raw/*102.59*/("""{"""),format.raw/*102.60*/("""localStorage.clear(); window.location='/login'"""),format.raw/*102.106*/("""}"""),format.raw/*102.107*/(""";
                                return response.json();
                            """),format.raw/*104.29*/("""}"""),format.raw/*104.30*/(""")
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    for(let i=0;i<data.length;i++)"""),format.raw/*107.51*/("""{"""),format.raw/*107.52*/("""
                        """),format.raw/*108.25*/("""options+=`<option value="$"""),format.raw/*108.51*/("""{"""),format.raw/*108.52*/("""data[i].id"""),format.raw/*108.62*/("""}"""),format.raw/*108.63*/("""">$"""),format.raw/*108.66*/("""{"""),format.raw/*108.67*/("""data[i].departure"""),format.raw/*108.84*/("""}"""),format.raw/*108.85*/("""-$"""),format.raw/*108.87*/("""{"""),format.raw/*108.88*/("""data[i].arrival"""),format.raw/*108.103*/("""}"""),format.raw/*108.104*/("""</option>`;
                    """),format.raw/*109.21*/("""}"""),format.raw/*109.22*/("""
                    """),format.raw/*110.21*/("""document.querySelector("#destination").innerHTML = options;

                """),format.raw/*112.17*/("""}"""),format.raw/*112.18*/("""
                """),format.raw/*113.17*/("""async function loadDrivers() """),format.raw/*113.46*/("""{"""),format.raw/*113.47*/("""
                    """),format.raw/*114.21*/("""var options = "<option value='0'>Select drivers</option>";
                    var requestOptions = """),format.raw/*115.42*/("""{"""),format.raw/*115.43*/("""
                        """),format.raw/*116.25*/("""method: 'GET',
                        headers: """),format.raw/*117.34*/("""{"""),format.raw/*117.35*/("""
                            """),format.raw/*118.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*119.54*/("""{"""),format.raw/*119.55*/("""localStorage.getItem("token")"""),format.raw/*119.84*/("""}"""),format.raw/*119.85*/("""`
                        """),format.raw/*120.25*/("""}"""),format.raw/*120.26*/("""
                    """),format.raw/*121.21*/("""}"""),format.raw/*121.22*/(""";
                    const data = await fetch(`$"""),format.raw/*122.48*/("""{"""),format.raw/*122.49*/("""apiUrl"""),format.raw/*122.55*/("""}"""),format.raw/*122.56*/("""/users/type?user_type=driver`, requestOptions)
                            .then(response => """),format.raw/*123.47*/("""{"""),format.raw/*123.48*/("""
                                """),format.raw/*124.33*/("""if(response.status===401) """),format.raw/*124.59*/("""{"""),format.raw/*124.60*/("""localStorage.clear(); window.location='/login'"""),format.raw/*124.106*/("""}"""),format.raw/*124.107*/(""";
                                return response.json();
                            """),format.raw/*126.29*/("""}"""),format.raw/*126.30*/(""")
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    for(let i=0;i<data.length;i++)"""),format.raw/*129.51*/("""{"""),format.raw/*129.52*/("""
                        """),format.raw/*130.25*/("""options+=`<option value="$"""),format.raw/*130.51*/("""{"""),format.raw/*130.52*/("""data[i].id"""),format.raw/*130.62*/("""}"""),format.raw/*130.63*/("""">$"""),format.raw/*130.66*/("""{"""),format.raw/*130.67*/("""data[i].name"""),format.raw/*130.79*/("""}"""),format.raw/*130.80*/(""" """),format.raw/*130.81*/("""($"""),format.raw/*130.83*/("""{"""),format.raw/*130.84*/("""data[i].phone"""),format.raw/*130.97*/("""}"""),format.raw/*130.98*/(""")</option>`;
                    """),format.raw/*131.21*/("""}"""),format.raw/*131.22*/("""
                    """),format.raw/*132.21*/("""document.querySelector("#driver").innerHTML = options;

                """),format.raw/*134.17*/("""}"""),format.raw/*134.18*/("""

                """),format.raw/*136.17*/("""async function save() """),format.raw/*136.39*/("""{"""),format.raw/*136.40*/("""
                    """),format.raw/*137.21*/("""const elFail = document.querySelector("#responseFail"),
                            elSuccess = document.querySelector("#responseSuccess");
                    const data = """),format.raw/*139.34*/("""{"""),format.raw/*139.35*/("""
                        """),format.raw/*140.25*/("""destination: document.querySelector("#destination").value,
                        driver: document.querySelector("#driver").value,
                        bus_plate_no: document.querySelector("#bus_plate_no").value,
                        passenger_limit: document.querySelector("#passenger_limit").value,
                        departure_date: new Date(document.querySelector("#departure_date").value).getTime()/1000,

                    """),format.raw/*146.21*/("""}"""),format.raw/*146.22*/("""
                    """),format.raw/*147.21*/("""console.log(validateForm(data));
                    if(!validateForm(data)) return;
                    var requestOptions = """),format.raw/*149.42*/("""{"""),format.raw/*149.43*/("""
                        """),format.raw/*150.25*/("""method: 'POST',
                        body: JSON.stringify(data),
                        headers: """),format.raw/*152.34*/("""{"""),format.raw/*152.35*/("""
                            """),format.raw/*153.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*154.54*/("""{"""),format.raw/*154.55*/("""localStorage.getItem("token")"""),format.raw/*154.84*/("""}"""),format.raw/*154.85*/("""`
                        """),format.raw/*155.25*/("""}"""),format.raw/*155.26*/("""
                    """),format.raw/*156.21*/("""}"""),format.raw/*156.22*/(""";
                    const res = await fetch(`$"""),format.raw/*157.47*/("""{"""),format.raw/*157.48*/("""apiUrl"""),format.raw/*157.54*/("""}"""),format.raw/*157.55*/("""/schedule/$"""),format.raw/*157.66*/("""{"""),format.raw/*157.67*/("""id"""),format.raw/*157.69*/("""}"""),format.raw/*157.70*/("""`, requestOptions)
                            .then(response => response.json())
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    if (res.status) """),format.raw/*161.37*/("""{"""),format.raw/*161.38*/("""
                        """),format.raw/*162.25*/("""elSuccess.setAttribute("style","display:block");
                        elFail.setAttribute("style","display:none");
                        elSuccess.innerHTML = res.message;
                    """),format.raw/*165.21*/("""}"""),format.raw/*165.22*/(""" """),format.raw/*165.23*/("""else """),format.raw/*165.28*/("""{"""),format.raw/*165.29*/("""
                        """),format.raw/*166.25*/("""elFail.setAttribute("style", "display:block");
                        elSuccess.setAttribute("style", "display:none");
                        elFail.innerHTML = res.message;
                    """),format.raw/*169.21*/("""}"""),format.raw/*169.22*/("""
                """),format.raw/*170.17*/("""}"""),format.raw/*170.18*/("""

            """),format.raw/*172.13*/("""}"""),format.raw/*172.14*/(""")
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
                  HASH: 2f601aacca1d106e293f1454a66f088075482d15
                  MATRIX: 998->1|1011->7|1041->29|1075->55|1114->57|1145->62|3531->2421|3547->2428|3577->2437|3609->2442|3724->2529|3753->2530|3798->2547|4071->2792|4100->2793|4149->2814|4201->2838|4230->2839|4275->2856|4329->2882|4358->2883|4407->2904|4461->2930|4490->2931|4524->2937|4553->2938|4592->2949|4621->2950|4651->2952|4680->2953|4936->3181|4965->3182|5018->3207|5369->3530|5398->3531|5443->3548|5472->3549|5518->3567|5572->3593|5601->3594|5650->3615|5921->3857|5951->3858|6025->3903|6055->3904|6085->3905|6115->3906|6155->3917|6185->3918|6278->3983|6307->3984|6383->4031|6413->4032|6443->4033|6473->4034|6513->4045|6543->4046|6632->4107|6661->4108|6735->4153|6765->4154|6795->4155|6825->4156|6865->4167|6895->4168|7016->4261|7045->4262|7119->4307|7149->4308|7179->4309|7209->4310|7249->4321|7279->4322|7361->4376|7390->4377|7443->4402|7537->4468|7566->4469|7635->4510|7664->4511|7717->4536|7816->4607|7845->4608|7906->4641|7935->4642|7988->4667|8079->4730|8108->4731|8184->4779|8213->4780|8266->4805|8353->4864|8382->4865|8431->4886|8484->4911|8513->4912|8566->4937|8781->5124|8810->5125|8859->5146|8916->5175|8945->5176|8990->5193|9052->5227|9081->5228|9130->5249|9262->5353|9291->5354|9344->5379|9420->5427|9449->5428|9506->5457|9623->5546|9652->5547|9709->5576|9738->5577|9792->5603|9821->5604|9870->5625|9899->5626|9977->5675|10007->5676|10042->5682|10072->5683|10179->5761|10209->5762|10271->5795|10326->5821|10356->5822|10432->5868|10463->5869|10578->5955|10608->5956|10815->6134|10845->6135|10899->6160|10954->6186|10984->6187|11023->6197|11053->6198|11085->6201|11115->6202|11161->6219|11191->6220|11222->6222|11252->6223|11297->6238|11328->6239|11389->6271|11419->6272|11469->6293|11575->6370|11605->6371|11651->6388|11709->6417|11739->6418|11789->6439|11918->6539|11948->6540|12002->6565|12079->6613|12109->6614|12167->6643|12285->6732|12315->6733|12373->6762|12403->6763|12458->6789|12488->6790|12538->6811|12568->6812|12646->6861|12676->6862|12711->6868|12741->6869|12863->6962|12893->6963|12955->6996|13010->7022|13040->7023|13116->7069|13147->7070|13262->7156|13292->7157|13499->7335|13529->7336|13583->7361|13638->7387|13668->7388|13707->7398|13737->7399|13769->7402|13799->7403|13840->7415|13870->7416|13900->7417|13931->7419|13961->7420|14003->7433|14033->7434|14095->7467|14125->7468|14175->7489|14276->7561|14306->7562|14353->7580|14404->7602|14434->7603|14484->7624|14686->7797|14716->7798|14770->7823|15242->8266|15272->8267|15322->8288|15477->8414|15507->8415|15561->8440|15691->8541|15721->8542|15779->8571|15897->8660|15927->8661|15985->8690|16015->8691|16070->8717|16100->8718|16150->8739|16180->8740|16257->8788|16287->8789|16322->8795|16352->8796|16392->8807|16422->8808|16453->8810|16483->8811|16756->9055|16786->9056|16840->9081|17066->9278|17096->9279|17126->9280|17160->9285|17190->9286|17244->9311|17469->9507|17499->9508|17545->9525|17575->9526|17618->9540|17648->9541
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|71->40|71->40|71->40|72->41|74->43|74->43|75->44|80->49|80->49|81->50|82->51|82->51|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|88->57|88->57|89->58|93->62|93->62|94->63|94->63|96->65|96->65|96->65|97->66|99->68|99->68|99->68|99->68|99->68|99->68|99->68|99->68|100->69|100->69|100->69|100->69|100->69|100->69|100->69|100->69|101->70|101->70|101->70|101->70|101->70|101->70|101->70|101->70|102->71|102->71|102->71|102->71|102->71|102->71|102->71|102->71|104->73|104->73|105->74|106->75|106->75|106->75|106->75|107->76|108->77|108->77|108->77|108->77|109->78|110->79|110->79|111->80|111->80|112->81|113->82|113->82|114->83|114->83|114->83|115->84|119->88|119->88|120->89|121->90|121->90|122->91|122->91|122->91|123->92|124->93|124->93|125->94|126->95|126->95|127->96|128->97|128->97|128->97|128->97|129->98|129->98|130->99|130->99|131->100|131->100|131->100|131->100|132->101|132->101|133->102|133->102|133->102|133->102|133->102|135->104|135->104|138->107|138->107|139->108|139->108|139->108|139->108|139->108|139->108|139->108|139->108|139->108|139->108|139->108|139->108|139->108|140->109|140->109|141->110|143->112|143->112|144->113|144->113|144->113|145->114|146->115|146->115|147->116|148->117|148->117|149->118|150->119|150->119|150->119|150->119|151->120|151->120|152->121|152->121|153->122|153->122|153->122|153->122|154->123|154->123|155->124|155->124|155->124|155->124|155->124|157->126|157->126|160->129|160->129|161->130|161->130|161->130|161->130|161->130|161->130|161->130|161->130|161->130|161->130|161->130|161->130|161->130|161->130|162->131|162->131|163->132|165->134|165->134|167->136|167->136|167->136|168->137|170->139|170->139|171->140|177->146|177->146|178->147|180->149|180->149|181->150|183->152|183->152|184->153|185->154|185->154|185->154|185->154|186->155|186->155|187->156|187->156|188->157|188->157|188->157|188->157|188->157|188->157|188->157|188->157|192->161|192->161|193->162|196->165|196->165|196->165|196->165|196->165|197->166|200->169|200->169|201->170|201->170|203->172|203->172
                  -- GENERATED --
              */
          