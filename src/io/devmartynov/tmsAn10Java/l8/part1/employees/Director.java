package io.devmartynov.tmsAn10Java.l8.part1.employees;

/**
 * Director
 */
public class Director implements Employee {
    private String position = "Director";

    /**
     * Ctor.
     */
    public Director() {
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
