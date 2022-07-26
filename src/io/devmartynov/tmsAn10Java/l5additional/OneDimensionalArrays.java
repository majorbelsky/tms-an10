package io.devmartynov.tmsAn10Java.l5additional;

import io.devmartynov.tmsAn10Java.l5additional.utils.*;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionalArrays {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        printAverageOfArrayElements();
//        printRootAndSquareOfArrayElements();
//        printSurnames();
//        printSurnameThatStartsWith();
//        printRandomIncreasedArray();
//        printNegativeElementsCountInArray();
//        printArrayWithReplacedNegativeNumbers();
//        printBiggestElementOfArray();
//        printDaysNumberWithTemperatureBelow10();
//        printDaysCountForSwimming();
//        printPrecipitations();
//        printCountWhenTemperatureHigherThanAverage();
//        printMinValueInArray();
        printDistance();
    }

    /**
     * Task #1
     */
    public static void printAverageOfArrayElements() {
        IntArray intArray = new IntArray(ArrayUtils.getArrayFromConsole(5));
        intArray.display(',');
        System.out.println("Average of array elements: " + intArray.averageOfElements());
    }

    /**
     * Task #2
     */
    public static void printRootAndSquareOfArrayElements() {
        int[] array = ArrayUtils.getArrayFromConsole(5);
        StringBuilder stringBuilder = new StringBuilder();

        for (int number : array) {
            stringBuilder
                .append("Number: ")
                .append(number)
                .append(" root: ")
                .append(Math.sqrt(number))
                .append(", square: ")
                .append(number * number)
                .append("\n");
        }

        System.out.print(stringBuilder);
    }

    /**
     * Task #3
     */
    public static void printSurnames() {
        String[] surnames = {"Martynov", "Ivanov", "Orlov", "Goncharov", "Sidorov"};
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = surnames.length - 1; i >= 0; i--) {
            stringBuilder
                .append(surnames[i])
                .append("\n");
        }

        System.out.println(stringBuilder);
    }

    /**
     * Task #4
     */
    public static void printSurnameThatStartsWith() {
        String[] surnames = {"Martynov", "Ivanov", "Orlov", "Goncharov", "Sidorov", "Gusev", "Smirnov", "Short"};
        StringBuilder stringBuilder = new StringBuilder();
        System.out.print("Enter letter: ");
        String letter = scanner.next();

        for (String surname : surnames) {
            if (surname.toLowerCase().startsWith(letter.toLowerCase())) {
                stringBuilder.append(surname);
            }
        }

        System.out.println(stringBuilder);
    }

    /**
     * Task #5
     */
    public static void printRandomIncreasedArray() {
        IntArray randomArray = new RandomIntArray(7).get();
        System.out.println("Array: " + randomArray);
        IntArray increasedArray = new IncreasedIntArray(randomArray, 2).get();
        System.out.println("Increased array: " + increasedArray);
    }

    /**
     * Task #6
     */
    public static void printNegativeElementsCountInArray() {
        IntArray randomArray = new RandomIntArray(8, -20, 10).get();
        System.out.println("Array: " + randomArray);
        System.out.println(
            "Negative elements count: " + new NegativeIntArray(randomArray).get().asPrimitive().length
        );
    }

    /**
     * Task #7
     */
    public static void printArrayWithReplacedNegativeNumbers() {
        IntArray randomArray = new RandomIntArray(12, -30, 10).get();
        System.out.println("Array: " + randomArray);
        NegativeIntArray negativeArray = new NegativeIntArray(randomArray);
        negativeArray.replaceNegativeWithZero();
        System.out.println("Array with replaced negative numbers by 0: " + negativeArray.get());
    }

    /**
     * Task #8
     */
    public static void printBiggestElementOfArray() {
        IntArray randomArray = new RandomIntArray(15, -35, 25).get();
        System.out.println("Array: " + randomArray);
        ArrayMeasurement arrayMeasurement = new ArrayMeasurement(randomArray);
        System.out.println(
            "Biggest element is: " + arrayMeasurement.biggestElement()
                + ", biggest element index is: " + arrayMeasurement.biggestElementIndex()
        );
    }

    /**
     * Task #9
     */
    public static void printNegativeTemperatureHour() {
        // TODO implemets
    }

    /**
     * Task #10
     */
    public static void printDaysNumberWithTemperatureBelow10() {
        IntArray temperatures = new RandomIntArray(10, -30).get();
        System.out.println("Array: " + temperatures);
        int count = 0;

        for (int temperature : temperatures.asPrimitive()) {
            if (temperature < -10) {
                count++;
            }
        }

        System.out.println("Temperature below 10: " + count + " times.");
    }

    /**
     * Task #11
     */
    public static void printDaysCountForSwimming() {
        int minTemperatureForSwimming = 23;
        int maxTemperatureForSwimming = 36;
        IntArray temperatures = new RandomIntArray(10, 30).get();
        System.out.println("Array: " + temperatures);
        int count = 0;

        for (int temperature : temperatures.asPrimitive()) {
            if (temperature >= minTemperatureForSwimming && temperature <= maxTemperatureForSwimming) {
                count++;
            }
        }

        System.out.println("Days count for swimming: " + count + " times.");
    }

    /**
     * Task #12
     */
    public static void printPrecipitations() {
        int daysCount = 10;
        int temperatureToSnow = 0;

        IntArray temperatures = new RandomIntArray(daysCount, 30, -20).get();
        IntArray precipitations = new RandomIntArray(daysCount, 20, 30).get();
        System.out.println("Temperatures: " + temperatures);
        System.out.println("Precipitations: " + precipitations);

        int precipitationsSnow = 0;
        int precipitationsRain = 0;

        int[] tempArray = temperatures.asPrimitive();
        int[] precipitationArray = precipitations.asPrimitive();

        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] < temperatureToSnow) {
                precipitationsSnow += precipitationArray[i];
            } else {
                precipitationsRain += precipitationArray[i];
            }
        }

        System.out.println("Rain: " + precipitationsRain + ". Snow: " + precipitationsSnow);
    }

    /**
     * Task #13
     */
    public static void printCountWhenTemperatureHigherThanAverage() {
        int[] temperatures = ArrayUtils.generateRandomArray(10, 30);
        float averageTemperature = ArrayUtils.averageOfElements(temperatures);
        System.out.println("Temperatures: " + Arrays.toString(temperatures));
        System.out.println("Average of temperatures: " + averageTemperature);
        int count = 0;

        for (int temperature : temperatures) {
            if (temperature > averageTemperature) {
                count++;
            }
        }

        System.out.println("Temperature is higher that average count: " + count);


    }

    /**
     * Task #14
     */
    public static void gg14() {
        // TODO implements
    }

    /**
     * Task #15
     */
    public static void printMinValueInArray() {
        int[] array = ArrayUtils.generateRandomArray(15);
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Min value: " + ArrayUtils.getSmallestElement(array));
    }

    /**
     * Task #16
     * initial speed is 0
     */
    public static void printDistance() {
        float[] array = new float[10];
        float g = 10f;

        for (int i = 0; i < array.length; i++) {
            array[i] = calculateDistanceOfFreeFall(0, i, g);
        }

        System.out.println("Array: " + Arrays.toString(array));
    }

    /**
     * Calculates passed distance in free fall by time
     *  S = V0 * t + а * t² / 2
     * @param initSpeed initial speed
     * @param time pass time
     * @param acceleration acceleration
     * @return distance
     */
    private static float calculateDistanceOfFreeFall(float initSpeed, int time, float acceleration) {
        return (initSpeed * time) + acceleration * time * time / 2;
    }
}
