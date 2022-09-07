package circunferenciaEstaticos.comClasse.application;

import circunferenciaEstaticos.comClasse.util.Calculador;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculador calc = new Calculador();

        System.out.println("Digite o raio");
        double raio = sc.nextDouble();
        double c = calc.circunferencia(raio);
        double v = calc.volume(raio);
        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor PI: %.2f%n", calc.PI);

        sc.close();
    }


}
