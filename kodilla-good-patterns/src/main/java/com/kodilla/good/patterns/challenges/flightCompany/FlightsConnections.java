package com.kodilla.good.patterns.challenges.flightCompany;

import java.util.*;

public final class FlightsConnections {
    private final List<String> flightsFromGDN = new LinkedList(){{
        add("WAW");
        add("WRO");
        add("KRK");
    }};
    private final List<String> flightsFromWAW = new LinkedList(){{
        add("GDN");
        add("POZ");
        add("WRO");
        add("KTW");
    }};
    private final List<String> flightsFromWRO = new LinkedList(){{
        add("GDN");
        add("KRK");
        add("POZ");
    }};
    private final List<String> flightsFromKRK = new LinkedList(){{
        add("GDN");
        add("WRO");
    }};
    private final Map<String, List<String>> flightsMap = new HashMap(){{
        put("GDN", flightsFromGDN);
        put("WAW", flightsFromWAW);
        put("WRO", flightsFromWRO);
        put("KRK", flightsFromKRK);
    }};

    public Map<String, List<String>> getFlightsMap() {
        return flightsMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightsConnections that = (FlightsConnections) o;
        return Objects.equals(flightsMap, that.flightsMap);
    }

    @Override
    public int hashCode() {

        return Objects.hash(flightsMap);
    }
}
