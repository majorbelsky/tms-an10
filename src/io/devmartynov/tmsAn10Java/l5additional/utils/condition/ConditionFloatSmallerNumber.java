package io.devmartynov.tmsAn10Java.l5additional.utils.condition;

public class ConditionFloatSmallerNumber implements ConditionFloat {
    private final float toCompareNumber;

    public ConditionFloatSmallerNumber(float number) {
        this.toCompareNumber = number;
    }

    @Override
    public boolean check(float number) {
        return number < toCompareNumber;
    }
}
