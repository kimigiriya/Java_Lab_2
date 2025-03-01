package geometry2d;

import exceptions.InvalidDimensionException;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) throws InvalidDimensionException {
        if (radius <= 0) {
            throw new InvalidDimensionException("Радиус должен быть больше нуля.");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{radius=" + radius + "}";
    }
}