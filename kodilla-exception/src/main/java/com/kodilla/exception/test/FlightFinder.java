package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight)throws RouteNotFoundException{
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("GDA", true);
        flightMap.put("BCN", true);
        flightMap.put("MUN", false);
        flightMap.put("CDG", true);
        flightMap.put("HSK", false);

        if(flightMap.containsKey(flight.getArrivalAirport()) && flightMap.containsKey(flight.getDepartureAirport())) {
            if(flightMap.get(flight.getArrivalAirport())) {
                System.out.println("Your route was found:)");
            }else {
                throw new RouteNotFoundException("Airport do not exist! Put correct airport name");
            }
        }else {
            throw new RouteNotFoundException("Airport do not exist! Put correct airport name");
        }
    }
}
