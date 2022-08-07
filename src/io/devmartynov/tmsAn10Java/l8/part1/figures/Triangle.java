package io.devmartynov.tmsAn10Java.l8.part1.figures;

/**
 * Triangle
 */
public class Triangle extends Figure {
    private static final String NAME = "Triangle";
    private double sideA;
    private double sideB;
    private double sideC;

    /**
     * Ctor.
     *
     * @param sideA sideA
     * @param sideB sideB
     * @param sideC sideC
     */
    public Triangle(double sideA, double sideB, double sideC) {
        super(NAME);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    /**
     * Calculates triangle area using <a href="https://ru.wikipedia.org/wiki/Формула_Герона">Heron 's formula</a>
     * @return triangle area
     */
    @Override
    public double calculateArea() {
        double halfPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(
            halfPerimeter
            * (halfPerimeter - sideA)
            * (halfPerimeter - sideB)
            * (halfPerimeter - sideC)
        );
    }
}
