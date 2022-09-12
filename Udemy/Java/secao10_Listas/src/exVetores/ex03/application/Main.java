package exVetores.ex03.application;

import exVetores.ex03.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        String nome;
        int idade, qtdIdade = 0;
        double altura, mediaAltura = 0.0;
        Pessoa vet[] = new Pessoa[n];
        double porcentagem = 0;
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            nome = sc.nextLine();
            System.out.print("Idade: ");
            idade = sc.nextInt();
            if (idade < 16) {
                qtdIdade++;
            }
            System.out.print("Altura: ");
            altura = sc.nextDouble();
            mediaAltura += altura;
            vet[i] = new Pessoa(nome, idade, altura);
        }
        porcentagem = (double) qtdIdade / n * 100;
        mediaAltura = mediaAltura / n;
        System.out.println("Altura média: " + String.format("%.2f", mediaAltura));
        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", porcentagem) + "%");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].getIdade() < 16) {
                System.out.println(vet[i].getNome());
            }
        }


        sc.close();
    }
}
