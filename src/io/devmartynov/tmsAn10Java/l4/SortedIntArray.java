package io.devmartynov.tmsAn10Java.l4;

import java.util.Arrays;

public class SortedIntArray implements IntArray {
    private final IntArray array;
    private int[] sortedValue;
    public SortedIntArray(IntArray array) {
        this.array = array;
    }

    public int[] get() {
        if (sortedValue == null) {
            sortedValue = array.get();
            Arrays.sort(sortedValue);
        }
        return sortedValue;
    }
}
