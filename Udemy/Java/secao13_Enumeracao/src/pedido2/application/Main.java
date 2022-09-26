package pedido2.application;

import pedido2.entities.Client;
import pedido2.entities.Order;
import pedido2.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("birth date (DD/MM/YYYY): ");
        String birthDate = sc.next();
        System.out.println("Enter oder data:");
        Order order = new Order();
        System.out.println("-Status-");
        System.out.println("1 - PENDING PAYMENT");
        System.out.println("2 - PROCESSING");
        System.out.println("3 - SHIPPED");
        System.out.println("4 - DELIVERED");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                order.setStatus(OrderStatus.PENDING_PAYMENT);
                break;
            case 2:
                order.setStatus(OrderStatus.PROCESSING);
                break;
            case 3:
                order.setStatus(OrderStatus.SHIPPED);
                break;
            case 4:
                order.setStatus(OrderStatus.DELIVERED);
                break;
        }
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
        Client client = new Client(name, email, sdf.parse(birthDate));

        System.out.println("ORDER SUMARY: ");


        sc.close();
    }
}
