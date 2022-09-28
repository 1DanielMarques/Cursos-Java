package product.application;

import product.entities.ImportedProduct;
import product.entities.Product;
import product.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> products = new ArrayList<>();
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            switch (type) {
                case 'c':
                    products.add(new Product(name, price));
                    break;
                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    String manufactureDate = sc.next();
                    products.add(new UsedProduct(name, price, sdf.parse(manufactureDate)));
                    break;
                case 'i':
                    System.out.print("Customs fee: ");
                    double customsFee = sc.nextDouble();
                    products.add(new ImportedProduct(name, price, customsFee));
                    break;
            }
        }
        System.out.println("\nPRICE TAGS:");
        for(Product p : products){
            System.out.println(p.priceTag());
        }
        sc.close();
    }
}
