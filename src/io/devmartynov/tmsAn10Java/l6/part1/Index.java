package io.devmartynov.tmsAn10Java.l6.part1;

public class Index {
    public static void main(String[] args) {
        // Task #1
        // Create CreditCard class with two fields: account number, amount.
        // Create method charge.
        // Create method withdraw.
        // Create method for getting info about card
        // Create 3 instances of CreditCard with account number and initial amount.
        // Test: charge two first cards and withdraw third card.
        //
        CreditCard card1 = new CreditCard(new AccountNumber(1111111111111111L), new Amount(13.3));
        CreditCard card2 = new CreditCard(new AccountNumber(2222222222222222L), new Amount(100000.1));
        CreditCard card3 = new CreditCard(new AccountNumber(3333333333333333L), new Amount(14));

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);

        card1.charge(new Amount(7));
        card2.charge(new Amount(20000));
        card3.withdraw(new Amount(10));

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);

        // validation errors
//        card1.charge(new Amount(-7));
//        card1.withdraw(new Amount(20000));
    }
}
