
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

object driverUpdate extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/layout/*1.8*/.main("Update driver")/*1.30*/("Update driver")/*1.47*/ {_display_(Seq[Any](format.raw/*1.49*/("""
    """),format.raw/*2.5*/("""<div class="container-fluid py-4">
        <div class="row">
            <div class="col-6 offset-3">
                <div class="card z-index-0">
                    <div class="card-header text-center pt-4">
                        <h5>Update driver information</h5>
                    </div>
                    <div class="card-body">
                        <div class="alert alert-success" id="responseSuccess" style="display: none"></div>
                        <div class="alert alert-danger" id="responseFail" style="display: none"></div>
                        <form role="form text-left">
                            <div class="mb-3">
                                <input type="text" class="form-control" placeholder="Name" id="name" aria-label="Name" aria-describedby="email-addon">
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
                  SOURCE: app/views/driverUpdate.scala.html
                  HASH: 2039e3e5704af0eb378b330ac3cf063212ac4b89
                  MATRIX: 996->1|1009->7|1039->29|1064->46|1103->48|1134->53|2824->1716|2840->1723|2870->1732|2902->1737|3017->1824|3046->1825|3091->1842|3297->2020|3326->2021|3375->2042|3427->2066|3456->2067|3501->2084|3555->2110|3584->2111|3633->2132|3687->2158|3716->2159|3750->2165|3779->2166|3814->2173|3843->2174|3873->2176|3902->2177|4158->2405|4187->2406|4240->2431|4528->2691|4557->2692|4602->2709|4631->2710|4676->2727|4730->2753|4759->2754|4808->2775|5038->2977|5067->2978|5139->3021|5169->3022|5199->3023|5229->3024|5269->3035|5299->3036|5533->3242|5562->3243|5615->3268|5704->3329|5733->3330|5793->3362|5822->3363|5875->3388|5965->3450|5994->3451|6075->3504|6104->3505|6157->3530|6249->3594|6278->3595|6327->3616|6380->3641|6409->3642|6462->3667|6677->3854|6706->3855|6755->3876|6812->3905|6841->3906|6887->3924|6937->3946|6966->3947|7015->3968|7216->4141|7245->4142|7298->4167|7579->4420|7608->4421|7657->4442|7811->4568|7840->4569|7893->4594|8022->4695|8051->4696|8108->4725|8225->4814|8254->4815|8311->4844|8340->4845|8394->4871|8423->4872|8472->4893|8501->4894|8577->4942|8606->4943|8640->4949|8669->4950|8704->4957|8733->4958|8763->4960|8792->4961|9064->5205|9093->5206|9147->5231|9373->5428|9403->5429|9433->5430|9467->5435|9497->5436|9551->5461|9776->5657|9806->5658|9856->5679|9918->5712|9948->5713|9990->5726|10020->5727
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|61->30|61->30|61->30|62->31|64->33|64->33|65->34|68->37|68->37|69->38|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|72->41|72->41|72->41|72->41|72->41|72->41|76->45|76->45|77->46|81->50|81->50|82->51|82->51|83->52|83->52|83->52|84->53|86->55|86->55|86->55|86->55|86->55|86->55|86->55|86->55|90->59|90->59|91->60|92->61|92->61|92->61|92->61|93->62|94->63|94->63|95->64|95->64|96->65|97->66|97->66|98->67|98->67|98->67|99->68|103->72|103->72|104->73|105->74|105->74|107->76|107->76|107->76|108->77|110->79|110->79|111->80|115->84|115->84|116->85|118->87|118->87|119->88|121->90|121->90|122->91|123->92|123->92|123->92|123->92|124->93|124->93|125->94|125->94|126->95|126->95|126->95|126->95|126->95|126->95|126->95|126->95|130->99|130->99|131->100|134->103|134->103|134->103|134->103|134->103|135->104|138->107|138->107|139->108|140->109|140->109|141->110|141->110
                  -- GENERATED --
              */
          