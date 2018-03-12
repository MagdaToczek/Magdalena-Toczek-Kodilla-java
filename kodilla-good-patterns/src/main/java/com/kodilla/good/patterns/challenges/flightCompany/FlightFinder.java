package com.kodilla.good.patterns.challenges.flightCompany;

import java.util.*;
import java.util.stream.Collectors;

public class FlightFinder {
    private FlightsConnections flightsConnections = new FlightsConnections();

    public List<String> findFlightsFrom(String departureAirport) {
        return flightsConnections.getFlightsMap().get(departureAirport);
    }

    public List<String> findFlightsTo(String destinationAirport) {
        return flightsConnections.getFlightsMap().entrySet().stream()
                .filter(e -> e.getValue().contains(destinationAirport))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public void findFlightsThrough(String transferAirport) {
        List<String> resultDestinationAirports = flightsConnections.getFlightsMap().entrySet().stream()
                .filter(e -> e.getKey().equals(transferAirport))
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.toList());

        System.out.println(resultDestinationAirports);

        List<String> resultDepartureAirports = flightsConnections.getFlightsMap().entrySet().stream()
                .filter(e -> e.getValue().contains(transferAirport))
                .map(e -> e.getKey())
                .collect(Collectors.toList());

        System.out.println(resultDepartureAirports);

        for (String elementIn : resultDepartureAirports) {
            for (String elementOut : resultDestinationAirports) {
                if (!elementIn.equals(elementOut)) {
                    System.out.println(elementIn + " -> " + transferAirport + " -> " + elementOut);
                }
            }
        }
    }
}