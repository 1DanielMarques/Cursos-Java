package exVetores.ex07.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double vet[] = new double[n];
        double soma = 0;
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
            soma += vet[i];
        }
        double media = soma / n;
        System.out.printf("MEDIA DO VETOR = %.3f%n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < media) {
                System.out.println(vet[i]);
            }
        }

        sc.close();

    }
}
