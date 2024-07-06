
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

object stationUpdate extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/layout/*1.8*/.main("Update station")/*1.31*/("Update station")/*1.49*/ {_display_(Seq[Any](format.raw/*1.51*/("""
    """),format.raw/*2.5*/("""<div class="container-fluid py-4">
        <div class="row">
            <div class="col-6 offset-3">
                <div class="card z-index-0">
                    <div class="card-header text-center pt-4">
                        <h5>Update station</h5>
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
                                <button type="button" class="btn bg-gradient-dark w-100 my-4 mb-2" id="btnUpdate">Update</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        """),_display_(/*34.10*/commons/*34.17*/.footer()),format.raw/*34.26*/("""
    """),format.raw/*35.5*/("""</div>
    <script>
            window.addEventListener("DOMContentLoaded", function () """),format.raw/*37.69*/("""{"""),format.raw/*37.70*/("""
                """),format.raw/*38.17*/("""const urlArr = getUrlParams();
                const id = urlArr[urlArr.length - 1];
                loadDestinations();
                loadById();
                document.querySelector("#btnUpdate").onclick = () => """),format.raw/*42.70*/("""{"""),format.raw/*42.71*/("""
                    """),format.raw/*43.21*/("""event.preventDefault();
                    console.log("Button clicked");
                    save();
                """),format.raw/*46.17*/("""}"""),format.raw/*46.18*/("""

                """),format.raw/*48.17*/("""function validateForm(obj)"""),format.raw/*48.43*/("""{"""),format.raw/*48.44*/("""
                    """),format.raw/*49.21*/("""const elFail = document.querySelector("#responseFail"),
                            elSuccess = document.querySelector("#responseSuccess");
                    const nameValidation = obj.name.length<2?"""),format.raw/*51.62*/("""{"""),format.raw/*51.63*/("""status:false,message:"Invalid station name""""),format.raw/*51.106*/("""}"""),format.raw/*51.107*/(""":"""),format.raw/*51.108*/("""{"""),format.raw/*51.109*/("""status:true"""),format.raw/*51.120*/("""}"""),format.raw/*51.121*/(""",
                            destinationValidation = obj.destination.length<=0?"""),format.raw/*52.79*/("""{"""),format.raw/*52.80*/("""status:false,message:"Select destination is mandatory""""),format.raw/*52.134*/("""}"""),format.raw/*52.135*/(""":"""),format.raw/*52.136*/("""{"""),format.raw/*52.137*/("""status:true"""),format.raw/*52.148*/("""}"""),format.raw/*52.149*/(""";

                    if(!nameValidation.status)"""),format.raw/*54.47*/("""{"""),format.raw/*54.48*/("""
                        """),format.raw/*55.25*/("""elFail.innerHTML=nameValidation.message;
                    """),format.raw/*56.21*/("""}"""),format.raw/*56.22*/("""else if(!destinationValidation.status)"""),format.raw/*56.60*/("""{"""),format.raw/*56.61*/("""
                        """),format.raw/*57.25*/("""elFail.innerHTML=destinationValidation.message;
                    """),format.raw/*58.21*/("""}"""),format.raw/*58.22*/("""
                    """),format.raw/*59.21*/("""if(elFail.innerHTML!=="")"""),format.raw/*59.46*/("""{"""),format.raw/*59.47*/("""
                        """),format.raw/*60.25*/("""elFail.style.display ='block';
                        elSuccess.style.display ='none';
                        clearResponse();
                        return false;
                    """),format.raw/*64.21*/("""}"""),format.raw/*64.22*/("""
                    """),format.raw/*65.21*/("""return true;
                """),format.raw/*66.17*/("""}"""),format.raw/*66.18*/("""

                """),format.raw/*68.17*/("""async function loadById() """),format.raw/*68.43*/("""{"""),format.raw/*68.44*/("""
                    """),format.raw/*69.21*/("""const res = await fetch(`$"""),format.raw/*69.47*/("""{"""),format.raw/*69.48*/("""apiUrl"""),format.raw/*69.54*/("""}"""),format.raw/*69.55*/("""/station/$"""),format.raw/*69.65*/("""{"""),format.raw/*69.66*/("""id"""),format.raw/*69.68*/("""}"""),format.raw/*69.69*/("""`)
                            .then(response => response.json())
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    if (!res.error) """),format.raw/*73.37*/("""{"""),format.raw/*73.38*/("""
                        """),format.raw/*74.25*/("""let obj = res;
                        document.querySelector("#name").value = obj.name;
                    """),format.raw/*76.21*/("""}"""),format.raw/*76.22*/("""
                """),format.raw/*77.17*/("""}"""),format.raw/*77.18*/("""

                """),format.raw/*79.17*/("""document.querySelector("#destination").onchange=()=>"""),format.raw/*79.69*/("""{"""),format.raw/*79.70*/("""
                    """),format.raw/*80.21*/("""loadStations(document.querySelector("#destination").value);
                """),format.raw/*81.17*/("""}"""),format.raw/*81.18*/("""
                """),format.raw/*82.17*/("""document.querySelector("#btnSave").onclick=()=>"""),format.raw/*82.64*/("""{"""),format.raw/*82.65*/("""
                    """),format.raw/*83.21*/("""save();
                """),format.raw/*84.17*/("""}"""),format.raw/*84.18*/("""
                """),format.raw/*85.17*/("""async function loadDestinations() """),format.raw/*85.51*/("""{"""),format.raw/*85.52*/("""
                    """),format.raw/*86.21*/("""var options = "<option value='0'>Select destination</option>";
                    var requestOptions = """),format.raw/*87.42*/("""{"""),format.raw/*87.43*/("""
                        """),format.raw/*88.25*/("""method: 'GET',
                        headers: """),format.raw/*89.34*/("""{"""),format.raw/*89.35*/("""
                            """),format.raw/*90.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*91.54*/("""{"""),format.raw/*91.55*/("""localStorage.getItem("token")"""),format.raw/*91.84*/("""}"""),format.raw/*91.85*/("""`
                        """),format.raw/*92.25*/("""}"""),format.raw/*92.26*/("""
                    """),format.raw/*93.21*/("""}"""),format.raw/*93.22*/(""";
                    const data = await fetch(`$"""),format.raw/*94.48*/("""{"""),format.raw/*94.49*/("""apiUrl"""),format.raw/*94.55*/("""}"""),format.raw/*94.56*/("""/destinations`, requestOptions)
                            .then(response => """),format.raw/*95.47*/("""{"""),format.raw/*95.48*/("""
                                """),format.raw/*96.33*/("""if(response.status===401) """),format.raw/*96.59*/("""{"""),format.raw/*96.60*/("""localStorage.clear(); window.location='/login'"""),format.raw/*96.106*/("""}"""),format.raw/*96.107*/(""";
                                return response.json();
                            """),format.raw/*98.29*/("""}"""),format.raw/*98.30*/(""")
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    for(let i=0;i<data.length;i++)"""),format.raw/*101.51*/("""{"""),format.raw/*101.52*/("""
                        """),format.raw/*102.25*/("""options+=`<option value="$"""),format.raw/*102.51*/("""{"""),format.raw/*102.52*/("""data[i].id"""),format.raw/*102.62*/("""}"""),format.raw/*102.63*/("""">$"""),format.raw/*102.66*/("""{"""),format.raw/*102.67*/("""data[i].departure"""),format.raw/*102.84*/("""}"""),format.raw/*102.85*/("""-$"""),format.raw/*102.87*/("""{"""),format.raw/*102.88*/("""data[i].arrival"""),format.raw/*102.103*/("""}"""),format.raw/*102.104*/("""</option>`;
                    """),format.raw/*103.21*/("""}"""),format.raw/*103.22*/("""
                    """),format.raw/*104.21*/("""document.querySelector("#destination").innerHTML = options;

                """),format.raw/*106.17*/("""}"""),format.raw/*106.18*/("""
                """),format.raw/*107.17*/("""async function loadStations(destinationId) """),format.raw/*107.60*/("""{"""),format.raw/*107.61*/("""
                    """),format.raw/*108.21*/("""var options = "<option value='0'>Select previous station</option>";
                    var requestOptions = """),format.raw/*109.42*/("""{"""),format.raw/*109.43*/("""
                        """),format.raw/*110.25*/("""method: 'GET',
                        headers: """),format.raw/*111.34*/("""{"""),format.raw/*111.35*/("""
                            """),format.raw/*112.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*113.54*/("""{"""),format.raw/*113.55*/("""localStorage.getItem("token")"""),format.raw/*113.84*/("""}"""),format.raw/*113.85*/("""`
                        """),format.raw/*114.25*/("""}"""),format.raw/*114.26*/("""
                    """),format.raw/*115.21*/("""}"""),format.raw/*115.22*/(""";
                    const data = await fetch(`$"""),format.raw/*116.48*/("""{"""),format.raw/*116.49*/("""apiUrl"""),format.raw/*116.55*/("""}"""),format.raw/*116.56*/("""/destination/$"""),format.raw/*116.70*/("""{"""),format.raw/*116.71*/("""destinationId"""),format.raw/*116.84*/("""}"""),format.raw/*116.85*/("""/stations`, requestOptions)
                            .then(response => response.json())
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    for(let i=0;i<data.length;i++)"""),format.raw/*120.51*/("""{"""),format.raw/*120.52*/("""
                        """),format.raw/*121.25*/("""options+=`<option value="$"""),format.raw/*121.51*/("""{"""),format.raw/*121.52*/("""data[i].id"""),format.raw/*121.62*/("""}"""),format.raw/*121.63*/("""">$"""),format.raw/*121.66*/("""{"""),format.raw/*121.67*/("""data[i].name"""),format.raw/*121.79*/("""}"""),format.raw/*121.80*/("""</option>`;
                    """),format.raw/*122.21*/("""}"""),format.raw/*122.22*/("""
                    """),format.raw/*123.21*/("""document.querySelector("#previous").innerHTML = options;
                """),format.raw/*124.17*/("""}"""),format.raw/*124.18*/("""
                """),format.raw/*125.17*/("""async function save() """),format.raw/*125.39*/("""{"""),format.raw/*125.40*/("""
                    """),format.raw/*126.21*/("""const elFail = document.querySelector("#responseFail"),
                            elSuccess = document.querySelector("#responseSuccess");
                    const data = """),format.raw/*128.34*/("""{"""),format.raw/*128.35*/("""
                        """),format.raw/*129.25*/("""destination: document.querySelector("#destination").value,
                        name: document.querySelector("#name").value,
                    """),format.raw/*131.21*/("""}"""),format.raw/*131.22*/("""
                    """),format.raw/*132.21*/("""if(document.querySelector("#previous")!=='0')"""),format.raw/*132.66*/("""{"""),format.raw/*132.67*/("""
                        """),format.raw/*133.25*/("""data.previous = document.querySelector("#previous").value;
                    """),format.raw/*134.21*/("""}"""),format.raw/*134.22*/("""
                    """),format.raw/*135.21*/("""if(!validateForm(data)) return;
                    var requestOptions = """),format.raw/*136.42*/("""{"""),format.raw/*136.43*/("""
                        """),format.raw/*137.25*/("""method: 'POST',
                        body: JSON.stringify(data),
                        headers: """),format.raw/*139.34*/("""{"""),format.raw/*139.35*/("""
                            """),format.raw/*140.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*141.54*/("""{"""),format.raw/*141.55*/("""localStorage.getItem("token")"""),format.raw/*141.84*/("""}"""),format.raw/*141.85*/("""`
                        """),format.raw/*142.25*/("""}"""),format.raw/*142.26*/("""
                    """),format.raw/*143.21*/("""}"""),format.raw/*143.22*/(""";
                    const res = await fetch(`$"""),format.raw/*144.47*/("""{"""),format.raw/*144.48*/("""apiUrl"""),format.raw/*144.54*/("""}"""),format.raw/*144.55*/("""/station/$"""),format.raw/*144.65*/("""{"""),format.raw/*144.66*/("""id"""),format.raw/*144.68*/("""}"""),format.raw/*144.69*/("""`, requestOptions)
                            .then(response => response.json())
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    if (res.status) """),format.raw/*148.37*/("""{"""),format.raw/*148.38*/("""
                        """),format.raw/*149.25*/("""elSuccess.setAttribute("style","display:block");
                        elFail.setAttribute("style","display:none");
                        elSuccess.innerHTML = res.message;
                        document.querySelector("#name").value="";
                    """),format.raw/*153.21*/("""}"""),format.raw/*153.22*/(""" """),format.raw/*153.23*/("""else """),format.raw/*153.28*/("""{"""),format.raw/*153.29*/("""
                        """),format.raw/*154.25*/("""elFail.setAttribute("style", "display:block");
                        elSuccess.setAttribute("style", "display:none");
                        elFail.innerHTML = res.message;
                    """),format.raw/*157.21*/("""}"""),format.raw/*157.22*/("""
                """),format.raw/*158.17*/("""}"""),format.raw/*158.18*/("""
            """),format.raw/*159.13*/("""}"""),format.raw/*159.14*/(""")
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
                  SOURCE: app/views/stationUpdate.scala.html
                  HASH: c5a0a5a5eb48e3b885282763d28f7b3eefcf46bc
                  MATRIX: 997->1|1010->7|1041->30|1067->48|1106->50|1137->55|3002->1893|3018->1900|3048->1909|3080->1914|3196->2002|3225->2003|3270->2020|3516->2238|3545->2239|3594->2260|3741->2379|3770->2380|3816->2398|3870->2424|3899->2425|3948->2446|4177->2647|4206->2648|4278->2691|4308->2692|4338->2693|4368->2694|4408->2705|4438->2706|4546->2786|4575->2787|4658->2841|4688->2842|4718->2843|4748->2844|4788->2855|4818->2856|4895->2905|4924->2906|4977->2931|5066->2992|5095->2993|5161->3031|5190->3032|5243->3057|5339->3125|5368->3126|5417->3147|5470->3172|5499->3173|5552->3198|5767->3385|5796->3386|5845->3407|5902->3436|5931->3437|5977->3455|6031->3481|6060->3482|6109->3503|6163->3529|6192->3530|6226->3536|6255->3537|6293->3547|6322->3548|6352->3550|6381->3551|6637->3779|6666->3780|6719->3805|6856->3914|6885->3915|6930->3932|6959->3933|7005->3951|7085->4003|7114->4004|7163->4025|7267->4101|7296->4102|7341->4119|7416->4166|7445->4167|7494->4188|7546->4212|7575->4213|7620->4230|7682->4264|7711->4265|7760->4286|7892->4390|7921->4391|7974->4416|8050->4464|8079->4465|8136->4494|8253->4583|8282->4584|8339->4613|8368->4614|8422->4640|8451->4641|8500->4662|8529->4663|8606->4712|8635->4713|8669->4719|8698->4720|8804->4798|8833->4799|8894->4832|8948->4858|8977->4859|9052->4905|9082->4906|9196->4992|9225->4993|9432->5171|9462->5172|9516->5197|9571->5223|9601->5224|9640->5234|9670->5235|9702->5238|9732->5239|9778->5256|9808->5257|9839->5259|9869->5260|9914->5275|9945->5276|10006->5308|10036->5309|10086->5330|10192->5407|10222->5408|10268->5425|10340->5468|10370->5469|10420->5490|10558->5599|10588->5600|10642->5625|10719->5673|10749->5674|10807->5703|10925->5792|10955->5793|11013->5822|11043->5823|11098->5849|11128->5850|11178->5871|11208->5872|11286->5921|11316->5922|11351->5928|11381->5929|11424->5943|11454->5944|11496->5957|11526->5958|11822->6225|11852->6226|11906->6251|11961->6277|11991->6278|12030->6288|12060->6289|12092->6292|12122->6293|12163->6305|12193->6306|12254->6338|12284->6339|12334->6360|12436->6433|12466->6434|12512->6451|12563->6473|12593->6474|12643->6495|12845->6668|12875->6669|12929->6694|13106->6842|13136->6843|13186->6864|13260->6909|13290->6910|13344->6935|13452->7014|13482->7015|13532->7036|13634->7109|13664->7110|13718->7135|13848->7236|13878->7237|13936->7266|14054->7355|14084->7356|14142->7385|14172->7386|14227->7412|14257->7413|14307->7434|14337->7435|14414->7483|14444->7484|14479->7490|14509->7491|14548->7501|14578->7502|14609->7504|14639->7505|14912->7749|14942->7750|14996->7775|15288->8038|15318->8039|15348->8040|15382->8045|15412->8046|15466->8071|15691->8267|15721->8268|15767->8285|15797->8286|15839->8299|15869->8300
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|65->34|65->34|65->34|66->35|68->37|68->37|69->38|73->42|73->42|74->43|77->46|77->46|79->48|79->48|79->48|80->49|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|85->54|85->54|86->55|87->56|87->56|87->56|87->56|88->57|89->58|89->58|90->59|90->59|90->59|91->60|95->64|95->64|96->65|97->66|97->66|99->68|99->68|99->68|100->69|100->69|100->69|100->69|100->69|100->69|100->69|100->69|100->69|104->73|104->73|105->74|107->76|107->76|108->77|108->77|110->79|110->79|110->79|111->80|112->81|112->81|113->82|113->82|113->82|114->83|115->84|115->84|116->85|116->85|116->85|117->86|118->87|118->87|119->88|120->89|120->89|121->90|122->91|122->91|122->91|122->91|123->92|123->92|124->93|124->93|125->94|125->94|125->94|125->94|126->95|126->95|127->96|127->96|127->96|127->96|127->96|129->98|129->98|132->101|132->101|133->102|133->102|133->102|133->102|133->102|133->102|133->102|133->102|133->102|133->102|133->102|133->102|133->102|134->103|134->103|135->104|137->106|137->106|138->107|138->107|138->107|139->108|140->109|140->109|141->110|142->111|142->111|143->112|144->113|144->113|144->113|144->113|145->114|145->114|146->115|146->115|147->116|147->116|147->116|147->116|147->116|147->116|147->116|147->116|151->120|151->120|152->121|152->121|152->121|152->121|152->121|152->121|152->121|152->121|152->121|153->122|153->122|154->123|155->124|155->124|156->125|156->125|156->125|157->126|159->128|159->128|160->129|162->131|162->131|163->132|163->132|163->132|164->133|165->134|165->134|166->135|167->136|167->136|168->137|170->139|170->139|171->140|172->141|172->141|172->141|172->141|173->142|173->142|174->143|174->143|175->144|175->144|175->144|175->144|175->144|175->144|175->144|175->144|179->148|179->148|180->149|184->153|184->153|184->153|184->153|184->153|185->154|188->157|188->157|189->158|189->158|190->159|190->159
                  -- GENERATED --
              */
          