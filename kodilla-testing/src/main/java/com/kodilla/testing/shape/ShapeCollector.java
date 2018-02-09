package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private Shape shape;
    private ArrayList<Shape> shapesList = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapesList.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapesList.contains(shape)){
            shapesList.remove(shape);
            result = true;
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

    public ArrayList<Shape> showFigures(){
        return shapesList;
    }

    public int getShapesListQuantity(){
        return shapesList.size();
    }
}
