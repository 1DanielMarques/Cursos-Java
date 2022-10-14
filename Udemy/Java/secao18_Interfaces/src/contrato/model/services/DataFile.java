package contrato.model.services;

import contrato.model.entities.Contract;
import contrato.model.entities.Installment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DataFile {

    private static final String PATH = "C:\\Users\\nohax\\OneDrive\\Área de Trabalho\\Software\\REPOSITORIOS\\CursosJava\\Udemy\\Java\\secao18_Interfaces\\out.txt";

    public DataFile() {

    }


    public static void createFile(Contract contract, List<Installment> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PATH))) {
            bw.write(contract.toString());
            bw.newLine();
            for (Installment i : list) {
                bw.write(i.toString());
                bw.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
