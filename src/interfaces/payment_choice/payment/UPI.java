package interfaces.payment_choice.payment;

public class UPI implements Payable {
    public void pay() {
        System.out.println("Paid successfully using UPI");
    }
}
