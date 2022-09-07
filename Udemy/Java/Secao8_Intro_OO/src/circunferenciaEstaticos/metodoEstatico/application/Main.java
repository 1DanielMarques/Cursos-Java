package circunferenciaEstaticos.metodoEstatico.application;

import circunferenciaEstaticos.metodoEstatico.util.Calculador;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio");
        double raio = sc.nextDouble();
        double c = Calculador.circunferencia(raio);
        double v = Calculador.volume(raio);
        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor PI: %.2f%n", Calculador.PI);

        sc.close();
    }
}
