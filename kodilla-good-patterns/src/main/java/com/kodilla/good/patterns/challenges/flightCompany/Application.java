package com.kodilla.good.patterns.challenges.flightCompany;

public class Application {
    public static void main(String[] args){
        FlightFinder flightFinder = new FlightFinder();

//        flightFinder.findFlightsFrom("GDN");
//        flightFinder.findFlightsTo("WRO");
        flightFinder.findFlightsThrough("GDN");
    }
}
