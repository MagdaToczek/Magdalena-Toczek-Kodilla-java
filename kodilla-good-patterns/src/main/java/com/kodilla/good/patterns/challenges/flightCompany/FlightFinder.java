package com.kodilla.good.patterns.challenges.flightCompany;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    private FlightsConnections flightsConnections = new FlightsConnections();

    public List<String> findFlightsFrom(String departureAirport){
        System.out.println("\nChecking flights from chosen city...");

        List<String> destinationFlightsList = flightsConnections.getFlightsMap().get(departureAirport);

        if(destinationFlightsList.size() == 0) {
            System.out.println("Flight not found");
        }
        System.out.println("From " + departureAirport + " you can flight to:\n" + destinationFlightsList);

        return destinationFlightsList;
    }

    public List<String> findFlightsTo(String destinationAirport){
        System.out.println("\nChecking flights to chosen city...");

        List<String> departureFlightsList = flightsConnections.getFlightsMap().entrySet().stream()
                .filter(e -> e.getValue().contains(destinationAirport))
                .map(e -> e.getKey())
                .collect(Collectors.toList());

        if(departureFlightsList.size() == 0) {
            System.out.println("Flight not found");
        } else {
            System.out.println("To " + destinationAirport + " you can flight from:\n" + departureFlightsList);
        }

        return departureFlightsList;
    }

    public void findFlightsThrough(String transferAirport) {
        System.out.println("\nChecking flights city through chosen city...");
        List<String> flightsToTransferAirport = findFlightsTo(transferAirport);
        List<String> flightsFromTransferAirport = findFlightsFrom(transferAirport);
        List<String> flightsThroughTransferAirport = null;
        for(int i = 0; i < flightsToTransferAirport.size()-1; i++) {
            for(int j = 0; j < flightsFromTransferAirport.size()-1; j++) {
                if(!flightsToTransferAirport.get(i).equals(flightsFromTransferAirport.get(j))) {
                    if (flightsToTransferAirport.get(i) != null && flightsFromTransferAirport.get(j) != null) {
                        flightsThroughTransferAirport.add(flightsToTransferAirport.get(i) + " -> " + flightsFromTransferAirport.get(j));
                    }
                }
            }
        }

        System.out.println(flightsThroughTransferAirport);
    }
}
