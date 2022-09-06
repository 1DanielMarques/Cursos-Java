package retangulo;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo ret = new Retangulo();
        System.out.print("Largura: ");
        ret.largura = sc.nextDouble();
        System.out.print("Altura: ");
        ret.altura = sc.nextDouble();
        System.out.println("Área: " + ret.area());
        System.out.println("Perímetro: " + ret.perimetro());
        System.out.println("Diagonal: " + ret.diagonal());

        sc.close();

    }
}
