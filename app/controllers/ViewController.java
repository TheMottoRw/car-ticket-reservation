package controllers;

import play.mvc.Controller;
import play.mvc.Result;

import static play.mvc.Results.ok;

public class ViewController extends Controller {
    public Result index() {
        return ok(views.html.companies.render());
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
}
