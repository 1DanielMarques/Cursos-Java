package pensionato.application;

import pensionato.entities.Aluguel;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluguel quartos[] = new Aluguel[10];
        String nome, email;
        int quarto;

        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Aluguel #" + (i + 1) + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            nome = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Quarto: ");
            quarto = sc.nextInt();
            quartos[quarto] = new Aluguel(nome, email, quarto);
            System.out.println();
        }
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(quartos[i]);
            }
        }

        sc.close();

    }
}
