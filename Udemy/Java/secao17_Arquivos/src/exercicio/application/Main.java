package exercicio.application;

import exercicio.entities.Produto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] dados = null;
        List<Produto> produtos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\nohax\\OneDrive\\Área de Trabalho\\Software\\REPOSITORIOS\\CursosJava\\Udemy\\Java\\secao17_Arquivos\\exercicioProp\\in.txt"))) {
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
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
