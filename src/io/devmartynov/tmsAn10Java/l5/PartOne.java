package io.devmartynov.tmsAn10Java.l5;

import java.util.Arrays;
import java.util.Scanner;

public class PartOne {
    public static void main(String[] args) {
        increaseElements();
        printColorizedChessDesk();
    }

    /**
     * Task #1
     * Create three-dimensional integer array.
     * Go through array by cycle and increase every element by number.
     */
    public static void increaseElements() {
        int[][][] array = {
            {
                {3, 2, -3},
                {1, 2, 8}
            },
            {
                {-3, -7, 5, 4},
                {0},
                {3, 4}
            }
        };
        System.out.println("Initial array: " + Arrays.deepToString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to increase every element in array: ");
        int numberToIncrease = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += numberToIncrease;
                }
            }
        }
        System.out.println("Result array: " + Arrays.deepToString(array));
    }

    /**
     * Task #2
     * Use two-dimensional array with size 8 * 8 for colorizing chess desk.
     */
    public static void printColorizedChessDesk() {
        final int SIZE = 8;
        final String[][] array = new String[SIZE][SIZE];
        final String HORIZONTAL_DELIMITER = "---------------------------------";
        final String VERTICAL_DELIMITER = "|";

        for (int i = 0; i < SIZE; i++) {
            System.out.println("\n" + HORIZONTAL_DELIMITER);

            for (int j = 0; j < SIZE; j++) {
                array[i][j] = (i + j) % 2 == 0 ? "W" : "B";
                System.out.print(VERTICAL_DELIMITER + " " + array[i][j] + " ");
            }

            System.out.print(VERTICAL_DELIMITER);
        }
        System.out.println("\n" + HORIZONTAL_DELIMITER);
    }
}
