package io.devmartynov.tmsAn10Java.l5additional.utils.utils;

public class NumberUtils {
    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean isNegative(int num) {
        return num < 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
