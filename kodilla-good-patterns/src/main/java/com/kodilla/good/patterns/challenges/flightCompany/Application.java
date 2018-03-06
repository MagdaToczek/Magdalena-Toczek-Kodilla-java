package com.kodilla.good.patterns.challenges.flightCompany;

public class Application {
    public static void main(String[] args){
        FlightFinder flightFinder = new FlightFinder();
        System.out.println(flightFinder.findFlightsFrom(""));
    }
}
