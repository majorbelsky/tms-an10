package io.devmartynov.tmsAn10Java.l10;

import java.util.Random;

/**
 * Random string.
 */
public class RandomString {
    private static final char FORMATTING_SYMBOL = '%';
    private static final char INT_SYMBOL = 'd';
    private static final char STRING_SYMBOL = 's';
    private String format;
    private String value;
    private Random random = new Random();

    /**
     * Ctor.
     *
     * @param format string generation format
     */
    public RandomString(String format) {
        this.format = format;
        this.value = generate();
    }

    /**
     * Generates latin letter from range A-Z.
     *
     * @return letter
     */
    private char generateLetter() {
        return (char) ('A' + random.nextInt(26));
    }

    /**
     * Generates symbol as string by type format.
     *
     * @param type symbol type
     * @return symbol as string
     */
    private String generateSymbol(char type) {
        String symbol;
        switch (type) {
            case INT_SYMBOL: {
                symbol = String.valueOf(random.nextInt(10));
                break;
            }
            default: {
                symbol = String.valueOf(generateLetter());
            }
        }
        return symbol;
    }

    /**
     * Generates string
     *
     * @return string
     */
    private String generate() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < format.length(); i++) {
            if (format.charAt(i) == FORMATTING_SYMBOL && i + 1 < format.length()) {
                stringBuilder.append(generateSymbol(format.charAt(i + 1)));
                i++;
            } else {
                stringBuilder.append(format.charAt(i));
            }
        }

        return stringBuilder.toString();
    }

    /**
     * Generated random string
     *
     * @return string
     */
    public String getValue() {
        return value;
    }
}
