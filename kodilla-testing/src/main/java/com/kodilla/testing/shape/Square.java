package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private final String shapeName;
    private final double sideLength;

    public Square(String shapeName, double sideLength) {
        this.shapeName = shapeName;
        this.sideLength = sideLength;
    }


    public double getSideLength() {
        return sideLength;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
    return sideLength*sideLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.sideLength, sideLength) == 0 && shapeName.equals(square.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, sideLength);
    }
}
