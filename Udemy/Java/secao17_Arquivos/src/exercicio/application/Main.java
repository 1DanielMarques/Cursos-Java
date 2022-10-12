package exercicio.application;

import exercicio.entities.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] dados;
        List<Produto> produtos = new ArrayList<>();
        String pathIn = "C:\\Users\\nohax\\OneDrive\\Área de Trabalho\\Software\\REPOSITORIOS\\CursosJava\\Udemy\\Java\\secao17_Arquivos\\exercicioProp\\in.txt";
        String pathOut = "C:\\Users\\nohax\\OneDrive\\Área de Trabalho\\Software\\REPOSITORIOS\\CursosJava\\Udemy\\Java\\secao17_Arquivos\\exercicioProp\\out.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(pathIn))) {
            String line = br.readLine();
            while (line != null) {
                dados = line.split(",");
                Produto p = new Produto(dados[0], Double.parseDouble(dados[1]), Integer.parseInt(dados[2]));
                produtos.add(p);
                line = br.readLine();
            }
            for (Produto p : produtos) {
                System.out.println(p);
            }
            //File file = new File(pathOut);
            ;
            //if (file.exists()) {
            BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut, true));
            System.out.println("existe");
        /*    } else {
                bw = new BufferedWriter(new FileWriter(pathOut));
                System.out.println("NAO existe");
            }*/
            for (Produto p : produtos) {
                bw.write(p.getNome() + "," + p.total());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
