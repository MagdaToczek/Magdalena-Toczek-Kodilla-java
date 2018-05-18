package com.kodilla.patterns2.decorator.pizza;

import static org.junit.Assert.*;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrder() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        //When
        BigDecimal theCost = thePizza.getCost();
        String description = thePizza.getDescription();
        //Then
        assertEquals(new BigDecimal(15.00), theCost);
        assertEquals("Pizza on thin dough with tomato sauce and cheese", description);
    }

    @Test
    public void testPizzaWithSalamiOrder() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new SalamiDecorator(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        String description = thePizza.getDescription();
        //Then
        assertEquals(new BigDecimal(17.00), theCost);
        assertEquals("Pizza on thin dough with tomato sauce and cheese and salami", description);
    }

    @Test
    public void testPizzaWithSalamiOlivesOrder() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new SalamiDecorator(thePizza);
        thePizza = new OlivesDecorator(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        String description = thePizza.getDescription();
        //Then
        assertEquals(new BigDecimal(18.50), theCost);
        assertEquals("Pizza on thin dough with tomato sauce and cheese and salami and olives", description);
    }

    @Test
    public void testPizzaWithSalamiOlivesPepperOrder() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new SalamiDecorator(thePizza);
        thePizza = new OlivesDecorator(thePizza);
        thePizza = new PepperDecorator(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        String description = thePizza.getDescription();
        //Then
        assertEquals(new BigDecimal(20.00), theCost);
        assertEquals("Pizza on thin dough with tomato sauce and cheese and salami and olives and pepper", description);
    }

    @Test
    public void testPizzaWithSalamiOlivesPepperCheeseOrder() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new SalamiDecorator(thePizza);
        thePizza = new OlivesDecorator(thePizza);
        thePizza = new PepperDecorator(thePizza);
        thePizza = new CheeseDecorator(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        String description = thePizza.getDescription();
        //Then
        assertEquals(new BigDecimal(22.00), theCost);
        assertEquals("Pizza on thin dough with tomato sauce and cheese and salami and olives and pepper and extra cheese", description);
    }
}
