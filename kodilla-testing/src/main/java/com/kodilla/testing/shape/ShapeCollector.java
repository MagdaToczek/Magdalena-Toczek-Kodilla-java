package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapesList = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapesList.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapesList.contains(shape)){
            result = shapesList.remove(shape);
        }
        return result;
    }

    public Shape getFigure(int n){
        Shape retrivedShape = null;
        if(n >= 0 && n < shapesList.size()){
            retrivedShape = shapesList.get(n);
        }
        return retrivedShape;
    }

    public void showFigures(){
        for (Shape shapesListLoop : shapesList) System.out.println(shapesListLoop.getField());
    }

    public int getShapesListQuantity(){
        return shapesList.size();
    }
}
