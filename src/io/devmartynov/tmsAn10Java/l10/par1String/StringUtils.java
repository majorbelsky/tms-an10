package io.devmartynov.tmsAn10Java.l10.par1String;

public class StringUtils {
    /**
     * Finds the shortest word in string.
     *
     * @param str string
     * @return string
     */
    public static String getShortestWord(String str) {
        String[] words = str.trim().split(" ");
        int length = words[0].length();
        int index = 0;

        for (int i = 1; i < words.length; i++) {
            int wordLength = words[i].length();
            if (wordLength <= length) {
                length = wordLength;
                index = i;
            }
        }

        return words[index];
    }

    /**
     * Finds the longest word in string
     *
     * @param str string
     * @return string
     */
    public static String getLongestString(String str) {
        String[] words = str.trim().split(" ");
        int length = words[0].length();
        int index = 0;

        for (int i = 1; i < words.length; i++) {
            int wordLength = words[i].length();
            if (wordLength >= length) {
                length = wordLength;
                index = i;
            }
        }

        return words[index];
    }

    /**
     * Finds word with minimal different characters.
     *
     * @param str str
     * @return str
     */
    public static String getWordWithMinCountOfDifferentChars(String str) {
        String[] words = str.trim().split(" ");
        int indexOfResultWord = 0;
        int minCount = words[0].length();

        for (int i = 0; i < words.length; i++) {
            char symbol = words[i].charAt(0);
            int tmpMinCount = 0;

            for (int j = 1; j < words[i].length(); j++) {
                char tmpSymbol = words[i].charAt(j);
                if (tmpSymbol != symbol) {
                    tmpMinCount++;
                }
            }

            if (tmpMinCount < minCount) {
                minCount = tmpMinCount;
                indexOfResultWord = i;
            }
        }

        return words[indexOfResultWord];
    }

    /**
     * Checks if word in string is palindrome
     *
     * @param str       string
     * @param wordIndex index of word in string
     * @return false if given wordIndex is out of string length and word isn't palindrome, otherwise true.
     */
    public static boolean checkIsPalindromeWord(String str, int wordIndex) {
        String[] words = str.trim().split(" ");
        if (wordIndex >= words.length) {
            System.out.println("You give index that is out of string");
            return false;
        }
        return isPalindrome(words[wordIndex].toLowerCase());
    }

    /**
     * Duplicates every letter in string.
     *
     * @param str string
     * @return string
     */
    public static String duplicateLetterInString(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            stringBuilder
                .append(symbol)
                .append(symbol);
        }
        return stringBuilder.toString();
    }

    /**
     * Checks if given string is palindrome
     *
     * @param str string
     * @return true if string is palindrome otherwise false
     */
    private static boolean isPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return str.equals(stringBuilder.toString());
    }
}
