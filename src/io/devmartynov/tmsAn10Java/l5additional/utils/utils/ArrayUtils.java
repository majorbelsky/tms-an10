package io.devmartynov.tmsAn10Java.l5additional.utils.utils;

import io.devmartynov.tmsAn10Java.l5additional.utils.SortDirectionEnum;
import io.devmartynov.tmsAn10Java.l5additional.utils.condition.ConditionFloat;
import io.devmartynov.tmsAn10Java.l5additional.utils.condition.ConditionInt;

import java.util.Arrays;

public class ArrayUtils {
    private static final int DEFAULT_ELEMENT_RANGE = 100;

    /**
     * Gets int array from console by requesting number step by step
     *
     * @param size size of array
     * @return int array
     */
    public static int[] getArrayFromConsole(int size) {
        int i = 0;
        int[] array = new int[size];

        while (i < size) {
            System.out.print(ConsoleUtils.REQUEST_ARRAY_MESSAGE + i + ": ");
            array[i] = ConsoleUtils.requestIntNumber();
            i++;
        }

        return array;
    }

    /**
     * Gets float array from console by requesting number step by step
     *
     * @param size size of array
     * @return float array
     */
    public static float[] getFloatArrayFromConsole(int size) {
        int i = 0;
        float[] array = new float[size];

        while (i < size) {
            System.out.print(ConsoleUtils.REQUEST_ARRAY_MESSAGE + i + ": ");
            array[i] = ConsoleUtils.requestFloatNumber();
            i++;
        }

        return array;
    }

    /**
     * Increases every element in array by multiplying on multiplier
     *
     * @param array      array
     * @param multiplier multiplier
     */
    public static void increaseArrayByMultiplier(int[] array, int multiplier) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= multiplier;
        }
    }

    /**
     * Calculates average of array elements
     *
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
     *
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
     *
     * @param size          size of array
     * @param range         range of array element
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
     *
     * @param size  size of array
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
     *
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
     *
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
     *
     * @param size  size of array
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
     *
     * @param size          size of array
     * @param range         range of array element
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
     *
     * @param begin      array starts with this number
     * @param multiplier index of array multiply to this number
     * @param size       size of array
     */
    public static int[] generateArrayAsSequence(int size, int begin, int multiplier, SortDirectionEnum direction) {
        int[] array = new int[size];

        for (int i = 0, j = begin / multiplier; i < size; i++, j++) {
            array[direction.equals(SortDirectionEnum.ASC) ? i : size - 1 - i] = multiplier * j;
        }

        return array;
    }

    /**
     * Finds the smallest element in int array
     *
     * @param array int array
     * @return found element
     */
    public static int getSmallestElement(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    /**
     * Finds the smallest element in float array
     *
     * @param array float array
     * @return found element
     */
    public static float getSmallestElement(float[] array) {
        Arrays.sort(array);
        return array[0];
    }

    /**
     * Finds the smallest element and its index in array
     *
     * @param array array
     * @return array where first element is the smallest element, second is the smallest element index
     */
    public static int[] getSmallestElementAndItsIndex(int[] array) {
        int smallestElement = array[0];
        int smallestElementIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestElement) {
                smallestElement = array[i];
                smallestElementIndex = i;
            }
        }

        return new int[]{smallestElement, smallestElementIndex};
    }

    /**
     * Finds the biggest element in int array
     *
     * @param array array
     * @return found int element
     */
    public static int getBiggestElement(int[] array) {
        int biggestElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if (biggestElement < array[i]) {
                biggestElement = array[i];
            }
        }

        return biggestElement;
    }

    /**
     * Finds the biggest element in float array
     *
     * @param array array
     * @return found float element
     */
    public static float getBiggestElement(float[] array) {
        float biggestElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if (biggestElement < array[i]) {
                biggestElement = array[i];
            }
        }

        return biggestElement;
    }

    /**
     * Finds the biggest element and its index in array
     *
     * @param array array
     * @return array where first element is the biggest element, second is the biggest element index
     */
    public static int[] getBiggestElementAndItsIndex(int[] array) {
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
     *
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
     *
     * @param array         array
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
     * Calculates sum of all array elements.
     *
     * @param array int array
     * @return sum
     */
    public static int calculatesElementsSum(int[] array) {
        int sum = 0;

        for (float number : array) {
            sum += number;
        }

        return sum;
    }

    /**
     * Calculates sum of all array elements that satisfy condition
     *
     * @param array     float array
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
     *
     * @param array     int array
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
     *
     * @param array     int array
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
     *
     * @param array     float array
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

    /**
     * Gets count of elements that satisfy the condition
     *
     * @param array     int array
     * @param condition int condition
     * @return count
     */
    public static int getElementsCountThatSatisfyTheCondition(int[] array, ConditionInt condition) {
        int count = 0;

        for (int number : array) {
            if (condition.check(number)) {
                count++;
            }
        }

        return count;
    }

    /**
     * Removes duplicates of given element and return array.
     *
     * @param array array
     * @param str   str to search for duplication
     * @return array without duplication of str
     */
    public static String[] arrayWithoutDuplicatesOf(String[] array, String str) {
        int i = 1;
        int size = array.length;

        while (i < size) {
            if (array[i].equals(str)) {
                System.arraycopy(array, i + 1, array, i, array.length - i - 1);
                size--;
            } else {
                i++;
            }
        }

        if (size == array.length) {
            return array;
        }

        return Arrays.copyOfRange(array, 0, size);
    }

    /**
     * Swaps elements in array: first -> last, second -> before last, ...
     *
     * @param array array
     */
    public static void swapElements(String[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            String tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
    }

    /**
     * Swaps elements in array: first -> last, second -> before last, ...
     *
     * @param array array
     */
    public static void swapElements(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
    }

    /**
     * Finds index of given element.
     *
     * @param array   array
     * @param element element
     * @return -1 if element doesn't exist in array otherwise index
     */
    public static int findIndexOfElement(int[] array, int element) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }
        return index;
    }
}
