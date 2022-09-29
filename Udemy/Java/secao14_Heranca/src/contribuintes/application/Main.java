package contribuintes.application;

import contribuintes.entities.Pessoa;
import contribuintes.entities.PessoaFisica;
import contribuintes.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();
        System.out.print("Quantos contribuintes? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Dados contribuinte #" + i + ": ");
            System.out.print("Pessoa Fisica ou Juridica (f/j)? ");
            char tipo = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Renda anual: R$");
            double rendaAnual = sc.nextDouble();
            if (tipo == 'f') {
                System.out.print("Gastos com saúde: R$");
                double gastosSaude = sc.nextDouble();
                list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            } else {
                System.out.print("Quantidade funcionários: ");
                int funcionarios = sc.nextInt();
                list.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
            }

        }
        System.out.println();
        double total = 0;
        System.out.println("Taxas pagas: ");
        for (Pessoa p : list) {
            System.out.println(p.getNome() + ": " + " R$" + String.format("%.2f", p.imposto()));
            total += p.imposto();
        }
        System.out.print("\nTotal Impostos: R$" + String.format("%.2f",total));

        sc.close();
    }
}
