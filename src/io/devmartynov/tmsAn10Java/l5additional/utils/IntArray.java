package io.devmartynov.tmsAn10Java.l5additional.utils;

import java.util.Arrays;

public class IntArray {
    private int[] array;

    public IntArray(int[] array) {
        this.array = array;
    }

    /**
     * Returns array
     * @return array
     */
    public int[] asPrimitive() {
        return array;
    };

    /**
     * Calculates average of array elements
     *
     * @return average
     */
    public float averageOfElements() {
        int sumOfArray = 0;

        for (int j : array) {
            sumOfArray += j;
        }

        return (float) sumOfArray / array.length;
    }

    /**
     * Prints array.
     *
     * @param delimiter delimiter
     */
    public void display(char delimiter) {
        System.out.print(array[0]);

        for (int i = 1; i < array.length; i++) {
            System.out.print(delimiter + " " + array[i]);
        }

        System.out.println();
    }

    /**
     * Resizes array
     *
     * @param size  Desired size for the array
     */
    public void resize(int size) {
        int[] newArray = new int[size];
        for (int i = 0; i < array.length && i < size; ++i) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
