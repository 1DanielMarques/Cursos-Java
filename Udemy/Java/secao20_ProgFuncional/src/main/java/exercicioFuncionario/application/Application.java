package exercicioFuncionario.application;

import exercicioFuncionario.model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        final String PATH = "C:\\Users\\nohax\\OneDrive\\Área de Trabalho\\Software\\REPOSITORIOS\\CursosJava\\Udemy\\Java\\secao20_ProgFuncional\\src\\main\\java\\exercicioFuncionario\\summary.txt";
        List<Employee> employeeList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(PATH))) {
            String line = br.readLine();
            while (line != null) {
                String[] data = line.split(",");
                employeeList.add(new Employee(data[0], data[1], Double.parseDouble(data[2])));

                line = br.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
