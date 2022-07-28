package io.devmartynov.tmsAn10Java.l5additional.utils.utils;

public class MathUtils {

    /**
     * Calculates passed distance in free fall by time
     * S = V0 * t + а * t² / 2
     *
     * @param initSpeed    initial speed
     * @param time         pass time
     * @param acceleration acceleration
     * @return distance
     */
    public static float calculateDistanceOfFreeFall(float initSpeed, int time, float acceleration) {
        return (initSpeed * time) + acceleration * time * time / 2;
    }
}
