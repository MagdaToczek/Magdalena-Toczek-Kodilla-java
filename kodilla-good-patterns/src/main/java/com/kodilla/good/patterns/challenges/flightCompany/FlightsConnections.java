package com.kodilla.good.patterns.challenges.flightCompany;

import java.util.*;

public final class FlightsConnections {
    private final Map<String, List<String>> flightsMap = new HashMap<String, List<String>>(){{
        put("GDN", Arrays.asList("WAW", "WRO", "KRK"));
        put("WAW", Arrays.asList("GDN", "POZ", "WRO", "KTW"));
        put("WRO", Arrays.asList("GDN", "KRK", "POZ"));
        put("KRK", Arrays.asList("GDN", "WRO"));
    }};

    public Map<String, List<String>> getFlightsMap() {
        return flightsMap;
    }
}
