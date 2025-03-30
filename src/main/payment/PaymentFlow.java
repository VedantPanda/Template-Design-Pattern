package main.payment;

public abstract class PaymentFlow {

    public final void sendMoney(){
        validateRequest();
        debitAmount();
        calculateFee();
        creditAmount();
    }

    protected abstract void validateRequest();
    protected abstract void debitAmount();
    protected abstract void calculateFee();
    protected abstract void creditAmount();

}
