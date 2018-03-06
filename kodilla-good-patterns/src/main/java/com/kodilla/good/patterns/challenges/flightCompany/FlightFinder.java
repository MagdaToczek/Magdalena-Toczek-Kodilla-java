package com.kodilla.good.patterns.challenges.flightCompany;

import java.util.List;

public class FlightFinder {
    private FlightsConnections flightsConnections = new FlightsConnections();

    public List<String> findFlightsFrom(String departureAirport){
        List<String> destinationFlightsList = flightsConnections.getFlightsMap().get(departureAirport);
//        if(destinationFlightsList == null) {
//
//        }
        return destinationFlightsList;
    }
}
