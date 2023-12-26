package interfaces.payment_choice.payment;

public class DebitCard implements Payable {
    public void pay() {
        System.out.println("Paid successfully using DebitCard");
    }

}
