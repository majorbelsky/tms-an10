package io.devmartynov.tmsAn10Java.l8.part1.employees;

/**
 * Accountant
 */
public class Accountant implements Employee {
    private static final String POSITION = "Accountant";

    /**
     * Ctor.
     */
    public Accountant() {
    }

    @Override
    public void displayPosition() {
        System.out.println(POSITION);
    }
}
