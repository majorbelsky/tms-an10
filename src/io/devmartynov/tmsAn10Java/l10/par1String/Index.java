package io.devmartynov.tmsAn10Java.l10.par1String;

public class Index {
    public static void main(String[] args) {
        /*
        1. Дана строка произвольной длины с произвольными словами.
        Найти самое короткое слово в строке и вывести его на экран.
        Найти самое длинное слово в строке и вывести его на экран.
         */
        System.out.println(StringUtils.getShortestWord("dsdflkjsd s sdf lskjd ff d"));
        System.out.println(StringUtils.getLongestString("ddd s sdf lskjd ff d"));
        /*
        2.  Дана строка произвольной длины с произвольными словами.
        Найти слово, в котором число различных символов минимально.
        Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них. Например,
        в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
         */
        System.out.println(StringUtils.getWordWithMinCountOfDifferentChars("fffff ab f 1234 jkjk"));

        /*
        3. Дана строка произвольной длины с произвольными словами.
        Написать программу для проверки является ли любое выбранное слово в строке палиндромом.
        Например, есть строка, вводится число 3, значит необходимо проверить является ли 3 Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например, в строке 5 слов, а на вход программе передали число 500 и т. п. ситуации.
         */
        System.out.println(StringUtils.checkIsPalindromeWord("топот ываыва ыв ыва ы", 0));

        /*
         4. Дана произвольная строка. Вынести на консоль новую строку, в которой задублирована
         каждая буква из начальной строки.
         */
        System.out.println(StringUtils.duplicateLetterInString("Hello"));
    }
}
