package io.devmartynov.tmsAn10Java.l3;

import java.util.Scanner;

public class ControlFlowConstruction {

    public static void main(String[] args) {
        System.out.println("Task #1 Get season by month number with SWITCH-CASE: ");
        printSeasonByMonthNumber(true);
        System.out.println("Task #1 Get season by month number with IF-ELSE-IF: ");
        printSeasonByMonthNumber(false);
        System.out.print("Task #2 Check number 5 is even: ");
        printIsEven(5);
        System.out.print("Task #3 Check weather statement by temperature -30: ");
        printWeatherStatementByTemperature(-30);
        System.out.println("Task #4  Get rainbow color by passed color number: ");
        printRainbowColorByNumber();
    }

    /**
     * Task #1
     * Write a program to output the time of the year by the number of the month.
     *
     * @param withSwitch if true SWITCH-CASE will be used to determine season else IF-ELSE-IF
     */
    public static void printSeasonByMonthNumber(boolean withSwitch) {
        Scanner scanner = new Scanner(System.in);
        boolean predicate = true;

        while (predicate) {
            try {
                System.out.print("Enter month number to get season: ");
                int monthNumber = scanner.nextInt();
                System.out.println(
                    "The season is: " + (withSwitch
                        ? getSeasonByMonthNumberWithSwitch(monthNumber)
                        : getSeasonByMonthNumberWithIf(monthNumber))
                );
                predicate = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Task #2
     * Write a program that will accept a number as input and display if number is even.
     *
     * @param number number
     */
    public static void printIsEven(int number) {
        System.out.println("Number " + number + " is " + (number % 2 == 0 ? "even" : "not even"));
    }

    /**
     * Task #3
     * Check weather statement by temperature and print checking result.
     *
     * @param temperature Temperature
     */
    public static void printWeatherStatementByTemperature(int temperature) {
        if (temperature <= 15 && temperature > -5) {
            System.out.println("Нормально");
            return;
        } else if (temperature > 15) {
            System.out.println("Тепло");
        } else {
            System.out.println("Холодно");
        }
    }

    /**
     * Task #4
     * Get rainbow color number from user input and print color name.
     */
    public static void printRainbowColorByNumber() {
        Scanner scanner = new Scanner(System.in);
        boolean predicate = true;

        while (predicate) {
            try {
                System.out.print("Enter color number: ");
                int colorNumber = scanner.nextInt();
                System.out.println(getRainbowColorByNumber(colorNumber));
                predicate = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Get rainbow color name by passed color number.
     *
     * @param number color number
     * @return color name
     * @throws IllegalArgumentException if passed number is not in range [1, 7]
     */
    private static RainbowColorsEnum getRainbowColorByNumber(int number) throws IllegalArgumentException {
        switch (number) {
            case 1:
                return RainbowColorsEnum.RED;
            case 2:
                return RainbowColorsEnum.ORANGE;
            case 3:
                return RainbowColorsEnum.YELLOW;
            case 4:
                return RainbowColorsEnum.GREEN;
            case 5:
                return RainbowColorsEnum.LIGHTBLUE;
            case 6:
                return RainbowColorsEnum.BLUE;
            case 7:
                return RainbowColorsEnum.PURPLE;
            default:
                throw new IllegalArgumentException("Incorrect color sequence number: " + number + ". Choose from 1 to 7");
        }
    }

    /**
     * Get season by month number.
     * Switch-case is used to determine season.
     * @param monthNumber month number
     * @return season label
     * @throws IllegalArgumentException if passed number is not in range [1, 12]
     */
    private static SeasonEnum getSeasonByMonthNumberWithSwitch(int monthNumber) throws IllegalArgumentException {
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                return SeasonEnum.WINTER;
            case 3:
            case 4:
            case 5:
                return SeasonEnum.SPRING;
            case 6:
            case 7:
            case 8:
                return SeasonEnum.SUMMER;
            case 9:
            case 10:
            case 11:
                return SeasonEnum.AUTUMN;
            default:
                throw new IllegalArgumentException("Incorrect month number: " + monthNumber + ". Choose from 1 to 12");
        }
    }

    /**
     * Get season by month number.
     * If-else-if is used to determine season.
     * @param monthNumber month number
     * @return season label
     * @throws IllegalArgumentException if passed number is not in range [1, 12]
     */
    private static SeasonEnum getSeasonByMonthNumberWithIf(int monthNumber) throws IllegalArgumentException {
        if (isWinter(monthNumber)) {
            return SeasonEnum.WINTER;
        } else if (isSpring(monthNumber)) {
            return SeasonEnum.SPRING;
        } else if (isSummer(monthNumber)) {
            return SeasonEnum.SUMMER;
        } else if (isAutumn(monthNumber)) {
            return SeasonEnum.AUTUMN;
        }

        throw new IllegalArgumentException("Incorrect month number: " + monthNumber + ". Choose from 1 to 12");
    }

    /**
     * Check winter season by month number
     *
     * @param monthNumber month number
     * @return checking result
     */
    private static boolean isWinter(int monthNumber) {
        return monthNumber == 12 || monthNumber == 1 || monthNumber == 2;
    }

    /**
     * Check spring season by month number
     *
     * @param monthNumber month number
     * @return checking result
     */
    private static boolean isSpring(int monthNumber) {
        return monthNumber == 3 || monthNumber == 4 || monthNumber == 5;
    }

    /**
     * Check summer season by month number
     *
     * @param monthNumber month number
     * @return checking result
     */
    private static boolean isSummer(int monthNumber) {
        return monthNumber == 6 || monthNumber == 7 || monthNumber == 8;
    }

    /**
     * Check autumn season by month number
     *
     * @param monthNumber month number
     * @return checking result
     */
    private static boolean isAutumn(int monthNumber) {
        return monthNumber == 9 || monthNumber == 10 || monthNumber == 11;
    }
}
