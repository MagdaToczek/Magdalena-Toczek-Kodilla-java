package com.kodilla.good.patterns.challenges.flightCompany;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    private FlightsConnections flightsConnections = new FlightsConnections();

    public void findFlightsFrom(String departureAirport) throws FlightFinderException {
        System.out.println("\nChecking flights from chosen city...");

        List<String> destinationFlightsList = flightsConnections.getFlightsMap().get(departureAirport);

        if(destinationFlightsList.size() == 0) {
            throw new FlightFinderException("Flight not found");
        }
        System.out.println("From " + departureAirport + " you can flight to:\n" + destinationFlightsList);
    }

    public void findFlightsTo(String destinationAirport) throws FlightFinderException{
        System.out.println("\nChecking flights to chosen city...");

        List<String> departureFlightsList = flightsConnections.getFlightsMap().entrySet().stream()
                .filter(e -> e.getValue().contains(destinationAirport))
                .map(e -> e.getKey())
                .collect(Collectors.toList());

        if(departureFlightsList.size() == 0) {
            throw new FlightFinderException("Flight not found");
        } else {
            System.out.println("To " + destinationAirport + " you can flight from:\n" + departureFlightsList);
        }
    }

    public void findFlightsToAndThrough(String destinationAirport, String transferAirport) {
        System.out.println("\nChecking flights to chosen city with transfer...");

        //List<String>
    }
}
