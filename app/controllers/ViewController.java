package controllers;

import play.mvc.Controller;
import play.mvc.Result;

import static play.mvc.Results.ok;

public class ViewController extends Controller {
    public Result index() {
        return ok(views.html.companies.render());
    }
    public Result destinations() {
        return ok(views.html.destinations.render());
    }
}
