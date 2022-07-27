package io.devmartynov.tmsAn10Java.l5additional.utils.condition;

public class ConditionNotEqualNumber implements ConditionInt {
    private final int numberToCompare;

    public ConditionNotEqualNumber(int numberToCompare) {
        this.numberToCompare = numberToCompare;
    }

    @Override
    public boolean check(int number) {
        return number != numberToCompare;
    }
}
