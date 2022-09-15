package Matrizes.posicaoNumeros.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Linhas: ");
        int m = sc.nextInt();
        System.out.print("Colunas: ");
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        System.out.println();
        System.out.println("Insira valores inteiros");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Linha "+(i+1)+" Coluna "+(j+1)+": ");
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < mat.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+" | ");
            }
            System.out.println();
        }
        System.out.print("Informe um número da matriz: ");
        int numero = sc.nextInt();


        sc.close();
    }
}
