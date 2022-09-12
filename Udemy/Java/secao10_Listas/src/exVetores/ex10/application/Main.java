package exVetores.ex10.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        String vetNome[] = new String[n];
        int vetIdade[] = new int[n];
        int maiorIdade = 0, indiceMaior = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            vetNome[i] = sc.nextLine();
            System.out.print("Idade: ");
            vetIdade[i] = sc.nextInt();
            if (i == 0) {
                maiorIdade = vetIdade[0];
            }
            if (vetIdade[i] > maiorIdade) {
                maiorIdade = vetIdade[i];
                indiceMaior = i;
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + vetNome[indiceMaior]);


        sc.close();
    }
}
