package io.devmartynov.tmsAn10Java.l8.part1.employees;

/**
 * Director
 */
public class Director implements Employee {
    private static final String POSITION = "Director";

    /**
     * Ctor.
     */
    public Director() {
    }

    @Override
    public void displayPosition() {
        System.out.println(POSITION);
    }
}
