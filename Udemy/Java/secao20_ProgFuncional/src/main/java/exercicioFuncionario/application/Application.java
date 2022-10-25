package exercicioFuncionario.application;

import exercicioFuncionario.model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {

        final String PATH = "C:\\Users\\nohax\\OneDrive\\Área de Trabalho\\Software\\REPOSITORIOS\\CursosJava\\Udemy\\Java\\secao20_ProgFuncional\\src\\main\\java\\exercicioFuncionario\\summary.txt";
        List<Employee> employeeList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(PATH))) {
            Scanner sc = new Scanner(System.in);
            String line = br.readLine();
            while (line != null) {
                String[] data = line.split(",");
                employeeList.add(new Employee(data[0], data[1], Double.parseDouble(data[2])));
                line = br.readLine();
            }
            System.out.print("Enter salary: $");
            double salary = sc.nextDouble();
            List emails = employeeList.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(e -> e.getEmail())
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println(Arrays.toString(emails.toArray()));
            double aux = 0;
            double sum = employeeList.stream()
                    .filter(e -> e.getName().charAt(0) == 'M')
                    .map(e -> e.getSalary())
                    .reduce(0.0, (x, y) -> x + y);
            System.out.println("Sum of salary of people whose name starts with 'M': $"+String.format("%.2f",sum));
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
