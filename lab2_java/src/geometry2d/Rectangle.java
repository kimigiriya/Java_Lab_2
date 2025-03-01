package geometry2d;

import exceptions.InvalidDimensionException;

public class Rectangle implements Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) throws InvalidDimensionException {
        if (width <= 0 || height <= 0) {
            throw new InvalidDimensionException("Ширина и высота должны быть больше нуля.");
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle{width=" + width + ", height=" + height + "}";
    }
}