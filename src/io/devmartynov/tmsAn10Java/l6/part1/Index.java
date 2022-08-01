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
        CreditCard card1 = new CreditCard(1111111111111111L, 13.3);
        CreditCard card2 = new CreditCard(2222222222222222L, 100000.1);
        CreditCard card3 = new CreditCard(3333333333333333L, 14);

        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();

        card1.charge(7);
        card2.charge(20000);
        card3.withdraw(10);

        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();

        // validation errors
//        card1.charge(-7);
//        card1.withdraw(20000);
    }
}
