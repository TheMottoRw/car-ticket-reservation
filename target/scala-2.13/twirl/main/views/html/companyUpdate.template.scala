
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

object companyUpdate extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/layout/*1.8*/.main("Register company")/*1.33*/("Update company")/*1.51*/ {_display_(Seq[Any](format.raw/*1.53*/("""
    """),format.raw/*2.5*/("""<div class="container-fluid py-4">
        <div class="row">
            <div class="col-6 offset-3">
                <div class="card z-index-0">
                    <div class="card-header text-center pt-4">
                        <h5>Update company information</h5>
                    </div>
                    <div class="card-body">
                        <div class="alert alert-success" id="responseSuccess" style="display: none"></div>
                        <div class="alert alert-danger" id="responseFail" style="display: none"></div>
                        <form role="form text-left">
                            <div class="mb-3">
                                <input type="text" class="form-control" placeholder="Name" id="name" aria-label="Company name" aria-describedby="email-addon">
                            </div>
                            <div class="mb-3">
                                <input type="email" class="form-control" placeholder="Email" id="email" aria-label="Email" aria-describedby="email-addon">
                            </div>
                            <div class="mb-3">
                                <input type="number" class="form-control" placeholder="Phone number"  id="phone" aria-label="Email" aria-describedby="phone-addon">
                            </div>
                            <div class="text-center">
                                <button type="button" class="btn bg-gradient-dark w-100 my-4 mb-2" id="btnUpdate">Update</button>
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
                """),format.raw/*34.17*/("""const urlArr = getUrlParams();
                const id = urlArr[urlArr.length - 1];
                loadById();
                document.querySelector("#btnUpdate").onclick=()=>"""),format.raw/*37.66*/("""{"""),format.raw/*37.67*/("""
                    """),format.raw/*38.21*/("""save();
                """),format.raw/*39.17*/("""}"""),format.raw/*39.18*/("""
                """),format.raw/*40.17*/("""async function loadById() """),format.raw/*40.43*/("""{"""),format.raw/*40.44*/("""
                    """),format.raw/*41.21*/("""const res = await fetch(`$"""),format.raw/*41.47*/("""{"""),format.raw/*41.48*/("""apiUrl"""),format.raw/*41.54*/("""}"""),format.raw/*41.55*/("""/user/$"""),format.raw/*41.62*/("""{"""),format.raw/*41.63*/("""id"""),format.raw/*41.65*/("""}"""),format.raw/*41.66*/("""`)
                            .then(response => response.json())
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    if (!res.error) """),format.raw/*45.37*/("""{"""),format.raw/*45.38*/("""
                        """),format.raw/*46.25*/("""let obj = res;
                        document.querySelector("#name").value = obj.name;
                        document.querySelector("#email").value = obj.email
                        document.querySelector("#phone").value = obj.phone;
                    """),format.raw/*50.21*/("""}"""),format.raw/*50.22*/("""
                """),format.raw/*51.17*/("""}"""),format.raw/*51.18*/("""
                """),format.raw/*52.17*/("""function validateForm(obj)"""),format.raw/*52.43*/("""{"""),format.raw/*52.44*/("""
                    """),format.raw/*53.21*/("""const elFail = document.querySelector("#responseFail"),
                            elSuccess = document.querySelector("#responseSuccess");
                    const nameValidation = obj.name.length<=3?"""),format.raw/*55.63*/("""{"""),format.raw/*55.64*/("""status:false,message:"Invalid company name""""),format.raw/*55.107*/("""}"""),format.raw/*55.108*/(""":"""),format.raw/*55.109*/("""{"""),format.raw/*55.110*/("""status:true"""),format.raw/*55.121*/("""}"""),format.raw/*55.122*/(""",
                            emailValidation = validateEmailAddress(obj.email),
                            phoneValidation = validatePhoneNumber(obj.phone);

                    if(!nameValidation.status)"""),format.raw/*59.47*/("""{"""),format.raw/*59.48*/("""
                        """),format.raw/*60.25*/("""elFail.innerHTML=nameValidation.message;
                    """),format.raw/*61.21*/("""}"""),format.raw/*61.22*/("""else if(!emailValidation.status)"""),format.raw/*61.54*/("""{"""),format.raw/*61.55*/("""
                        """),format.raw/*62.25*/("""elFail.innerHTML=emailValidation.message;
                    """),format.raw/*63.21*/("""}"""),format.raw/*63.22*/("""else
                    if(!phoneValidation.status) """),format.raw/*64.49*/("""{"""),format.raw/*64.50*/("""
                        """),format.raw/*65.25*/("""elFail.innerHTML = phoneValidation.message;
                    """),format.raw/*66.21*/("""}"""),format.raw/*66.22*/("""
                    """),format.raw/*67.21*/("""if(elFail.innerHTML!=="")"""),format.raw/*67.46*/("""{"""),format.raw/*67.47*/("""
                        """),format.raw/*68.25*/("""elFail.style.display ='block';
                        elSuccess.style.display ='none';
                        clearResponse();
                        return false;
                    """),format.raw/*72.21*/("""}"""),format.raw/*72.22*/("""
                    """),format.raw/*73.21*/("""return true;
                """),format.raw/*74.17*/("""}"""),format.raw/*74.18*/("""

                """),format.raw/*76.17*/("""async function save() """),format.raw/*76.39*/("""{"""),format.raw/*76.40*/("""
                    """),format.raw/*77.21*/("""const elFail = document.querySelector("#responseFail"),
                            elSuccess = document.querySelector("#responseSuccess");
                    const data = """),format.raw/*79.34*/("""{"""),format.raw/*79.35*/("""
                        """),format.raw/*80.25*/("""name: document.querySelector("#name").value,
                        email: document.querySelector("#email").value,
                        phone: document.querySelector("#phone").value,
                        user_type: "company",
                    """),format.raw/*84.21*/("""}"""),format.raw/*84.22*/("""
                    """),format.raw/*85.21*/("""console.log(validateForm(data));
                    if(!validateForm(data)) return;
                    var requestOptions = """),format.raw/*87.42*/("""{"""),format.raw/*87.43*/("""
                        """),format.raw/*88.25*/("""method: 'POST',
                        body: JSON.stringify(data),
                        headers: """),format.raw/*90.34*/("""{"""),format.raw/*90.35*/("""
                            """),format.raw/*91.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*92.54*/("""{"""),format.raw/*92.55*/("""localStorage.getItem("token")"""),format.raw/*92.84*/("""}"""),format.raw/*92.85*/("""`
                        """),format.raw/*93.25*/("""}"""),format.raw/*93.26*/("""
                    """),format.raw/*94.21*/("""}"""),format.raw/*94.22*/(""";
                    const res = await fetch(`$"""),format.raw/*95.47*/("""{"""),format.raw/*95.48*/("""apiUrl"""),format.raw/*95.54*/("""}"""),format.raw/*95.55*/("""/user/$"""),format.raw/*95.62*/("""{"""),format.raw/*95.63*/("""id"""),format.raw/*95.65*/("""}"""),format.raw/*95.66*/("""`, requestOptions)
                            .then(response => response.json())
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    if (res.status) """),format.raw/*99.37*/("""{"""),format.raw/*99.38*/("""
                        """),format.raw/*100.25*/("""elSuccess.setAttribute("style","display:block");
                        elFail.setAttribute("style","display:none");
                        elSuccess.innerHTML = res.message;
                    """),format.raw/*103.21*/("""}"""),format.raw/*103.22*/(""" """),format.raw/*103.23*/("""else """),format.raw/*103.28*/("""{"""),format.raw/*103.29*/("""
                        """),format.raw/*104.25*/("""elFail.setAttribute("style", "display:block");
                        elSuccess.setAttribute("style", "display:none");
                        elFail.innerHTML = res.message;
                    """),format.raw/*107.21*/("""}"""),format.raw/*107.22*/("""
                    """),format.raw/*108.21*/("""clearResponse();
                """),format.raw/*109.17*/("""}"""),format.raw/*109.18*/("""
            """),format.raw/*110.13*/("""}"""),format.raw/*110.14*/(""")
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
                  SOURCE: app/views/companyUpdate.scala.html
                  HASH: 45bb77ac6db84b8b5673132f4861d724ee7c991f
                  MATRIX: 997->1|1010->7|1043->32|1069->50|1108->52|1139->57|2838->1729|2854->1736|2884->1745|2916->1750|3031->1837|3060->1838|3105->1855|3311->2033|3340->2034|3389->2055|3441->2079|3470->2080|3515->2097|3569->2123|3598->2124|3647->2145|3701->2171|3730->2172|3764->2178|3793->2179|3828->2186|3857->2187|3887->2189|3916->2190|4172->2418|4201->2419|4254->2444|4542->2704|4571->2705|4616->2722|4645->2723|4690->2740|4744->2766|4773->2767|4822->2788|5052->2990|5081->2991|5153->3034|5183->3035|5213->3036|5243->3037|5283->3048|5313->3049|5547->3255|5576->3256|5629->3281|5718->3342|5747->3343|5807->3375|5836->3376|5889->3401|5979->3463|6008->3464|6089->3517|6118->3518|6171->3543|6263->3607|6292->3608|6341->3629|6394->3654|6423->3655|6476->3680|6691->3867|6720->3868|6769->3889|6826->3918|6855->3919|6901->3937|6951->3959|6980->3960|7029->3981|7230->4154|7259->4155|7312->4180|7593->4433|7622->4434|7671->4455|7825->4581|7854->4582|7907->4607|8036->4708|8065->4709|8122->4738|8239->4827|8268->4828|8325->4857|8354->4858|8408->4884|8437->4885|8486->4906|8515->4907|8591->4955|8620->4956|8654->4962|8683->4963|8718->4970|8747->4971|8777->4973|8806->4974|9078->5218|9107->5219|9161->5244|9387->5441|9417->5442|9447->5443|9481->5448|9511->5449|9565->5474|9790->5670|9820->5671|9870->5692|9932->5725|9962->5726|10004->5739|10034->5740
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|61->30|61->30|61->30|62->31|64->33|64->33|65->34|68->37|68->37|69->38|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|72->41|72->41|72->41|72->41|72->41|72->41|76->45|76->45|77->46|81->50|81->50|82->51|82->51|83->52|83->52|83->52|84->53|86->55|86->55|86->55|86->55|86->55|86->55|86->55|86->55|90->59|90->59|91->60|92->61|92->61|92->61|92->61|93->62|94->63|94->63|95->64|95->64|96->65|97->66|97->66|98->67|98->67|98->67|99->68|103->72|103->72|104->73|105->74|105->74|107->76|107->76|107->76|108->77|110->79|110->79|111->80|115->84|115->84|116->85|118->87|118->87|119->88|121->90|121->90|122->91|123->92|123->92|123->92|123->92|124->93|124->93|125->94|125->94|126->95|126->95|126->95|126->95|126->95|126->95|126->95|126->95|130->99|130->99|131->100|134->103|134->103|134->103|134->103|134->103|135->104|138->107|138->107|139->108|140->109|140->109|141->110|141->110
                  -- GENERATED --
              */
          