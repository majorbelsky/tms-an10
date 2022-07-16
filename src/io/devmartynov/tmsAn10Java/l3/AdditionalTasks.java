package io.devmartynov.tmsAn10Java.l3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AdditionalTasks {
    public static void main(String[] args) {
        System.out.print("Task #1. Fibonacci Sequence: ");
        printFibonacciSequence(11);
        System.out.println("\nTask #2. Deposit sum: ");
        calculateAndPrintDepositAmount();
        System.out.println("\nTask #3. Multiplication table: ");
        printMultiplicationTable();
    }

    /**
     * Task #1
     * Display the first numbers of the Fibonacci sequence.
     * @param countOfNumbersInSequence numbers count in sequence
     */
    public static void printFibonacciSequence(int countOfNumbersInSequence) {
        String separator = "";
        int prevNumber = 0;
        int currentNumber = 1;
        int nextNumber;

        System.out.print(separator + prevNumber);
        separator = ", ";

        for (int i = 1; i < countOfNumbersInSequence; i++) {
            System.out.print(separator + currentNumber);

            nextNumber = prevNumber + currentNumber;
            prevNumber = currentNumber;
            currentNumber = nextNumber;
        }
    }

    /**
     * Task #2
     * Write a program in which the user enters the deposit amount and the number of months.
     * Bank calculates the final amount of the deposit, taking into account the accrual of interest for each month.
     */
    public static void calculateAndPrintDepositAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter deposit amount: ");
        double sum = scanner.nextDouble();
        System.out.print("Enter month count: ");
        int monthCount = scanner.nextInt();
        System.out.print("Deposit amount with profit: " +
            new DecimalFormat("####0.00")
                .format(calculateDepositAmount(sum, monthCount, 7f)));
    }

    /**
     * Task #3
     * Write a program that outputs a multiplication table to the console.
     */
    public static void printMultiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("| " + i * j + " ");
            }
            System.out.println();
        }
    }

    /**
     * Calculate deposit amount
     *
     * @param sum deposit amount
     * @param monthCount month count
     * @param monthlyProfitPercent percent profit per month
     * @return deposit amount with profit
     */
    private static double calculateDepositAmount(double sum, int monthCount, float monthlyProfitPercent) {
        double profit = 0d;

        for (int i = 1; i <= monthCount; i++) {
            profit += sum / 100 * monthlyProfitPercent;
        }

        return sum + profit;
    }
}
