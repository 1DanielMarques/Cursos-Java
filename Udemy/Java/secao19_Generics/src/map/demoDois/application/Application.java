package map.demoDois.application;


import map.demoDois.model.entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {

        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Tv", 900.0);
        Product p3 = new Product("Tv", 900.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product ps = new Product("Tv", 900.0);

        System.out.println("Contais 'ps' key: " + stock.containsKey(ps));


    }
}
