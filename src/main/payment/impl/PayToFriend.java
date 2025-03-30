package main.payment.impl;

import main.payment.PaymentFlow;

public class PayToFriend extends PaymentFlow {
    @Override
    protected void validateRequest() {
        System.out.println("Validating logic of pay to friend");
    }

    @Override
    protected void debitAmount() {
        System.out.println("Debit the amount logic of pay to friend");
    }

    @Override
    protected void calculateFee() {
        System.out.println("0% fees charged");
    }

    @Override
    protected void creditAmount() {
        System.out.println("Credit the full amount");
    }
}
