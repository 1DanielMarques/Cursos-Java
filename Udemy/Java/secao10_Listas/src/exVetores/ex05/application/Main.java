package exVetores.ex05.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros? ");
        int n = sc.nextInt();
        double vet[] = new double[n];
        double maior = 0;
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }
        maior = vet[0];
        int posicao=0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
                posicao = i;
            }
        }
        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSICAO = " + posicao);
        sc.close();

    }
}
