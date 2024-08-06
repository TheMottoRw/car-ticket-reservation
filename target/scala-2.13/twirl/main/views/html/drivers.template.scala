
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

object drivers extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/layout/*1.8*/.main("Registered drivers")/*1.35*/("Drivers")/*1.46*/ {_display_(Seq[Any](format.raw/*1.48*/("""
    """),format.raw/*2.5*/("""<div class="container-fluid py-4">
        <div class="row">
            <div class="col-12">
                <div class="card mb-4">
                    <div class="card-header pb-0">
                        <h6>Registered drivers <a href=""""),_display_(/*7.58*/routes/*7.64*/.ViewController.driverAdd()),format.raw/*7.91*/("""" class="btn btn-dark btn-sm" style="margin-left:70% ">Add driver</a> </h6>
                    </div>
                    <div class="card-body px-0 pt-0 pb-2">
                        <div class="table-responsive p-0">
                            <div class="alert alert-success" id="responseSuccess" style="display: none"></div>
                            <div class="alert alert-danger" id="responseFail" style="display: none"></div>
                            <table class="table align-items-center mb-0">
                                <thead>
                                    <tr>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            #Count</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            Names</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">
                                            Email</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            Phone</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            Status</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            Registered on</th>
                                        <th class="text-secondary opacity-7">Action</th>
                                    </tr>
                                </thead>
                                <tbody id="table-data">
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        """),_display_(/*39.10*/commons/*39.17*/.footer()),format.raw/*39.26*/("""
    """),format.raw/*40.5*/("""</div>
    <script>
            window.addEventListener("DOMContentLoaded", function () """),format.raw/*42.69*/("""{"""),format.raw/*42.70*/("""
                """),format.raw/*43.17*/("""loadData();
            """),format.raw/*44.13*/("""}"""),format.raw/*44.14*/(""");

            async function loadData() """),format.raw/*46.39*/("""{"""),format.raw/*46.40*/("""
                """),format.raw/*47.17*/("""var requestOptions = """),format.raw/*47.38*/("""{"""),format.raw/*47.39*/("""
                    """),format.raw/*48.21*/("""method: 'GET',
                    headers: """),format.raw/*49.30*/("""{"""),format.raw/*49.31*/("""
                        """),format.raw/*50.25*/(""""Content-Type": "application/json",
                        "Authorization":`Bearer $"""),format.raw/*51.50*/("""{"""),format.raw/*51.51*/("""localStorage.getItem("token")"""),format.raw/*51.80*/("""}"""),format.raw/*51.81*/("""`
                    """),format.raw/*52.21*/("""}"""),format.raw/*52.22*/("""
                """),format.raw/*53.17*/("""}"""),format.raw/*53.18*/(""";
                const data = await fetch(`$"""),format.raw/*54.44*/("""{"""),format.raw/*54.45*/("""apiUrl"""),format.raw/*54.51*/("""}"""),format.raw/*54.52*/("""/users/type?user_type=driver`, requestOptions)
                        .then(response => response.json())
                        .then(result => result)
                        .catch(error => console.log('error', error));
                setContent(data);
            """),format.raw/*59.13*/("""}"""),format.raw/*59.14*/("""

            """),format.raw/*61.13*/("""function setContent(arr) """),format.raw/*61.38*/("""{"""),format.raw/*61.39*/("""
                """),format.raw/*62.17*/("""var data = '';
                for (var i = 0; i < arr.length; i++) """),format.raw/*63.54*/("""{"""),format.raw/*63.55*/("""

                    """),format.raw/*65.21*/("""data+=`<tr>

                        <td>
                            <p class="font-weight-bold mb-0 ml-2">$"""),format.raw/*68.68*/("""{"""),format.raw/*68.69*/("""i+1"""),format.raw/*68.72*/("""}"""),format.raw/*68.73*/("""</p>
                        </td>
                        <td>
                            <div class="d-flex px-2 py-1">
                                <div class="d-flex flex-column justify-content-center">
                                    <p class="mb-0 text-secondary">$"""),format.raw/*73.69*/("""{"""),format.raw/*73.70*/("""arr[i].name"""),format.raw/*73.81*/("""}"""),format.raw/*73.82*/("""</p>
                                </div>
                            </div>
                        </td>
                        <td>
                            <p class="text-secondary mb-0">$"""),format.raw/*78.61*/("""{"""),format.raw/*78.62*/("""arr[i].email"""),format.raw/*78.74*/("""}"""),format.raw/*78.75*/("""</p>
                        </td>
                        <td>
                            <p class="text-secondary mb-0">$"""),format.raw/*81.61*/("""{"""),format.raw/*81.62*/("""arr[i].phone"""),format.raw/*81.74*/("""}"""),format.raw/*81.75*/("""</p>
                        </td>
                        <td>
                            <p class="text-secondary mb-0">$"""),format.raw/*84.61*/("""{"""),format.raw/*84.62*/("""arr[i].status"""),format.raw/*84.75*/("""}"""),format.raw/*84.76*/(""" """),format.raw/*84.77*/("""</p>
                        </td>
                        <td>
                            <p class="text-secondary mb-0">$"""),format.raw/*87.61*/("""{"""),format.raw/*87.62*/("""getDate(arr[i].created_at).substring(0,16)"""),format.raw/*87.104*/("""}"""),format.raw/*87.105*/("""</p>
                        </td>
                        <td class="align-middle">
                            <a href="/driver/$"""),format.raw/*90.47*/("""{"""),format.raw/*90.48*/("""arr[i].id"""),format.raw/*90.57*/("""}"""),format.raw/*90.58*/("""" class="text-secondary font-weight-bold text-xs" data-toggle="tooltip" data-original-title="Edit destination">
                                Edit
                            </a>
                            <a href="#" class="text-danger font-weight-bold text-xs" data-toggle="tooltip" data-original-title="Delete company" data-id="$"""),format.raw/*93.155*/("""{"""),format.raw/*93.156*/("""arr[i].id"""),format.raw/*93.165*/("""}"""),format.raw/*93.166*/("""" onclick="confirmDelete(this)">
                                delete
                            </a>
                        </td>
                    </tr>`
                """),format.raw/*98.17*/("""}"""),format.raw/*98.18*/("""
                """),format.raw/*99.17*/("""document.querySelector("#table-data").innerHTML = data;
            """),format.raw/*100.13*/("""}"""),format.raw/*100.14*/("""

            """),format.raw/*102.13*/("""async function confirmDelete(obj) """),format.raw/*102.47*/("""{"""),format.raw/*102.48*/("""
                """),format.raw/*103.17*/("""isConfirmed = confirm(`Are you sure you want to deleting company`)
                if (!isConfirmed) console.log(`delete of $"""),format.raw/*104.59*/("""{"""),format.raw/*104.60*/("""obj.getAttribute('data-id')"""),format.raw/*104.87*/("""}"""),format.raw/*104.88*/(""" """),format.raw/*104.89*/("""cancelled`)
                if (isConfirmed) """),format.raw/*105.34*/("""{"""),format.raw/*105.35*/("""
                    """),format.raw/*106.21*/("""deleteData(obj.getAttribute("data-id"));
                """),format.raw/*107.17*/("""}"""),format.raw/*107.18*/("""
            """),format.raw/*108.13*/("""}"""),format.raw/*108.14*/("""

            """),format.raw/*110.13*/("""async function deleteData(id) """),format.raw/*110.43*/("""{"""),format.raw/*110.44*/("""
                """),format.raw/*111.17*/("""var requestOptions = """),format.raw/*111.38*/("""{"""),format.raw/*111.39*/("""
                    """),format.raw/*112.21*/("""method: 'POST',
                    body: JSON.stringify("""),format.raw/*113.42*/("""{"""),format.raw/*113.43*/("""user_id: localStorage.getItem("id")"""),format.raw/*113.78*/("""}"""),format.raw/*113.79*/("""),
                    headers: """),format.raw/*114.30*/("""{"""),format.raw/*114.31*/("""
                        """),format.raw/*115.25*/(""""Content-Type": "application/json",
                        "Authorization":`Bearer $"""),format.raw/*116.50*/("""{"""),format.raw/*116.51*/("""localStorage.getItem("token")"""),format.raw/*116.80*/("""}"""),format.raw/*116.81*/("""`
                    """),format.raw/*117.21*/("""}"""),format.raw/*117.22*/("""
                """),format.raw/*118.17*/("""}"""),format.raw/*118.18*/(""";
                console.log(requestOptions)
                let url = `$"""),format.raw/*120.29*/("""{"""),format.raw/*120.30*/("""apiUrl"""),format.raw/*120.36*/("""}"""),format.raw/*120.37*/("""/user/$"""),format.raw/*120.44*/("""{"""),format.raw/*120.45*/("""id"""),format.raw/*120.47*/("""}"""),format.raw/*120.48*/("""/delete`;
                const data = await fetch(url, requestOptions)
                        .then(response => response.json())
                        .then(result => result)
                        .catch(error => console.log('error', error));
                var el = "";
                if (data.status) """),format.raw/*126.34*/("""{"""),format.raw/*126.35*/("""
                    """),format.raw/*127.21*/("""el = document.getElementById("responseSuccess");
                    document.getElementById("responseFail").style.display = 'none';
                    loadData();
                """),format.raw/*130.17*/("""}"""),format.raw/*130.18*/(""" """),format.raw/*130.19*/("""else """),format.raw/*130.24*/("""{"""),format.raw/*130.25*/("""
                    """),format.raw/*131.21*/("""el = document.getElementById("responseFail");
                    document.getElementById("responseSuccess").style.display = 'none';
                """),format.raw/*133.17*/("""}"""),format.raw/*133.18*/("""
                """),format.raw/*134.17*/("""el.style = 'display:block';
                el.innerHTML = data.message;
                clearResponse();
            """),format.raw/*137.13*/("""}"""),format.raw/*137.14*/("""


    """),format.raw/*140.5*/("""</script>

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
                  SOURCE: app/views/drivers.scala.html
                  HASH: ed9649bc86b99ad4559da255926c00a883a0e60d
                  MATRIX: 991->1|1004->7|1039->34|1058->45|1097->47|1128->52|1396->294|1410->300|1457->327|3579->2422|3595->2429|3625->2438|3657->2443|3773->2531|3802->2532|3847->2549|3899->2573|3928->2574|3998->2616|4027->2617|4072->2634|4121->2655|4150->2656|4199->2677|4271->2721|4300->2722|4353->2747|4466->2832|4495->2833|4552->2862|4581->2863|4631->2885|4660->2886|4705->2903|4734->2904|4807->2949|4836->2950|4870->2956|4899->2957|5197->3227|5226->3228|5268->3242|5321->3267|5350->3268|5395->3285|5491->3353|5520->3354|5570->3376|5707->3485|5736->3486|5767->3489|5796->3490|6103->3769|6132->3770|6171->3781|6200->3782|6426->3980|6455->3981|6495->3993|6524->3994|6676->4118|6705->4119|6745->4131|6774->4132|6926->4256|6955->4257|6996->4270|7025->4271|7054->4272|7206->4396|7235->4397|7306->4439|7336->4440|7495->4571|7524->4572|7561->4581|7590->4582|7955->4918|7985->4919|8023->4928|8053->4929|8259->5107|8288->5108|8333->5125|8430->5193|8460->5194|8503->5208|8566->5242|8596->5243|8642->5260|8796->5385|8826->5386|8882->5413|8912->5414|8942->5415|9016->5460|9046->5461|9096->5482|9182->5539|9212->5540|9254->5553|9284->5554|9327->5568|9386->5598|9416->5599|9462->5616|9512->5637|9542->5638|9592->5659|9678->5716|9708->5717|9772->5752|9802->5753|9863->5785|9893->5786|9947->5811|10061->5896|10091->5897|10149->5926|10179->5927|10230->5949|10260->5950|10306->5967|10336->5968|10439->6042|10469->6043|10504->6049|10534->6050|10570->6057|10600->6058|10631->6060|10661->6061|11001->6372|11031->6373|11081->6394|11291->6575|11321->6576|11351->6577|11385->6582|11415->6583|11465->6604|11643->6753|11673->6754|11719->6771|11866->6889|11896->6890|11931->6897
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|38->7|38->7|38->7|70->39|70->39|70->39|71->40|73->42|73->42|74->43|75->44|75->44|77->46|77->46|78->47|78->47|78->47|79->48|80->49|80->49|81->50|82->51|82->51|82->51|82->51|83->52|83->52|84->53|84->53|85->54|85->54|85->54|85->54|90->59|90->59|92->61|92->61|92->61|93->62|94->63|94->63|96->65|99->68|99->68|99->68|99->68|104->73|104->73|104->73|104->73|109->78|109->78|109->78|109->78|112->81|112->81|112->81|112->81|115->84|115->84|115->84|115->84|115->84|118->87|118->87|118->87|118->87|121->90|121->90|121->90|121->90|124->93|124->93|124->93|124->93|129->98|129->98|130->99|131->100|131->100|133->102|133->102|133->102|134->103|135->104|135->104|135->104|135->104|135->104|136->105|136->105|137->106|138->107|138->107|139->108|139->108|141->110|141->110|141->110|142->111|142->111|142->111|143->112|144->113|144->113|144->113|144->113|145->114|145->114|146->115|147->116|147->116|147->116|147->116|148->117|148->117|149->118|149->118|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|157->126|157->126|158->127|161->130|161->130|161->130|161->130|161->130|162->131|164->133|164->133|165->134|168->137|168->137|171->140
                  -- GENERATED --
              */
          