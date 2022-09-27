package banco.application;

import banco.entities.Account;
import banco.entities.BusinessAccount;
import banco.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001,"Alex",0.0);
        BusinessAccount bcc = new BusinessAccount(1002,"Maria",0.0,500.0);

        //UPCASTING
        Account acc1 = bcc;
        Account acc2 = new BusinessAccount(1003,"Bob",0.0,200.0);
        Account acc3 = new SavingsAccount(1004,"Anna",0.0,0.01);




    }
}
