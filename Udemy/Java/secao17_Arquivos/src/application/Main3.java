package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main3 {
    // Try-with-resources
    public static void main(String[] args) {
        String path = "C:\\Users\\nohax\\OneDrive\\Área de Trabalho\\Software\\REPOSITORIOS\\CursosJava\\Udemy\\Java\\secao17_Arquivos\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            // br = new BufferedReader(new FileReader(path));
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
