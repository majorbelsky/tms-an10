package io.devmartynov.tmsAn10Java.l8.part1.employees;

/**
 * Accountant
 */
public class Accountant implements Employee {
    private String position = "Accountant";

    /**
     * Ctor.
     */
    public Accountant() {
    }

    @Override
    public void displayPosition() {
        System.out.println(position);
    }

    @Override
    public String getPosition() {
        return position;
    }
}
