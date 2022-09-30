package primeiroContato.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method1();


    }
    public static void method1(){
        System.out.println("**METHOD 1 START**");
        method2();
        System.out.println("**METHOD 1 END**");
    }

    public static void method2() {
        System.out.println("**METHOD 2 START**");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
        }
        sc.close();
        System.out.println("**METHOD 2 END**");
    }
}
