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
                System.out.print("Linha " + (i + 1) + " Coluna " + (j + 1) + ": ");
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < mat.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.print("Informe um número da matriz: ");
        int numero = sc.nextInt();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == numero) {
                    System.out.println("Posicao: " + i + "," + j);
                    if (j != 0) {
                        System.out.println("Esquerda: " + mat[i][j - 1]);
                    }
                    if (j != mat[i].length - 1) {
                        System.out.println("Direita: " + mat[i][j + 1]);
                    }
                    if (i != 0) {
                        System.out.println("Cima: " + mat[i - 1][j]);
                    }
                    if (i != mat.length - 1) {
                        System.out.println("Baixo: " + mat[i + 1][j]);
                    }
                    System.out.println("---------------------------");
                }

            }
        }


        sc.close();
    }
}
