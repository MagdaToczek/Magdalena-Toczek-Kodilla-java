package com.kodilla.exception.test;

import org.junit.Assert;
import org.junit.Test;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;

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
            Assert.assertThat(e.getMessage(), is("Route is not found"));
        }

        //Then

    }
}
