
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

object companyAdd extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/layout/*1.8*/.main("Register company")/*1.33*/("Add company")/*1.48*/ {_display_(Seq[Any](format.raw/*1.50*/("""
    """),format.raw/*2.5*/("""<div class="container-fluid py-4">
        <div class="row">
            <div class="col-6 offset-3">
                <div class="card z-index-0">
                    <div class="card-header text-center pt-4">
                        <h5>Register new company</h5>
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
                        user_type: "company",
                    """),format.raw/*69.21*/("""}"""),format.raw/*69.22*/("""
                    """),format.raw/*70.21*/("""console.log(validateForm(data));
                    if(!validateForm(data)) return;
                    var requestOptions = """),format.raw/*72.42*/("""{"""),format.raw/*72.43*/("""
                        """),format.raw/*73.25*/("""method: 'POST',
                        body: JSON.stringify(data),
                        headers: """),format.raw/*75.34*/("""{"""),format.raw/*75.35*/("""
                            """),format.raw/*76.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*77.54*/("""{"""),format.raw/*77.55*/("""localStorage.getItem("token")"""),format.raw/*77.84*/("""}"""),format.raw/*77.85*/("""`
                        """),format.raw/*78.25*/("""}"""),format.raw/*78.26*/("""
                    """),format.raw/*79.21*/("""}"""),format.raw/*79.22*/(""";
                    const res = await fetch(`$"""),format.raw/*80.47*/("""{"""),format.raw/*80.48*/("""apiUrl"""),format.raw/*80.54*/("""}"""),format.raw/*80.55*/("""/user`, requestOptions)
                            .then(response => response.json())
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    if (res.status) """),format.raw/*84.37*/("""{"""),format.raw/*84.38*/("""
                        """),format.raw/*85.25*/("""elSuccess.setAttribute("style","display:block");
                        elFail.setAttribute("style","display:none");
                        elSuccess.innerHTML = res.message;
                        document.querySelector("#name").value="";
                        document.querySelector("#email").value="";
                        document.querySelector("#phone").value="";
                    """),format.raw/*91.21*/("""}"""),format.raw/*91.22*/(""" """),format.raw/*91.23*/("""else """),format.raw/*91.28*/("""{"""),format.raw/*91.29*/("""
                        """),format.raw/*92.25*/("""elFail.setAttribute("style", "display:block");
                        elSuccess.setAttribute("style", "display:none");
                        elFail.innerHTML = res.message;
                    """),format.raw/*95.21*/("""}"""),format.raw/*95.22*/("""
                    """),format.raw/*96.21*/("""clearResponse();
                """),format.raw/*97.17*/("""}"""),format.raw/*97.18*/("""
            """),format.raw/*98.13*/("""}"""),format.raw/*98.14*/(""")
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
                  SOURCE: app/views/companyAdd.scala.html
                  HASH: 24f297cfa2f609e9789f456106ab04f180b8fb2c
                  MATRIX: 994->1|1007->7|1040->32|1063->47|1102->49|1133->54|2821->1715|2837->1722|2867->1731|2899->1736|3014->1823|3043->1824|3088->1841|3163->1888|3192->1889|3241->1910|3293->1934|3322->1935|3367->1952|3421->1978|3450->1979|3499->2000|3729->2202|3758->2203|3830->2246|3860->2247|3890->2248|3920->2249|3960->2260|3990->2261|4224->2467|4253->2468|4306->2493|4395->2554|4424->2555|4484->2587|4513->2588|4566->2613|4656->2675|4685->2676|4766->2729|4795->2730|4848->2755|4940->2819|4969->2820|5018->2841|5071->2866|5100->2867|5153->2892|5368->3079|5397->3080|5446->3101|5503->3130|5532->3131|5578->3149|5628->3171|5657->3172|5706->3193|5907->3366|5936->3367|5989->3392|6270->3645|6299->3646|6348->3667|6502->3793|6531->3794|6584->3819|6713->3920|6742->3921|6799->3950|6916->4039|6945->4040|7002->4069|7031->4070|7085->4096|7114->4097|7163->4118|7192->4119|7268->4167|7297->4168|7331->4174|7360->4175|7637->4424|7666->4425|7719->4450|8144->4847|8173->4848|8202->4849|8235->4854|8264->4855|8317->4880|8541->5076|8570->5077|8619->5098|8680->5131|8709->5132|8750->5145|8779->5146
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|61->30|61->30|61->30|62->31|64->33|64->33|65->34|65->34|65->34|66->35|67->36|67->36|68->37|68->37|68->37|69->38|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|75->44|75->44|76->45|77->46|77->46|77->46|77->46|78->47|79->48|79->48|80->49|80->49|81->50|82->51|82->51|83->52|83->52|83->52|84->53|88->57|88->57|89->58|90->59|90->59|92->61|92->61|92->61|93->62|95->64|95->64|96->65|100->69|100->69|101->70|103->72|103->72|104->73|106->75|106->75|107->76|108->77|108->77|108->77|108->77|109->78|109->78|110->79|110->79|111->80|111->80|111->80|111->80|115->84|115->84|116->85|122->91|122->91|122->91|122->91|122->91|123->92|126->95|126->95|127->96|128->97|128->97|129->98|129->98
                  -- GENERATED --
              */
          