
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
              <h1 class="text-white mb-2 mt-5">Welcome back!</h1>
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
                <h5>Login to your account</h5>
              </div>
              <div class="card-body">
                <div class="alert alert-success" id="responseSuccess" style="display: none"></div>
                <div class="alert alert-danger" id="responseFail" style="display: none"></div>
                <form role="form text-left" id="loginForm">
                  <div class="mb-3">
                    <input type="email" class="form-control" placeholder="Email" id="email" aria-label="Email" aria-describedby="email-addon">
                  </div>
                  <div class="mb-3">
                    <input type="password" class="form-control" id="password" placeholder="Password" aria-label="Password" aria-describedby="password-addon">
                  </div>
                  <div class="text-center">
                    <button type="button" class="btn bg-gradient-dark w-100 my-4 mb-2" id="btnLogin">Sign in</button>
                  </div>
                  <p class="text-sm mt-3 mb-0">Doesn't have an account? <a href=""""),_display_(/*72.83*/routes/*72.89*/.ViewController.signup()),format.raw/*72.113*/("""" class="text-dark font-weight-bolder">Sign up</a></p>
                </form>
                <form class="pt-3" id="verifyAccountForm" style="display: none">
                  <div class="form-group">
                    <input type="text" name="verification_code" class="form-control" id="verification_code" placeholder="Verification code" required>
                  </div>
                  <div class="mt-3">
                    <button class="btn btn-primary w-100" type="submit" id="btnVerify">Verify account</button>
                  </div>
                  <div class="mt-3">
                    <button class="btn btn-info w-100" type="submit" id="btnResend">Resend code</button>
                  </div>
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
    <script src="/static/helper/utils.js"></script>
    <script src="/static/helper/validators.js"></script>
    <script>
    var win = navigator.platform.indexOf('Win') > -1;
    if (win && document.querySelector('#sidenav-scrollbar')) """),format.raw/*103.62*/("""{"""),format.raw/*103.63*/("""
      """),format.raw/*104.7*/("""var options = """),format.raw/*104.21*/("""{"""),format.raw/*104.22*/("""
        """),format.raw/*105.9*/("""damping: '0.5'
      """),format.raw/*106.7*/("""}"""),format.raw/*106.8*/("""
      """),format.raw/*107.7*/("""Scrollbar.init(document.querySelector('#sidenav-scrollbar'), options);
    """),format.raw/*108.5*/("""}"""),format.raw/*108.6*/("""
  """),format.raw/*109.3*/("""</script>
      <!-- Github buttons -->
    <script async defer src="https://buttons.github.io/buttons.js"></script>
      <!-- Control Center for Soft Dashboard: parallax effects, scripts for the example pages etc -->
    <script src="/static/assets/js/soft-ui-dashboard.min.js?v=1.0.3"></script>
    <script>
            redirectIfLoggedIn();
            // document.querySelector("#lnkBackToLogin").onclick = function ()"""),format.raw/*116.79*/("""{"""),format.raw/*116.80*/("""
            """),format.raw/*117.13*/("""//   event.preventDefault();
            //   document.querySelector("#loginForm").style.display='block';
            //   document.querySelector("#verifyAccountForm").style.display='none';
            // """),format.raw/*120.16*/("""}"""),format.raw/*120.17*/("""
            """),format.raw/*121.13*/("""document.querySelector("#btnLogin").onclick = () => """),format.raw/*121.65*/("""{"""),format.raw/*121.66*/("""
              """),format.raw/*122.15*/("""event.preventDefault();
              console.log("Login called");
              login();
            """),format.raw/*125.13*/("""}"""),format.raw/*125.14*/("""
            """),format.raw/*126.13*/("""document.querySelector("#btnVerify").onclick = () => """),format.raw/*126.66*/("""{"""),format.raw/*126.67*/("""
              """),format.raw/*127.15*/("""event.preventDefault();
              verifyAccount();
            """),format.raw/*129.13*/("""}"""),format.raw/*129.14*/("""
            """),format.raw/*130.13*/("""document.querySelector("#btnResend").onclick = () => """),format.raw/*130.66*/("""{"""),format.raw/*130.67*/("""
              """),format.raw/*131.15*/("""event.preventDefault();
              resendCode();
            """),format.raw/*133.13*/("""}"""),format.raw/*133.14*/("""

            """),format.raw/*135.13*/("""function redirectIfLoggedIn() """),format.raw/*135.43*/("""{"""),format.raw/*135.44*/("""
              """),format.raw/*136.15*/("""if (isLoggedIn()) """),format.raw/*136.33*/("""{"""),format.raw/*136.34*/("""
                """),format.raw/*137.17*/("""let userType = localStorage.getItem("user_type");
                if (userType === 'admin') """),format.raw/*138.43*/("""{"""),format.raw/*138.44*/("""
                  """),format.raw/*139.19*/("""window.location = '/companies';
                """),format.raw/*140.17*/("""}"""),format.raw/*140.18*/(""" """),format.raw/*140.19*/("""else """),format.raw/*140.24*/("""{"""),format.raw/*140.25*/("""
                  """),format.raw/*141.19*/("""window.location = '/destinations';
                """),format.raw/*142.17*/("""}"""),format.raw/*142.18*/("""
              """),format.raw/*143.15*/("""}"""),format.raw/*143.16*/("""
            """),format.raw/*144.13*/("""}"""),format.raw/*144.14*/("""

            """),format.raw/*146.13*/("""function isLoggedIn() """),format.raw/*146.35*/("""{"""),format.raw/*146.36*/("""
              """),format.raw/*147.15*/("""return localStorage.getItem("user_type") !== null;
            """),format.raw/*148.13*/("""}"""),format.raw/*148.14*/("""

            """),format.raw/*150.13*/("""async function login() """),format.raw/*150.36*/("""{"""),format.raw/*150.37*/("""
              """),format.raw/*151.15*/("""const elFail = document.querySelector("#responseFail"),
                      elSuccess = document.querySelector("#responseSuccess");
              const data = """),format.raw/*153.28*/("""{"""),format.raw/*153.29*/("""
                """),format.raw/*154.17*/("""email: document.querySelector("#email").value,
                password: document.querySelector("#password").value
              """),format.raw/*156.15*/("""}"""),format.raw/*156.16*/("""
              """),format.raw/*157.15*/("""const emailValidation = validateEmailAddress(data.email);
              if(!emailValidation.status)"""),format.raw/*158.42*/("""{"""),format.raw/*158.43*/("""
                """),format.raw/*159.17*/("""elFail.setAttribute("style", "display:block");
                elFail.innerHTML=emailValidation.message;
                elSuccess.setAttribute("style", "display:none");
                clearResponse();
                return;
              """),format.raw/*164.15*/("""}"""),format.raw/*164.16*/("""
              """),format.raw/*165.15*/("""var requestOptions = """),format.raw/*165.36*/("""{"""),format.raw/*165.37*/("""
                """),format.raw/*166.17*/("""method: 'POST',
                body: JSON.stringify(data),
                headers: """),format.raw/*168.26*/("""{"""),format.raw/*168.27*/("""
                  """),format.raw/*169.19*/(""""Content-Type": "application/json"
                """),format.raw/*170.17*/("""}"""),format.raw/*170.18*/("""
              """),format.raw/*171.15*/("""}"""),format.raw/*171.16*/(""";
              const res = await fetch(`$"""),format.raw/*172.41*/("""{"""),format.raw/*172.42*/("""apiUrl"""),format.raw/*172.48*/("""}"""),format.raw/*172.49*/("""/login`, requestOptions)
                      .then(response => response.json())
                      .then(result => result)
                      .catch(error => console.log('error', error));
              if (res.token) """),format.raw/*176.30*/("""{"""),format.raw/*176.31*/("""
                """),format.raw/*177.17*/("""elSuccess.setAttribute("style", "display:block");
                elFail.setAttribute("style", "display:none");
                elSuccess.innerHTML = "Logged in successfully";
                document.querySelector("#email").value = "";
                document.querySelector("#password").value = "";
                let obj = res.data;
                localStorage.setItem("id", obj.id);
                localStorage.setItem("name", obj.name);
                localStorage.setItem("email", obj.email);
                localStorage.setItem("phone", obj.phone);
                localStorage.setItem("user_type", obj.user_type);
                localStorage.setItem("status", obj.status);
                localStorage.setItem("is_verified", obj.verified);
                localStorage.setItem("token", res.token);
                if(obj.verified)"""),format.raw/*191.33*/("""{"""),format.raw/*191.34*/("""
                  """),format.raw/*192.19*/("""if (obj.user_type == "admin")
                    window.location = '/companies';
                  else
                    window.location = '/destinations';
                """),format.raw/*196.17*/("""}"""),format.raw/*196.18*/("""else"""),format.raw/*196.22*/("""{"""),format.raw/*196.23*/("""
                  """),format.raw/*197.19*/("""document.getElementById("loginForm").style.display='none';
                  document.getElementById("verifyAccountForm").style.display='block';
                """),format.raw/*199.17*/("""}"""),format.raw/*199.18*/("""
              """),format.raw/*200.15*/("""}"""),format.raw/*200.16*/(""" """),format.raw/*200.17*/("""else """),format.raw/*200.22*/("""{"""),format.raw/*200.23*/("""
                """),format.raw/*201.17*/("""elFail.setAttribute("style", "display:block");
                elSuccess.setAttribute("style", "display:none");
                elFail.innerHTML = res.message;
              """),format.raw/*204.15*/("""}"""),format.raw/*204.16*/("""
            """),format.raw/*205.13*/("""}"""),format.raw/*205.14*/("""
            """),format.raw/*206.13*/("""async function verifyAccount() """),format.raw/*206.44*/("""{"""),format.raw/*206.45*/("""
              """),format.raw/*207.15*/("""const data = """),format.raw/*207.28*/("""{"""),format.raw/*207.29*/("""
                """),format.raw/*208.17*/("""code: document.querySelector("#verification_code").value
              """),format.raw/*209.15*/("""}"""),format.raw/*209.16*/("""
              """),format.raw/*210.15*/("""var requestOptions = """),format.raw/*210.36*/("""{"""),format.raw/*210.37*/("""
                """),format.raw/*211.17*/("""method: 'POST',
                body: JSON.stringify(data),
                headers: """),format.raw/*213.26*/("""{"""),format.raw/*213.27*/("""
                  """),format.raw/*214.19*/(""""Content-Type": "application/json"
                """),format.raw/*215.17*/("""}"""),format.raw/*215.18*/("""
              """),format.raw/*216.15*/("""}"""),format.raw/*216.16*/(""";
              const res = await fetch(`$"""),format.raw/*217.41*/("""{"""),format.raw/*217.42*/("""apiUrl"""),format.raw/*217.48*/("""}"""),format.raw/*217.49*/("""/user/$"""),format.raw/*217.56*/("""{"""),format.raw/*217.57*/("""localStorage.getItem("id")"""),format.raw/*217.83*/("""}"""),format.raw/*217.84*/("""/verify`, requestOptions)
                      .then(response => response.json())
                      .then(result => result)
                      .catch(error => console.log('error', error));
              if (res.token) """),format.raw/*221.30*/("""{"""),format.raw/*221.31*/("""
                """),format.raw/*222.17*/("""let el = document.querySelector("#responseSuccess");
                el.setAttribute("style", "display:block");
                document.querySelector("#responseFail").setAttribute("style", "display:none");
                el.innerHTML = "Account verified successful";
                let obj = res.data;
                localStorage.setItem("is_verified", 1);
                if (obj.user_type == "admin")
                  window.location = '/companies';
                else
                  window.location = '/destinations';

              """),format.raw/*233.15*/("""}"""),format.raw/*233.16*/(""" """),format.raw/*233.17*/("""else """),format.raw/*233.22*/("""{"""),format.raw/*233.23*/("""
                """),format.raw/*234.17*/("""let el = document.querySelector("#responseFail");
                el.setAttribute("style", "display:block");
                document.querySelector("#responseSuccess").setAttribute("style", "display:none");
                el.innerHTML = res.message;
              """),format.raw/*238.15*/("""}"""),format.raw/*238.16*/("""
              """),format.raw/*239.15*/("""clearResponse();

            """),format.raw/*241.13*/("""}"""),format.raw/*241.14*/("""
            """),format.raw/*242.13*/("""async function resendCode() """),format.raw/*242.41*/("""{"""),format.raw/*242.42*/("""
              """),format.raw/*243.15*/("""const data = """),format.raw/*243.28*/("""{"""),format.raw/*243.29*/("""
                """),format.raw/*244.17*/("""email: localStorage.getItem("email")
              """),format.raw/*245.15*/("""}"""),format.raw/*245.16*/("""
              """),format.raw/*246.15*/("""var requestOptions = """),format.raw/*246.36*/("""{"""),format.raw/*246.37*/("""
                """),format.raw/*247.17*/("""method: 'POST',
                body: JSON.stringify(data),
                headers: """),format.raw/*249.26*/("""{"""),format.raw/*249.27*/("""
                  """),format.raw/*250.19*/(""""Content-Type": "application/json"
                """),format.raw/*251.17*/("""}"""),format.raw/*251.18*/("""
              """),format.raw/*252.15*/("""}"""),format.raw/*252.16*/(""";
              const res = await fetch(`$"""),format.raw/*253.41*/("""{"""),format.raw/*253.42*/("""apiUrl"""),format.raw/*253.48*/("""}"""),format.raw/*253.49*/("""/user/resend/code`, requestOptions)
                      .then(response => response.json())
                      .then(result => result)
                      .catch(error => console.log('error', error));
              if (res.status) """),format.raw/*257.31*/("""{"""),format.raw/*257.32*/("""
                """),format.raw/*258.17*/("""let el = document.querySelector("#responseSuccess");
                el.setAttribute("style", "display:block");
                document.querySelector("#responseFail").setAttribute("style", "display:none");
                el.innerHTML = res.message;
              """),format.raw/*262.15*/("""}"""),format.raw/*262.16*/(""" """),format.raw/*262.17*/("""else """),format.raw/*262.22*/("""{"""),format.raw/*262.23*/("""
                """),format.raw/*263.17*/("""let el = document.querySelector("#responseFail");
                el.setAttribute("style", "display:block");
                document.querySelector("#responseSuccess").setAttribute("style", "display:none");
                el.innerHTML = res.message;
              """),format.raw/*267.15*/("""}"""),format.raw/*267.16*/("""
              """),format.raw/*268.15*/("""clearResponse();
            """),format.raw/*269.13*/("""}"""),format.raw/*269.14*/("""

    """),format.raw/*271.5*/("""</script>

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
                  SOURCE: app/views/login.scala.html
                  HASH: 3fb202eb0feb73ffcc2d8fed41846b50faa8a393
                  MATRIX: 989->0|4567->3551|4582->3557|4628->3581|6274->5198|6304->5199|6339->5206|6382->5220|6412->5221|6449->5230|6498->5251|6527->5252|6562->5259|6665->5334|6694->5335|6725->5338|7177->5761|7207->5762|7249->5775|7483->5980|7513->5981|7555->5994|7636->6046|7666->6047|7710->6062|7841->6164|7871->6165|7913->6178|7995->6231|8025->6232|8069->6247|8165->6314|8195->6315|8237->6328|8319->6381|8349->6382|8393->6397|8486->6461|8516->6462|8559->6476|8618->6506|8648->6507|8692->6522|8739->6540|8769->6541|8815->6558|8936->6650|8966->6651|9014->6670|9091->6718|9121->6719|9151->6720|9185->6725|9215->6726|9263->6745|9343->6796|9373->6797|9417->6812|9447->6813|9489->6826|9519->6827|9562->6841|9613->6863|9643->6864|9687->6879|9779->6942|9809->6943|9852->6957|9904->6980|9934->6981|9978->6996|10168->7157|10198->7158|10244->7175|10402->7304|10432->7305|10476->7320|10604->7419|10634->7420|10680->7437|10950->7678|10980->7679|11024->7694|11074->7715|11104->7716|11150->7733|11264->7818|11294->7819|11342->7838|11422->7889|11452->7890|11496->7905|11526->7906|11597->7948|11627->7949|11662->7955|11692->7956|11946->8181|11976->8182|12022->8199|12895->9043|12925->9044|12973->9063|13178->9239|13208->9240|13241->9244|13271->9245|13319->9264|13509->9425|13539->9426|13583->9441|13613->9442|13643->9443|13677->9448|13707->9449|13753->9466|13956->9640|13986->9641|14028->9654|14058->9655|14100->9668|14160->9699|14190->9700|14234->9715|14276->9728|14306->9729|14352->9746|14452->9817|14482->9818|14526->9833|14576->9854|14606->9855|14652->9872|14766->9957|14796->9958|14844->9977|14924->10028|14954->10029|14998->10044|15028->10045|15099->10087|15129->10088|15164->10094|15194->10095|15230->10102|15260->10103|15315->10129|15345->10130|15600->10356|15630->10357|15676->10374|16251->10920|16281->10921|16311->10922|16345->10927|16375->10928|16421->10945|16715->11210|16745->11211|16789->11226|16848->11256|16878->11257|16920->11270|16977->11298|17007->11299|17051->11314|17093->11327|17123->11328|17169->11345|17249->11396|17279->11397|17323->11412|17373->11433|17403->11434|17449->11451|17563->11536|17593->11537|17641->11556|17721->11607|17751->11608|17795->11623|17825->11624|17896->11666|17926->11667|17961->11673|17991->11674|18257->11911|18287->11912|18333->11929|18627->12194|18657->12195|18687->12196|18721->12201|18751->12202|18797->12219|19091->12484|19121->12485|19165->12500|19223->12529|19253->12530|19287->12536
                  LINES: 32->1|103->72|103->72|103->72|134->103|134->103|135->104|135->104|135->104|136->105|137->106|137->106|138->107|139->108|139->108|140->109|147->116|147->116|148->117|151->120|151->120|152->121|152->121|152->121|153->122|156->125|156->125|157->126|157->126|157->126|158->127|160->129|160->129|161->130|161->130|161->130|162->131|164->133|164->133|166->135|166->135|166->135|167->136|167->136|167->136|168->137|169->138|169->138|170->139|171->140|171->140|171->140|171->140|171->140|172->141|173->142|173->142|174->143|174->143|175->144|175->144|177->146|177->146|177->146|178->147|179->148|179->148|181->150|181->150|181->150|182->151|184->153|184->153|185->154|187->156|187->156|188->157|189->158|189->158|190->159|195->164|195->164|196->165|196->165|196->165|197->166|199->168|199->168|200->169|201->170|201->170|202->171|202->171|203->172|203->172|203->172|203->172|207->176|207->176|208->177|222->191|222->191|223->192|227->196|227->196|227->196|227->196|228->197|230->199|230->199|231->200|231->200|231->200|231->200|231->200|232->201|235->204|235->204|236->205|236->205|237->206|237->206|237->206|238->207|238->207|238->207|239->208|240->209|240->209|241->210|241->210|241->210|242->211|244->213|244->213|245->214|246->215|246->215|247->216|247->216|248->217|248->217|248->217|248->217|248->217|248->217|248->217|248->217|252->221|252->221|253->222|264->233|264->233|264->233|264->233|264->233|265->234|269->238|269->238|270->239|272->241|272->241|273->242|273->242|273->242|274->243|274->243|274->243|275->244|276->245|276->245|277->246|277->246|277->246|278->247|280->249|280->249|281->250|282->251|282->251|283->252|283->252|284->253|284->253|284->253|284->253|288->257|288->257|289->258|293->262|293->262|293->262|293->262|293->262|294->263|298->267|298->267|299->268|300->269|300->269|302->271
                  -- GENERATED --
              */
          