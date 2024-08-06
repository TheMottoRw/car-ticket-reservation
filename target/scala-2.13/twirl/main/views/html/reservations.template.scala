
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

object reservations extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/layout/*1.8*/.main("Reservations")/*1.29*/("Reservation made")/*1.49*/ {_display_(Seq[Any](format.raw/*1.51*/("""
    """),format.raw/*2.5*/("""<div class="container-fluid py-4">
        <div class="row">
            <div class="col-12">
                <div class="card mb-4">
                    <div class="card-header pb-0">
                        <h6>Reservations made</h6>
                    </div>
                    <div class="card-body px-0 pt-0 pb-2">
                        <div class="table-responsive p-0">
                            <table class="table align-items-center mb-0">
                                <thead>
                                    <tr>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            #Count</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            Passenger</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            Pickup station</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">
                                            From-To</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            Time</th>
                                        <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">
                                            Bus</th>
                                    </tr>
                                </thead>
                                <tbody id="reservations-data">
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        """),_display_(/*36.10*/commons/*36.17*/.footer()),format.raw/*36.26*/("""
    """),format.raw/*37.5*/("""</div>
    <script>
            window.addEventListener("DOMContentLoaded", function () """),format.raw/*39.69*/("""{"""),format.raw/*39.70*/("""
                """),format.raw/*40.17*/("""const urlArr = getUrlParams();
                const id = urlArr[urlArr.length - 1];
                loadData();

                async function loadData() """),format.raw/*44.43*/("""{"""),format.raw/*44.44*/("""
                    """),format.raw/*45.21*/("""var requestOptions = """),format.raw/*45.42*/("""{"""),format.raw/*45.43*/("""
                        """),format.raw/*46.25*/("""method: 'GET',
                        headers: """),format.raw/*47.34*/("""{"""),format.raw/*47.35*/("""
                            """),format.raw/*48.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*49.54*/("""{"""),format.raw/*49.55*/("""localStorage.getItem("token")"""),format.raw/*49.84*/("""}"""),format.raw/*49.85*/("""`
                        """),format.raw/*50.25*/("""}"""),format.raw/*50.26*/("""
                    """),format.raw/*51.21*/("""}"""),format.raw/*51.22*/(""";
                    const data = await fetch(`$"""),format.raw/*52.48*/("""{"""),format.raw/*52.49*/("""apiUrl"""),format.raw/*52.55*/("""}"""),format.raw/*52.56*/("""/schedule/$"""),format.raw/*52.67*/("""{"""),format.raw/*52.68*/("""id"""),format.raw/*52.70*/("""}"""),format.raw/*52.71*/("""/reservations`, requestOptions)
                            .then(response => response.json())
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    setContent(data);
                """),format.raw/*57.17*/("""}"""),format.raw/*57.18*/("""

                """),format.raw/*59.17*/("""function setContent(arr) """),format.raw/*59.42*/("""{"""),format.raw/*59.43*/("""
                    """),format.raw/*60.21*/("""var data = '';
                    for (var i = 0; i < arr.length; i++) """),format.raw/*61.58*/("""{"""),format.raw/*61.59*/("""

                        """),format.raw/*63.25*/("""data+=`<tr>

                        <th>
                            <p class="font-weight-bold mb-0 ml-2">$"""),format.raw/*66.68*/("""{"""),format.raw/*66.69*/("""i+1"""),format.raw/*66.72*/("""}"""),format.raw/*66.73*/("""</p>
                        </th>
                        <td>
                            <p class="text-secondary mb-0">$"""),format.raw/*69.61*/("""{"""),format.raw/*69.62*/("""arr[i].passenger.name"""),format.raw/*69.83*/("""}"""),format.raw/*69.84*/("""<br>$"""),format.raw/*69.89*/("""{"""),format.raw/*69.90*/("""arr[i].passenger.phone"""),format.raw/*69.112*/("""}"""),format.raw/*69.113*/("""</p>
                        </td>
                        <td>
                            <p class="text-secondary mb-0">$"""),format.raw/*72.61*/("""{"""),format.raw/*72.62*/("""arr[i].pickup_station.name"""),format.raw/*72.88*/("""}"""),format.raw/*72.89*/("""</p>
                        </td>
                        <td>
                            <div class="d-flex px-2 py-1">
                                <div class="d-flex flex-column justify-content-center">
                                    <p class="mb-0 text-secondary">$"""),format.raw/*77.69*/("""{"""),format.raw/*77.70*/("""arr[i].schedule.destination.departure"""),format.raw/*77.107*/("""}"""),format.raw/*77.108*/("""-$"""),format.raw/*77.110*/("""{"""),format.raw/*77.111*/("""arr[i].schedule.destination.arrival"""),format.raw/*77.146*/("""}"""),format.raw/*77.147*/("""</p>
                                </div>
                            </div>
                        </td>
                        <td>
                            <p class="text-secondary mb-0">$"""),format.raw/*82.61*/("""{"""),format.raw/*82.62*/("""getDate(arr[i].schedule.departure_date)"""),format.raw/*82.101*/("""}"""),format.raw/*82.102*/("""</p>
                        </td>
<td>
                            <p class="text-secondary mb-0">$"""),format.raw/*85.61*/("""{"""),format.raw/*85.62*/("""arr[i].schedule.bus_plate_no"""),format.raw/*85.90*/("""}"""),format.raw/*85.91*/("""</p>
                        </td>
                    </tr>`
                    """),format.raw/*88.21*/("""}"""),format.raw/*88.22*/("""
                    """),format.raw/*89.21*/("""document.querySelector("#reservations-data").innerHTML = data;
                """),format.raw/*90.17*/("""}"""),format.raw/*90.18*/("""

                """),format.raw/*92.17*/("""async function confirmDelete(obj) """),format.raw/*92.51*/("""{"""),format.raw/*92.52*/("""
                    """),format.raw/*93.21*/("""isConfirmed = confirm(`Are you sure you want to deleting schedule`)
                    if (!isConfirmed) console.log(`delete of $"""),format.raw/*94.63*/("""{"""),format.raw/*94.64*/("""obj.getAttribute('data-id')"""),format.raw/*94.91*/("""}"""),format.raw/*94.92*/(""" """),format.raw/*94.93*/("""cancelled`)
                    if (isConfirmed) """),format.raw/*95.38*/("""{"""),format.raw/*95.39*/("""
                        """),format.raw/*96.25*/("""deleteData(obj.getAttribute("data-id"));
                    """),format.raw/*97.21*/("""}"""),format.raw/*97.22*/("""
                """),format.raw/*98.17*/("""}"""),format.raw/*98.18*/("""

                """),format.raw/*100.17*/("""async function deleteData(id) """),format.raw/*100.47*/("""{"""),format.raw/*100.48*/("""
                    """),format.raw/*101.21*/("""var requestOptions = """),format.raw/*101.42*/("""{"""),format.raw/*101.43*/("""
                        """),format.raw/*102.25*/("""method: 'POST',
                        body: JSON.stringify("""),format.raw/*103.46*/("""{"""),format.raw/*103.47*/("""user_id: localStorage.getItem("id")"""),format.raw/*103.82*/("""}"""),format.raw/*103.83*/("""),
                        headers: """),format.raw/*104.34*/("""{"""),format.raw/*104.35*/("""
                            """),format.raw/*105.29*/(""""Content-Type": "application/json",
                            "Authorization":`Bearer $"""),format.raw/*106.54*/("""{"""),format.raw/*106.55*/("""localStorage.getItem("token")"""),format.raw/*106.84*/("""}"""),format.raw/*106.85*/("""`
                        """),format.raw/*107.25*/("""}"""),format.raw/*107.26*/("""
                    """),format.raw/*108.21*/("""}"""),format.raw/*108.22*/(""";
                    console.log(requestOptions)
                    let url = `$"""),format.raw/*110.33*/("""{"""),format.raw/*110.34*/("""apiUrl"""),format.raw/*110.40*/("""}"""),format.raw/*110.41*/("""/schedule/$"""),format.raw/*110.52*/("""{"""),format.raw/*110.53*/("""id"""),format.raw/*110.55*/("""}"""),format.raw/*110.56*/("""/delete`;
                    const data = await fetch(url, requestOptions)
                            .then(response => response.json())
                            .then(result => result)
                            .catch(error => console.log('error', error));
                    var el = "";
                    if (data.status) """),format.raw/*116.38*/("""{"""),format.raw/*116.39*/("""
                        """),format.raw/*117.25*/("""el = document.getElementById("responseSuccess");
                        document.getElementById("responseFail").style.display = 'none';
                        loadData();
                    """),format.raw/*120.21*/("""}"""),format.raw/*120.22*/(""" """),format.raw/*120.23*/("""else """),format.raw/*120.28*/("""{"""),format.raw/*120.29*/("""
                        """),format.raw/*121.25*/("""el = document.getElementById("responseFail");
                        document.getElementById("responseSuccess").style.display = 'none';
                    """),format.raw/*123.21*/("""}"""),format.raw/*123.22*/("""
                    """),format.raw/*124.21*/("""el.style = 'display:block';
                    el.innerHTML = data.message;
                """),format.raw/*126.17*/("""}"""),format.raw/*126.18*/("""
            """),format.raw/*127.13*/("""}"""),format.raw/*127.14*/(""");




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
                  SOURCE: app/views/reservations.scala.html
                  HASH: 11e782f9c93b119352bddd13f2333704b1f3ca72
                  MATRIX: 996->1|1009->7|1038->28|1066->48|1105->50|1136->55|3121->2013|3137->2020|3167->2029|3199->2034|3315->2122|3344->2123|3389->2140|3573->2296|3602->2297|3651->2318|3700->2339|3729->2340|3782->2365|3858->2413|3887->2414|3944->2443|4061->2532|4090->2533|4147->2562|4176->2563|4230->2589|4259->2590|4308->2611|4337->2612|4414->2661|4443->2662|4477->2668|4506->2669|4545->2680|4574->2681|4604->2683|4633->2684|4936->2959|4965->2960|5011->2978|5064->3003|5093->3004|5142->3025|5242->3097|5271->3098|5325->3124|5462->3233|5491->3234|5522->3237|5551->3238|5703->3362|5732->3363|5781->3384|5810->3385|5843->3390|5872->3391|5923->3413|5953->3414|6105->3538|6134->3539|6188->3565|6217->3566|6524->3845|6553->3846|6619->3883|6649->3884|6680->3886|6710->3887|6774->3922|6804->3923|7030->4121|7059->4122|7127->4161|7157->4162|7285->4262|7314->4263|7370->4291|7399->4292|7509->4374|7538->4375|7587->4396|7694->4475|7723->4476|7769->4494|7831->4528|7860->4529|7909->4550|8067->4680|8096->4681|8151->4708|8180->4709|8209->4710|8286->4759|8315->4760|8368->4785|8457->4846|8486->4847|8531->4864|8560->4865|8607->4883|8666->4913|8696->4914|8746->4935|8796->4956|8826->4957|8880->4982|8970->5043|9000->5044|9064->5079|9094->5080|9159->5116|9189->5117|9247->5146|9365->5235|9395->5236|9453->5265|9483->5266|9538->5292|9568->5293|9618->5314|9648->5315|9759->5397|9789->5398|9824->5404|9854->5405|9894->5416|9924->5417|9955->5419|9985->5420|10349->5755|10379->5756|10433->5781|10655->5974|10685->5975|10715->5976|10749->5981|10779->5982|10833->6007|11019->6164|11049->6165|11099->6186|11221->6279|11251->6280|11293->6293|11323->6294
                  LINES: 32->1|32->1|32->1|32->1|32->1|33->2|67->36|67->36|67->36|68->37|70->39|70->39|71->40|75->44|75->44|76->45|76->45|76->45|77->46|78->47|78->47|79->48|80->49|80->49|80->49|80->49|81->50|81->50|82->51|82->51|83->52|83->52|83->52|83->52|83->52|83->52|83->52|83->52|88->57|88->57|90->59|90->59|90->59|91->60|92->61|92->61|94->63|97->66|97->66|97->66|97->66|100->69|100->69|100->69|100->69|100->69|100->69|100->69|100->69|103->72|103->72|103->72|103->72|108->77|108->77|108->77|108->77|108->77|108->77|108->77|108->77|113->82|113->82|113->82|113->82|116->85|116->85|116->85|116->85|119->88|119->88|120->89|121->90|121->90|123->92|123->92|123->92|124->93|125->94|125->94|125->94|125->94|125->94|126->95|126->95|127->96|128->97|128->97|129->98|129->98|131->100|131->100|131->100|132->101|132->101|132->101|133->102|134->103|134->103|134->103|134->103|135->104|135->104|136->105|137->106|137->106|137->106|137->106|138->107|138->107|139->108|139->108|141->110|141->110|141->110|141->110|141->110|141->110|141->110|141->110|147->116|147->116|148->117|151->120|151->120|151->120|151->120|151->120|152->121|154->123|154->123|155->124|157->126|157->126|158->127|158->127
                  -- GENERATED --
              */
          