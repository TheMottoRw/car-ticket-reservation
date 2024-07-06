
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
        """),_display_(/*35.10*/commons/*35.17*/.footer()),format.raw/*35.26*/("""
    """),format.raw/*36.5*/("""</div>
    <script>
            window.addEventListener("DOMContentLoaded",function () """),format.raw/*38.68*/("""{"""),format.raw/*38.69*/("""
                """),format.raw/*39.17*/("""loadDestinations();
                document.querySelector("#btnSave").onclick=()=>"""),format.raw/*40.64*/("""{"""),format.raw/*40.65*/("""
                    """),format.raw/*41.21*/("""save();
                """),format.raw/*42.17*/("""}"""),format.raw/*42.18*/("""
                """),format.raw/*43.17*/("""function validateForm(obj)"""),format.raw/*43.43*/("""{"""),format.raw/*43.44*/("""
                    """),format.raw/*44.21*/("""const elFail = document.querySelector("#responseFail"),
                            elSuccess = document.querySelector("#responseSuccess");
                    const passengerLimitValidation = isNaN(obj.passenger_limit) || obj.passenger_limit<=0?"""),format.raw/*46.107*/("""{"""),format.raw/*46.108*/("""status:false,message:"Invalid passenger lmit""""),format.raw/*46.153*/("""}"""),format.raw/*46.154*/(""":"""),format.raw/*46.155*/("""{"""),format.raw/*46.156*/("""status:true"""),format.raw/*46.167*/("""}"""),format.raw/*46.168*/(""",
                            busPlateNo = obj.bus_plate_no.length<4?"""),format.raw/*47.68*/("""{"""),format.raw/*47.69*/("""status:false,message:"Invalid bus plate numer location""""),format.raw/*47.124*/("""}"""),format.raw/*47.125*/(""":"""),format.raw/*47.126*/("""{"""),format.raw/*47.127*/("""status:true"""),format.raw/*47.138*/("""}"""),format.raw/*47.139*/(""",
                            departureValidation = obj.departure_date<new Date().getTime()/1000?"""),format.raw/*48.96*/("""{"""),format.raw/*48.97*/("""status:false,message:"Invalid departure time""""),format.raw/*48.142*/("""}"""),format.raw/*48.143*/(""":"""),format.raw/*48.144*/("""{"""),format.raw/*48.145*/("""status:true"""),format.raw/*48.156*/("""}"""),format.raw/*48.157*/(""";

                    if(!departureValidation.status)"""),format.raw/*50.52*/("""{"""),format.raw/*50.53*/("""
                        """),format.raw/*51.25*/("""elFail.innerHTML=departureValidation.message;
                    """),format.raw/*52.21*/("""}"""),format.raw/*52.22*/("""else if(!passengerLimitValidation.status)"""),format.raw/*52.63*/("""{"""),format.raw/*52.64*/("""
                        """),format.raw/*53.25*/("""elFail.innerHTML=passengerLimitValidation.message;
                    """),format.raw/*54.21*/("""}"""),format.raw/*54.22*/("""else
                    if(!busPlateNo.status) """),format.raw/*55.44*/("""{"""),format.raw/*55.45*/("""
                        """),format.raw/*56.25*/("""elFail.innerHTML = busPlateNo.message;
                    """),format.raw/*57.21*/("""}"""),format.raw/*57.22*/("""
                    """),format.raw/*58.21*/("""if(elFail.innerHTML!=="")"""),format.raw/*58.46*/("""{"""),format.raw/*58.47*/("""
                        """),format.raw/*59.25*/("""elFail.style.display ='block';
                        elSuccess.style.display ='none';
                        clearResponse();
                        return false;
                    """),format.raw/*63.21*/("""}"""),format.raw/*63.22*/("""
                    """),format.raw/*64.21*/("""return true;
                """),format.raw/*65.17*/("""}"""),format.raw/*65.18*/("""
                """),format.raw/*66.17*/("""async function loadDestinations() """),format.raw/*66.51*/("""{"""),format.raw/*66.52*/("""
                    """),format.raw/*67.21*/("""var options = "<option value='0'>Select destination</option>";
                    var requestOptions = """),format.raw/*68.42*/("""{"""),format.raw/*68.43*/("""
                        """),format.raw/*69.25*/("""method: 'GET',
                        headers: """),format.raw/*70.34*/("""{"""),format.raw/*70.35*/("""
                            """),format.raw/*71.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*72.54*/("""{"""),format.raw/*72.55*/("""localStorage.getItem("token")"""),format.raw/*72.84*/("""}"""),format.raw/*72.85*/("""`
                        """),format.raw/*73.25*/("""}"""),format.raw/*73.26*/("""
                    """),format.raw/*74.21*/("""}"""),format.raw/*74.22*/(""";
                    const data = await fetch(`$"""),format.raw/*75.48*/("""{"""),format.raw/*75.49*/("""apiUrl"""),format.raw/*75.55*/("""}"""),format.raw/*75.56*/("""/destinations`, requestOptions)
                            .then(response => """),format.raw/*76.47*/("""{"""),format.raw/*76.48*/("""
                                """),format.raw/*77.33*/("""if(response.status===401) """),format.raw/*77.59*/("""{"""),format.raw/*77.60*/("""localStorage.clear(); window.location='/login'"""),format.raw/*77.106*/("""}"""),format.raw/*77.107*/(""";
                                return response.json();
                            """),format.raw/*79.29*/("""}"""),format.raw/*79.30*/(""")
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    for(let i=0;i<data.length;i++)"""),format.raw/*82.51*/("""{"""),format.raw/*82.52*/("""
                        """),format.raw/*83.25*/("""options+=`<option value="$"""),format.raw/*83.51*/("""{"""),format.raw/*83.52*/("""data[i].id"""),format.raw/*83.62*/("""}"""),format.raw/*83.63*/("""">$"""),format.raw/*83.66*/("""{"""),format.raw/*83.67*/("""data[i].departure"""),format.raw/*83.84*/("""}"""),format.raw/*83.85*/("""-$"""),format.raw/*83.87*/("""{"""),format.raw/*83.88*/("""data[i].arrival"""),format.raw/*83.103*/("""}"""),format.raw/*83.104*/("""</option>`;
                    """),format.raw/*84.21*/("""}"""),format.raw/*84.22*/("""
                    """),format.raw/*85.21*/("""document.querySelector("#destination").innerHTML = options;

                """),format.raw/*87.17*/("""}"""),format.raw/*87.18*/("""

                """),format.raw/*89.17*/("""async function save() """),format.raw/*89.39*/("""{"""),format.raw/*89.40*/("""
                    """),format.raw/*90.21*/("""const elFail = document.querySelector("#responseFail"),
                            elSuccess = document.querySelector("#responseSuccess");
                    const data = """),format.raw/*92.34*/("""{"""),format.raw/*92.35*/("""
                        """),format.raw/*93.25*/("""destination: document.querySelector("#destination").value,
                        bus_plate_no: document.querySelector("#bus_plate_no").value,
                        passenger_limit: document.querySelector("#passenger_limit").value,
                        departure_date: new Date(document.querySelector("#departure_date").value).getTime()/1000,
                    """),format.raw/*97.21*/("""}"""),format.raw/*97.22*/("""
                    """),format.raw/*98.21*/("""console.log(validateForm(data));
                    if(!validateForm(data)) return;
                    var requestOptions = """),format.raw/*100.42*/("""{"""),format.raw/*100.43*/("""
                        """),format.raw/*101.25*/("""method: 'POST',
                        body: JSON.stringify(data),
                        headers: """),format.raw/*103.34*/("""{"""),format.raw/*103.35*/("""
                            """),format.raw/*104.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*105.54*/("""{"""),format.raw/*105.55*/("""localStorage.getItem("token")"""),format.raw/*105.84*/("""}"""),format.raw/*105.85*/("""`
                        """),format.raw/*106.25*/("""}"""),format.raw/*106.26*/("""
                    """),format.raw/*107.21*/("""}"""),format.raw/*107.22*/(""";
                    const res = await fetch(`$"""),format.raw/*108.47*/("""{"""),format.raw/*108.48*/("""apiUrl"""),format.raw/*108.54*/("""}"""),format.raw/*108.55*/("""/schedule`, requestOptions)
                            .then(response => response.json())
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    if (res.status) """),format.raw/*112.37*/("""{"""),format.raw/*112.38*/("""
                        """),format.raw/*113.25*/("""elSuccess.setAttribute("style","display:block");
                        elFail.setAttribute("style","display:none");
                        elSuccess.innerHTML = res.message;
                        document.querySelector("#bus_plate_no").value="";
                        document.querySelector("#passenger_limit").value="";
                        document.querySelector("#departure_date").value="";
                    """),format.raw/*119.21*/("""}"""),format.raw/*119.22*/(""" """),format.raw/*119.23*/("""else """),format.raw/*119.28*/("""{"""),format.raw/*119.29*/("""
                        """),format.raw/*120.25*/("""elFail.setAttribute("style", "display:block");
                        elSuccess.setAttribute("style", "display:none");
                        elFail.innerHTML = res.message;
                    """),format.raw/*123.21*/("""}"""),format.raw/*123.22*/("""
                """),format.raw/*124.17*/("""}"""),format.raw/*124.18*/("""

            """),format.raw/*126.13*/("""}"""),format.raw/*126.14*/(""")
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
                  HASH: 66431d9170062da90bc621700d67077d8e295253
                  MATRIX: 995->1|1008->7|1040->31|1076->59|1115->61|1146->66|3212->2105|3228->2112|3258->2121|3290->2126|3405->2213|3434->2214|3479->2231|3590->2314|3619->2315|3668->2336|3720->2360|3749->2361|3794->2378|3848->2404|3877->2405|3926->2426|4201->2672|4231->2673|4305->2718|4335->2719|4365->2720|4395->2721|4435->2732|4465->2733|4562->2802|4591->2803|4675->2858|4705->2859|4735->2860|4765->2861|4805->2872|4835->2873|4960->2970|4989->2971|5063->3016|5093->3017|5123->3018|5153->3019|5193->3030|5223->3031|5305->3085|5334->3086|5387->3111|5481->3177|5510->3178|5579->3219|5608->3220|5661->3245|5760->3316|5789->3317|5865->3365|5894->3366|5947->3391|6034->3450|6063->3451|6112->3472|6165->3497|6194->3498|6247->3523|6462->3710|6491->3711|6540->3732|6597->3761|6626->3762|6671->3779|6733->3813|6762->3814|6811->3835|6943->3939|6972->3940|7025->3965|7101->4013|7130->4014|7187->4043|7304->4132|7333->4133|7390->4162|7419->4163|7473->4189|7502->4190|7551->4211|7580->4212|7657->4261|7686->4262|7720->4268|7749->4269|7855->4347|7884->4348|7945->4381|7999->4407|8028->4408|8103->4454|8133->4455|8247->4541|8276->4542|8482->4720|8511->4721|8564->4746|8618->4772|8647->4773|8685->4783|8714->4784|8745->4787|8774->4788|8819->4805|8848->4806|8878->4808|8907->4809|8951->4824|8981->4825|9041->4857|9070->4858|9119->4879|9224->4956|9253->4957|9299->4975|9349->4997|9378->4998|9427->5019|9628->5192|9657->5193|9710->5218|10107->5587|10136->5588|10185->5609|10340->5735|10370->5736|10424->5761|10554->5862|10584->5863|10642->5892|10760->5981|10790->5982|10848->6011|10878->6012|10933->6038|10963->6039|11013->6060|11043->6061|11120->6109|11150->6110|11185->6116|11215->6117|11497->6370|11527->6371|11581->6396|12034->6820|12064->6821|12094->6822|12128->6827|12158->6828|12212->6853|12437->7049|12467->7050|12513->7067|12543->7068|12586->7082|12616->7083
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|66->35|66->35|66->35|67->36|69->38|69->38|70->39|71->40|71->40|72->41|73->42|73->42|74->43|74->43|74->43|75->44|77->46|77->46|77->46|77->46|77->46|77->46|77->46|77->46|78->47|78->47|78->47|78->47|78->47|78->47|78->47|78->47|79->48|79->48|79->48|79->48|79->48|79->48|79->48|79->48|81->50|81->50|82->51|83->52|83->52|83->52|83->52|84->53|85->54|85->54|86->55|86->55|87->56|88->57|88->57|89->58|89->58|89->58|90->59|94->63|94->63|95->64|96->65|96->65|97->66|97->66|97->66|98->67|99->68|99->68|100->69|101->70|101->70|102->71|103->72|103->72|103->72|103->72|104->73|104->73|105->74|105->74|106->75|106->75|106->75|106->75|107->76|107->76|108->77|108->77|108->77|108->77|108->77|110->79|110->79|113->82|113->82|114->83|114->83|114->83|114->83|114->83|114->83|114->83|114->83|114->83|114->83|114->83|114->83|114->83|115->84|115->84|116->85|118->87|118->87|120->89|120->89|120->89|121->90|123->92|123->92|124->93|128->97|128->97|129->98|131->100|131->100|132->101|134->103|134->103|135->104|136->105|136->105|136->105|136->105|137->106|137->106|138->107|138->107|139->108|139->108|139->108|139->108|143->112|143->112|144->113|150->119|150->119|150->119|150->119|150->119|151->120|154->123|154->123|155->124|155->124|157->126|157->126
                  -- GENERATED --
              */
          