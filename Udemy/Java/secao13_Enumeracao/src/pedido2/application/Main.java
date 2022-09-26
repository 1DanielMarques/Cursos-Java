package pedido2.application;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        sc.nextLine();
        String email = sc.nextLine();
        System.out.print("birth date (DD/MM/YYYY): ");
        String birthDate = sc.next();
        System.out.println("Enter oder data:");
        System.out.print("-Status-");
        System.out.println("1 - PENDING PAYMENT");
        System.out.println("2 - PROCESSING");
        System.out.println("3 - SHIPPED");
        System.out.println("4 - DELIVERED");
        int opcao = sc.nextInt();
        System.out.print("How many items to this order? ");
        int quantityItems = sc.nextInt();
        for (int i = 1; i <= quantityItems; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

        }


        sc.close();
    }
}
