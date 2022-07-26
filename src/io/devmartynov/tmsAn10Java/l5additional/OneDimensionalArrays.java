package io.devmartynov.tmsAn10Java.l5additional;

import io.devmartynov.tmsAn10Java.l5additional.utils.*;
import io.devmartynov.tmsAn10Java.l5additional.utils.condition.*;
import io.devmartynov.tmsAn10Java.l5additional.utils.utils.ArrayUtils;
import io.devmartynov.tmsAn10Java.l5additional.utils.utils.ConsoleUtils;
import io.devmartynov.tmsAn10Java.l5additional.utils.utils.NumberUtils;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class OneDimensionalArrays {
    private static final int DECADE = 10;

    public static void main(String[] args) {
        printAverageOfArrayElements();
        printRootAndSquareOfArrayElements();
        printSurnames();
        printSurnameThatStartsWith();
        printRandomIncreasedArray();
        printNegativeElementsCountInArray();
        printArrayWithReplacedNegativeNumbers();
        printBiggestElementOfArray();
        printDaysNumberWithTemperatureBelow10();
        printDaysCountForSwimming();
        printPrecipitations();
        printCountWhenTemperatureHigherThanAverage();
        printWindStatement();
        printMinValueInArray();
        printDistance();
        printIsOrderedArray();
        printSumOfPositiveElementsOfArray();
        printSumOfEvenElementsOfArray();
        printProductOfElementsThatAreMultipliesOfSeven();
        printSumOfElementsThatHaveNotEventIndex();
        printProductOfElementsThatLessZero();
        printSumOfElementsThatRemainderOfTheDivisionBy2Is3();
        printSumOfElementsWhichIsBiggerThanNumber();
        printProductOfElementsWhichIsSmallerThanNumber();
        printProductOfElementsThatRemainderOfTheDivisionBy3And9();
        printSumOfElementsThatSmallerAverageOfElements();
        printSumOfElementsThatRemainderOfTheDivisionBy5And8();
        printProductOfAllArrayElementsRemainderOfTheDivisionBy5();
        printAscSortedArray();
    }

    /**
     * Task #1
     * Введите с клавиатуры в массив пять целочисленных значений. Выведите их в одну строку через запятую.
     * Получите для массива среднее арифметическое.
     */
    public static void printAverageOfArrayElements() {
        int[] array = ArrayUtils.getArrayFromConsole(5);
        ConsoleUtils.printAsSequence(array, ", ");
        System.out.println("Average of array elements: " + ArrayUtils.averageOfElements(array));
    }

    /**
     * Task #2
     * Введите с клавиатуры пять целочисленных элементов массива X.
     * Выведите на экран значения корней и квадратов каждого из элементов массива.
     */
    public static void printRootAndSquareOfArrayElements() {
        int[] array = ArrayUtils.getArrayFromConsole(5);
        StringJoiner stringJoiner = new StringJoiner("\n");

        for (int number : array) {
            stringJoiner.add("Number: " + number + " root: " + Math.sqrt(number) + ", square: " + number * number);
        }

        System.out.print(stringJoiner);
    }

    /**
     * Task #3
     * Создайте массив из пяти фамилий и выведите их на экран столбиком, начиная с последней.
     */
    public static void printSurnames() {
        String[] surnames = {"Martynov", "Ivanov", "Orlov", "Goncharov", "Sidorov"};
        StringJoiner stringJoiner = new StringJoiner("\n");

        for (int i = surnames.length - 1; i >= 0; i--) {
            stringJoiner.add(surnames[i]);
        }

        System.out.println(stringJoiner);
    }

    /**
     * Task #4
     * Создайте массив из пяти фамилий и выведите их на экран те из них, которые начинаются с определенной буквы,
     * которая вводится с клавиатуры.
     */
    public static void printSurnameThatStartsWith() {
        String[] surnames = {"Martynov", "Ivanov", "Orlov", "Goncharov", "Sidorov", "Gusev", "Smirnov", "Short"};
        StringJoiner stringJoiner = new StringJoiner(", ");
        String letter = ConsoleUtils.requestString();

        for (String surname : surnames) {
            if (surname.toLowerCase().startsWith(letter.toLowerCase())) {
                stringJoiner.add(surname);
            }
        }

        System.out.println(stringJoiner);
    }

    /**
     * Task #5
     * Создайте массив А[1..7] с помощью генератора случайных чисел и выведите его на экран.
     * Увеличьте все его элементы в 2 раза.
     */
    public static void printRandomIncreasedArray() {
        int[] array = ArrayUtils.generateRandomArray(7);
        ConsoleUtils.printArray(array);
        ArrayUtils.increaseArrayByMultiplier(array, 2);
        ConsoleUtils.printArray(array);
    }

    /**
     * Task #6
     * Создайте массив А[1..8] с помощью генератора случайных чисел с элементами от –10 до 10 и выведите его на экран.
     * Подсчитайте количество отрицательных элементов массива.
     */
    public static void printNegativeElementsCountInArray() {
        int[] array = ArrayUtils.generateRandomArray(8, -20, 10);
        ConsoleUtils.printArray(array);
        System.out.println("Negative elements count: " + ArrayUtils.getCountOfNegativeElements(array));
    }

    /**
     * Task #7
     * Создайте массив А[1..12] с помощью генератора случайных чисел с элементами от –20 до 10 и выведите его на экран.
     * Замените все отрицательные элементы массива числом 0.
     */
    public static void printArrayWithReplacedNegativeNumbers() {
        int[] array = ArrayUtils.generateRandomArray(12, -30, 10);
        ConsoleUtils.printArray(array);
        ArrayUtils.replaceNegativeElementsWith(array, 0);
        ConsoleUtils.printArray(array);
    }

    /**
     * Task #8
     * Создайте целочисленный массив А[1..15] с помощью генератора случайных чисел с элементами от –15 до 30
     * и выведите его на экран. Определите самый большой элемент массива и его индекс.
     */
    public static void printBiggestElementOfArray() {
        int[] array = ArrayUtils.generateRandomArray(15, -35, 25);
        ConsoleUtils.printArray(array);
        int[] measurements = ArrayUtils.findBiggestElementAndItsIndex(array);
        System.out.println(
            "Biggest element is: " + measurements[0]
                + ", biggest element index is: " + measurements[1]
        );
    }

    /**
     * Task #9
     * С 8 до 20 часов температура воздуха измерялась ежечасно. Известно, что в течение этого времени температура
     * понижалась. Определите, в котором часу была впервые отмечена отрицательная температура.
     */
    public static void printNegativeTemperatureHour() {
        // TODO некорректное условие задачи
    }

    /**
     * Task #10
     * Данные о температуре воздуха за декаду ноября хранятся в массиве.
     * Определить, сколько раз температура опускалась ниже –10 градусов.
     */
    public static void printDaysNumberWithTemperatureBelow10() {
        int[] temperatures = ArrayUtils.generateRandomArray(10, -30);
        ConsoleUtils.printArray(temperatures);
        int count = 0;

        for (int temperature : temperatures) {
            if (temperature < -10) {
                count++;
            }
        }

        System.out.println("Temperature below 10: " + count + " times.");
    }

    /**
     * Task #11
     * Данные о температуре воды на Черноморском побережье за декаду сентября хранятся в массиве.
     * Определить, сколько за это время было дней, пригодных для купания.
     */
    public static void printDaysCountForSwimming() {
        int minTemperatureForSwimming = 23;
        int maxTemperatureForSwimming = 36;
        int[] temperatures = ArrayUtils.generateRandomArray(10, 30);
        ConsoleUtils.printArray(temperatures);
        int count = 0;

        for (int temperature : temperatures) {
            if (temperature >= minTemperatureForSwimming && temperature <= maxTemperatureForSwimming) {
                count++;
            }
        }

        System.out.println("Days count for swimming: " + count + " times.");
    }

    /**
     * Task #12
     * Данные о температуре воздуха и количестве осадков за декаду апреля хранятся в массивах.
     * Определить количество осадков, выпавших в виде дождя и в виде снега за эту декаду.
     */
    public static void printPrecipitations() {
        int daysCount = 10;
        int temperatureToSnow = 0;

        int[] temperatures = ArrayUtils.generateRandomArray(daysCount, 30, -20);
        int[] precipitations = ArrayUtils.generateRandomArray(daysCount, 20, 30);
        ConsoleUtils.printArray(temperatures);
        ConsoleUtils.printArray(precipitations);

        int precipitationsSnow = 0;
        int precipitationsRain = 0;

        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] < temperatureToSnow) {
                precipitationsSnow += precipitations[i];
            } else {
                precipitationsRain += precipitations[i];
            }
        }

        System.out.println("Rain: " + precipitationsRain + ". Snow: " + precipitationsSnow);
    }

    /**
     * Task #13
     * Данные о температуре воздуха за декаду декабря хранятся в массиве.
     * Определить, сколько раз температура была выше средней за эту декаду..
     */
    public static void printCountWhenTemperatureHigherThanAverage() {
        int[] temperatures = ArrayUtils.generateRandomArray(10, 30);
        float averageTemperature = ArrayUtils.averageOfElements(temperatures);
        ConsoleUtils.printArray(temperatures);
        System.out.println("Average of temperatures: " + averageTemperature);
        int count = 0;

        for (int temperature : temperatures) {
            if (temperature > averageTemperature) {
                count++;
            }
        }
        System.out.println("Temperature is higher that average count: " + count);
    }

    /**
     * Task #14
     * Данные о направлении ветра (северный, южный, восточный, западный) и силе ветра за декаду ноября хранятся
     * в массиве. Определить, сколько дней дул южный ветер с силой, превышающей 8 м/с.
     */
    public static void printWindStatement() {
        int[] windPowers = ArrayUtils.generateRandomArray(DECADE, 20, 10);
        WindDirectionEnum[] windDirections = {
            WindDirectionEnum.EASTERN,
            WindDirectionEnum.WESTERN,
            WindDirectionEnum.EASTERN,
            WindDirectionEnum.WESTERN,
            WindDirectionEnum.EASTERN,
            WindDirectionEnum.SOUTH,
            WindDirectionEnum.WESTERN,
            WindDirectionEnum.SOUTH,
            WindDirectionEnum.NORTHERN,
            WindDirectionEnum.WESTERN,
        };

        ConsoleUtils.printArray(windPowers);
        System.out.println("Array: " + Arrays.toString(windDirections));

        int i = 0;
        int counter = 0;
        while (i < DECADE) {
            if (windPowers[i] > 8 && windDirections[i].equals(WindDirectionEnum.SOUTH)) {
                counter++;
            }
            i++;
        }

        System.out.println("Count: " + counter);
    }

    /**
     * Task #15
     * Создайте массив из 15 целочисленных элементов и определите среди них минимальное значение.
     */
    public static void printMinValueInArray() {
        int[] array = ArrayUtils.generateRandomArray(15);
        ConsoleUtils.printArray(array);
        System.out.println("Min value: " + ArrayUtils.getSmallestElement(array));
    }

    /**
     * Task #16
     * Сформируйте линейный массив вещественных чисел, элементы которого являются расстояниями,
     * пройденными телом при свободном падении на землю за 1, 2, … , 10 с.
     * initial speed is 0
     */
    public static void printDistance() {
        float[] array = new float[10];
        float g = 10f;
        for (int i = 0; i < array.length; i++) {
            array[i] = calculateDistanceOfFreeFall(0, i, g);
        }
        System.out.println("Array: " + Arrays.toString(array));
    }

    /**
     * Task #17
     * Дан линейный массив целых чисел. Проверьте, является ли он упорядоченным по убыванию.
     */
    public static void printIsOrderedArray() {
        int[] array = ArrayUtils.generateArrayAsSequence(10, 0, 1, SortDirectionEnum.ASC);
        ConsoleUtils.printArray(array);
        boolean isOrderedDesc = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                isOrderedDesc = false;
                break;
            }
        }
        System.out.println("Is desc ordered: " + isOrderedDesc);
    }

    /**
     * Task #18
     * Найти сумму положительных элементов линейного массива целых чисел. Размерность массива – 10.
     * Заполнение массива осуществить с клавиатуры.
     */
    public static void printSumOfPositiveElementsOfArray() {
        int[] array = ArrayUtils.getArrayFromConsole(10);
        ConsoleUtils.printArray(array);
        int sum = ArrayUtils.calculateSumOfAllArrayElementsThatSatisfyTheCondition(
            array,
            new ConditionIntPositive()
        );
        System.out.println("Sum of positive elements: " + sum);
    }

    /**
     * Task #19
     * Найти сумму четных элементов массива целых чисел. Размерность массива – 20.
     * Заполнение массива осуществить случайными числами от 100 до 200.
     */
    public static void printSumOfEvenElementsOfArray() {
        int[] array = ArrayUtils.generateRandomArray(20, 100, 100);
        ConsoleUtils.printArray(array);
        int sum = ArrayUtils.calculateSumOfAllArrayElementsThatSatisfyTheCondition(
            array,
            new ConditionIntEven()
        );
        System.out.println("Sum of even elements: " + sum);
    }

    /**
     * Task #20
     * Найти произведение элементов массива целых чисел, которые кратны 7. Размерность массива – 15.
     * Заполнение массива осуществить случайными числами от 10 до 50.
     */
    public static void printProductOfElementsThatAreMultipliesOfSeven() {
        int[] array = ArrayUtils.generateRandomArray(15, 50, 10);
        ConsoleUtils.printArray(array);
        int product = ArrayUtils.calculateProductOfAllArrayElementsThatSatisfyTheCondition(
            array,
            new ConditionIntRemainderOfTheDivisionBy(7)
        );
        System.out.println("Sum of even elements: " + product);
    }

    /**
     * Task #21
     * Найти сумму элементов массива вещественных чисел, имеющих нечетные номера. Размерность массива – 20.
     * Заполнение массива осуществить случайными числами от 100 до 200.
     */
    public static void printSumOfElementsThatHaveNotEventIndex() {
        float[] array = ArrayUtils.generateFloatRandomArray(20, 100, 100);
        ConsoleUtils.printArray(array);
        float sum = 0f;

        for (int i = 0; i < array.length; i++) {
            if (!NumberUtils.isEven(i)) {
                sum += array[i];
            }
        }

        System.out.println("Sum of elements with not even index: " + sum);
    }

    /**
     * Task #22
     * Найти произведение всех элементов массива целых чисел, меньших 0. Размерность массива – 10.
     * Заполнение массива осуществить с клавиатуры.
     */
    public static void printProductOfElementsThatLessZero() {
        int[] array = ArrayUtils.getArrayFromConsole(10);
        int product = ArrayUtils.calculateProductOfAllArrayElementsThatSatisfyTheCondition(
            array,
            new ConditionIntSmallerNumber(0)
        );
        System.out.println("Product of positive elements: " + product);
    }

    /**
     * Task #23
     * Найти сумму всех элементов массива целых чисел, удовлетворяющих условию: остаток от деления на 2 равен 3.
     * Размерность массива – 20. Заполнение массива осуществить случайными числами от 200 до 300.
     */
    public static void printSumOfElementsThatRemainderOfTheDivisionBy2Is3() {
        int[] array = ArrayUtils.generateRandomArray(20, 100, 200);
        ConsoleUtils.printArray(array);
        int sum = ArrayUtils.calculateSumOfAllArrayElementsThatSatisfyTheCondition(
            array,
            new ConditionIntRemainderOfTheDivisionBy2Equals3()
        );
        System.out.println("Sum: " + sum);
    }

    /**
     * Task #24
     * Найти сумму всех элементов массива вещественных чисел, больших заданного числа. Размерность массива – 20.
     * Заполнение массива осуществить случайными числами от 50 до 100.
     */
    public static void printSumOfElementsWhichIsBiggerThanNumber() {
        float toCompareNumber = ConsoleUtils.requestFloatNumber();
        float[] array = ArrayUtils.generateFloatRandomArray(20, 50 ,50);
        ConsoleUtils.printArray(array);
        float sum = ArrayUtils.calculateSumOfAllArrayElementsThatSatisfyTheCondition(
            array,
            new ConditionFloatBiggerNumber(toCompareNumber)
        );

        System.out.println("Sum: " + sum);
    }

    /**
     * Task #25
     * Найти произведение всех элементов массива вещественных чисел, меньших заданного числа. Размерность массива – 10.
     * Заполнение массива осуществить случайными числами от 50 до 100.
     */
    public static void printProductOfElementsWhichIsSmallerThanNumber() {
        float toCompareNumber = ConsoleUtils.requestFloatNumber();
        float[] array = ArrayUtils.generateFloatRandomArray(10, 50, 50);
        ConsoleUtils.printArray(array);
        float product = ArrayUtils.calculateProductOfAllArrayElementsThatSatisfyTheCondition(
            array,
            new ConditionFloatSmallerNumber(toCompareNumber)
        );
        System.out.println("Sum: " + product);
    }

    /**
     * Task #26
     * Найти произведение элементов массива, кратных 3 и 9. Размерность массива – 10.
     * Заполнение массива осуществить случайными числами от 5 до 500.
     */
    public static void printProductOfElementsThatRemainderOfTheDivisionBy3And9() {
        int[] array = ArrayUtils.generateRandomArray(30, 495, 5);
        ConsoleUtils.printArray(array);
        int product = ArrayUtils.calculateProductOfAllArrayElementsThatSatisfyTheCondition(
            array,
            new ConditionIntRemainderOfTheDivisionBy(9)
        );
        System.out.println("Product: " + product);
    }

    /**
     * Task #27
     * Найти сумму всех элементов массива целых чисел, которые меньше среднего арифметического элементов массива.
     * Размерность массива –20. Заполнение массива осуществить случайными числами от 150 до 300.
     */
    public static void printSumOfElementsThatSmallerAverageOfElements() {
        int[] array = ArrayUtils.generateRandomArray(20, 150, 150);
        ConsoleUtils.printArray(array);
        float averageOfElements = ArrayUtils.averageOfElements(array);
        System.out.println("Average: " + averageOfElements);
        int sum = ArrayUtils.calculateSumOfAllArrayElementsThatSatisfyTheCondition(
            array,
            new ConditionIntSmallerNumber(averageOfElements)
        );
        System.out.println("Sum: " + sum);
    }

    /**
     * Task #28
     * Найти сумму элементов массива целых чисел, которые делятся на 5 и на 8 одновременно. Размерность массива –30.
     * Заполнение массива осуществить случайными числами от 500 до 1000.
     */
    public static void printSumOfElementsThatRemainderOfTheDivisionBy5And8() {
        int[] array = ArrayUtils.generateRandomArray(30, 500, 500);
        ConsoleUtils.printArray(array);
        int sum = ArrayUtils.calculateSumOfAllArrayElementsThatSatisfyTheCondition(
            array,
            new ConditionIntRemainderOfTheDivisionBy5And8()
        );
        System.out.println("Sum: " + sum);
    }

    /**
     * Task #29
     * Найти произведение элементов линейного массива целых чисел, которые кратны 5.
     * Размерность массива –10. Заполнение массива осуществить случайными числами от 10 до 100.
     */
    public static void printProductOfAllArrayElementsRemainderOfTheDivisionBy5() {
        int[] array = ArrayUtils.generateRandomArray(10, 90, 10);
        ConsoleUtils.printArray(array);
        int product = ArrayUtils.calculateProductOfAllArrayElementsThatSatisfyTheCondition(
            array,
            new ConditionIntRemainderOfTheDivisionBy(5)
        );
        System.out.println("Product: " + product);
    }

    /**
     * Task #30
     * Рассортируйте заданный линейный массив по возрастанию.
     */
    public static void printAscSortedArray() {
        int[] array = ArrayUtils.generateRandomArray(20);
        ConsoleUtils.printArray(array);
        Arrays.sort(array);
        ConsoleUtils.printArray(array);
    }

    /**
     * Calculates passed distance in free fall by time
     * S = V0 * t + а * t² / 2
     *
     * @param initSpeed    initial speed
     * @param time         pass time
     * @param acceleration acceleration
     * @return distance
     */
    private static float calculateDistanceOfFreeFall(float initSpeed, int time, float acceleration) {
        return (initSpeed * time) + acceleration * time * time / 2;
    }
}
