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

    public List<String> findFlightsThrough(String transferAirport) {
        List<String> resultFlightsThrough = new ArrayList<>();
        flightsConnections.getFlightsMap().entrySet().stream()
                .filter(e -> e.getValue().contains(transferAirport))
                .forEach(e -> {
                    String departureAirport = e.getKey();
                    e.getValue().stream()
                            .filter(airport -> airport.equals(transferAirport))
                            .forEach(airport -> flightsConnections.getFlightsMap()
                                    .getOrDefault(transferAirport, Collections.emptyList())
                                    .stream()
                                    .filter(destinationAirport -> !destinationAirport.equals(departureAirport))
                                    .forEach(destinationAirport -> resultFlightsThrough.add(departureAirport + " -> " + transferAirport + " -> " + destinationAirport))
                            );
                });

        return resultFlightsThrough;
    }
}