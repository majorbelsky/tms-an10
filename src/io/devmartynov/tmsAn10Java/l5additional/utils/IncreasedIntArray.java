package io.devmartynov.tmsAn10Java.l5additional.utils;

public class IncreasedIntArray {
    private final IntArray origin;

    private final int increaseToNumber;

    private IntArray array;

    public IncreasedIntArray(IntArray array, int increaseToNumber) {
        this.origin = array;
        this.increaseToNumber = increaseToNumber;
    }

    public IntArray get() {
        if (array == null) {
            array = increaseArrayBy(increaseToNumber);
        }

        return array;
    }

    private IntArray increaseArrayBy(int number) {
        int[] array = origin.asPrimitive();

        for (int i = 0; i < array.length; i++) {
            array[i] *= number;
        }
        return new IntArray(array);
    }
}
