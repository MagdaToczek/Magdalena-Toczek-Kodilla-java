package com.kodilla.good.patterns.challenges.flightCompany;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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
        for (Map.Entry<String, List<String>> entry : flightsConnections.getFlightsMap().entrySet()) {
            if (entry.getKey().equals(transferAirport)) {
                System.out.println(entry);
                for (String destinationAirport : entry.getValue()) {
                    if (flightsConnections.getFlightsMap().get(destinationAirport) != null) {
                        for (String departureAirports : flightsConnections.getFlightsMap().get(destinationAirport)) {
                            if (!departureAirports.equals(transferAirport)) {
                                System.out.println(transferAirport + " -> " + destinationAirport + " -> " + departureAirports );
                            }
                        }
                    }
                }
            }
        }
    }
}
