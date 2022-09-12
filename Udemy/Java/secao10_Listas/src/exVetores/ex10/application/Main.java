package exVetores.ex10.application;

import exVetores.ex10.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome;
        double n1, n2;
        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        Aluno vet[] = new Aluno[n];
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
            sc.nextLine();
            nome = sc.nextLine();
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            vet[i] = new Aluno(nome,n1,n2);
        }
        System.out.println("Alunos aprovados:");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].media()) {
                System.out.println(vet[i].getNome());
            }

        }


        sc.close();

    }
}

