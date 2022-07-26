package io.devmartynov.tmsAn10Java.l5additional.utils;

import java.util.Arrays;

public class ArrayMeasurement {
    private static final int NOT_FOUND_INDEX = -1;
    private final IntArray origin;

    private int biggestElement = NOT_FOUND_INDEX;

    private int biggestElementIndex = NOT_FOUND_INDEX;

    public ArrayMeasurement(IntArray array) {
        this.origin = array;
    }

    public int biggestElement() {
        if (biggestElement == NOT_FOUND_INDEX) {
            findBiggestElementAndItsIndex();
        }

        return biggestElement;
    }

    public int biggestElementIndex() {
        if (biggestElementIndex == NOT_FOUND_INDEX) {
            findBiggestElementAndItsIndex();
        }

        return biggestElementIndex;
    }

    public void findBiggestElementAndItsIndex() {
        int[] array = origin.asPrimitive();
        biggestElement = array[0];
        biggestElementIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (biggestElement < array[i]) {
                biggestElement = array[i];
                biggestElementIndex = i;
            }
        }
    }
}
