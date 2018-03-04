package com.kodilla.good.patterns.challenges.shop;

public class Product {
    private String name;
    private double priceInDollars;

    public Product(String name, double priceInDollars) {
        this.name = name;
        this.priceInDollars = priceInDollars;
    }

    public String getName() {
        return name;
    }

    public double getPriceInDollars() {
        return priceInDollars;
    }
}
