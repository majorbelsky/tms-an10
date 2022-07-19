package io.devmartynov.tmsAn10Java.l4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Homework.
 * Additional tasks.
 */
public class AdditionalTasks {
    public static void main(String[] args) {
        printArrayOfEvenNumbersFromGivenArray();
        printReplacedElementsInsideArray();
        printSortedStringArray();
        int[] array = new RandomIntArray(10).get();
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * Task #1
     * Create array with N random integers and print it.
     * Take array size from user input in console. Array size must be in range of (5, 10].
     * Print warning message and request enter new value if user entered value that out of range.
     * Create new array which is consist of even numbers from origin array.
     * Print new array.
     */
    public static void printArrayOfEvenNumbersFromGivenArray() {
        Scanner scanner = new Scanner(System.in);
        boolean predicate = true;
        int size = 0;

        while (predicate) {
            System.out.print("Enter size of array in range of (5, 10] ");
            size = scanner.nextInt();

            if (size <= 5 || size > 10) {
                System.out.println(
                    "You gave the incorrect array size: " + size
                        + ". Size must be in range of (5, 10]. Please, try again"
                );
            } else {
                predicate = false;
            }
        }

        int[] array = new RandomIntArray(size).get();
        System.out.println("Ok, you have array: " + Arrays.toString(array));

        int[] evenArray = getArrayOfEvenNumbersFromGivenArray(array);

        System.out.println(
            evenArray.length > 0
                ? "Array of even numbers: " + Arrays.toString(evenArray)
                : "No even numbers were found in array: " + Arrays.toString(array)
        );
    }

    /**
     * Task #2
     * Create array and fill it in. Print array.
     * Replace each element with odd index with 0.
     * Print the array.
     */
    public static void printReplacedElementsInsideArray() {
        int[] array = new RandomIntArray(10).get();
        System.out.println("Array: " + Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }

        System.out.println("Array with replaced elements: " + Arrays.toString(array));
    }

    /**
     * Task #3
     * Create string array. Fill it with names of people. Sort the array. Print result.
     */
    public static void printSortedStringArray() {
        String[] array = {"Pavel", "Denis", "Yra", "Egor", "Mihail", "Artem", "Anton", "Andrey", "Boris"};
        Arrays.sort(array);
        System.out.println("Sorted string array: " + Arrays.toString(array));
    }

    /**
     * Task #4
     * Implement a bubble sorting algorithm by adding comments at each step.
     *
     * @param array array of integers
     */
    public static void bubbleSort(int[] array) {
        // isSorted is flag that helps us to understand if all elements is sorted
        // and we should go out from high level cycle.
        boolean isSorted = false;
        // variable that helps swapping two values without value losing
        int tmp;

        // start first cycle with isSorted flag as predicate
        while (!isSorted) {
            // high level cycle will be stopped if no elements were swapped
            isSorted = true;
            // start low level cycle for comparing and swapping elements
            // array.length - 1 to prevent out of bounds exception
            for (int i = 0; i < array.length - 1; i++) {
                // detected that two values is in incorrect order
                if (array[i] > array[i + 1]) {
                    // save element to tmp for swapping
                    tmp = array[i];
                    // swap one element
                    array[i] = array[i + 1];
                    // swap another
                    array[i + 1] = tmp;
                    // set flag to false for indicating that we need one more sort iteration
                    isSorted = false;
                }
            }
        }
    }

    /**
     * Searches even numbers in given array and returns new array with found numbers.
     *
     * @param array array
     * @return array of event numbers
     */
    private static int[] getArrayOfEvenNumbersFromGivenArray(int[] array) {
        int[] resultArray = new int[array.length];
        int i = 0;
        int j = 0;

        while (i < array.length) {
            if (array[i] % 2 == 0) {
                resultArray[j] = array[i];
                j++;
            }
            i++;
        }

        return Arrays.copyOfRange(resultArray, 0, j);

    }
}
