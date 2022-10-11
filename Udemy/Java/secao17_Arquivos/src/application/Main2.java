package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        String path = "C:\\Users\\nohax\\OneDrive\\Área de Trabalho\\Software\\REPOSITORIOS\\CursosJava\\Udemy\\Java\\secao17_Arquivos\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // br = new BufferedReader(new FileReader(path));
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
