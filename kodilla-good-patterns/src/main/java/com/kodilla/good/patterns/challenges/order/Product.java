package com.kodilla.good.patterns.challenges.order;

public class Product {
    private String name;
    private double priceInDolars;

    public Product(String name, double priceInDolars) {
        this.name = name;
        this.priceInDolars = priceInDolars;
    }

    public String getName() {
        return name;
    }

    public double getPriceInDolars() {
        return priceInDolars;
    }
}
