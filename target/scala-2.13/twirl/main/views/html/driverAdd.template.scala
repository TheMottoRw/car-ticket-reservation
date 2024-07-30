
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

object driverAdd extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/layout/*1.8*/.main("Register driver")/*1.32*/("Add driver")/*1.46*/ {_display_(Seq[Any](format.raw/*1.48*/("""
    """),format.raw/*2.5*/("""<div class="container-fluid py-4">
        <div class="row">
            <div class="col-6 offset-3">
                <div class="card z-index-0">
                    <div class="card-header text-center pt-4">
                        <h5>Register new driver</h5>
                    </div>
                    <div class="card-body">
                        <div class="alert alert-success" id="responseSuccess" style="display: none"></div>
                        <div class="alert alert-danger" id="responseFail" style="display: none"></div>
                        <form role="form text-left">
                            <div class="mb-3">
                                <input type="text" class="form-control" placeholder="Company name" id="name" aria-label="Name" aria-describedby="email-addon">
                            </div>
                            <div class="mb-3">
                                <input type="email" class="form-control" placeholder="Email" id="email" aria-label="Email" aria-describedby="email-addon">
                            </div>
                            <div class="mb-3">
                                <input type="number" class="form-control" placeholder="Phone number"  id="phone" aria-label="Email" aria-describedby="phone-addon">
                            </div>
                            <div class="text-center">
                                <button type="button" class="btn bg-gradient-dark w-100 my-4 mb-2" id="btnSave">Add</button>
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
                    const nameValidation = obj.name.length<=3?"""),format.raw/*40.63*/("""{"""),format.raw/*40.64*/("""status:false,message:"Invalid company name""""),format.raw/*40.107*/("""}"""),format.raw/*40.108*/(""":"""),format.raw/*40.109*/("""{"""),format.raw/*40.110*/("""status:true"""),format.raw/*40.121*/("""}"""),format.raw/*40.122*/(""",
                            emailValidation = validateEmailAddress(obj.email),
                            phoneValidation = validatePhoneNumber(obj.phone);

                    if(!nameValidation.status)"""),format.raw/*44.47*/("""{"""),format.raw/*44.48*/("""
                        """),format.raw/*45.25*/("""elFail.innerHTML=nameValidation.message;
                    """),format.raw/*46.21*/("""}"""),format.raw/*46.22*/("""else if(!emailValidation.status)"""),format.raw/*46.54*/("""{"""),format.raw/*46.55*/("""
                        """),format.raw/*47.25*/("""elFail.innerHTML=emailValidation.message;
                    """),format.raw/*48.21*/("""}"""),format.raw/*48.22*/("""else
                    if(!phoneValidation.status) """),format.raw/*49.49*/("""{"""),format.raw/*49.50*/("""
                        """),format.raw/*50.25*/("""elFail.innerHTML = phoneValidation.message;
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
                        """),format.raw/*65.25*/("""name: document.querySelector("#name").value,
                        email: document.querySelector("#email").value,
                        phone: document.querySelector("#phone").value,
                        user_type: "driver",
                        company: localStorage.getItem("id"),
                    """),format.raw/*70.21*/("""}"""),format.raw/*70.22*/("""
                    """),format.raw/*71.21*/("""console.log(validateForm(data));
                    if(!validateForm(data)) return;
                    var requestOptions = """),format.raw/*73.42*/("""{"""),format.raw/*73.43*/("""
                        """),format.raw/*74.25*/("""method: 'POST',
                        body: JSON.stringify(data),
                        headers: """),format.raw/*76.34*/("""{"""),format.raw/*76.35*/("""
                            """),format.raw/*77.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*78.54*/("""{"""),format.raw/*78.55*/("""localStorage.getItem("token")"""),format.raw/*78.84*/("""}"""),format.raw/*78.85*/("""`
                        """),format.raw/*79.25*/("""}"""),format.raw/*79.26*/("""
                    """),format.raw/*80.21*/("""}"""),format.raw/*80.22*/(""";
                    const res = await fetch(`$"""),format.raw/*81.47*/("""{"""),format.raw/*81.48*/("""apiUrl"""),format.raw/*81.54*/("""}"""),format.raw/*81.55*/("""/user`, requestOptions)
                            .then(response => response.json())
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    if (res.status) """),format.raw/*85.37*/("""{"""),format.raw/*85.38*/("""
                        """),format.raw/*86.25*/("""elSuccess.setAttribute("style","display:block");
                        elFail.setAttribute("style","display:none");
                        elSuccess.innerHTML = res.message;
                        document.querySelector("#name").value="";
                        document.querySelector("#email").value="";
                        document.querySelector("#phone").value="";
                    """),format.raw/*92.21*/("""}"""),format.raw/*92.22*/(""" """),format.raw/*92.23*/("""else """),format.raw/*92.28*/("""{"""),format.raw/*92.29*/("""
                        """),format.raw/*93.25*/("""elFail.setAttribute("style", "display:block");
                        elSuccess.setAttribute("style", "display:none");
                        elFail.innerHTML = res.message;
                    """),format.raw/*96.21*/("""}"""),format.raw/*96.22*/("""
                    """),format.raw/*97.21*/("""clearResponse();
                """),format.raw/*98.17*/("""}"""),format.raw/*98.18*/("""
            """),format.raw/*99.13*/("""}"""),format.raw/*99.14*/(""")
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
                  SOURCE: app/views/driverAdd.scala.html
                  HASH: 5ac8c6a6cae7c96829d510ffc8e04a5be4378c03
                  MATRIX: 993->1|1006->7|1038->31|1060->45|1099->47|1130->52|2817->1712|2833->1719|2863->1728|2895->1733|3010->1820|3039->1821|3084->1838|3159->1885|3188->1886|3237->1907|3289->1931|3318->1932|3363->1949|3417->1975|3446->1976|3495->1997|3725->2199|3754->2200|3826->2243|3856->2244|3886->2245|3916->2246|3956->2257|3986->2258|4220->2464|4249->2465|4302->2490|4391->2551|4420->2552|4480->2584|4509->2585|4562->2610|4652->2672|4681->2673|4762->2726|4791->2727|4844->2752|4936->2816|4965->2817|5014->2838|5067->2863|5096->2864|5149->2889|5364->3076|5393->3077|5442->3098|5499->3127|5528->3128|5574->3146|5624->3168|5653->3169|5702->3190|5903->3363|5932->3364|5985->3389|6326->3702|6355->3703|6404->3724|6558->3850|6587->3851|6640->3876|6769->3977|6798->3978|6855->4007|6972->4096|7001->4097|7058->4126|7087->4127|7141->4153|7170->4154|7219->4175|7248->4176|7324->4224|7353->4225|7387->4231|7416->4232|7693->4481|7722->4482|7775->4507|8200->4904|8229->4905|8258->4906|8291->4911|8320->4912|8373->4937|8597->5133|8626->5134|8675->5155|8736->5188|8765->5189|8806->5202|8835->5203
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|61->30|61->30|61->30|62->31|64->33|64->33|65->34|65->34|65->34|66->35|67->36|67->36|68->37|68->37|68->37|69->38|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|75->44|75->44|76->45|77->46|77->46|77->46|77->46|78->47|79->48|79->48|80->49|80->49|81->50|82->51|82->51|83->52|83->52|83->52|84->53|88->57|88->57|89->58|90->59|90->59|92->61|92->61|92->61|93->62|95->64|95->64|96->65|101->70|101->70|102->71|104->73|104->73|105->74|107->76|107->76|108->77|109->78|109->78|109->78|109->78|110->79|110->79|111->80|111->80|112->81|112->81|112->81|112->81|116->85|116->85|117->86|123->92|123->92|123->92|123->92|123->92|124->93|127->96|127->96|128->97|129->98|129->98|130->99|130->99
                  -- GENERATED --
              */
          