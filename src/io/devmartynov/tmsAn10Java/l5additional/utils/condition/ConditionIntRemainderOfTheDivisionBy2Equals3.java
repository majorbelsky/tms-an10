package io.devmartynov.tmsAn10Java.l5additional.utils.condition;

public class ConditionIntRemainderOfTheDivisionBy2Equals3 implements ConditionInt {
    @Override
    public boolean check(int number) {
        return number % 2 == 3;
    }
}
