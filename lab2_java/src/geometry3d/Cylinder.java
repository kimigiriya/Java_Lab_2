package geometry3d;

import geometry2d.Figure;
import exceptions.ZeroHeightException;

public class Cylinder {
    private final Figure base;
    private final double height;

    public Cylinder(Figure base, double height) throws ZeroHeightException {
        if (height == 0) {
            throw new ZeroHeightException("Высота цилиндра не может быть равна нулю.");
        }
        this.base = base;
        this.height = height;
    }

    public Figure getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double volume() {
        return base.area() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{base=" + base + ", height=" + height + "}";
    }
}