package consumer.application;

import consumer.entities.Product;
import consumer.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Application {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        /* Expressao lambda inline
            double factor = 1.1;
            list.forEach(p -> p.setPrice(p.getPrice()*factor));
         */

        /* Expressao lambda declarada
            double factor = 1.1;
            Consumer<Product> cons = p -> {
                p.setPrice(p.getPrice() * factor);
            };
                            OU
            Consumer<Product> cons = p -> p.setPrice(p.getPrice()*factor);

            list.forEach(cons);
         */

        /* Reference method com metodo nao estatico
            list.forEach(Product::nonStaticPriceUpdate);
         */

        /* Reference method com metodo estatico
            list.forEach(Product::staticPriceUpdate);
         */

        /* Implementacao da interface
            list.forEach(new PriceUpdate());
         */
        list.forEach(System.out::println);

    }
}
