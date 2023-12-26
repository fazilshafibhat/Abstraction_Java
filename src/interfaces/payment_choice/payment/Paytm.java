package interfaces.payment_choice.payment;

public class Paytm implements Payable {
    public void pay() {
        System.out.println("Paid successfully using PaytmWallet");
    }
}
