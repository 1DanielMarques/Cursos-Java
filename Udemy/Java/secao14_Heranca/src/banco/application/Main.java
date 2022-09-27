package banco.application;

import banco.entities.Account;
import banco.entities.BusinessAccount;
import banco.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001,"Alex",1000.0);
        BusinessAccount bcc = new BusinessAccount(1002,"Maria",0.0,500.0);

        //UPCASTING
        Account acc1 = bcc;
        Account acc2 = new BusinessAccount(1003,"Bob",1000.0,500.0);
        Account acc3 = new SavingsAccount(1004,"Anna",1000.0,0.01);

        //DOWNCASTING
        //BusinessAccount acc4 = acc2; Da erro
        /* BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0); */

        /* BusinessAccount acc5 = (BusinessAccount) acc3;
         Da erro pq acc3 nao eh business account e sim SavingsAccount */

        /* if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("loan");
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("update");
        } */
        //------------------------------------------//
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());

        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());

        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());




    }
}
