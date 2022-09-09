package exVetores.ex04.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int contador=0;
        System.out.print("Quantos numeros? ");
        int n = sc.nextInt();
        int vet[] = new int[n];
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }
        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < vet.length; i++) {
            if(vet[i]%2==0){
                System.out.print(vet[i] + " ");
                contador++;
            }
        }
        System.out.println("\nQUANTIDADE DE PARES = "+contador);

        sc.close();

    }
}
