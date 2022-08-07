package io.devmartynov.tmsAn10Java.l8.part1.figures;

/**
 * Circle
 */
public class Circle extends Figure {
    private static final String NAME = "Circle";
    private double radius;

    public Circle(double radius) {
        super(NAME);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
