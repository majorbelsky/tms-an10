package io.devmartynov.tmsAn10Java.l5additional.utils.condition;

import io.devmartynov.tmsAn10Java.l5additional.utils.utils.NumberUtils;

public class ConditionIntEven implements ConditionInt {
    @Override
    public boolean check(int number) {
        return NumberUtils.isEven(number);
    }
}
