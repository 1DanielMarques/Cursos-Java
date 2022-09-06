package aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();
        System.out.print("Nome: ");
        a.nome = sc.nextLine();
        System.out.println("Notas 1 2 e 3:");
        a.n1 = sc.nextDouble();
        a.n2 = sc.nextDouble();
        a.n3 = sc.nextDouble();

        System.out.println("Nota final: " + a.notaFinal());
        if (a.notaFinal() > 60) {
            System.out.println("PASSOU");
        } else {
            System.out.println("REPROVOU");
            double pontosFaltantes = 60 - a.notaFinal();
            System.out.println("Pontos faltantes: " + pontosFaltantes+" pontos");

        }

        sc.close();

    }
}
