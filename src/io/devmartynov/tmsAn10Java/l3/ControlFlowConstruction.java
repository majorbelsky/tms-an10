package io.devmartynov.tmsAn10Java.l3;

import java.util.Scanner;

public class ControlFlowConstruction {
    private static final Scanner scanner = new Scanner(System.in);

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
        RainbowColorsEnum color;

        switch (number) {
            case 1:
                color = RainbowColorsEnum.RED;
                break;
            case 2:
                color = RainbowColorsEnum.ORANGE;
                break;
            case 3:
                color = RainbowColorsEnum.YELLOW;
                break;
            case 4:
                color = RainbowColorsEnum.GREEN;
                break;
            case 5:
                color = RainbowColorsEnum.LIGHTBLUE;
                break;
            case 6:
                color = RainbowColorsEnum.BLUE;
                break;
            case 7:
                color = RainbowColorsEnum.PURPLE;
                break;
            default:
                throw new IllegalArgumentException("Incorrect color sequence number: " + number + ". Choose from 1 to 7");
        }

        return color;
    }

    /**
     * Get season by month number.
     * Switch-case is used to determine season.
     * @param monthNumber month number
     * @return season label
     * @throws IllegalArgumentException if passed number is not in range [1, 12]
     */
    private static SeasonEnum getSeasonByMonthNumberWithSwitch(int monthNumber) throws IllegalArgumentException {
        SeasonEnum month;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                month = SeasonEnum.WINTER;
                break;
            case 3:
            case 4:
            case 5:
                month = SeasonEnum.SPRING;
                break;
            case 6:
            case 7:
            case 8:
                month = SeasonEnum.SUMMER;
                break;
            case 9:
            case 10:
            case 11:
                month = SeasonEnum.AUTUMN;
                break;
            default:
                throw new IllegalArgumentException("Incorrect month number: " + monthNumber + ". Choose from 1 to 12");
        }

        return month;
    }

    /**
     * Get season by month number.
     * If-else-if is used to determine season.
     * @param monthNumber month number
     * @return season label
     * @throws IllegalArgumentException if passed number is not in range [1, 12]
     */
    private static SeasonEnum getSeasonByMonthNumberWithIf(int monthNumber) throws IllegalArgumentException {
        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            return SeasonEnum.WINTER;
        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            return SeasonEnum.SPRING;
        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            return SeasonEnum.SUMMER;
        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            return SeasonEnum.AUTUMN;
        }

        throw new IllegalArgumentException("Incorrect month number: " + monthNumber + ". Choose from 1 to 12");
    }
}
