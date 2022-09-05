package produto.application;

import produto.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String opcao = "";
        Produto produto = new Produto();
        do {
            System.out.println("Dados do produto:");
            System.out.print("Nome: ");
            produto.nome = sc.nextLine();
            System.out.print("Preço: ");
            produto.preco = sc.nextDouble();
            System.out.print("Quantidade: ");
            produto.quantidade = sc.nextInt();
            System.out.println(produto.nome + ", " + String.format("%.2f", produto.preco) + ", " + produto.quantidade);
            System.out.println("Deseja alterar algum dado? S/N");
            opcao = sc.next();
            sc.nextLine();
            opcao = opcao.toLowerCase();
        } while (!opcao.equals("n"));




        sc.close();
    }
}
