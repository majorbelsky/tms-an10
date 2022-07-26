package io.devmartynov.tmsAn10Java.l5;

import java.util.Arrays;

public class AdditionalTasks {
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 0, 0, 0},
            {0, 1, 0, 0},
            {0, 0, 0, 0},
        };
        int[][] matrixB = {
            {1, 2, 3},
            {1, 1, 1},
            {0, 0, 0},
            {2, 1, 0},
        };
        System.out.println("Result of multiplication: " + Arrays.deepToString(multiply(matrixB, matrixA)));
        printSumElementsOfArray();
        printDiagonalsOfArray();
        printSortedArray();
    }

    /**
     * Task #1
     * Multiply matrices.
     *
     * @param matrixA matrix m * l
     * @param matrixB matrix l * n
     * @return matrix - matrix m * n
     */
    public static int[][] multiply(int[][] matrixA, int[][] matrixB) {
        int rowsCountA = matrixA.length;
        int rowsCountB = matrixB.length;
        int columnsCountB = matrixB[0].length;
        int[][] multipliedMatrix = new int[rowsCountA][0];

        for (int row = 0; row < rowsCountA; row++) {
            multipliedMatrix[row] = new int[columnsCountB];

            for (int column = 0; column < columnsCountB; column++) {
                int sum = 0;

                for (int i = 0; i < rowsCountB; i++) {
                    sum += matrixA[row][i] * matrixB[i][column];
                }

                multipliedMatrix[row][column] = sum;
            }
        }

        return multipliedMatrix;
    }

    /**
     * Task #2
     * Create two-dimensional array.
     * Print sum of all elements.
     */
    public static void printSumElementsOfArray() {
        int[][] array = {
            {1, 0, 0, 2},
            {0, 1, 5, 0},
            {3, 0, -3, 0},
        };

        int sum = 0;

        for (int[] innerArray : array) {
            for (int element : innerArray) {
                sum += element;
            }
        }

        System.out.println("Sum of all elements in array is: " + sum);
    }

    /**
     * Task #3
     * Create two-dimensional array.
     * Print diagonals of array.
     */
    public static void printDiagonalsOfArray() {
        int[][] array = {
            {1, 0, 0, 5, 1, 6},
            {0, 2, 6, 3, 5, 1},
            {3, 7, 3, 4, 1, 1},
            {8, 0, 3, 4, 1, 1},
            {8, 2, -3, 4, 5, 1},
            {1, 0, -3, 4, 5, 6},
        };
        StringBuilder toPrint = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                boolean isDiagonalElement = i == j || i == array[i].length - 1 - j;
                boolean isLastElementInRow = j == array[i].length - 1;

                if (!isDiagonalElement && !isLastElementInRow) {
                    toPrint.append("  ");
                }

                if (isDiagonalElement) {
                    toPrint.append(array[i][j]).append(" ");
                }

                if (isLastElementInRow) {
                    toPrint.append("\n");
                }
            }
        }
        System.out.print(toPrint);
    }

    /**
     * Task #4
     * Create two-dimensional array.
     * Sort elements in array rows.
     */
    public static void printSortedArray() {
        int[][] array = {
            {1, 26, -3, 4},
            {0, 22, 33, -3},
            {3, 7, 3, 2},
            {22, 0, -11, -4},
        };

        for (int i = 0; i < array.length; i++) {
            int[] elements = array[i];
            Arrays.sort(elements);
            array[i] = elements;
        }

        System.out.println(Arrays.deepToString(array));
    }
}
