package exVetores.ex02.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros: ");
        int n = sc.nextInt();
        double vet[] = new double[n];
        double soma = 0.0, media = 0.0;
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
            soma += vet[i];
        }
        media = soma/n;
        System.out.print("VALORES = ");
        for(int i=0;i<vet.length;i++){
            System.out.print(vet[i]+" ");
        }
        System.out.println("\nSOMA = "+soma);
        System.out.println("MEDIA = "+media);


        sc.close();

    }
}
