
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

object signup extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!--
=========================================================
* Soft UI Dashboard - v1.0.3
=========================================================

* Product Page: https://www.creative-tim.com/product/soft-ui-dashboard
* Copyright 2021 Creative Tim (https://www.creative-tim.com)
* Licensed under MIT (https://www.creative-tim.com/license)

* Coded by Creative Tim

=========================================================

* The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
-->
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link rel="apple-touch-icon" sizes="76x76" href="/static/assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="/static/assets/img/favicon.png">
  <title>
    Create account as a company
  </title>
  <!--     Fonts and icons     -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet" />
  <!-- Nucleo Icons -->
  <link href="/static/assets/css/nucleo-icons.css" rel="stylesheet" />
  <link href="/static/assets/css/nucleo-svg.css" rel="stylesheet" />
  <!-- Font Awesome Icons -->
  <script src="https://kit.fontawesome.com/42d5adcbca.js" crossorigin="anonymous"></script>
  <link href="/static/assets/css/nucleo-svg.css" rel="stylesheet" />
  <!-- CSS Files -->
  <link id="pagestyle" href="/static/assets/css/soft-ui-dashboard.css?v=1.0.3" rel="stylesheet" />
</head>

<body class="g-sidenav-show  bg-gray-100">
  <section class="min-vh-100 mb-8">
    <div class="page-header align-items-start min-vh-50 pt-5 pb-11 m-3 border-radius-lg" style="background-image: url('/static/assets/img/curved-images/curved14.jpg');">
      <span class="mask bg-gradient-dark opacity-10"></span>
      <div class="container">
        <div class="row justify-content-center">
          <div class="col-lg-5 text-center mx-auto">
            <h1 class="text-white mb-2 mt-5">Welcome!</h1>
            <p class="text-lead text-white">Car ticket reservation.</p>
          </div>
        </div>
      </div>
    </div>
    <div class="container">
      <div class="row mt-lg-n10 mt-md-n11 mt-n10">
        <div class="col-xl-4 col-lg-5 col-md-7 mx-auto">
          <div class="card z-index-0">
            <div class="card-header text-center pt-4">
              <h5>Create account</h5>
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
                  <input type="number" class="form-control" placeholder="Phone number"  id="phone" aria-label="Email" aria-describedby="phoen-addon">
                </div>
                <div class="mb-3">
                  <input type="password" class="form-control" placeholder="Password" id="password" aria-label="Password" aria-describedby="password-addon">
                </div>
                <div class="mb-3">
                  <input type="password" class="form-control" placeholder="Confirm password" id="confirmPassword" aria-label="Password" aria-describedby="password-addon">
                </div>
                <div class="text-center">
                  <button type="button" class="btn bg-gradient-dark w-100 my-4 mb-2" id="btnSignup">Sign up</button>
                </div>
                <p class="text-sm mt-3 mb-0">Already have an account? <a href=""""),_display_(/*81.81*/routes/*81.87*/.ViewController.login()),format.raw/*81.110*/("""" class="text-dark font-weight-bolder">Sign in</a></p>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- -------- START FOOTER 3 w/ COMPANY DESCRIPTION WITH LINKS & SOCIAL ICONS & COPYRIGHT ------- -->
  <!-- -------- END FOOTER 3 w/ COMPANY DESCRIPTION WITH LINKS & SOCIAL ICONS & COPYRIGHT ------- -->
  <!--   Core JS Files   -->
  <script src="/static/assets/js/core/popper.min.js"></script>
  <script src="/static/assets/js/core/bootstrap.min.js"></script>
  <script src="/static/assets/js/plugins/perfect-scrollbar.min.js"></script>
  <script src="/static/assets/js/plugins/smooth-scrollbar.min.js"></script>
  <script>
    var win = navigator.platform.indexOf('Win') > -1;
    if (win && document.querySelector('#sidenav-scrollbar')) """),format.raw/*98.62*/("""{"""),format.raw/*98.63*/("""
      """),format.raw/*99.7*/("""var options = """),format.raw/*99.21*/("""{"""),format.raw/*99.22*/("""
        """),format.raw/*100.9*/("""damping: '0.5'
      """),format.raw/*101.7*/("""}"""),format.raw/*101.8*/("""
      """),format.raw/*102.7*/("""Scrollbar.init(document.querySelector('#sidenav-scrollbar'), options);
    """),format.raw/*103.5*/("""}"""),format.raw/*103.6*/("""
  """),format.raw/*104.3*/("""</script>
  <!-- Github buttons -->
  <script async defer src="https://buttons.github.io/buttons.js"></script>
  <!-- Control Center for Soft Dashboard: parallax effects, scripts for the example pages etc -->
  <script src="/static/assets/js/soft-ui-dashboard.min.js?v=1.0.3"></script>
  <script src="/static/helper/utils.js"></script>
  <script src="/static/helper/validators.js"></script>
  <script>
    window.addEventListener("DOMContentLoaded",function () """),format.raw/*112.60*/("""{"""),format.raw/*112.61*/("""
      """),format.raw/*113.7*/("""document.querySelector("#btnSignup").onclick=()=>"""),format.raw/*113.56*/("""{"""),format.raw/*113.57*/("""
        """),format.raw/*114.9*/("""signup();
      """),format.raw/*115.7*/("""}"""),format.raw/*115.8*/("""
      """),format.raw/*116.7*/("""function validateSignup(obj)"""),format.raw/*116.35*/("""{"""),format.raw/*116.36*/("""
        """),format.raw/*117.9*/("""const elFail = document.querySelector("#responseFail"),
                elSuccess = document.querySelector("#responseSuccess");
        const emailValidation = validateEmailAddress(obj.email),
                phoneValidation = validatePhoneNumber(obj.phone);
        if(obj.name.trim().length==0)"""),format.raw/*121.38*/("""{"""),format.raw/*121.39*/("""
          """),format.raw/*122.11*/("""elFail.innerHTML="Name should not be empty";
        """),format.raw/*123.9*/("""}"""),format.raw/*123.10*/("""else if(!emailValidation.status)"""),format.raw/*123.42*/("""{"""),format.raw/*123.43*/("""
          """),format.raw/*124.11*/("""elFail.innerHTML=emailValidation.message;
        """),format.raw/*125.9*/("""}"""),format.raw/*125.10*/("""else
        if(!phoneValidation.status) """),format.raw/*126.37*/("""{"""),format.raw/*126.38*/("""
          """),format.raw/*127.11*/("""elFail.innerHTML = phoneValidation.message;
        """),format.raw/*128.9*/("""}"""),format.raw/*128.10*/("""
        """),format.raw/*129.9*/("""if(elFail.innerHTML!=="")"""),format.raw/*129.34*/("""{"""),format.raw/*129.35*/("""
          """),format.raw/*130.11*/("""elFail.style.display ='block';
          elSuccess.style.display ='none';
          clearResponse();
          return false;
        """),format.raw/*134.9*/("""}"""),format.raw/*134.10*/("""
        """),format.raw/*135.9*/("""return true;
      """),format.raw/*136.7*/("""}"""),format.raw/*136.8*/("""

      """),format.raw/*138.7*/("""async function signup() """),format.raw/*138.31*/("""{"""),format.raw/*138.32*/("""
        """),format.raw/*139.9*/("""const elFail = document.querySelector("#responseFail"),
                elSuccess = document.querySelector("#responseSuccess");
        const data = """),format.raw/*141.22*/("""{"""),format.raw/*141.23*/("""
          """),format.raw/*142.11*/("""name: document.querySelector("#name").value,
          email: document.querySelector("#email").value,
          phone: document.querySelector("#phone").value,
          password: document.querySelector("#password").value,
          user_type: "company",
        """),format.raw/*147.9*/("""}"""),format.raw/*147.10*/("""
        """),format.raw/*148.9*/("""if(data.password!==document.querySelector("#confirmPassword").value)"""),format.raw/*148.77*/("""{"""),format.raw/*148.78*/("""
          """),format.raw/*149.11*/("""elFail.innerHTML="Password does not match";
          elFail.style.display='block';
          elSuccess.style.display='none';
          clearResponse();
        """),format.raw/*153.9*/("""}"""),format.raw/*153.10*/("""
        """),format.raw/*154.9*/("""if(!validateSignup(data)) return;
        var requestOptions = """),format.raw/*155.30*/("""{"""),format.raw/*155.31*/("""
          """),format.raw/*156.11*/("""method: 'POST',
          body: JSON.stringify(data),
          headers: """),format.raw/*158.20*/("""{"""),format.raw/*158.21*/("""
            """),format.raw/*159.13*/(""""Content-Type": "application/json"
          """),format.raw/*160.11*/("""}"""),format.raw/*160.12*/("""
        """),format.raw/*161.9*/("""}"""),format.raw/*161.10*/(""";
        const res = await fetch(`$"""),format.raw/*162.35*/("""{"""),format.raw/*162.36*/("""apiUrl"""),format.raw/*162.42*/("""}"""),format.raw/*162.43*/("""/user`, requestOptions)
                .then(response => response.json())
                .then(result => result)
                .catch(error => console.log('error', error));
        if (res.status) """),format.raw/*166.25*/("""{"""),format.raw/*166.26*/("""
          """),format.raw/*167.11*/("""elSuccess.setAttribute("style","display:block");
          elFail.setAttribute("style","display:none");
          elSuccess.innerHTML = res.message;
          document.querySelector("#name").value="";
          document.querySelector("#phone").value="";
          document.querySelector("#email").value="";
          document.querySelector("#password").value="";
          document.querySelector("#confirmPassword").value="";
        """),format.raw/*175.9*/("""}"""),format.raw/*175.10*/(""" """),format.raw/*175.11*/("""else """),format.raw/*175.16*/("""{"""),format.raw/*175.17*/("""
          """),format.raw/*176.11*/("""elFail.setAttribute("style", "display:block");
          elSuccess.setAttribute("style", "display:none");
          elFail.innerHTML = res.message;
        """),format.raw/*179.9*/("""}"""),format.raw/*179.10*/("""
      """),format.raw/*180.7*/("""}"""),format.raw/*180.8*/("""

    """),format.raw/*182.5*/("""}"""),format.raw/*182.6*/(""")
  </script>
</body>

</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/signup.scala.html
                  HASH: 856b65e538db2675dea1d2dd6d3e740db809ab23
                  MATRIX: 990->0|5062->4045|5077->4051|5122->4074|5958->4882|5987->4883|6021->4890|6063->4904|6092->4905|6129->4914|6178->4935|6207->4936|6242->4943|6345->5018|6374->5019|6405->5022|6895->5483|6925->5484|6960->5491|7038->5540|7068->5541|7105->5550|7149->5566|7178->5567|7213->5574|7270->5602|7300->5603|7337->5612|7662->5908|7692->5909|7732->5920|7813->5973|7843->5974|7904->6006|7934->6007|7974->6018|8052->6068|8082->6069|8152->6110|8182->6111|8222->6122|8302->6174|8332->6175|8369->6184|8423->6209|8453->6210|8493->6221|8654->6354|8684->6355|8721->6364|8768->6383|8797->6384|8833->6392|8886->6416|8916->6417|8953->6426|9131->6575|9161->6576|9201->6587|9491->6849|9521->6850|9558->6859|9655->6927|9685->6928|9725->6939|9914->7100|9944->7101|9981->7110|10073->7173|10103->7174|10143->7185|10245->7258|10275->7259|10317->7272|10391->7317|10421->7318|10458->7327|10488->7328|10553->7364|10583->7365|10618->7371|10648->7372|10878->7573|10908->7574|10948->7585|11410->8019|11440->8020|11470->8021|11504->8026|11534->8027|11574->8038|11758->8194|11788->8195|11823->8202|11852->8203|11886->8209|11915->8210
                  LINES: 32->1|112->81|112->81|112->81|129->98|129->98|130->99|130->99|130->99|131->100|132->101|132->101|133->102|134->103|134->103|135->104|143->112|143->112|144->113|144->113|144->113|145->114|146->115|146->115|147->116|147->116|147->116|148->117|152->121|152->121|153->122|154->123|154->123|154->123|154->123|155->124|156->125|156->125|157->126|157->126|158->127|159->128|159->128|160->129|160->129|160->129|161->130|165->134|165->134|166->135|167->136|167->136|169->138|169->138|169->138|170->139|172->141|172->141|173->142|178->147|178->147|179->148|179->148|179->148|180->149|184->153|184->153|185->154|186->155|186->155|187->156|189->158|189->158|190->159|191->160|191->160|192->161|192->161|193->162|193->162|193->162|193->162|197->166|197->166|198->167|206->175|206->175|206->175|206->175|206->175|207->176|210->179|210->179|211->180|211->180|213->182|213->182
                  -- GENERATED --
              */
          