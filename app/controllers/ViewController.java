package controllers;

import play.mvc.Controller;
import play.mvc.Result;

import static play.mvc.Results.ok;

public class ViewController extends Controller {
    public Result index() {
        return redirect("/login");
    }
    public Result signup() {
        return ok(views.html.signup.render());
    }
    public Result login() {
        return ok(views.html.login.render());
    }
    public Result companies() {
        return ok(views.html.companies.render());
    }
    public Result companyAdd() {
        return ok(views.html.companyAdd.render());
    }
    public Result companyUpdate(String id) {
        return ok(views.html.companyUpdate.render());
    }
    public Result destinationAdd() {
        return ok(views.html.destinationAdd.render());
    }
    public Result destinationUpdate(String id) {
        return ok(views.html.destinationUpdate.render());
    }
    public Result destinations() {
        return ok(views.html.destinations.render());
    }
    public Result stationAdd() {
        return ok(views.html.stationAdd.render());
    }
    public Result stationUpdate(String id) {
        return ok(views.html.stationUpdate.render());
    }
    public Result stations() {
        return ok(views.html.stations.render());
    }
    public Result scheduleAdd() {
        return ok(views.html.scheduleAdd.render());
    }
    public Result scheduleUpdate(String id) {
        return ok(views.html.scheduleUpdate.render());
    }
    public Result schedules() {
        return ok(views.html.schedules.render());
    }
    public Result driverAdd() {
        return ok(views.html.driverAdd.render());
    }
    public Result driverUpdate(String id) {
        return ok(views.html.driverUpdate.render());
    }
    public Result drivers() {
        return ok(views.html.drivers.render());
    }
    public Result reservations(String scheduleId) {
        return ok(views.html.reservations.render());
    }
}
