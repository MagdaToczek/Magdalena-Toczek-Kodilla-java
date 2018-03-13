package com.kodilla.good.patterns.challenge.flightCompany;

import com.kodilla.good.patterns.challenges.flightCompany.FlightFinder;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FlightFinderTestSuite {
    @Test
    public void findFlightsFromTest() {
        //Given
        FlightFinder flightFinder = new FlightFinder();
        //When
        List<String> resultList = flightFinder.findFlightsFrom("GDN");
        //Then
        Assert.assertEquals(Arrays.asList("WAW", "WRO", "KRK"), resultList);
    }

    @Test
    public void findFlightsToTest() {
        //Given
        FlightFinder flightFinder = new FlightFinder();
        //When
        List<String> resultList = flightFinder.findFlightsTo("GDN");
        //Then
        Assert.assertEquals(Arrays.asList("WRO", "KRK", "WAW"), resultList);
    }

    @Test
    public void findFlightsThroughTest() {
        //Given
        FlightFinder flightFinder = new FlightFinder();
        //When
        List<String> resultList = flightFinder.findFlightsThrough("KRK");
        //Then
        Assert.assertEquals(Arrays.asList("GDN -> KRK -> WRO", "WRO -> KRK -> GDN"), resultList);
    }
}
