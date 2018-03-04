package com.kodilla.good.patterns.challenges.shop;

public class Supplier {
    private String name;
    private String address;
    private double margin;

    public Supplier(String name, String address, double margin) {
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
