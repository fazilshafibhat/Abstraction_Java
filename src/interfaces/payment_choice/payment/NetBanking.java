package interfaces.payment_choice.payment;

public class NetBanking implements Payable {
    public void pay() {
        System.out.println("Paid successfully using NetBanking");
    }

}
