package contrato.application;

import contrato.model.entities.Contract;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Valor do contrato: R$");
        double totalValue = sc.nextDouble();
        Contract contract = new Contract(number, date, totalValue);
        System.out.print("Entre com o numero de parcelas: ");
        int installment = sc.nextInt();



        System.out.println("Parcelas: ");



        sc.close();
    }
}
