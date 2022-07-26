package io.devmartynov.tmsAn10Java.l5additional.utils;

public class SortedIntArray {
    private final IntArray origin;

    private IntArray array;

    private SortDirectionEnum lastSortDirection;

    public SortedIntArray(IntArray array) {
        this.origin = array;
    }

    public IntArray get(SortDirectionEnum sortDirection) {
        if (lastSortDirection.equals(sortDirection)) {
            if (array == null) {
                array = sortedArray(sortDirection);
            }
        } else {
            array = sortedArray(sortDirection);
            lastSortDirection = sortDirection;
        }

        return array;
    }

    private IntArray sortedArray(SortDirectionEnum sortDirectionEnum) {
        boolean isSorted = false;
        int tmp;
        int[] arrayToSort = origin.asPrimitive();

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrayToSort.length - 1; i++) {
                if (sortPredicate(arrayToSort[i], arrayToSort[i + 1], sortDirectionEnum)) {
                    tmp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i + 1];
                    arrayToSort[i + 1] = tmp;
                    isSorted = false;
                }
            }
        }

        return new IntArray(arrayToSort);
    }

    private boolean sortPredicate(int num1, int num2, SortDirectionEnum sortDirectionEnum) {
        return sortDirectionEnum.equals(SortDirectionEnum.ASC) ? num1 > num2 : num1 < num2;
    }
}
