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

    public void findFlightsThrough(String departureAirport) {
        for (Map.Entry<String, List<String>> entry : flightsConnections.getFlightsMap().entrySet()) {
            if (entry.getKey().equals(departureAirport)) {
                System.out.println(entry);
                for (String transferAirport : entry.getValue()) {
                    if (flightsConnections.getFlightsMap().containsKey(transferAirport)) {
                        for (String destinationAirport : flightsConnections.getFlightsMap().get(transferAirport)) {
                            if (!destinationAirport.equals(departureAirport)) {
                                System.out.println(departureAirport + " -> " + transferAirport + " -> " + destinationAirport );
                            }
                        }
                    }
                }
            }
        }

        String result = flightsConnections.getFlightsMap().entrySet().stream()
                .filter(e -> e.getKey().equals(departureAirport))
                .collect(Collectors.toSet()).stream()
                    .flatMap(e -> e.getValue().stream())
                    .map(e -> flightsConnections.getFlightsMap().get(e))
                    .flatMap(List::stream)
                    .filter(v -> !v.equals(departureAirport))
                    .collect(Collectors.joining("", departureAirport + " -> ", ""));
        System.out.println(result);
    }
}
