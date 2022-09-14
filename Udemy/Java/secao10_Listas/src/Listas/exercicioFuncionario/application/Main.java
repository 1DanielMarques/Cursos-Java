package Listas.exercicioFuncionario.application;

import Listas.exercicioFuncionario.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos funcionarios? ");
        int n = sc.nextInt();
        List<Funcionario> funcionariosList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Funcionario #" + (i + 1) + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            while (idExistente(funcionariosList, id)) {
                System.out.print("ID Existente, tente novamente: ");
                id = sc.nextInt();
            }
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            funcionariosList.add(new Funcionario(id, nome, salario));
        }
        System.out.print("ID do funcionario que deseja aumentar salario: ");
        int id = sc.nextInt();
        Funcionario func = funcionariosList.stream().filter(f -> f.getId() == id).findFirst().orElse(null);
        if (func == null) {
            System.out.println("Funcionario inexistente");
        } else {
            System.out.print("Porcentagem: ");
            double porcentagem = sc.nextDouble();
            func.aumentaSalario(porcentagem);
        }
        System.out.println();
        System.out.println("Lista de Funcionarios:");
        for (Funcionario f : funcionariosList) {
            System.out.println(f.toString());
        }
        sc.close();
    }
    public static boolean idExistente(List<Funcionario> lista, int id) {
        Funcionario func = lista.stream().filter(idAux -> idAux.getId() == id).findFirst().orElse(null);
        return func != null;
    }
}
