package io.devmartynov.tmsAn10Java.l8.part1.figures;

/**
 * Figure
 */
public abstract class Figure {
    private final String name;

    /**
     * Ctor.
     *
     * @param name figure name
     */
    public Figure(String name) {
        this.name = name;
    }

    /**
     * Name of figure
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Abstract method, calculates perimeter of figure
     * @return perimeter
     */
    public abstract double calculatePerimeter();

    /**
     * Abstract method, calculates area of figure
     * @return area
     */
    public abstract double calculateArea();
}
