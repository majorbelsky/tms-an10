package io.devmartynov.tmsAn10Java.l4;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Homework.
 * Part #1.
 */
public class PartOne {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        checkIfNumberInsideArray();
        removeNumberFromArray();
        getMinMaxAndMiddleNumberFormArray();
        getAverageOfNumbersFromTwoArraysAndResult();
    }

    /**
     * Task #1
     * Crate integer array.
     * Print message if array contains number.
     * Number is given through console input.
     */
    public static void checkIfNumberInsideArray() {
        int[] array = new RandomIntArray(10).get();
        String arrayAsString = Arrays.toString(array);
        System.out.println("Array: " + arrayAsString);
        System.out.print("Enter number to check if it's inside the array: ");
        int toCheckNumber = scanner.nextInt();
        boolean included = false;

        for (int value : array) {
            if (toCheckNumber == value) {
                included = true;
                break;
            }
        }

        System.out.printf(
            "Number " + toCheckNumber + " is" + (included ? "" : " not") + " included in array: " + arrayAsString
        );
    }

    /**
     * Task #2
     * Crate integer array.
     * Remove number from array.
     * Number is given through console input.
     * Print message if array doesn't contain number;
     */
    public static void removeNumberFromArray() {
        int[] array = {11, 11, 11, 14, 16, 8, 33, 17, 8, 16};
        System.out.println("Array: " + Arrays.toString(array));
        System.out.print("Enter number to remove from array: ");
        int toRemoveNumber = scanner.nextInt();
        boolean successful = false;
        int i = 0;
        int size = array.length;

        while (i < size) {
            if (array[i] == toRemoveNumber) {
                System.arraycopy(array, i + 1, array, i, array.length - i - 1);
                successful = true;
                size--;
            } else {
                i++;
            }
        }

        array = Arrays.copyOfRange(array, 0, size);

        System.out.println(
            "Number "
                + toRemoveNumber
                + (successful ? " successfully removed from array. " : " is not included in array. ")
                + "Result array: " + Arrays.toString(array)
        );
    }

    /**
     * Task #3
     * Create random integer array.
     * Print min, max, and middle element in array.
     * It should be possible to create array of custom size.
     * Array size is given through console input.
     */
    public static void getMinMaxAndMiddleNumberFormArray() {
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] array = new SortedIntArray(new RandomIntArray(size)).get();
        String arrayAsString = Arrays.toString(array);
        System.out.println("Array: " + arrayAsString);
        System.out.println("Min value is: " + array[0]);
        System.out.println("Max value is: " + array[size - 1]);
        System.out.println("Middle value is: " + (size % 2 == 0 ? "no middle value" : array[size / 2]));
    }

    /**
     * Task #4
     * Create two arrays of 5 numbers.
     * Print arrays in two different lines.
     * Calculate average of numbers in each array.
     * Print if averages is equal or one is bigger than another.
     */
    public static void getAverageOfNumbersFromTwoArraysAndResult() {
        int size = 5;
        int[] array1 = new RandomIntArray(size).get();
        int[] array2 = new RandomIntArray(size).get();

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        int sumOfArray1 = 0;
        int sumOfArray2 = 0;

        for (int i = 0; i < size; i++) {
            sumOfArray1 += array1[i];
            sumOfArray2 += array2[i];
        }

        float averageOfArray1 = (float) sumOfArray1 / size;
        float averageOfArray2 = (float) sumOfArray2 / size;

        String pattern = "####0.00";
        String averageOfArray1AsString = new DecimalFormat(pattern).format(averageOfArray1);
        String averageOfArray2AsString = new DecimalFormat(pattern).format(averageOfArray2);

        String message;

        if (averageOfArray1 == averageOfArray2) {
            message = "Averages are equal " + averageOfArray1;
        } else {
            boolean firstBigger = averageOfArray1 > averageOfArray2;
            message = String.format(
                "Average of numbers inside %s: %s is bigger than %s: %s",
                firstBigger ? "array1" : "array2",
                firstBigger ? averageOfArray1AsString : averageOfArray2AsString,
                firstBigger ? "array2" : "array1",
                firstBigger ? averageOfArray2AsString : averageOfArray1AsString
            );
        }

        System.out.println(message);
    }
}
