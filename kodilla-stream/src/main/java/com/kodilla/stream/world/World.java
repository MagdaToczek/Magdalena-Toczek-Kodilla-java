package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {
    private Set<Continent> continentsSet = new HashSet<>();

    public void addContinent(Continent continent) {
        continentsSet.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        return continentsSet.stream()
                .flatMap(continent -> continent.getCountry().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
