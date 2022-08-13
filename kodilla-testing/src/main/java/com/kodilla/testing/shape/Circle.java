package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private final String shapeName;
    private final double radius;

    public Circle(String shapeName, double radius) {
        this.shapeName = shapeName;
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
    return shapeName;
    }

    @Override
    public double getField() {
    return 3.14*radius*radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && shapeName.equals(circle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, radius);
    }
}
