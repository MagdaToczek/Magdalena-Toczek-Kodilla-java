package com.kodilla.good.patterns.challenges.shop;

public final class Supplier {
    private final String name;
    private final String address;
    private final double margin;

    public Supplier(final String name, final String address, final double margin) {
        this.name = name;
        this.address = address;
        this.margin = margin;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getMargin() {
        return margin;
    }
}
