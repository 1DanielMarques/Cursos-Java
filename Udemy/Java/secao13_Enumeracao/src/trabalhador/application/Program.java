package trabalhador.application;

import trabalhador.entities.Department;
import trabalhador.entities.HourContract;
import trabalhador.entities.Worker;
import trabalhador.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Nome do Departamento: ");
        String departamento = sc.nextLine();
        System.out.println("[Dados Trabalhador]");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Nível: ");
        String nivel = sc.nextLine();
        System.out.print("Salário base: ");
        double salarioBase = sc.nextDouble();
        Worker worker = new Worker(nome, WorkerLevel.valueOf(nivel), salarioBase, new Department(departamento));
        System.out.print("Quantos contratos? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Dados contrato " + i + ": ");
            System.out.print("data (DD/MM/YYYY): ");
            LocalDate dataContrato = LocalDate.parse(sc.next(), fmt);
            System.out.print("Valor p/ Hora: ");
            double valorHora = sc.nextDouble();
            System.out.print("Duração contrato: ");
            int horas = sc.nextInt();
            HourContract contract = new HourContract(dataContrato, valorHora, horas);
            worker.addContract(contract);
        }
        System.out.println();
        System.out.print("Digite Mes e Ano p/ calcular salario (MM/YYYY): ");
        String mesEAno = sc.next();
        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));
        System.out.println("[NOME] > " + worker.getName());
        System.out.println("[DEPARTAMENTO] > " + worker.getDepartment().getName());
        System.out.println("[SALÁRIO] em " + mesEAno + ": R$" + String.format("%.2f", worker.income(ano, mes)));


        sc.close();
    }
}
