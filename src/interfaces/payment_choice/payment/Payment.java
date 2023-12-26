package interfaces.payment_choice.payment;

public class Payment {
    public void pay(int paymentType) {
        Payable payment = PaymentCreator.getPaymentProvider(paymentType);
        payment.pay();
    }
}
