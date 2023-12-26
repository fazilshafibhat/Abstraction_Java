package interfaces.payment_choice;

import java.util.Scanner;

import interfaces.payment_choice.payment.Payment;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pay for checkout");
        System.out.println("Choose your option:");
        System.out.println("1)Pay using Debit Card");
        System.out.println("2)Pay using Net Banking");
        System.out.println("3)Pay using UPI");
        System.out.println("4)Pay using Paytm Wallet");
        Integer paymentType = sc.nextInt();
        Payment payment = new Payment();
        payment.pay(paymentType);
        sc.close();

    }

}
