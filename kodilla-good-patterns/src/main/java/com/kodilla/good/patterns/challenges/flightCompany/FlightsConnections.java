package com.kodilla.good.patterns.challenges.flightCompany;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
}
