package io.devmartynov.tmsAn10Java.l5additional.utils.utils;

import io.devmartynov.tmsAn10Java.l5additional.utils.SortDirectionEnum;
import io.devmartynov.tmsAn10Java.l5additional.utils.condition.ConditionFloat;
import io.devmartynov.tmsAn10Java.l5additional.utils.condition.ConditionInt;

import java.util.Arrays;

public class ArrayUtils {
    private static final int DEFAULT_ELEMENT_RANGE = 100;

    public static int[] getArrayFromConsole(int size) {
        int i = 0;
        int[] array = new int[size];

        while (i < size) {
            System.out.print("Enter array element with index " + i + ": ");
            array[i] = ConsoleUtils.requestIntNumber();
            i++;
        }

        return array;
    }

    public static void increaseArrayByMultiplier(int[] array, int multiplier) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= multiplier;
        }
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

    /**
     * Generates array of random elements
     * @param size size of array
     * @param range range of array element
     * @return array
     */
    public static float[] generateFloatRandomArray(int size, int range) {
        float[] array = new float[size];

        for (int i = 0; i < size; i++) {
            array[i] = (float) (Math.random() * range);
        }

        return array;
    }

    /**
     * Generates array of random elements
     * @param size size of array
     * @param range range of array element
     * @param startPosition start position
     * @return array
     */
    public static float[] generateFloatRandomArray(int size, int range, int startPosition) {
        float[] array = new float[size];

        for (int i = 0; i < size; i++) {
            array[i] = (float) (Math.random() * range + startPosition);
        }

        return array;
    }

    /**
     * Generates linear array.
     * @param begin array starts with this number
     * @param multiplier index of array multiply to this number
     * @param size size of array
     */
    public static int[] generateArrayAsSequence(int size, int begin, int multiplier, SortDirectionEnum direction) {
        int[] array = new int[size];

        for (int i = begin / multiplier; i < size; i++) {
            array[direction.equals(SortDirectionEnum.ASC) ? i : size - 1 - i] = multiplier * i;
        }

        return array;
    }

    /**
     * Finds the smallest element in array
     * @param array array
     * @return found element
     */
    public static int getSmallestElement(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    /**
     * Finds the biggest element in array
     * @param array array
     * @return found element
     */
    public static int findBiggestElement(int[] array) {
        int biggestElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if (biggestElement < array[i]) {
                biggestElement = array[i];
            }
        }

        return biggestElement;
    }

    /**
     * Finds the biggest element and its index in array
     * @param array array
     * @return array where first element is the biggest element, second is the biggest element index
     */
    public static int[] findBiggestElementAndItsIndex(int[] array) {
        int biggestElement = array[0];
        int biggestElementIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (biggestElement < array[i]) {
                biggestElement = array[i];
                biggestElementIndex = i;
            }
        }

        return new int[]{biggestElement, biggestElementIndex};
    }

    /**
     * Gets count of negative elements in array
     * @param array array
     * @return count
     */
    public static int getCountOfNegativeElements(int[] array) {
        int count = 0;

        for (int number : array) {
            if (NumberUtils.isNegative(number)) {
                count++;
            }
        }

        return count;
    }

    /**
     * Replaces every negative element in array with given number
     * @param array array
     * @param replaceNumber number
     */
    public static void replaceNegativeElementsWith(int[] array, int replaceNumber) {
        for (int i = 0; i < array.length; i++) {
            if (NumberUtils.isNegative(array[i])) {
                array[i] = replaceNumber;
            }
        }
    }

    /**
     * Calculates sum of all array elements that satisfy condition
     * @param array float array
     * @param condition ConditionFloat
     * @return sum
     */
    public static float calculateSumOfAllArrayElementsThatSatisfyTheCondition(float[] array, ConditionFloat condition) {
        int sum = 0;

        for (float number : array) {
            if (condition.check(number)) {
                sum += number;
            }
        }

        return sum;
    }

    /**
     * Calculates sum of all array elements that satisfy condition
     * @param array int array
     * @param condition ConditionInt
     * @return sum
     */
    public static int calculateSumOfAllArrayElementsThatSatisfyTheCondition(int[] array, ConditionInt condition) {
        int sum = 0;

        for (int number : array) {
            if (condition.check(number)) {
                sum += number;
            }
        }

        return sum;
    }

    /**
     * Calculates product of all array elements that satisfy condition
     * @param array int array
     * @param condition ConditionInt
     * @return product
     */
    public static int calculateProductOfAllArrayElementsThatSatisfyTheCondition(int[] array, ConditionInt condition) {
        int product = 1;
        boolean hasElements = false;

        for (int number : array) {
            if (condition.check(number)) {
                product *= number;
                hasElements = true;
            }
        }

        if (!hasElements) {
            product = 0;
        }

        return product;
    }

    /**
     * Calculates product of all array elements that satisfy condition
     * @param array float array
     * @param condition ConditionInt
     * @return product
     */
    public static float calculateProductOfAllArrayElementsThatSatisfyTheCondition(float[] array, ConditionFloat condition) {
        float product = 1;
        boolean hasElements = false;

        for (float number : array) {
            if (condition.check(number)) {
                product *= number;
                hasElements = true;
            }
        }

        if (!hasElements) {
            product = 0;
        }

        return product;
    }
}
