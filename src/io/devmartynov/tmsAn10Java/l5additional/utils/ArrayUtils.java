package io.devmartynov.tmsAn10Java.l5additional.utils;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtils {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int DEFAULT_ELEMENT_RANGE = 100;

    public static int[] getArrayFromConsole(int size) {
        int i = 0;
        int[] array = new int[size];

        while (i < size) {
            System.out.print("Введите число: ");
            array[i] = scanner.nextInt();
            i++;
        }

        return array;
    }

    /**
     * Calculates average of array elements
     * @param array array of integers
     * @return average of elements in array
     */
    public static float averageOfElements(int[] array) {
        int sumOfArray = 0;

        for (int j : array) {
            sumOfArray += j;
        }

        return (float) sumOfArray / array.length;
    }

    /**
     * Calculates average of array elements
     * @param array array of float numbers
     * @return average of elements in array
     */
    public static float averageOfElements(float[] array) {
        int sumOfArray = 0;

        for (float j : array) {
            sumOfArray += j;
        }

        return (float) sumOfArray / array.length;
    }

    /**
     * Generates array of random elements
     * @param size size of array
     * @param range range of array element
     * @param startPosition start position
     * @return array
     */
    public static int[] generateRandomArray(int size, int range, int startPosition) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * range + startPosition);
        }

        return array;
    }

    /**
     * Generates array of random elements
     * @param size size of array
     * @param range range of array element
     * @return array
     */
    public static int[] generateRandomArray(int size, int range) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * range);
        }

        return array;
    }

    /**
     * Generates array of random elements
     * @param size size of array
     * @return array
     */
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * DEFAULT_ELEMENT_RANGE);
        }

        return array;
    }

    /**
     * Generates array of random float elements
     * @param size size of array
     * @return array of floats
     */
    public static float[] generateFloatRandomArray(int size) {
        float[] array = new float[size];

        for (int i = 0; i < size; i++) {
            array[i] = (float) (Math.random() * DEFAULT_ELEMENT_RANGE);
        }

        return array;
    }

    public static int getSmallestElement(int[] array) {
        Arrays.sort(array);
        return array[0];
    }
}
