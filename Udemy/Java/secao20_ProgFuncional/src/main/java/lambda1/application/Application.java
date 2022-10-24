package lambda1.application;

import lambda1.model.entities.Product;
import predicate.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.50));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

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

        list.removeIf(p -> p.getPrice() >= 100);


        list.forEach(p -> System.out.println(p));


    }
}
