package Listas.primeiroContato;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add("Maria");
        list.add("Alex");
        list.add("Pedro");
        list.add("Gustavo");
        mostraNomes();
        System.out.println("--INSERINDO NA POSICAO 2--");
        list.add(2, "Marco");
        mostraNomes();
        System.out.println("--ENCONTRANDO POSICAO ELEMENTO--");
        System.out.println("Index of Pedro: " + list.indexOf("Pedro"));
        System.out.println("Tamanho: " + list.size());
        System.out.println("--REMOVENDO PELA COMPARACAO DO VALOR--");
        list.remove("Pedro");
        mostraNomes();
        System.out.println("--REMOVENDO PELO INDEX--");
        list.remove(1);
        mostraNomes();
        System.out.println("--REMOVENDO PELO PREDICADO--");
        list.removeIf(nome -> nome.charAt(0) == 'M');
        mostraNomes();
        System.out.println("--LISTA NOMES--");
        list.add("Maria");
        list.add("Alex");
        list.add("Pedro");
        list.add(1, "Marco");
        mostraNomes();
        System.out.println("--FILTRAR LISTA--");
        List<String> resultado = list.stream().filter(nome -> nome.charAt(0) == 'M').collect(Collectors.toList());
        for (String nome : resultado) {
            System.out.println(nome);
        }
        System.out.println("--ENCONTRANDO PRIMEIRO ELEMENTO COM FILTRO--");
        String nome = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse("Não tem");
        System.out.println(nome);
    }

    public static void mostraNomes() {
        for (String nome : list) {
            System.out.println(nome);
        }
    }

}
