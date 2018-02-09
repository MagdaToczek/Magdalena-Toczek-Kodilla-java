package com.kodilla.testing.shape;

public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getShapeName(String shapeName) {
        return "circle";
    }

    @Override
    public double getField() {
        return Math.PI * Math.pow(this.r,  2);
    }
}
