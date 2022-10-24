package predicate.application;

import predicate.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("HD Case", 80.90));
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

                /* Expressao lambda inline
            double min = 100.0;
            list.removeIf(p -> p.getPrice() >= min);
         */

        /* Expressao lambda declarada
            double min = 100.0;
            Predicate<Product> pred = p -> p.getPrice() >= min;
            list.removeIf(pred);
         */

        /* Reference method com metodo nao estatico
            list.removeIf(Product::nonStaticProductPredicate);
         */


        /* Reference method com metodo estatico
            list.removeIf(Product::staticProductPredicate);
         */

        /* Implementacao da interface
            list.removeIf(new ProductPredicate());
        */

        System.out.println();

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
