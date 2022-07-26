package io.devmartynov.tmsAn10Java.l5additional.utils;

public class NegativeIntArray {
    private final IntArray origin;
    private IntArray array;

    public NegativeIntArray(IntArray array) {
        this.origin = array;
    }

    public IntArray get() {
        if (array == null) {
            array = negativeArray();
        }

        return array;
    }

    public void replaceNegativeWithZero() {
        int[] elements = origin.asPrimitive();

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < 0) {
                elements[i] = 0;
            }
        }

        array = new IntArray(elements);
    }

    private IntArray negativeArray() {
        int[] elements = new int[origin.asPrimitive().length];
        int counter = 0;

        for (int element : origin.asPrimitive()) {
            if (element < 0) {
                elements[counter] = element;
                counter++;
            }
        }

        IntArray newArray = new IntArray(elements);
        newArray.resize(counter);
        return newArray;
    }
}
