package exVetores.ex06.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores em cada vetor? ");
        int n = sc.nextInt();
        double A[] = new double[n];
        double B[] = new double[n];
        double C[] = new double[n];
        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < B.length; i++) {
            B[i] = sc.nextInt();
        }
        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
            System.out.println(C[i]);
        }


        sc.close();
    }
}
