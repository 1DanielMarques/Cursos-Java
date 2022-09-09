package exemploVetorObjeto.application;

import exemploVetorObjeto.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Produto vet[] = new Produto[n];

        for (int i = 0; i < vet.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vet[i] = new Produto(nome, preco);
        }
        double soma = 0;
        for (int i = 0; i < vet.length; i++) {
            soma += vet[i].getPreco();
        }
        double media = soma / n;
        System.out.printf("Média preco: %.2f%n",media);

        sc.close();
    }
}
