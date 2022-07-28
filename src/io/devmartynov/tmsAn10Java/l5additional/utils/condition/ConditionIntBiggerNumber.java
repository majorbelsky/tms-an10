package io.devmartynov.tmsAn10Java.l5additional.utils.condition;

public class ConditionIntBiggerNumber implements ConditionInt {
    private final float toCompareNumber;

    public ConditionIntBiggerNumber(float number) {
        this.toCompareNumber = number;
    }

    @Override
    public boolean check(int number) {
        return number > toCompareNumber;
    }
}
