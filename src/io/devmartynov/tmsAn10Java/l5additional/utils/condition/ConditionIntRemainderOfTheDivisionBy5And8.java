package io.devmartynov.tmsAn10Java.l5additional.utils.condition;

public class ConditionIntRemainderOfTheDivisionBy5And8 implements ConditionInt {
    @Override
    public boolean check(int number) {
        return number % 5 == 0 && number % 8 == 0;
    }
}
