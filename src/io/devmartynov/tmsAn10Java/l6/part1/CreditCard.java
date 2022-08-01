package io.devmartynov.tmsAn10Java.l6.part1;

/**
 * Credit card
 */
public class CreditCard {
    private final long accountNumber;
    private double amount;

    /**
     * Ctor.
     *
     * @param accountNumber account number
     * @param initialAmount positive number
     */
    public CreditCard(long accountNumber, double initialAmount) {
        this.accountNumber = accountNumber;
        this.amount = initialAmount;
    }

    /**
     * Charges account.
     *
     * @param amount amount
     * @throws IllegalArgumentException if amount is negative number
     */
    public void charge(double amount) throws IllegalArgumentException {
        if (!isAmountPositive(amount)) {
            throw new IllegalArgumentException("Amount must be positive!");
        }
        this.amount += amount;
    }

    /**
     * Withdraws amount.
     *
     * @param amount amount
     * @throws IllegalArgumentException if amount is negative number or current amount is smaller than passed amount
     */
    public void withdraw(double amount) throws IllegalArgumentException {
        String messages = "";
        if (!isAmountPositive(amount)) {
            messages += "Amount must be positive!\n";
        } else if (this.amount - amount < 0) {
            messages += "Insufficient funds!\n";
        }

        if (messages.length() != 0) {
            throw new IllegalArgumentException(messages);
        }
        this.amount -= amount;
    }

    /**
     * Displays credit card info.
     */
    public void displayInfo() {
        System.out.println(
            "Credit card with account number: "
                + beautifyAccountNumber(accountNumber)
                + ". Current amount: " + amount + "$"
        );
    }

    /**
     * Checks if amount is positive number
     *
     * @param amount amount
     * @return true if  amount is positive number otherwise false
     */
    private boolean isAmountPositive(double amount) {
        return amount > 0;
    }

    /**
     * Beautify account number by splitting it by 4 number and join with "-"
     * 1234567891011121314 --> "1234-5678-9101-2134"
     *
     * @return account number as string
     */
    private String beautifyAccountNumber(long accountNumber) {
        String[] arr = Long.toString(accountNumber).split("(?<=\\G....)");
        return String.join("-", arr);
    }
}
