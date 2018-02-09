package com.kodilla.testing.shape;

public class Square implements Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String getShapeName(String shapeName) {
        return "square";
    }

    @Override
    public double getField() {
        return Math.pow(a, 2);
    }
}
