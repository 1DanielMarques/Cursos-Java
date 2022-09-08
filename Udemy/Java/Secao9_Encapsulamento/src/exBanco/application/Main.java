package exBanco.application;

import exBanco.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valor = 0;
        System.out.print("[Número conta] - ");
        int numero = sc.nextInt();
        System.out.print("[Titular] - ");
        sc.nextLine();
        String nome = sc.nextLine();
        Conta conta = new Conta(numero, nome);
        System.out.print("Deseja fazer o depósito inicial? S/N ");
        String opcao = sc.next();
        opcao = opcao.toLowerCase();
        if (opcao.equals("s")) {
            System.out.print("[Valor] - R$");
            valor = sc.nextDouble();
            conta.deposita(valor);
        }
        System.out.println(conta.toString());
        System.out.print("[Depósito] - ");
        valor = sc.nextDouble();
        conta.deposita(valor);
        System.out.println("[ATUALIZADO]");
        System.out.println(conta.toString());
        System.out.print("[Saque] - ");
        valor = sc.nextDouble();
        conta.saca(valor);
        System.out.println("[ATUALIZADO]");
        System.out.println(conta.toString());


        sc.close();

    }
}
