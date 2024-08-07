
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

object schedules extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/layout/*1.8*/.main("Registered schedules")/*1.37*/("Schedules")/*1.50*/ {_display_(Seq[Any](format.raw/*1.52*/("""
    """),format.raw/*2.5*/("""<div class="container-fluid py-4">
        <div class="row">
            <div class="col-12">
                <div class="card mb-4">
                    <div class="card-header pb-0">
                        <h6>Available schedulers<a href=""""),_display_(/*7.59*/routes/*7.65*/.ViewController.scheduleAdd()),format.raw/*7.94*/("""" class="btn btn-dark btn-sm" style="margin-left:70% ">Add schedule</a></h6>
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
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">
                                            Destination</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">
                                            Driver</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            Bus</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            Passengers</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            Time</th>
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
                const data = await fetch(`$"""),format.raw/*54.44*/("""{"""),format.raw/*54.45*/("""apiUrl"""),format.raw/*54.51*/("""}"""),format.raw/*54.52*/("""/schedules`, requestOptions)
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
                                    <p class="mb-0 text-secondary">$"""),format.raw/*73.69*/("""{"""),format.raw/*73.70*/("""arr[i].destination.departure"""),format.raw/*73.98*/("""}"""),format.raw/*73.99*/("""-$"""),format.raw/*73.101*/("""{"""),format.raw/*73.102*/("""arr[i].destination.arrival"""),format.raw/*73.128*/("""}"""),format.raw/*73.129*/("""</p>
                                </div>
                            </div>
                        </td>
                        <td>
                            <p class="text-secondary mb-0">$"""),format.raw/*78.61*/("""{"""),format.raw/*78.62*/("""arr[i].driver.name"""),format.raw/*78.80*/("""}"""),format.raw/*78.81*/("""<br>$"""),format.raw/*78.86*/("""{"""),format.raw/*78.87*/("""arr[i].driver.phone"""),format.raw/*78.106*/("""}"""),format.raw/*78.107*/("""</p>
                        </td>
                        <td>
                            <p class="text-secondary mb-0">$"""),format.raw/*81.61*/("""{"""),format.raw/*81.62*/("""arr[i].bus_plate_no"""),format.raw/*81.81*/("""}"""),format.raw/*81.82*/("""</p>
                        </td>
                        <td>
                            <p class="text-secondary mb-0">$"""),format.raw/*84.61*/("""{"""),format.raw/*84.62*/("""arr[i].passenger_limit"""),format.raw/*84.84*/("""}"""),format.raw/*84.85*/("""</p>
                        </td>
                        <td>
                            <p class="text-secondary mb-0">$"""),format.raw/*87.61*/("""{"""),format.raw/*87.62*/("""getDate(arr[i].departure_date)"""),format.raw/*87.92*/("""}"""),format.raw/*87.93*/("""</p>
                        </td>
                        <td class="align-middle">
                            <a href="/reservations/$"""),format.raw/*90.53*/("""{"""),format.raw/*90.54*/("""arr[i].id"""),format.raw/*90.63*/("""}"""),format.raw/*90.64*/("""" class="text-success font-weight-bold text-xs" data-toggle="tooltip" data-original-title="Reservations">
                                Reservations
                            </a>
                            <a href="/schedule/$"""),format.raw/*93.49*/("""{"""),format.raw/*93.50*/("""arr[i].id"""),format.raw/*93.59*/("""}"""),format.raw/*93.60*/("""" class="text-secondary font-weight-bold text-xs" data-toggle="tooltip" data-original-title="Edit destination">
                                Edit
                            </a>
                            <a href="#" class="text-danger font-weight-bold text-xs" data-toggle="tooltip" data-original-title="Delete schedule" data-id="$"""),format.raw/*96.156*/("""{"""),format.raw/*96.157*/("""arr[i].id"""),format.raw/*96.166*/("""}"""),format.raw/*96.167*/("""" onclick="confirmDelete(this)">
                                delete
                            </a>
                        </td>
                    </tr>`
                """),format.raw/*101.17*/("""}"""),format.raw/*101.18*/("""
                """),format.raw/*102.17*/("""document.querySelector("#table-data").innerHTML = data;
            """),format.raw/*103.13*/("""}"""),format.raw/*103.14*/("""

            """),format.raw/*105.13*/("""async function confirmDelete(obj) """),format.raw/*105.47*/("""{"""),format.raw/*105.48*/("""
                """),format.raw/*106.17*/("""isConfirmed = confirm(`Are you sure you want to deleting schedule`)
                if (!isConfirmed) console.log(`delete of $"""),format.raw/*107.59*/("""{"""),format.raw/*107.60*/("""obj.getAttribute('data-id')"""),format.raw/*107.87*/("""}"""),format.raw/*107.88*/(""" """),format.raw/*107.89*/("""cancelled`)
                if (isConfirmed) """),format.raw/*108.34*/("""{"""),format.raw/*108.35*/("""
                    """),format.raw/*109.21*/("""deleteData(obj.getAttribute("data-id"));
                """),format.raw/*110.17*/("""}"""),format.raw/*110.18*/("""
            """),format.raw/*111.13*/("""}"""),format.raw/*111.14*/("""

            """),format.raw/*113.13*/("""async function deleteData(id) """),format.raw/*113.43*/("""{"""),format.raw/*113.44*/("""
                """),format.raw/*114.17*/("""var requestOptions = """),format.raw/*114.38*/("""{"""),format.raw/*114.39*/("""
                    """),format.raw/*115.21*/("""method: 'POST',
                    body: JSON.stringify("""),format.raw/*116.42*/("""{"""),format.raw/*116.43*/("""user_id: localStorage.getItem("id")"""),format.raw/*116.78*/("""}"""),format.raw/*116.79*/("""),
                    headers: """),format.raw/*117.30*/("""{"""),format.raw/*117.31*/("""
                        """),format.raw/*118.25*/(""""Content-Type": "application/json",
                        "Authorization":`Bearer $"""),format.raw/*119.50*/("""{"""),format.raw/*119.51*/("""localStorage.getItem("token")"""),format.raw/*119.80*/("""}"""),format.raw/*119.81*/("""`
                    """),format.raw/*120.21*/("""}"""),format.raw/*120.22*/("""
                """),format.raw/*121.17*/("""}"""),format.raw/*121.18*/(""";
                console.log(requestOptions)
                let url = `$"""),format.raw/*123.29*/("""{"""),format.raw/*123.30*/("""apiUrl"""),format.raw/*123.36*/("""}"""),format.raw/*123.37*/("""/schedule/$"""),format.raw/*123.48*/("""{"""),format.raw/*123.49*/("""id"""),format.raw/*123.51*/("""}"""),format.raw/*123.52*/("""/delete`;
                const data = await fetch(url, requestOptions)
                        .then(response => response.json())
                        .then(result => result)
                        .catch(error => console.log('error', error));
                var el = "";
                if (data.status) """),format.raw/*129.34*/("""{"""),format.raw/*129.35*/("""
                    """),format.raw/*130.21*/("""el = document.getElementById("responseSuccess");
                    document.getElementById("responseFail").style.display = 'none';
                    loadData();
                """),format.raw/*133.17*/("""}"""),format.raw/*133.18*/(""" """),format.raw/*133.19*/("""else """),format.raw/*133.24*/("""{"""),format.raw/*133.25*/("""
                    """),format.raw/*134.21*/("""el = document.getElementById("responseFail");
                    document.getElementById("responseSuccess").style.display = 'none';
                """),format.raw/*136.17*/("""}"""),format.raw/*136.18*/("""
                """),format.raw/*137.17*/("""el.style = 'display:block';
                el.innerHTML = data.message;
            """),format.raw/*139.13*/("""}"""),format.raw/*139.14*/("""


    """),format.raw/*142.5*/("""</script>

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
                  SOURCE: app/views/schedules.scala.html
                  HASH: 6eedbd1e3e39c63c1840f346017266307cd0383f
                  MATRIX: 993->1|1006->7|1043->36|1064->49|1103->51|1134->56|1403->299|1417->305|1466->334|3594->2435|3610->2442|3640->2451|3672->2456|3788->2544|3817->2545|3862->2562|3914->2586|3943->2587|4013->2629|4042->2630|4087->2647|4136->2668|4165->2669|4214->2690|4286->2734|4315->2735|4368->2760|4481->2845|4510->2846|4567->2875|4596->2876|4646->2898|4675->2899|4720->2916|4749->2917|4822->2962|4851->2963|4885->2969|4914->2970|5194->3222|5223->3223|5265->3237|5318->3262|5347->3263|5392->3280|5488->3348|5517->3349|5567->3371|5704->3480|5733->3481|5764->3484|5793->3485|6100->3764|6129->3765|6185->3793|6214->3794|6245->3796|6275->3797|6330->3823|6360->3824|6586->4022|6615->4023|6661->4041|6690->4042|6723->4047|6752->4048|6800->4067|6830->4068|6982->4192|7011->4193|7058->4212|7087->4213|7239->4337|7268->4338|7318->4360|7347->4361|7499->4485|7528->4486|7586->4516|7615->4517|7780->4654|7809->4655|7846->4664|7875->4665|8135->4897|8164->4898|8201->4907|8230->4908|8596->5245|8626->5246|8664->5255|8694->5256|8901->5434|8931->5435|8977->5452|9074->5520|9104->5521|9147->5535|9210->5569|9240->5570|9286->5587|9441->5713|9471->5714|9527->5741|9557->5742|9587->5743|9661->5788|9691->5789|9741->5810|9827->5867|9857->5868|9899->5881|9929->5882|9972->5896|10031->5926|10061->5927|10107->5944|10157->5965|10187->5966|10237->5987|10323->6044|10353->6045|10417->6080|10447->6081|10508->6113|10538->6114|10592->6139|10706->6224|10736->6225|10794->6254|10824->6255|10875->6277|10905->6278|10951->6295|10981->6296|11084->6370|11114->6371|11149->6377|11179->6378|11219->6389|11249->6390|11280->6392|11310->6393|11650->6704|11680->6705|11730->6726|11940->6907|11970->6908|12000->6909|12034->6914|12064->6915|12114->6936|12292->7085|12322->7086|12368->7103|12482->7188|12512->7189|12547->7196
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|38->7|38->7|38->7|70->39|70->39|70->39|71->40|73->42|73->42|74->43|75->44|75->44|77->46|77->46|78->47|78->47|78->47|79->48|80->49|80->49|81->50|82->51|82->51|82->51|82->51|83->52|83->52|84->53|84->53|85->54|85->54|85->54|85->54|90->59|90->59|92->61|92->61|92->61|93->62|94->63|94->63|96->65|99->68|99->68|99->68|99->68|104->73|104->73|104->73|104->73|104->73|104->73|104->73|104->73|109->78|109->78|109->78|109->78|109->78|109->78|109->78|109->78|112->81|112->81|112->81|112->81|115->84|115->84|115->84|115->84|118->87|118->87|118->87|118->87|121->90|121->90|121->90|121->90|124->93|124->93|124->93|124->93|127->96|127->96|127->96|127->96|132->101|132->101|133->102|134->103|134->103|136->105|136->105|136->105|137->106|138->107|138->107|138->107|138->107|138->107|139->108|139->108|140->109|141->110|141->110|142->111|142->111|144->113|144->113|144->113|145->114|145->114|145->114|146->115|147->116|147->116|147->116|147->116|148->117|148->117|149->118|150->119|150->119|150->119|150->119|151->120|151->120|152->121|152->121|154->123|154->123|154->123|154->123|154->123|154->123|154->123|154->123|160->129|160->129|161->130|164->133|164->133|164->133|164->133|164->133|165->134|167->136|167->136|168->137|170->139|170->139|173->142
                  -- GENERATED --
              */
          