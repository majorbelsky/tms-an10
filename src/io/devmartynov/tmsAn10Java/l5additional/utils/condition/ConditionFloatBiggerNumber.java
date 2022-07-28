package io.devmartynov.tmsAn10Java.l5additional.utils.condition;

public class ConditionFloatBiggerNumber implements ConditionFloat {
    private final float toCompareNumber;

    public ConditionFloatBiggerNumber(float number) {
        this.toCompareNumber = number;
    }

    @Override
    public boolean check(float number) {
        return number > toCompareNumber;
    }
}
