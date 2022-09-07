package conversorMoeda.application;

import circunferenciaEstaticos.comClasse.util.Calculador;
import conversorMoeda.util.Conversor;

import java.net.ConnectException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Preço dolar: ");
        Conversor.dolar = sc.nextDouble();
        System.out.print("Quantos dólares comprará: ");
        Conversor.qtd = sc.nextDouble();
        System.out.println("Valor a pagar: R$" + Conversor.conversor());

        sc.close();


    }
}
