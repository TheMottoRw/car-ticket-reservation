
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
        """),_display_(/*35.10*/commons/*35.17*/.footer()),format.raw/*35.26*/("""
    """),format.raw/*36.5*/("""</div>
    <script>
            window.addEventListener("DOMContentLoaded",function () """),format.raw/*38.68*/("""{"""),format.raw/*38.69*/("""
                """),format.raw/*39.17*/("""const urlArr = getUrlParams();
                const id = urlArr[urlArr.length - 1];
                loadById();
                loadDestinations();
                document.querySelector("#btnUpdate").onclick=()=>"""),format.raw/*43.66*/("""{"""),format.raw/*43.67*/("""
                    """),format.raw/*44.21*/("""save();
                """),format.raw/*45.17*/("""}"""),format.raw/*45.18*/("""
                """),format.raw/*46.17*/("""async function loadById() """),format.raw/*46.43*/("""{"""),format.raw/*46.44*/("""
                    """),format.raw/*47.21*/("""const res = await fetch(`$"""),format.raw/*47.47*/("""{"""),format.raw/*47.48*/("""apiUrl"""),format.raw/*47.54*/("""}"""),format.raw/*47.55*/("""/schedule/$"""),format.raw/*47.66*/("""{"""),format.raw/*47.67*/("""id"""),format.raw/*47.69*/("""}"""),format.raw/*47.70*/("""`)
                            .then(response => response.json())
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    if (!res.error) """),format.raw/*51.37*/("""{"""),format.raw/*51.38*/("""
                        """),format.raw/*52.25*/("""let obj = res;
                        document.querySelector("#bus_plate_no").value = obj.bus_plate_no;
                        document.querySelector("#passenger_limit").value = obj.passenger_limit;
                        document.querySelector("#departure_date").value = getDate(obj.departure_date)
                    """),format.raw/*56.21*/("""}"""),format.raw/*56.22*/("""
                """),format.raw/*57.17*/("""}"""),format.raw/*57.18*/("""

                """),format.raw/*59.17*/("""function validateForm(obj)"""),format.raw/*59.43*/("""{"""),format.raw/*59.44*/("""
                    """),format.raw/*60.21*/("""const elFail = document.querySelector("#responseFail"),
                            elSuccess = document.querySelector("#responseSuccess");
                    const passengerLimitValidation = isNaN(obj.passenger_limit) || obj.passenger_limit<=0?"""),format.raw/*62.107*/("""{"""),format.raw/*62.108*/("""status:false,message:"Invalid passenger lmit""""),format.raw/*62.153*/("""}"""),format.raw/*62.154*/(""":"""),format.raw/*62.155*/("""{"""),format.raw/*62.156*/("""status:true"""),format.raw/*62.167*/("""}"""),format.raw/*62.168*/(""",
                            busPlateNo = obj.bus_plate_no.length<4?"""),format.raw/*63.68*/("""{"""),format.raw/*63.69*/("""status:false,message:"Invalid bus plate numer location""""),format.raw/*63.124*/("""}"""),format.raw/*63.125*/(""":"""),format.raw/*63.126*/("""{"""),format.raw/*63.127*/("""status:true"""),format.raw/*63.138*/("""}"""),format.raw/*63.139*/(""",
                            departureValidation = obj.departure_date<new Date().getTime()/1000?"""),format.raw/*64.96*/("""{"""),format.raw/*64.97*/("""status:false,message:"Invalid departure time""""),format.raw/*64.142*/("""}"""),format.raw/*64.143*/(""":"""),format.raw/*64.144*/("""{"""),format.raw/*64.145*/("""status:true"""),format.raw/*64.156*/("""}"""),format.raw/*64.157*/(""";

                    if(!departureValidation.status)"""),format.raw/*66.52*/("""{"""),format.raw/*66.53*/("""
                        """),format.raw/*67.25*/("""elFail.innerHTML=departureValidation.message;
                    """),format.raw/*68.21*/("""}"""),format.raw/*68.22*/("""else if(!passengerLimitValidation.status)"""),format.raw/*68.63*/("""{"""),format.raw/*68.64*/("""
                        """),format.raw/*69.25*/("""elFail.innerHTML=passengerLimitValidation.message;
                    """),format.raw/*70.21*/("""}"""),format.raw/*70.22*/("""else
                    if(!busPlateNo.status) """),format.raw/*71.44*/("""{"""),format.raw/*71.45*/("""
                        """),format.raw/*72.25*/("""elFail.innerHTML = busPlateNo.message;
                    """),format.raw/*73.21*/("""}"""),format.raw/*73.22*/("""
                    """),format.raw/*74.21*/("""if(elFail.innerHTML!=="")"""),format.raw/*74.46*/("""{"""),format.raw/*74.47*/("""
                        """),format.raw/*75.25*/("""elFail.style.display ='block';
                        elSuccess.style.display ='none';
                        clearResponse();
                        return false;
                    """),format.raw/*79.21*/("""}"""),format.raw/*79.22*/("""
                    """),format.raw/*80.21*/("""return true;
                """),format.raw/*81.17*/("""}"""),format.raw/*81.18*/("""
                """),format.raw/*82.17*/("""async function loadDestinations() """),format.raw/*82.51*/("""{"""),format.raw/*82.52*/("""
                    """),format.raw/*83.21*/("""var options = "<option value='0'>Select destination</option>";
                    var requestOptions = """),format.raw/*84.42*/("""{"""),format.raw/*84.43*/("""
                        """),format.raw/*85.25*/("""method: 'GET',
                        headers: """),format.raw/*86.34*/("""{"""),format.raw/*86.35*/("""
                            """),format.raw/*87.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*88.54*/("""{"""),format.raw/*88.55*/("""localStorage.getItem("token")"""),format.raw/*88.84*/("""}"""),format.raw/*88.85*/("""`
                        """),format.raw/*89.25*/("""}"""),format.raw/*89.26*/("""
                    """),format.raw/*90.21*/("""}"""),format.raw/*90.22*/(""";
                    const data = await fetch(`$"""),format.raw/*91.48*/("""{"""),format.raw/*91.49*/("""apiUrl"""),format.raw/*91.55*/("""}"""),format.raw/*91.56*/("""/destinations`, requestOptions)
                            .then(response => """),format.raw/*92.47*/("""{"""),format.raw/*92.48*/("""
                                """),format.raw/*93.33*/("""if(response.status===401) """),format.raw/*93.59*/("""{"""),format.raw/*93.60*/("""localStorage.clear(); window.location='/login'"""),format.raw/*93.106*/("""}"""),format.raw/*93.107*/(""";
                                return response.json();
                            """),format.raw/*95.29*/("""}"""),format.raw/*95.30*/(""")
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    for(let i=0;i<data.length;i++)"""),format.raw/*98.51*/("""{"""),format.raw/*98.52*/("""
                        """),format.raw/*99.25*/("""options+=`<option value="$"""),format.raw/*99.51*/("""{"""),format.raw/*99.52*/("""data[i].id"""),format.raw/*99.62*/("""}"""),format.raw/*99.63*/("""">$"""),format.raw/*99.66*/("""{"""),format.raw/*99.67*/("""data[i].departure"""),format.raw/*99.84*/("""}"""),format.raw/*99.85*/("""-$"""),format.raw/*99.87*/("""{"""),format.raw/*99.88*/("""data[i].arrival"""),format.raw/*99.103*/("""}"""),format.raw/*99.104*/("""</option>`;
                    """),format.raw/*100.21*/("""}"""),format.raw/*100.22*/("""
                    """),format.raw/*101.21*/("""document.querySelector("#destination").innerHTML = options;

                """),format.raw/*103.17*/("""}"""),format.raw/*103.18*/("""

                """),format.raw/*105.17*/("""async function save() """),format.raw/*105.39*/("""{"""),format.raw/*105.40*/("""
                    """),format.raw/*106.21*/("""const elFail = document.querySelector("#responseFail"),
                            elSuccess = document.querySelector("#responseSuccess");
                    const data = """),format.raw/*108.34*/("""{"""),format.raw/*108.35*/("""
                        """),format.raw/*109.25*/("""destination: document.querySelector("#destination").value,
                        bus_plate_no: document.querySelector("#bus_plate_no").value,
                        passenger_limit: document.querySelector("#passenger_limit").value,
                        departure_date: new Date(document.querySelector("#departure_date").value).getTime()/1000,
                    """),format.raw/*113.21*/("""}"""),format.raw/*113.22*/("""
                    """),format.raw/*114.21*/("""console.log(validateForm(data));
                    if(!validateForm(data)) return;
                    var requestOptions = """),format.raw/*116.42*/("""{"""),format.raw/*116.43*/("""
                        """),format.raw/*117.25*/("""method: 'POST',
                        body: JSON.stringify(data),
                        headers: """),format.raw/*119.34*/("""{"""),format.raw/*119.35*/("""
                            """),format.raw/*120.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*121.54*/("""{"""),format.raw/*121.55*/("""localStorage.getItem("token")"""),format.raw/*121.84*/("""}"""),format.raw/*121.85*/("""`
                        """),format.raw/*122.25*/("""}"""),format.raw/*122.26*/("""
                    """),format.raw/*123.21*/("""}"""),format.raw/*123.22*/(""";
                    const res = await fetch(`$"""),format.raw/*124.47*/("""{"""),format.raw/*124.48*/("""apiUrl"""),format.raw/*124.54*/("""}"""),format.raw/*124.55*/("""/schedule/$"""),format.raw/*124.66*/("""{"""),format.raw/*124.67*/("""id"""),format.raw/*124.69*/("""}"""),format.raw/*124.70*/("""`, requestOptions)
                            .then(response => response.json())
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    if (res.status) """),format.raw/*128.37*/("""{"""),format.raw/*128.38*/("""
                        """),format.raw/*129.25*/("""elSuccess.setAttribute("style","display:block");
                        elFail.setAttribute("style","display:none");
                        elSuccess.innerHTML = res.message;
                    """),format.raw/*132.21*/("""}"""),format.raw/*132.22*/(""" """),format.raw/*132.23*/("""else """),format.raw/*132.28*/("""{"""),format.raw/*132.29*/("""
                        """),format.raw/*133.25*/("""elFail.setAttribute("style", "display:block");
                        elSuccess.setAttribute("style", "display:none");
                        elFail.innerHTML = res.message;
                    """),format.raw/*136.21*/("""}"""),format.raw/*136.22*/("""
                """),format.raw/*137.17*/("""}"""),format.raw/*137.18*/("""

            """),format.raw/*139.13*/("""}"""),format.raw/*139.14*/(""")
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
                  HASH: c0da5262fe760b81ec9a7a9aba9b562a3d6110f2
                  MATRIX: 998->1|1011->7|1041->29|1075->55|1114->57|1145->62|3214->2104|3230->2111|3260->2120|3292->2125|3407->2212|3436->2213|3481->2230|3723->2444|3752->2445|3801->2466|3853->2490|3882->2491|3927->2508|3981->2534|4010->2535|4059->2556|4113->2582|4142->2583|4176->2589|4205->2590|4244->2601|4273->2602|4303->2604|4332->2605|4588->2833|4617->2834|4670->2859|5021->3182|5050->3183|5095->3200|5124->3201|5170->3219|5224->3245|5253->3246|5302->3267|5577->3513|5607->3514|5681->3559|5711->3560|5741->3561|5771->3562|5811->3573|5841->3574|5938->3643|5967->3644|6051->3699|6081->3700|6111->3701|6141->3702|6181->3713|6211->3714|6336->3811|6365->3812|6439->3857|6469->3858|6499->3859|6529->3860|6569->3871|6599->3872|6681->3926|6710->3927|6763->3952|6857->4018|6886->4019|6955->4060|6984->4061|7037->4086|7136->4157|7165->4158|7241->4206|7270->4207|7323->4232|7410->4291|7439->4292|7488->4313|7541->4338|7570->4339|7623->4364|7838->4551|7867->4552|7916->4573|7973->4602|8002->4603|8047->4620|8109->4654|8138->4655|8187->4676|8319->4780|8348->4781|8401->4806|8477->4854|8506->4855|8563->4884|8680->4973|8709->4974|8766->5003|8795->5004|8849->5030|8878->5031|8927->5052|8956->5053|9033->5102|9062->5103|9096->5109|9125->5110|9231->5188|9260->5189|9321->5222|9375->5248|9404->5249|9479->5295|9509->5296|9623->5382|9652->5383|9858->5561|9887->5562|9940->5587|9994->5613|10023->5614|10061->5624|10090->5625|10121->5628|10150->5629|10195->5646|10224->5647|10254->5649|10283->5650|10327->5665|10357->5666|10418->5698|10448->5699|10498->5720|10604->5797|10634->5798|10681->5816|10732->5838|10762->5839|10812->5860|11014->6033|11044->6034|11098->6059|11496->6428|11526->6429|11576->6450|11731->6576|11761->6577|11815->6602|11945->6703|11975->6704|12033->6733|12151->6822|12181->6823|12239->6852|12269->6853|12324->6879|12354->6880|12404->6901|12434->6902|12511->6950|12541->6951|12576->6957|12606->6958|12646->6969|12676->6970|12707->6972|12737->6973|13010->7217|13040->7218|13094->7243|13320->7440|13350->7441|13380->7442|13414->7447|13444->7448|13498->7473|13723->7669|13753->7670|13799->7687|13829->7688|13872->7702|13902->7703
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|66->35|66->35|66->35|67->36|69->38|69->38|70->39|74->43|74->43|75->44|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|82->51|82->51|83->52|87->56|87->56|88->57|88->57|90->59|90->59|90->59|91->60|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|97->66|97->66|98->67|99->68|99->68|99->68|99->68|100->69|101->70|101->70|102->71|102->71|103->72|104->73|104->73|105->74|105->74|105->74|106->75|110->79|110->79|111->80|112->81|112->81|113->82|113->82|113->82|114->83|115->84|115->84|116->85|117->86|117->86|118->87|119->88|119->88|119->88|119->88|120->89|120->89|121->90|121->90|122->91|122->91|122->91|122->91|123->92|123->92|124->93|124->93|124->93|124->93|124->93|126->95|126->95|129->98|129->98|130->99|130->99|130->99|130->99|130->99|130->99|130->99|130->99|130->99|130->99|130->99|130->99|130->99|131->100|131->100|132->101|134->103|134->103|136->105|136->105|136->105|137->106|139->108|139->108|140->109|144->113|144->113|145->114|147->116|147->116|148->117|150->119|150->119|151->120|152->121|152->121|152->121|152->121|153->122|153->122|154->123|154->123|155->124|155->124|155->124|155->124|155->124|155->124|155->124|155->124|159->128|159->128|160->129|163->132|163->132|163->132|163->132|163->132|164->133|167->136|167->136|168->137|168->137|170->139|170->139
                  -- GENERATED --
              */
          