package com.kodilla.good.patterns.challenges.shop;

public class Product {
    private String name;
    private double priceInDollars;

    public Product(String name, double priceInDolars) {
        this.name = name;
        this.priceInDollars = priceInDolars;
    }

    public String getName() {
        return name;
    }

    public double getPriceInDolars() {
        return priceInDollars;
    }
}
