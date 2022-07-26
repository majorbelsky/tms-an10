package io.devmartynov.tmsAn10Java.l5additional.utils;

public class RandomIntArray {
    private static final int DEFAULT_RANGE = 100;
    private static final int DEFAULT_START_POSITION = 0;
    private final int size;
    private final int range;
    private final int startPosition;
    private IntArray array;

    public RandomIntArray(final int size) {
        this.size = size;
        this.range = DEFAULT_RANGE;
        this.startPosition = DEFAULT_START_POSITION;
    }

    public RandomIntArray(final int size, final int range) {
        this.size = size;
        this.range = range;
        this.startPosition = DEFAULT_START_POSITION;
    }

    public RandomIntArray(final int size, final int range, final int startPosition) {
        this.size = size;
        this.range = range;
        this.startPosition = startPosition;
    }

    public IntArray get() {
        if (array == null) {
            array = generate();
        }
        return array;
    }

    private IntArray generate() {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * range + startPosition);
        }

        return new IntArray(array);
    }
}
