package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main4 {
    public static void main(String[] args) {

        String[] lines = new String[]{"Goord morning", "Good afternoon", "Good night"};

        String path = "C:\\Users\\nohax\\OneDrive\\Área de Trabalho\\Software\\REPOSITORIOS\\CursosJava\\Udemy\\Java\\secao17_Arquivos\\exercicioProp\\out\\summary.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
            //FileWriter(path) -> cria/recria o arquivo
            //FileWriter(path,true) -> acrescenta no arquivo existente
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
