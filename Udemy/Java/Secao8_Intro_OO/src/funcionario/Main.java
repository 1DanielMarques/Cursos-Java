package funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double porcentagem;
        Funcionario f = new Funcionario();
        System.out.print("Nome: ");
        f.nome = sc.nextLine();
        System.out.print("Salário Bruto: ");
        f.salarioBruto = sc.nextDouble();
        System.out.print("Taxa: ");
        f.taxa = sc.nextDouble();
        System.out.println("Funcionário: " + f.nome + ", R$" + f.salarioLiquido());
        System.out.print("Porcentagem de aumento: ");
        porcentagem = sc.nextDouble();
        f.aumentaSalario(porcentagem);
        System.out.println("Dados atualizados: " + f.nome + ", R$" + f.liquido);


        sc.close();

    }
}
