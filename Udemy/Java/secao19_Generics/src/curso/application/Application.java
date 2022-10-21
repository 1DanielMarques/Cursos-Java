package curso.application;

import java.util.Scanner;

public class Application {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("How many students for course A? ");
        int quantity = sc.nextInt();
        students(quantity);

        System.out.print("How many students for course B? ");
        quantity = sc.nextInt();
        students(quantity);

        System.out.print("How many students for course B? ");
        quantity = sc.nextInt();
        students(quantity);


        System.out.println("Total students: ");
        sc.close();
    }

    public static void students(int quantity) {
        for (int i = 1; i <= quantity; i++) {
            int studentId = sc.nextInt();

        }
    }


}
