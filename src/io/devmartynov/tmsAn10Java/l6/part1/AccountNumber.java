package io.devmartynov.tmsAn10Java.l6.part1;

/**
 * Account number
 */
public class AccountNumber {
    private static final int ACCOUNT_NUMBER_LENGTH = 16;
    private final long value;

    /**
     * Ctor.
     *
     * @param value value
     */
    public AccountNumber(long value) {
        String validationErrors = validate(value);
        if (validationErrors.length() > 0) {
            throw new IllegalArgumentException(validationErrors);
        }
        this.value = value;
    }

    /**
     * Returns account number value
     *
     * @return value
     */
    public long value() {
        return value;
    }

    /**
     * Validates account number.
     *
     * @param number account number
     * @return string representation of errors or empty string
     */
    private String validate(long number) {
        String errors = "";
        if (Long.toString(number).length() != ACCOUNT_NUMBER_LENGTH) {
            errors += "Incorrect length of account number";
        }
        //...other validation
        return errors;
    }
}
