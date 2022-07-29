package io.devmartynov.tmsAn10Java.l6.part1;

/**
 * Amount of credit card
 */
public class Amount {
    private final double value;

    /**
     * Ctor.
     * Validates number.
     *
     * @param value positive number
     */
    public Amount(double value) {
        String validationErrors = validate(value);
        if (validationErrors.length() > 0) {
            throw new IllegalArgumentException(validationErrors);
        }
        this.value = value;
    }

    /**
     * Returns amount value
     *
     * @return value
     */
    public double value() {
        return value;
    }

    /**
     * Validates amount.
     * Zero amount - is correct amount. There are cases where services checks credit card by withdraw zero amount.
     *
     * @param amount positive number
     * @return string representation of errors or empty string
     */
    private String validate(double amount) {
        String errors = "";
        if (amount < 0) {
            errors += "Amount can not be negative.\n";
        }
        //...other validation
        return errors;
    }
}
