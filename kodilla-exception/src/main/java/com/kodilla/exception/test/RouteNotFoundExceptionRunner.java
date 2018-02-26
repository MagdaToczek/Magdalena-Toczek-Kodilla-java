package com.kodilla.exception.test;

public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("MUN", "BCN");
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flight);
        }catch(RouteNotFoundException e) {
            System.out.println("Route is not found");
        }
    }
}