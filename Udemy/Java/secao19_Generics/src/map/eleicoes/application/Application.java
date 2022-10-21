package map.eleicoes.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {

        final String PATH = "C:\\Users\\nohax\\OneDrive\\Área de Trabalho\\Software\\REPOSITORIOS\\CursosJava\\Udemy\\Java\\secao19_Generics\\src\\map\\eleicoes\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(PATH))) {
            Map<String, Integer> votos = new LinkedHashMap<>();

            String line = br.readLine();
            while (line != null) {
                String[] dados = line.split(",");
                String name = dados[0];
                int votoAtual = Integer.parseInt(dados[1]);

                if (votos.containsKey(name)) {
                    int votoAnterior = votos.get(name);
                    votos.put(name, votoAtual + votoAnterior);
                } else {
                    votos.put(name, votoAtual);
                }
                line = br.readLine();
            }
            for (String key : votos.keySet()) {
                System.out.println(key + ": " + votos.get(key));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
