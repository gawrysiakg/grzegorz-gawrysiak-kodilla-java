package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    private final String shapeName;
    private final double base;
    private final double high;

    public Triangle(String shapeName, double base, double high) {
        this.shapeName = shapeName;
        this.base = base;
        this.high = high;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
    return base*high/2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.base, base) == 0 && Double.compare(triangle.high, high) == 0 && shapeName.equals(triangle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, base, high);
    }
}
