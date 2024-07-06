
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

object destinationAdd extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/layout/*1.8*/.main("Register destination")/*1.37*/("Add Destination")/*1.56*/ {_display_(Seq[Any](format.raw/*1.58*/("""
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
                                <input type="number" class="form-control" placeholder="Price"  id="price" aria-label="price" aria-describedby="phone-addon">
                            </div>
                            <div class="text-center">
                                <button type="button" class="btn bg-gradient-dark w-100 my-4 mb-2" id="btnSave">Save</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        """),_display_(/*30.10*/commons/*30.17*/.footer()),format.raw/*30.26*/("""
    """),format.raw/*31.5*/("""</div>
    <script>
            window.addEventListener("DOMContentLoaded",function () """),format.raw/*33.68*/("""{"""),format.raw/*33.69*/("""
                """),format.raw/*34.17*/("""document.querySelector("#btnSave").onclick=()=>"""),format.raw/*34.64*/("""{"""),format.raw/*34.65*/("""
                    """),format.raw/*35.21*/("""save();
                """),format.raw/*36.17*/("""}"""),format.raw/*36.18*/("""
                """),format.raw/*37.17*/("""function validateForm(obj)"""),format.raw/*37.43*/("""{"""),format.raw/*37.44*/("""
                    """),format.raw/*38.21*/("""const elFail = document.querySelector("#responseFail"),
                            elSuccess = document.querySelector("#responseSuccess");
                    const priceValidation = isNaN(obj.price) || obj.price<=0?"""),format.raw/*40.78*/("""{"""),format.raw/*40.79*/("""status:false,message:"Invalid price""""),format.raw/*40.115*/("""}"""),format.raw/*40.116*/(""":"""),format.raw/*40.117*/("""{"""),format.raw/*40.118*/("""status:true"""),format.raw/*40.129*/("""}"""),format.raw/*40.130*/(""",
                            departureValidation = obj.departure.length<4?"""),format.raw/*41.74*/("""{"""),format.raw/*41.75*/("""status:false,message:"Invalid departure location""""),format.raw/*41.124*/("""}"""),format.raw/*41.125*/(""":"""),format.raw/*41.126*/("""{"""),format.raw/*41.127*/("""status:true"""),format.raw/*41.138*/("""}"""),format.raw/*41.139*/(""",
                            arrivalValidation = obj.arrival.length<4?"""),format.raw/*42.70*/("""{"""),format.raw/*42.71*/("""status:false,message:"Invalid arrival location""""),format.raw/*42.118*/("""}"""),format.raw/*42.119*/(""":"""),format.raw/*42.120*/("""{"""),format.raw/*42.121*/("""status:true"""),format.raw/*42.132*/("""}"""),format.raw/*42.133*/(""";

                    if(!departureValidation.status)"""),format.raw/*44.52*/("""{"""),format.raw/*44.53*/("""
                        """),format.raw/*45.25*/("""elFail.innerHTML=departureValidation.message;
                    """),format.raw/*46.21*/("""}"""),format.raw/*46.22*/("""else if(!arrivalValidation.status)"""),format.raw/*46.56*/("""{"""),format.raw/*46.57*/("""
                        """),format.raw/*47.25*/("""elFail.innerHTML=arrivalValidation.message;
                    """),format.raw/*48.21*/("""}"""),format.raw/*48.22*/("""else
                    if(!priceValidation.status) """),format.raw/*49.49*/("""{"""),format.raw/*49.50*/("""
                        """),format.raw/*50.25*/("""elFail.innerHTML = priceValidation.message;
                    """),format.raw/*51.21*/("""}"""),format.raw/*51.22*/("""
                    """),format.raw/*52.21*/("""if(elFail.innerHTML!=="")"""),format.raw/*52.46*/("""{"""),format.raw/*52.47*/("""
                        """),format.raw/*53.25*/("""elFail.style.display ='block';
                        elSuccess.style.display ='none';
                        clearResponse();
                        return false;
                    """),format.raw/*57.21*/("""}"""),format.raw/*57.22*/("""
                    """),format.raw/*58.21*/("""return true;
                """),format.raw/*59.17*/("""}"""),format.raw/*59.18*/("""

                """),format.raw/*61.17*/("""async function save() """),format.raw/*61.39*/("""{"""),format.raw/*61.40*/("""
                    """),format.raw/*62.21*/("""const elFail = document.querySelector("#responseFail"),
                            elSuccess = document.querySelector("#responseSuccess");
                    const data = """),format.raw/*64.34*/("""{"""),format.raw/*64.35*/("""
                        """),format.raw/*65.25*/("""departure: document.querySelector("#departure").value,
                        arrival: document.querySelector("#arrival").value,
                        price: document.querySelector("#price").value,
                    """),format.raw/*68.21*/("""}"""),format.raw/*68.22*/("""
                    """),format.raw/*69.21*/("""console.log(validateForm(data));
                    if(!validateForm(data)) return;
                    var requestOptions = """),format.raw/*71.42*/("""{"""),format.raw/*71.43*/("""
                        """),format.raw/*72.25*/("""method: 'POST',
                        body: JSON.stringify(data),
                        headers: """),format.raw/*74.34*/("""{"""),format.raw/*74.35*/("""
                            """),format.raw/*75.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*76.54*/("""{"""),format.raw/*76.55*/("""localStorage.getItem("token")"""),format.raw/*76.84*/("""}"""),format.raw/*76.85*/("""`
                        """),format.raw/*77.25*/("""}"""),format.raw/*77.26*/("""
                    """),format.raw/*78.21*/("""}"""),format.raw/*78.22*/(""";
                    const res = await fetch(`$"""),format.raw/*79.47*/("""{"""),format.raw/*79.48*/("""apiUrl"""),format.raw/*79.54*/("""}"""),format.raw/*79.55*/("""/destination`, requestOptions)
                            .then(response => response.json())
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    if (res.status) """),format.raw/*83.37*/("""{"""),format.raw/*83.38*/("""
                        """),format.raw/*84.25*/("""elSuccess.setAttribute("style","display:block");
                        elFail.setAttribute("style","display:none");
                        elSuccess.innerHTML = res.message;
                        document.querySelector("#departure").value="";
                        document.querySelector("#arrival").value="";
                        document.querySelector("#price").value="";
                    """),format.raw/*90.21*/("""}"""),format.raw/*90.22*/(""" """),format.raw/*90.23*/("""else """),format.raw/*90.28*/("""{"""),format.raw/*90.29*/("""
                        """),format.raw/*91.25*/("""elFail.setAttribute("style", "display:block");
                        elSuccess.setAttribute("style", "display:none");
                        elFail.innerHTML = res.message;
                    """),format.raw/*94.21*/("""}"""),format.raw/*94.22*/("""
                """),format.raw/*95.17*/("""}"""),format.raw/*95.18*/("""

            """),format.raw/*97.13*/("""}"""),format.raw/*97.14*/(""")
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
                  SOURCE: app/views/destinationAdd.scala.html
                  HASH: 0e1406b473a66ebe58e234d576a14ac4c29be0d5
                  MATRIX: 998->1|1011->7|1048->36|1075->55|1114->57|1145->62|2824->1714|2840->1721|2870->1730|2902->1735|3017->1822|3046->1823|3091->1840|3166->1887|3195->1888|3244->1909|3296->1933|3325->1934|3370->1951|3424->1977|3453->1978|3502->1999|3747->2216|3776->2217|3841->2253|3871->2254|3901->2255|3931->2256|3971->2267|4001->2268|4104->2343|4133->2344|4211->2393|4241->2394|4271->2395|4301->2396|4341->2407|4371->2408|4470->2479|4499->2480|4575->2527|4605->2528|4635->2529|4665->2530|4705->2541|4735->2542|4817->2596|4846->2597|4899->2622|4993->2688|5022->2689|5084->2723|5113->2724|5166->2749|5258->2813|5287->2814|5368->2867|5397->2868|5450->2893|5542->2957|5571->2958|5620->2979|5673->3004|5702->3005|5755->3030|5970->3217|5999->3218|6048->3239|6105->3268|6134->3269|6180->3287|6230->3309|6259->3310|6308->3331|6509->3504|6538->3505|6591->3530|6840->3751|6869->3752|6918->3773|7072->3899|7101->3900|7154->3925|7283->4026|7312->4027|7369->4056|7486->4145|7515->4146|7572->4175|7601->4176|7655->4202|7684->4203|7733->4224|7762->4225|7838->4273|7867->4274|7901->4280|7930->4281|8214->4537|8243->4538|8296->4563|8728->4967|8757->4968|8786->4969|8819->4974|8848->4975|8901->5000|9125->5196|9154->5197|9199->5214|9228->5215|9270->5229|9299->5230
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|61->30|61->30|61->30|62->31|64->33|64->33|65->34|65->34|65->34|66->35|67->36|67->36|68->37|68->37|68->37|69->38|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|72->41|72->41|72->41|72->41|72->41|72->41|72->41|72->41|73->42|73->42|73->42|73->42|73->42|73->42|73->42|73->42|75->44|75->44|76->45|77->46|77->46|77->46|77->46|78->47|79->48|79->48|80->49|80->49|81->50|82->51|82->51|83->52|83->52|83->52|84->53|88->57|88->57|89->58|90->59|90->59|92->61|92->61|92->61|93->62|95->64|95->64|96->65|99->68|99->68|100->69|102->71|102->71|103->72|105->74|105->74|106->75|107->76|107->76|107->76|107->76|108->77|108->77|109->78|109->78|110->79|110->79|110->79|110->79|114->83|114->83|115->84|121->90|121->90|121->90|121->90|121->90|122->91|125->94|125->94|126->95|126->95|128->97|128->97
                  -- GENERATED --
              */
          