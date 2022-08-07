package io.devmartynov.tmsAn10Java.l8.part1.employees;

/**
 * Worker
 */
public class Worker implements Employee {
    private static final String POSITION = "Worker";

    /**
     * Ctor.
     */
    public Worker() {
    }

    @Override
    public void displayPosition() {
        System.out.println(POSITION);
    }
}
