package contaBancaria.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: R$");
        double initBalance = sc.nextDouble();
        System.out.print("Withdraw limit: R$");
        double limit = sc.nextDouble();

        System.out.print("Enter amount for withdraw: R$");
        double amount = sc.nextDouble();



        sc.close();
    }
}
