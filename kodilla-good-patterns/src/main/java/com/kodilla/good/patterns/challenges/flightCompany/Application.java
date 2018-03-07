package com.kodilla.good.patterns.challenges.flightCompany;

public class Application {
    public static void main(String[] args){
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlightsFrom("GDN");
        }catch (FlightFinderException e) {
            System.out.println("Flight not found");
        }

        try {
            flightFinder.findFlightsTo("");
        }catch (FlightFinderException e) {
            System.out.println("Flight not found");
        }
    }
}
