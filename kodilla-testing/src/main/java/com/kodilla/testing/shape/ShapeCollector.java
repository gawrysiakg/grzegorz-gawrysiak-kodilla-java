package com.kodilla.testing.shape;
import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> collectedShapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        collectedShapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        collectedShapes.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n > collectedShapes.size()){
            return null;
        } else if (n < 0){
            return null;
        } else {return collectedShapes.get(n);}
    }

    public String showFigures() {
        return String.valueOf(collectedShapes);
    }


    @Override
    public String toString() {
        return ""+collectedShapes;
    }
}
