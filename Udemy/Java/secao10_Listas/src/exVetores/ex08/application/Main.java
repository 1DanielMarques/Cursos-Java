package exVetores.ex08.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int vet[] = new int[n];
        int soma = 0, contador = 0;
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
            if (vet[i] % 2 == 0) {
                soma += vet[i];
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            double media = soma / contador;
            System.out.printf("MEDIA DOS PARES = %.1f%n", media);
        }
        sc.close();
    }
}
