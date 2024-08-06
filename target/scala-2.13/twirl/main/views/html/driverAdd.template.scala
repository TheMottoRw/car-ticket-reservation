
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
                                <input type="text" class="form-control" placeholder="Driver name" id="name" aria-label="Name" aria-describedby="email-addon">
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
                  HASH: cb73db10af3c40da879852ac181ed84b86fe6f36
                  MATRIX: 993->1|1006->7|1038->31|1060->45|1099->47|1130->52|2816->1711|2832->1718|2862->1727|2894->1732|3009->1819|3038->1820|3083->1837|3158->1884|3187->1885|3236->1906|3288->1930|3317->1931|3362->1948|3416->1974|3445->1975|3494->1996|3724->2198|3753->2199|3825->2242|3855->2243|3885->2244|3915->2245|3955->2256|3985->2257|4219->2463|4248->2464|4301->2489|4390->2550|4419->2551|4479->2583|4508->2584|4561->2609|4651->2671|4680->2672|4761->2725|4790->2726|4843->2751|4935->2815|4964->2816|5013->2837|5066->2862|5095->2863|5148->2888|5363->3075|5392->3076|5441->3097|5498->3126|5527->3127|5573->3145|5623->3167|5652->3168|5701->3189|5902->3362|5931->3363|5984->3388|6325->3701|6354->3702|6403->3723|6557->3849|6586->3850|6639->3875|6768->3976|6797->3977|6854->4006|6971->4095|7000->4096|7057->4125|7086->4126|7140->4152|7169->4153|7218->4174|7247->4175|7323->4223|7352->4224|7386->4230|7415->4231|7692->4480|7721->4481|7774->4506|8199->4903|8228->4904|8257->4905|8290->4910|8319->4911|8372->4936|8596->5132|8625->5133|8674->5154|8735->5187|8764->5188|8805->5201|8834->5202
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|61->30|61->30|61->30|62->31|64->33|64->33|65->34|65->34|65->34|66->35|67->36|67->36|68->37|68->37|68->37|69->38|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|75->44|75->44|76->45|77->46|77->46|77->46|77->46|78->47|79->48|79->48|80->49|80->49|81->50|82->51|82->51|83->52|83->52|83->52|84->53|88->57|88->57|89->58|90->59|90->59|92->61|92->61|92->61|93->62|95->64|95->64|96->65|101->70|101->70|102->71|104->73|104->73|105->74|107->76|107->76|108->77|109->78|109->78|109->78|109->78|110->79|110->79|111->80|111->80|112->81|112->81|112->81|112->81|116->85|116->85|117->86|123->92|123->92|123->92|123->92|123->92|124->93|127->96|127->96|128->97|129->98|129->98|130->99|130->99
                  -- GENERATED --
              */
          