package io.devmartynov.tmsAn10Java.l4;

public class RandomIntArray implements IntArray {
    private static final int DEFAULT_RANGE = 100;
    private static final int DEFAULT_START_POSITION = 0;
    private final int size;
    private final int range;
    private final int startPosition;
    private int[] array;

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

    public int[] get() {
        if (array == null) {
            array = generate();
        }
        return array;
    }

    private int[] generate() {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * range + startPosition);
        }

        return array;
    }
}
