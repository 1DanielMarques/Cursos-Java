package exVetores.ex01.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        boolean verifica = true;
        int n = 0;
        do {
            System.out.print("Quantos numeros? ");
            n = sc.nextInt();
            if (n <= 10) {
                verifica = false;
            } else {
                System.out.println("Máximo 10, digite novamente");
            }
        } while (verifica);
        int vet[] = new int[n];
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS:");
        for(int i=0;i<vet.length;i++){
            if(vet[i]<0){
                System.out.println(vet[i]);
            }
        }

        sc.close();
    }
}
