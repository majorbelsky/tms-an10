package io.devmartynov.tmsAn10Java.l8.part1.figures;

/**
 * Rectangle
 */
public class Rectangle extends Figure {
    private double length;
    private double width;

    /**
     * Ctor.
     *
     * @param length length
     * @param width width
     */
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
