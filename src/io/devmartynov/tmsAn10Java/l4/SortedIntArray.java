package io.devmartynov.tmsAn10Java.l4;

import java.util.Arrays;

public class SortedIntArray implements IntArray {
    private final IntArray array;
    public SortedIntArray(IntArray array) {
        this.array = array;
    }

    public int[] get() {
        int[] a = array.get();
        Arrays.sort(a);
        return a;
    }
}
