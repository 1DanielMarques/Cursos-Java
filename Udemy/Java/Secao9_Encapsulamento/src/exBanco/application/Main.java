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
        System.out.print("Deseja fazer o depósito inicial? (s/n) ");
        char opcao = sc.next().charAt(0);
        if (opcao == 's') {
            System.out.print("[Valor] - R$");
            valor = sc.nextDouble();
            conta.deposita(valor);
        }
        System.out.println(conta);
        System.out.print("[Depósito] - ");
        valor = sc.nextDouble();
        conta.deposita(valor);
        System.out.println("[ATUALIZADO]");
        System.out.println(conta);
        System.out.print("[Saque] - ");
        valor = sc.nextDouble();
        conta.saca(valor);
        System.out.println("[ATUALIZADO]");
        System.out.println(conta);


        sc.close();

    }
}
