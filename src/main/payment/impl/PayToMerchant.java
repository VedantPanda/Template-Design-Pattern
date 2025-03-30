package main.payment.impl;

import main.payment.PaymentFlow;

public class PayToMerchant extends PaymentFlow {
    @Override
    protected void validateRequest() {
        System.out.println("Validating logic of pay to friend");
    }

    @Override
    protected void debitAmount() {
        System.out.println("Debit the amount logic of pay to merchant");
    }

    @Override
    protected void calculateFee() {
        System.out.println("2% fees charged");
    }

    @Override
    protected void creditAmount() {
        System.out.println("Credit the remaining amount");
    }
}
