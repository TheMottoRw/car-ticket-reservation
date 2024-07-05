// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSchedules Schedules = new controllers.ReverseSchedules(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUsers Users = new controllers.ReverseUsers(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseReservations Reservations = new controllers.ReverseReservations(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseViewController ViewController = new controllers.ReverseViewController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseStations Stations = new controllers.ReverseStations(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDestinations Destinations = new controllers.ReverseDestinations(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSchedules Schedules = new controllers.javascript.ReverseSchedules(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUsers Users = new controllers.javascript.ReverseUsers(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseReservations Reservations = new controllers.javascript.ReverseReservations(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseViewController ViewController = new controllers.javascript.ReverseViewController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseStations Stations = new controllers.javascript.ReverseStations(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDestinations Destinations = new controllers.javascript.ReverseDestinations(RoutesPrefix.byNamePrefix());
  }

}
