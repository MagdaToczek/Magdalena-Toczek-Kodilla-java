package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("37950000"));
        Country germany = new Country("Germany", new BigDecimal("82670000"));
        Country greece = new Country("Greece", new BigDecimal("10750000"));
        Country italy = new Country("Italy", new BigDecimal("60600000"));
        Country china = new Country("China", new BigDecimal("1379000000"));
        Country indonesia = new Country("Indonesia", new BigDecimal("246973100"));
        Country japan = new Country("Japan", new BigDecimal("128917246"));
        Country usa = new Country("United States of America", new BigDecimal("308878120"));
        Country canada = new Country("Canada", new BigDecimal("33989040"));
        Country mexico = new Country("Mexico", new BigDecimal("107563903"));
        Country argentina = new Country("Argentina", new BigDecimal("40913584"));
        Country chile = new Country("Chile", new BigDecimal("16601707"));
        Country peru = new Country("Peru", new BigDecimal("29546963"));
        Country egypt = new Country("Egypt", new BigDecimal("82079636"));
        Country libya = new Country("Libya", new BigDecimal("6597960"));
        Country mali = new Country("Mali", new BigDecimal("14159904"));
        Country australiaC = new Country("Australia", new BigDecimal("21714000"));
        Country newZealand = new Country("New Zealand", new BigDecimal("4186320"));

        Continent europe = new Continent();
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(greece);
        europe.addCountry(italy);

        Continent asia = new Continent();
        asia.addCountry(china);
        asia.addCountry(indonesia);
        asia.addCountry(japan);

        Continent northAmerica = new Continent();
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(mexico);

        Continent southAmerica = new Continent();
        southAmerica.addCountry(argentina);
        southAmerica.addCountry(chile);
        southAmerica.addCountry(peru);

        Continent africa = new Continent();
        africa.addCountry(egypt);
        africa.addCountry(libya);
        africa.addCountry(mali);

        Continent australia = new Continent();
        australia.addCountry(australiaC);
        australia.addCountry(newZealand);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(northAmerica);
        world.addContinent(southAmerica);
        world.addContinent(africa);

        //When
        BigDecimal totalPeopleOfTheWorld = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("2587191163"), totalPeopleOfTheWorld);
    }
}
