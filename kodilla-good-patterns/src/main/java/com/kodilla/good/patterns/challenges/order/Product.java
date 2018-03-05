package com.kodilla.good.patterns.challenges.order;

public final class Product {
    private final String name;
    private final double priceInDollars;

    public Product(final String name, final double priceInDollars) {
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
