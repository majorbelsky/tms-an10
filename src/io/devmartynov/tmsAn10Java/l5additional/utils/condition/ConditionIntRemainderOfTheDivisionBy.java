package io.devmartynov.tmsAn10Java.l5additional.utils.condition;

public class ConditionIntRemainderOfTheDivisionBy implements ConditionInt {
    private final int number;

    public ConditionIntRemainderOfTheDivisionBy(int number) {
        this.number = number;
    }

    @Override
    public boolean check(int numToCheck) {
        return numToCheck % number == 0;
    }
}
