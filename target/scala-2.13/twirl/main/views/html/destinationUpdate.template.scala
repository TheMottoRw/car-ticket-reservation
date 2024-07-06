
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

object destinationUpdate extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/layout/*1.8*/.main("Update destination")/*1.35*/("Update Destination")/*1.57*/ {_display_(Seq[Any](format.raw/*1.59*/("""
    """),format.raw/*2.5*/("""<div class="container-fluid py-4">
        <div class="row">
            <div class="col-6 offset-3">
                <div class="card z-index-0">
                    <div class="card-header text-center pt-4">
                        <h5>New destination</h5>
                    </div>
                    <div class="card-body">
                        <div class="alert alert-success" id="responseSuccess" style="display: none"></div>
                        <div class="alert alert-danger" id="responseFail" style="display: none"></div>
                        <form role="form text-left">
                            <div class="mb-3">
                                <input type="text" class="form-control" placeholder="From" id="departure" aria-label="departure" aria-describedby="email-addon">
                            </div>
                            <div class="mb-3">
                                <input type="text" class="form-control" placeholder="To" id="arrival" aria-label="arrival" aria-describedby="email-addon">
                            </div>
                            <div class="mb-3">
                                <input type="number" class="form-control" placeholder="Price" id="price" aria-label="price" aria-describedby="phone-addon">
                            </div>
                            <div class="text-center">
                                <button type="button" class="btn bg-gradient-dark w-100 my-4 mb-2" id="btnUpdate">
                                    Update</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        """),_display_(/*31.10*/commons/*31.17*/.footer()),format.raw/*31.26*/("""
    """),format.raw/*32.5*/("""</div>
    <script>
            window.addEventListener("DOMContentLoaded", function () """),format.raw/*34.69*/("""{"""),format.raw/*34.70*/("""
                """),format.raw/*35.17*/("""const urlArr = getUrlParams();
                const id = urlArr[urlArr.length - 1];
                loadById();
                document.querySelector("#btnUpdate").onclick = () => """),format.raw/*38.70*/("""{"""),format.raw/*38.71*/("""
                    """),format.raw/*39.21*/("""event.preventDefault();
                    console.log("Button clicked");
                    save();
                """),format.raw/*42.17*/("""}"""),format.raw/*42.18*/("""

                """),format.raw/*44.17*/("""function validateForm(obj) """),format.raw/*44.44*/("""{"""),format.raw/*44.45*/("""
                    """),format.raw/*45.21*/("""const elFail = document.querySelector("#responseFail"),
                            elSuccess = document.querySelector("#responseSuccess");
                    const priceValidation = isNaN(obj.price) || obj.price <= 0 ? """),format.raw/*47.82*/("""{"""),format.raw/*47.83*/("""
                                """),format.raw/*48.33*/("""status: false,
                                message: "Invalid price"
                            """),format.raw/*50.29*/("""}"""),format.raw/*50.30*/(""" """),format.raw/*50.31*/(""": """),format.raw/*50.33*/("""{"""),format.raw/*50.34*/("""status: true"""),format.raw/*50.46*/("""}"""),format.raw/*50.47*/(""",
                            departureValidation = obj.departure.length < 4 ? """),format.raw/*51.78*/("""{"""),format.raw/*51.79*/("""
                                """),format.raw/*52.33*/("""status: false,
                                message: "Invalid departure location"
                            """),format.raw/*54.29*/("""}"""),format.raw/*54.30*/(""" """),format.raw/*54.31*/(""": """),format.raw/*54.33*/("""{"""),format.raw/*54.34*/("""status: true"""),format.raw/*54.46*/("""}"""),format.raw/*54.47*/(""",
                            arrivalValidation = obj.arrival.length < 4 ? """),format.raw/*55.74*/("""{"""),format.raw/*55.75*/("""
                                """),format.raw/*56.33*/("""status: false,
                                message: "Invalid arrival location"
                            """),format.raw/*58.29*/("""}"""),format.raw/*58.30*/(""" """),format.raw/*58.31*/(""": """),format.raw/*58.33*/("""{"""),format.raw/*58.34*/("""status: true"""),format.raw/*58.46*/("""}"""),format.raw/*58.47*/(""";

                    if (!departureValidation.status) """),format.raw/*60.54*/("""{"""),format.raw/*60.55*/("""
                        """),format.raw/*61.25*/("""elFail.innerHTML = departureValidation.message;
                    """),format.raw/*62.21*/("""}"""),format.raw/*62.22*/(""" """),format.raw/*62.23*/("""else if (!arrivalValidation.status) """),format.raw/*62.59*/("""{"""),format.raw/*62.60*/("""
                        """),format.raw/*63.25*/("""elFail.innerHTML = arrivalValidation.message;
                    """),format.raw/*64.21*/("""}"""),format.raw/*64.22*/(""" """),format.raw/*64.23*/("""else if (!priceValidation.status) """),format.raw/*64.57*/("""{"""),format.raw/*64.58*/("""
                        """),format.raw/*65.25*/("""elFail.innerHTML = priceValidation.message;
                    """),format.raw/*66.21*/("""}"""),format.raw/*66.22*/("""
                    """),format.raw/*67.21*/("""if (elFail.innerHTML !== "") """),format.raw/*67.50*/("""{"""),format.raw/*67.51*/("""
                        """),format.raw/*68.25*/("""elFail.style.display = 'block';
                        elSuccess.style.display = 'none';
                        clearResponse();
                        return false;
                    """),format.raw/*72.21*/("""}"""),format.raw/*72.22*/("""
                    """),format.raw/*73.21*/("""return true;
                """),format.raw/*74.17*/("""}"""),format.raw/*74.18*/("""

                """),format.raw/*76.17*/("""async function loadById() """),format.raw/*76.43*/("""{"""),format.raw/*76.44*/("""
                    """),format.raw/*77.21*/("""const res = await fetch(`$"""),format.raw/*77.47*/("""{"""),format.raw/*77.48*/("""apiUrl"""),format.raw/*77.54*/("""}"""),format.raw/*77.55*/("""/destination/$"""),format.raw/*77.69*/("""{"""),format.raw/*77.70*/("""id"""),format.raw/*77.72*/("""}"""),format.raw/*77.73*/("""`)
                            .then(response => response.json())
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    if (!res.error) """),format.raw/*81.37*/("""{"""),format.raw/*81.38*/("""
                        """),format.raw/*82.25*/("""let obj = res;
                        document.querySelector("#arrival").value = obj.arrival;
                        document.querySelector("#departure").value = obj.departure;
                        document.querySelector("#price").value = obj.price
                    """),format.raw/*86.21*/("""}"""),format.raw/*86.22*/("""
                """),format.raw/*87.17*/("""}"""),format.raw/*87.18*/("""

                """),format.raw/*89.17*/("""async function save() """),format.raw/*89.39*/("""{"""),format.raw/*89.40*/("""
                    """),format.raw/*90.21*/("""const elFail = document.querySelector("#responseFail"),
                            elSuccess = document.querySelector("#responseSuccess");
                    const data = """),format.raw/*92.34*/("""{"""),format.raw/*92.35*/("""
                        """),format.raw/*93.25*/("""departure: document.querySelector("#departure").value,
                        arrival: document.querySelector("#arrival").value,
                        price: document.querySelector("#price").value,
                    """),format.raw/*96.21*/("""}"""),format.raw/*96.22*/("""
                    """),format.raw/*97.21*/("""console.log(validateForm(data));
                    if (!validateForm(data)) return;
                    var requestOptions = """),format.raw/*99.42*/("""{"""),format.raw/*99.43*/("""
                        """),format.raw/*100.25*/("""method: 'POST',
                        body: JSON.stringify(data),
                        headers: """),format.raw/*102.34*/("""{"""),format.raw/*102.35*/("""
                            """),format.raw/*103.29*/(""""Content-Type": "application/json",
                            "Authorization": `Bearer $"""),format.raw/*104.55*/("""{"""),format.raw/*104.56*/("""localStorage.getItem("token")"""),format.raw/*104.85*/("""}"""),format.raw/*104.86*/("""`
                        """),format.raw/*105.25*/("""}"""),format.raw/*105.26*/("""
                    """),format.raw/*106.21*/("""}"""),format.raw/*106.22*/(""";
                    const res = await fetch(`$"""),format.raw/*107.47*/("""{"""),format.raw/*107.48*/("""apiUrl"""),format.raw/*107.54*/("""}"""),format.raw/*107.55*/("""/destination/$"""),format.raw/*107.69*/("""{"""),format.raw/*107.70*/("""id"""),format.raw/*107.72*/("""}"""),format.raw/*107.73*/("""`, requestOptions)
                            .then(response => response.json())
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    if (res.status) """),format.raw/*111.37*/("""{"""),format.raw/*111.38*/("""
                        """),format.raw/*112.25*/("""elSuccess.setAttribute("style", "display:block");
                        elFail.setAttribute("style", "display:none");
                        elSuccess.innerHTML = res.message;
                    """),format.raw/*115.21*/("""}"""),format.raw/*115.22*/(""" """),format.raw/*115.23*/("""else """),format.raw/*115.28*/("""{"""),format.raw/*115.29*/("""
                        """),format.raw/*116.25*/("""elFail.setAttribute("style", "display:block");
                        elSuccess.setAttribute("style", "display:none");
                        elFail.innerHTML = res.message;
                    """),format.raw/*119.21*/("""}"""),format.raw/*119.22*/("""
                    """),format.raw/*120.21*/("""clearResponse();
                """),format.raw/*121.17*/("""}"""),format.raw/*121.18*/("""
            """),format.raw/*122.13*/("""}"""),format.raw/*122.14*/(""")
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
                  SOURCE: app/views/destinationUpdate.scala.html
                  HASH: 1889aefeb9a8a5292a50969e0353d8e262b33594
                  MATRIX: 1001->1|1014->7|1049->34|1079->56|1118->58|1149->63|2868->1755|2884->1762|2914->1771|2946->1776|3062->1864|3091->1865|3136->1882|3346->2064|3375->2065|3424->2086|3571->2205|3600->2206|3646->2224|3701->2251|3730->2252|3779->2273|4028->2494|4057->2495|4118->2528|4246->2628|4275->2629|4304->2630|4334->2632|4363->2633|4403->2645|4432->2646|4539->2725|4568->2726|4629->2759|4770->2872|4799->2873|4828->2874|4858->2876|4887->2877|4927->2889|4956->2890|5059->2965|5088->2966|5149->2999|5288->3110|5317->3111|5346->3112|5376->3114|5405->3115|5445->3127|5474->3128|5558->3184|5587->3185|5640->3210|5736->3278|5765->3279|5794->3280|5858->3316|5887->3317|5940->3342|6034->3408|6063->3409|6092->3410|6154->3444|6183->3445|6236->3470|6328->3534|6357->3535|6406->3556|6463->3585|6492->3586|6545->3611|6762->3800|6791->3801|6840->3822|6897->3851|6926->3852|6972->3870|7026->3896|7055->3897|7104->3918|7158->3944|7187->3945|7221->3951|7250->3952|7292->3966|7321->3967|7351->3969|7380->3970|7636->4198|7665->4199|7718->4224|8020->4498|8049->4499|8094->4516|8123->4517|8169->4535|8219->4557|8248->4558|8297->4579|8498->4752|8527->4753|8580->4778|8829->4999|8858->5000|8907->5021|9062->5148|9091->5149|9145->5174|9275->5275|9305->5276|9363->5305|9482->5395|9512->5396|9570->5425|9600->5426|9655->5452|9685->5453|9735->5474|9765->5475|9842->5523|9872->5524|9907->5530|9937->5531|9980->5545|10010->5546|10041->5548|10071->5549|10344->5793|10374->5794|10428->5819|10656->6018|10686->6019|10716->6020|10750->6025|10780->6026|10834->6051|11059->6247|11089->6248|11139->6269|11201->6302|11231->6303|11273->6316|11303->6317
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|62->31|62->31|62->31|63->32|65->34|65->34|66->35|69->38|69->38|70->39|73->42|73->42|75->44|75->44|75->44|76->45|78->47|78->47|79->48|81->50|81->50|81->50|81->50|81->50|81->50|81->50|82->51|82->51|83->52|85->54|85->54|85->54|85->54|85->54|85->54|85->54|86->55|86->55|87->56|89->58|89->58|89->58|89->58|89->58|89->58|89->58|91->60|91->60|92->61|93->62|93->62|93->62|93->62|93->62|94->63|95->64|95->64|95->64|95->64|95->64|96->65|97->66|97->66|98->67|98->67|98->67|99->68|103->72|103->72|104->73|105->74|105->74|107->76|107->76|107->76|108->77|108->77|108->77|108->77|108->77|108->77|108->77|108->77|108->77|112->81|112->81|113->82|117->86|117->86|118->87|118->87|120->89|120->89|120->89|121->90|123->92|123->92|124->93|127->96|127->96|128->97|130->99|130->99|131->100|133->102|133->102|134->103|135->104|135->104|135->104|135->104|136->105|136->105|137->106|137->106|138->107|138->107|138->107|138->107|138->107|138->107|138->107|138->107|142->111|142->111|143->112|146->115|146->115|146->115|146->115|146->115|147->116|150->119|150->119|151->120|152->121|152->121|153->122|153->122
                  -- GENERATED --
              */
          