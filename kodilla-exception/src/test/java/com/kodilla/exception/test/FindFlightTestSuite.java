package com.kodilla.exception.test;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;


public class FindFlightTestSuite {
    @Test
    public void testFindFlightWhenAirportsNamesAreCorrect() {
        //Given
        Flight flight = new Flight("GDA", "BCN");
        FlightFinder flightFinder = new FlightFinder();

        //When
        try {
            flightFinder.findFlight(flight);
        }catch(RouteNotFoundException e) {
            Assert.fail("Exception not expected");
        }
    }

    @Test
    public void testFindFlightWhenAirportNameIsIncorrect() {
        //Given
        Flight flight = new Flight("GDY", "BCN");
        FlightFinder flightFinder = new FlightFinder();

        //When
        try {
            flightFinder.findFlight(flight);
        }catch(RouteNotFoundException e) {
            Assert.assertThat(e.getMessage(), is("Airport do not exist! Put correct airport name"));
        }
    }

    @Test
    public void testFindFlightWhenArrivalAirportUnable() {
        //Given
        Flight flight = new Flight("GDA", "MUN");
        FlightFinder flightFinder = new FlightFinder();

        //When
        try {
            flightFinder.findFlight(flight);
        }catch(RouteNotFoundException e) {
            Assert.assertThat(e.getMessage(), is("Airport do not exist! Put correct airport name"));//Tu mi się nie zgadza komunikat, w ...Runner'ze jest "Route is not found"
        }
    }
}
