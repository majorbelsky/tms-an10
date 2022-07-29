package io.devmartynov.tmsAn10Java.l6.part1;

/**
 * Credit card
 */
public class CreditCard {
    private final AccountNumber accountNumber;
    private Amount amount;

    /**
     * Ctor.
     * Initial amount is 0.
     *
     * @param accountNumber account number
     */
    public CreditCard(AccountNumber accountNumber) {
        this.accountNumber = accountNumber;
        this.amount = new Amount(0);
    }

    /**
     * Ctor.
     *
     * @param accountNumber account number
     * @param initialAmount positive number
     */
    public CreditCard(AccountNumber accountNumber, Amount initialAmount) {
        this.accountNumber = accountNumber;
        this.amount = initialAmount;
    }

    /**
     * Charges account.
     * Validates amount before charging.
     *
     * @param amount positive number
     * @throws IllegalArgumentException if validation result has errors
     */
    public void charge(Amount amount) throws IllegalArgumentException {
        executeTransaction(amount);
    }

    /**
     * Withdraws account.
     * Validates amount before charging.
     *
     * @param amount positive number
     * @throws IllegalArgumentException if validation result has errors
     */
    public void withdraw(Amount amount) throws IllegalArgumentException {
        executeTransaction(amount);
    }

    private void executeTransaction(Amount amount) {
        try {
            this.amount = new Amount(this.amount.value() - amount.value());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "CreditCard{" +
            "accountNumber=" + accountNumber.value() +
            ", amount=" + amount.value() +
            '}';
    }
}
