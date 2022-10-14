package contrato.application;

import contrato.model.entities.Contract;
import contrato.model.entities.Installment;
import contrato.model.services.ContractService;
import contrato.model.services.DataFile;
import contrato.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            System.out.println("Entre os dados do contrato:");
            System.out.print("Numero: ");
            int number = sc.nextInt();
            System.out.print("Data (dd/MM/yyyy): ");
            LocalDate date = LocalDate.parse(sc.next(), fmt);
            System.out.print("Valor do contrato: R$");
            double totalValue = sc.nextDouble();
            Contract contract = new Contract(number, date, totalValue);
            System.out.print("Entre com o numero de parcelas: ");
            int installment = sc.nextInt();

            ContractService cs = new ContractService(new PaypalService());
            cs.processContract(contract, installment);
            System.out.println("Parcelas: ");
            for (Installment i : contract.getInstallmentList()) {
                System.out.println(i);
            }
            DataFile.createFile(contract, contract.getInstallmentList());
        } catch (InputMismatchException e) {
            System.out.println("Entrada de dados incorreta");
        }

        sc.close();
    }
}
