package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final Set<Country> countriesSet = new HashSet<>();

    public void addCountry(Country country) {
        countriesSet.add(country);
    }

    public Set<Country> getCountry() {
        return countriesSet;
    }
}
