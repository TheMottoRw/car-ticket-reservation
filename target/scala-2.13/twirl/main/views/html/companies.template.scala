
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

object companies extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/layout/*1.8*/.main("Registered companies")/*1.37*/("Companies")/*1.50*/ {_display_(Seq[Any](format.raw/*1.52*/("""
    """),format.raw/*2.5*/("""<div class="container-fluid py-4">
        <div class="row">
            <div class="col-12">
                <div class="card mb-4">
                    <div class="card-header pb-0">
                        <h6>Registered companies <a href=""""),_display_(/*7.60*/routes/*7.66*/.ViewController.companyAdd()),format.raw/*7.94*/("""" class="btn btn-dark btn-sm" style="margin-left:70% ">Add company</a> </h6>
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
                const data = await fetch(`$"""),format.raw/*54.44*/("""{"""),format.raw/*54.45*/("""apiUrl"""),format.raw/*54.51*/("""}"""),format.raw/*54.52*/("""/users/type?user_type=company`, requestOptions)
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
                            <a href="/company/$"""),format.raw/*90.48*/("""{"""),format.raw/*90.49*/("""arr[i].id"""),format.raw/*90.58*/("""}"""),format.raw/*90.59*/("""" class="text-secondary font-weight-bold text-xs" data-toggle="tooltip" data-original-title="Edit destination">
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
                  SOURCE: app/views/companies.scala.html
                  HASH: 70e8e09afe7ed5ef4caf44f9d86dfebe8a815156
                  MATRIX: 993->1|1006->7|1043->36|1064->49|1103->51|1134->56|1404->300|1418->306|1466->334|3589->2430|3605->2437|3635->2446|3667->2451|3783->2539|3812->2540|3857->2557|3909->2581|3938->2582|4008->2624|4037->2625|4082->2642|4131->2663|4160->2664|4209->2685|4281->2729|4310->2730|4363->2755|4476->2840|4505->2841|4562->2870|4591->2871|4641->2893|4670->2894|4715->2911|4744->2912|4817->2957|4846->2958|4880->2964|4909->2965|5208->3236|5237->3237|5279->3251|5332->3276|5361->3277|5406->3294|5502->3362|5531->3363|5581->3385|5718->3494|5747->3495|5778->3498|5807->3499|6114->3778|6143->3779|6182->3790|6211->3791|6437->3989|6466->3990|6506->4002|6535->4003|6687->4127|6716->4128|6756->4140|6785->4141|6937->4265|6966->4266|7007->4279|7036->4280|7065->4281|7217->4405|7246->4406|7317->4448|7347->4449|7507->4581|7536->4582|7573->4591|7602->4592|7967->4928|7997->4929|8035->4938|8065->4939|8271->5117|8300->5118|8345->5135|8442->5203|8472->5204|8515->5218|8578->5252|8608->5253|8654->5270|8808->5395|8838->5396|8894->5423|8924->5424|8954->5425|9028->5470|9058->5471|9108->5492|9194->5549|9224->5550|9266->5563|9296->5564|9339->5578|9398->5608|9428->5609|9474->5626|9524->5647|9554->5648|9604->5669|9690->5726|9720->5727|9784->5762|9814->5763|9875->5795|9905->5796|9959->5821|10073->5906|10103->5907|10161->5936|10191->5937|10242->5959|10272->5960|10318->5977|10348->5978|10451->6052|10481->6053|10516->6059|10546->6060|10582->6067|10612->6068|10643->6070|10673->6071|11013->6382|11043->6383|11093->6404|11303->6585|11333->6586|11363->6587|11397->6592|11427->6593|11477->6614|11655->6763|11685->6764|11731->6781|11878->6899|11908->6900|11943->6907
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|38->7|38->7|38->7|70->39|70->39|70->39|71->40|73->42|73->42|74->43|75->44|75->44|77->46|77->46|78->47|78->47|78->47|79->48|80->49|80->49|81->50|82->51|82->51|82->51|82->51|83->52|83->52|84->53|84->53|85->54|85->54|85->54|85->54|90->59|90->59|92->61|92->61|92->61|93->62|94->63|94->63|96->65|99->68|99->68|99->68|99->68|104->73|104->73|104->73|104->73|109->78|109->78|109->78|109->78|112->81|112->81|112->81|112->81|115->84|115->84|115->84|115->84|115->84|118->87|118->87|118->87|118->87|121->90|121->90|121->90|121->90|124->93|124->93|124->93|124->93|129->98|129->98|130->99|131->100|131->100|133->102|133->102|133->102|134->103|135->104|135->104|135->104|135->104|135->104|136->105|136->105|137->106|138->107|138->107|139->108|139->108|141->110|141->110|141->110|142->111|142->111|142->111|143->112|144->113|144->113|144->113|144->113|145->114|145->114|146->115|147->116|147->116|147->116|147->116|148->117|148->117|149->118|149->118|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|157->126|157->126|158->127|161->130|161->130|161->130|161->130|161->130|162->131|164->133|164->133|165->134|168->137|168->137|171->140
                  -- GENERATED --
              */
          