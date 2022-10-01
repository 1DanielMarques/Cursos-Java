package contaBancaria.application;

import contaBancaria.model.entities.Account;
import contaBancaria.model.exceptions.InvalidValueException;

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
        Account account = new Account(number, holder, initBalance, limit);

        System.out.print("Enter amount for withdraw: R$");
        double amount = sc.nextDouble();
        try {
            account.withdraw(amount);
        }catch (InvalidValueException e){

        }

        sc.close();
    }
}
