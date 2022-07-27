package io.devmartynov.tmsAn10Java.l5additional.utils.utils;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class ConsoleUtils {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String REQUEST_INT_NUMBER_MESSAGE = "Enter int number: ";
    private static final String REQUEST_FLOAT_NUMBER_MESSAGE = "Enter float number: ";
    private static final String REQUEST_STRING_MESSAGE = "Enter letter: ";
    private static final String PRINT_ARRAY_PREFIX = "Array: ";
    public static final String REQUEST_ARRAY_MESSAGE = "Enter array element with index ";

    /**
     * Requests int number from console with message
     * @return requested number
     */
    public static int requestIntNumber() {
        System.out.print(REQUEST_INT_NUMBER_MESSAGE);
        return scanner.nextInt();
    }

    /**
     * Requests float number from console with message
     * @return requested number
     */
    public static float requestFloatNumber() {
        System.out.print(REQUEST_FLOAT_NUMBER_MESSAGE);
        return scanner.nextFloat();
    }

    public static String requestString() {
        System.out.print(REQUEST_STRING_MESSAGE);
        return scanner.next();
    }

    /**
     * Prints int array.
     */
    public static void printArray(int[] array) {
        System.out.print(PRINT_ARRAY_PREFIX + Arrays.toString(array) + System.lineSeparator());
    }

    /**
     * Prints float array.
     */
    public static void printArray(float[] array) {
        System.out.print(PRINT_ARRAY_PREFIX + Arrays.toString(array) + System.lineSeparator());
    }

    /**
     * Prints int array as sequence.
     *
     * @param delimiter delimiter
     */
    public static void printAsSequence(int[] array, String delimiter) {
        StringJoiner stringJoiner = new StringJoiner(delimiter);
        for (int i : array) {
            stringJoiner.add(Integer.toString(i));
        }
        System.out.println("Array: " + stringJoiner);
    }
}
