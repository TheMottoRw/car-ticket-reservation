
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
                        driverValidation = obj.driver=="0"?"""),format.raw/*53.60*/("""{"""),format.raw/*53.61*/("""status:false,message:"You must select driver""""),format.raw/*53.106*/("""}"""),format.raw/*53.107*/(""":"""),format.raw/*53.108*/("""{"""),format.raw/*53.109*/("""status:true"""),format.raw/*53.120*/("""}"""),format.raw/*53.121*/(""",
                            busPlateNo = obj.bus_plate_no.length<4?"""),format.raw/*54.68*/("""{"""),format.raw/*54.69*/("""status:false,message:"Invalid bus plate number""""),format.raw/*54.116*/("""}"""),format.raw/*54.117*/(""":"""),format.raw/*54.118*/("""{"""),format.raw/*54.119*/("""status:true"""),format.raw/*54.130*/("""}"""),format.raw/*54.131*/(""",
                            departureValidation = obj.departure_date<new Date().getTime()/1000?"""),format.raw/*55.96*/("""{"""),format.raw/*55.97*/("""status:false,message:"Invalid departure time""""),format.raw/*55.142*/("""}"""),format.raw/*55.143*/(""":"""),format.raw/*55.144*/("""{"""),format.raw/*55.145*/("""status:true"""),format.raw/*55.156*/("""}"""),format.raw/*55.157*/(""";

                    if(!departureValidation.status)"""),format.raw/*57.52*/("""{"""),format.raw/*57.53*/("""
                        """),format.raw/*58.25*/("""elFail.innerHTML=departureValidation.message;
                    """),format.raw/*59.21*/("""}"""),format.raw/*59.22*/("""else if(!driverValidation.status)"""),format.raw/*59.55*/("""{"""),format.raw/*59.56*/("""
                        """),format.raw/*60.25*/("""elFail.innerHTML=driverValidation.message;
                    """),format.raw/*61.21*/("""}"""),format.raw/*61.22*/("""else if(!passengerLimitValidation.status)"""),format.raw/*61.63*/("""{"""),format.raw/*61.64*/("""
                        """),format.raw/*62.25*/("""elFail.innerHTML=passengerLimitValidation.message;
                    """),format.raw/*63.21*/("""}"""),format.raw/*63.22*/("""else
                    if(!busPlateNo.status) """),format.raw/*64.44*/("""{"""),format.raw/*64.45*/("""
                        """),format.raw/*65.25*/("""elFail.innerHTML = busPlateNo.message;
                    """),format.raw/*66.21*/("""}"""),format.raw/*66.22*/("""
                    """),format.raw/*67.21*/("""if(elFail.innerHTML!=="")"""),format.raw/*67.46*/("""{"""),format.raw/*67.47*/("""
                        """),format.raw/*68.25*/("""elFail.style.display ='block';
                        elSuccess.style.display ='none';
                        clearResponse();
                        return false;
                    """),format.raw/*72.21*/("""}"""),format.raw/*72.22*/("""
                    """),format.raw/*73.21*/("""return true;
                """),format.raw/*74.17*/("""}"""),format.raw/*74.18*/("""
                """),format.raw/*75.17*/("""async function loadDestinations() """),format.raw/*75.51*/("""{"""),format.raw/*75.52*/("""
                    """),format.raw/*76.21*/("""var options = "<option value='0'>Select destination</option>";
                    var requestOptions = """),format.raw/*77.42*/("""{"""),format.raw/*77.43*/("""
                        """),format.raw/*78.25*/("""method: 'GET',
                        headers: """),format.raw/*79.34*/("""{"""),format.raw/*79.35*/("""
                            """),format.raw/*80.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*81.54*/("""{"""),format.raw/*81.55*/("""localStorage.getItem("token")"""),format.raw/*81.84*/("""}"""),format.raw/*81.85*/("""`
                        """),format.raw/*82.25*/("""}"""),format.raw/*82.26*/("""
                    """),format.raw/*83.21*/("""}"""),format.raw/*83.22*/(""";
                    const data = await fetch(`$"""),format.raw/*84.48*/("""{"""),format.raw/*84.49*/("""apiUrl"""),format.raw/*84.55*/("""}"""),format.raw/*84.56*/("""/destinations`, requestOptions)
                            .then(response => """),format.raw/*85.47*/("""{"""),format.raw/*85.48*/("""
                                """),format.raw/*86.33*/("""if(response.status===401) """),format.raw/*86.59*/("""{"""),format.raw/*86.60*/("""localStorage.clear(); window.location='/login'"""),format.raw/*86.106*/("""}"""),format.raw/*86.107*/(""";
                                return response.json();
                            """),format.raw/*88.29*/("""}"""),format.raw/*88.30*/(""")
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    for(let i=0;i<data.length;i++)"""),format.raw/*91.51*/("""{"""),format.raw/*91.52*/("""
                        """),format.raw/*92.25*/("""options+=`<option value="$"""),format.raw/*92.51*/("""{"""),format.raw/*92.52*/("""data[i].id"""),format.raw/*92.62*/("""}"""),format.raw/*92.63*/("""">$"""),format.raw/*92.66*/("""{"""),format.raw/*92.67*/("""data[i].departure"""),format.raw/*92.84*/("""}"""),format.raw/*92.85*/("""-$"""),format.raw/*92.87*/("""{"""),format.raw/*92.88*/("""data[i].arrival"""),format.raw/*92.103*/("""}"""),format.raw/*92.104*/("""</option>`;
                    """),format.raw/*93.21*/("""}"""),format.raw/*93.22*/("""
                    """),format.raw/*94.21*/("""document.querySelector("#destination").innerHTML = options;

                """),format.raw/*96.17*/("""}"""),format.raw/*96.18*/("""
                """),format.raw/*97.17*/("""async function loadDrivers() """),format.raw/*97.46*/("""{"""),format.raw/*97.47*/("""
                    """),format.raw/*98.21*/("""var options = "<option value='0'>Select drivers</option>";
                    var requestOptions = """),format.raw/*99.42*/("""{"""),format.raw/*99.43*/("""
                        """),format.raw/*100.25*/("""method: 'GET',
                        headers: """),format.raw/*101.34*/("""{"""),format.raw/*101.35*/("""
                            """),format.raw/*102.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*103.54*/("""{"""),format.raw/*103.55*/("""localStorage.getItem("token")"""),format.raw/*103.84*/("""}"""),format.raw/*103.85*/("""`
                        """),format.raw/*104.25*/("""}"""),format.raw/*104.26*/("""
                    """),format.raw/*105.21*/("""}"""),format.raw/*105.22*/(""";
                    const data = await fetch(`$"""),format.raw/*106.48*/("""{"""),format.raw/*106.49*/("""apiUrl"""),format.raw/*106.55*/("""}"""),format.raw/*106.56*/("""/users/type?user_type=driver`, requestOptions)
                            .then(response => """),format.raw/*107.47*/("""{"""),format.raw/*107.48*/("""
                                """),format.raw/*108.33*/("""if(response.status===401) """),format.raw/*108.59*/("""{"""),format.raw/*108.60*/("""localStorage.clear(); window.location='/login'"""),format.raw/*108.106*/("""}"""),format.raw/*108.107*/(""";
                                return response.json();
                            """),format.raw/*110.29*/("""}"""),format.raw/*110.30*/(""")
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    for(let i=0;i<data.length;i++)"""),format.raw/*113.51*/("""{"""),format.raw/*113.52*/("""
                        """),format.raw/*114.25*/("""options+=`<option value="$"""),format.raw/*114.51*/("""{"""),format.raw/*114.52*/("""data[i].id"""),format.raw/*114.62*/("""}"""),format.raw/*114.63*/("""">$"""),format.raw/*114.66*/("""{"""),format.raw/*114.67*/("""data[i].name"""),format.raw/*114.79*/("""}"""),format.raw/*114.80*/(""" """),format.raw/*114.81*/("""($"""),format.raw/*114.83*/("""{"""),format.raw/*114.84*/("""data[i].phone"""),format.raw/*114.97*/("""}"""),format.raw/*114.98*/(""")</option>`;
                    """),format.raw/*115.21*/("""}"""),format.raw/*115.22*/("""
                    """),format.raw/*116.21*/("""document.querySelector("#driver").innerHTML = options;

                """),format.raw/*118.17*/("""}"""),format.raw/*118.18*/("""

                """),format.raw/*120.17*/("""async function save() """),format.raw/*120.39*/("""{"""),format.raw/*120.40*/("""
                    """),format.raw/*121.21*/("""const elFail = document.querySelector("#responseFail"),
                            elSuccess = document.querySelector("#responseSuccess");
                    const data = """),format.raw/*123.34*/("""{"""),format.raw/*123.35*/("""
                        """),format.raw/*124.25*/("""destination: document.querySelector("#destination").value,
                        driver: document.querySelector("#driver").value,
                        bus_plate_no: document.querySelector("#bus_plate_no").value,
                        passenger_limit: document.querySelector("#passenger_limit").value,
                        departure_date: new Date(document.querySelector("#departure_date").value).getTime()/1000,
                    """),format.raw/*129.21*/("""}"""),format.raw/*129.22*/("""
                    """),format.raw/*130.21*/("""console.log(validateForm(data));
                    if(!validateForm(data)) return;
                    var requestOptions = """),format.raw/*132.42*/("""{"""),format.raw/*132.43*/("""
                        """),format.raw/*133.25*/("""method: 'POST',
                        body: JSON.stringify(data),
                        headers: """),format.raw/*135.34*/("""{"""),format.raw/*135.35*/("""
                            """),format.raw/*136.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*137.54*/("""{"""),format.raw/*137.55*/("""localStorage.getItem("token")"""),format.raw/*137.84*/("""}"""),format.raw/*137.85*/("""`
                        """),format.raw/*138.25*/("""}"""),format.raw/*138.26*/("""
                    """),format.raw/*139.21*/("""}"""),format.raw/*139.22*/(""";
                    const res = await fetch(`$"""),format.raw/*140.47*/("""{"""),format.raw/*140.48*/("""apiUrl"""),format.raw/*140.54*/("""}"""),format.raw/*140.55*/("""/schedule`, requestOptions)
                            .then(response => response.json())
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    if (res.status) """),format.raw/*144.37*/("""{"""),format.raw/*144.38*/("""
                        """),format.raw/*145.25*/("""elSuccess.setAttribute("style","display:block");
                        elFail.setAttribute("style","display:none");
                        elSuccess.innerHTML = res.message;
                        document.querySelector("#bus_plate_no").value="";
                        document.querySelector("#passenger_limit").value="";
                        document.querySelector("#departure_date").value="";
                    """),format.raw/*151.21*/("""}"""),format.raw/*151.22*/(""" """),format.raw/*151.23*/("""else """),format.raw/*151.28*/("""{"""),format.raw/*151.29*/("""
                        """),format.raw/*152.25*/("""elFail.setAttribute("style", "display:block");
                        elSuccess.setAttribute("style", "display:none");
                        elFail.innerHTML = res.message;
                    """),format.raw/*155.21*/("""}"""),format.raw/*155.22*/("""
                """),format.raw/*156.17*/("""}"""),format.raw/*156.18*/("""

            """),format.raw/*158.13*/("""}"""),format.raw/*158.14*/(""")
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
                  HASH: f13b069dead32c1df9dc5c4e24e52a745c2004d9
                  MATRIX: 995->1|1008->7|1040->31|1076->59|1115->61|1146->66|3529->2422|3545->2429|3575->2438|3607->2443|3722->2530|3751->2531|3796->2548|3938->2662|3967->2663|4016->2684|4068->2708|4097->2709|4142->2726|4196->2752|4225->2753|4274->2774|4549->3020|4579->3021|4653->3066|4683->3067|4713->3068|4743->3069|4783->3080|4813->3081|4902->3142|4931->3143|5005->3188|5035->3189|5065->3190|5095->3191|5135->3202|5165->3203|5262->3272|5291->3273|5367->3320|5397->3321|5427->3322|5457->3323|5497->3334|5527->3335|5652->3432|5681->3433|5755->3478|5785->3479|5815->3480|5845->3481|5885->3492|5915->3493|5997->3547|6026->3548|6079->3573|6173->3639|6202->3640|6263->3673|6292->3674|6345->3699|6436->3762|6465->3763|6534->3804|6563->3805|6616->3830|6715->3901|6744->3902|6820->3950|6849->3951|6902->3976|6989->4035|7018->4036|7067->4057|7120->4082|7149->4083|7202->4108|7417->4295|7446->4296|7495->4317|7552->4346|7581->4347|7626->4364|7688->4398|7717->4399|7766->4420|7898->4524|7927->4525|7980->4550|8056->4598|8085->4599|8142->4628|8259->4717|8288->4718|8345->4747|8374->4748|8428->4774|8457->4775|8506->4796|8535->4797|8612->4846|8641->4847|8675->4853|8704->4854|8810->4932|8839->4933|8900->4966|8954->4992|8983->4993|9058->5039|9088->5040|9202->5126|9231->5127|9437->5305|9466->5306|9519->5331|9573->5357|9602->5358|9640->5368|9669->5369|9700->5372|9729->5373|9774->5390|9803->5391|9833->5393|9862->5394|9906->5409|9936->5410|9996->5442|10025->5443|10074->5464|10179->5541|10208->5542|10253->5559|10310->5588|10339->5589|10388->5610|10516->5710|10545->5711|10599->5736|10676->5784|10706->5785|10764->5814|10882->5903|10912->5904|10970->5933|11000->5934|11055->5960|11085->5961|11135->5982|11165->5983|11243->6032|11273->6033|11308->6039|11338->6040|11460->6133|11490->6134|11552->6167|11607->6193|11637->6194|11713->6240|11744->6241|11859->6327|11889->6328|12096->6506|12126->6507|12180->6532|12235->6558|12265->6559|12304->6569|12334->6570|12366->6573|12396->6574|12437->6586|12467->6587|12497->6588|12528->6590|12558->6591|12600->6604|12630->6605|12692->6638|12722->6639|12772->6660|12873->6732|12903->6733|12950->6751|13001->6773|13031->6774|13081->6795|13283->6968|13313->6969|13367->6994|13838->7436|13868->7437|13918->7458|14073->7584|14103->7585|14157->7610|14287->7711|14317->7712|14375->7741|14493->7830|14523->7831|14581->7860|14611->7861|14666->7887|14696->7888|14746->7909|14776->7910|14853->7958|14883->7959|14918->7965|14948->7966|15230->8219|15260->8220|15314->8245|15767->8669|15797->8670|15827->8671|15861->8676|15891->8677|15945->8702|16170->8898|16200->8899|16246->8916|16276->8917|16319->8931|16349->8932
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|71->40|71->40|71->40|72->41|74->43|74->43|75->44|77->46|77->46|78->47|79->48|79->48|80->49|80->49|80->49|81->50|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|84->53|84->53|85->54|85->54|85->54|85->54|85->54|85->54|85->54|85->54|86->55|86->55|86->55|86->55|86->55|86->55|86->55|86->55|88->57|88->57|89->58|90->59|90->59|90->59|90->59|91->60|92->61|92->61|92->61|92->61|93->62|94->63|94->63|95->64|95->64|96->65|97->66|97->66|98->67|98->67|98->67|99->68|103->72|103->72|104->73|105->74|105->74|106->75|106->75|106->75|107->76|108->77|108->77|109->78|110->79|110->79|111->80|112->81|112->81|112->81|112->81|113->82|113->82|114->83|114->83|115->84|115->84|115->84|115->84|116->85|116->85|117->86|117->86|117->86|117->86|117->86|119->88|119->88|122->91|122->91|123->92|123->92|123->92|123->92|123->92|123->92|123->92|123->92|123->92|123->92|123->92|123->92|123->92|124->93|124->93|125->94|127->96|127->96|128->97|128->97|128->97|129->98|130->99|130->99|131->100|132->101|132->101|133->102|134->103|134->103|134->103|134->103|135->104|135->104|136->105|136->105|137->106|137->106|137->106|137->106|138->107|138->107|139->108|139->108|139->108|139->108|139->108|141->110|141->110|144->113|144->113|145->114|145->114|145->114|145->114|145->114|145->114|145->114|145->114|145->114|145->114|145->114|145->114|145->114|145->114|146->115|146->115|147->116|149->118|149->118|151->120|151->120|151->120|152->121|154->123|154->123|155->124|160->129|160->129|161->130|163->132|163->132|164->133|166->135|166->135|167->136|168->137|168->137|168->137|168->137|169->138|169->138|170->139|170->139|171->140|171->140|171->140|171->140|175->144|175->144|176->145|182->151|182->151|182->151|182->151|182->151|183->152|186->155|186->155|187->156|187->156|189->158|189->158
                  -- GENERATED --
              */
          