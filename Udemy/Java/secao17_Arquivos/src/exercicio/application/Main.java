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
        String path = "C:\\Users\\nohax\\OneDrive\\Área de Trabalho\\Software\\REPOSITORIOS\\CursosJava\\Udemy\\Java\\secao17_Arquivos\\exercicioProp\\";

        try (BufferedReader br = new BufferedReader(new FileReader(path + "in.txt")); BufferedWriter bw = new BufferedWriter(new FileWriter(path + "out\\summary.txt"))) {
            String line = br.readLine();
            while (line != null) {
                dados = line.split(",");
                Produto p = new Produto(dados[0], Double.parseDouble(dados[1]), Integer.parseInt(dados[2]));
                produtos.add(p);
                line = br.readLine();
            }
            for (Produto p : produtos) {
                bw.write(p.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}