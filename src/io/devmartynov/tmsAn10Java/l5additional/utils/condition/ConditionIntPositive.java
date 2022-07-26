package io.devmartynov.tmsAn10Java.l5additional.utils.condition;

import io.devmartynov.tmsAn10Java.l5additional.utils.utils.NumberUtils;

public class ConditionIntPositive implements ConditionInt {
    @Override
    public boolean check(int number) {
        return NumberUtils.isPositive(number);
    }
}
