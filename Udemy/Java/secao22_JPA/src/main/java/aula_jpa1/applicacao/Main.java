package aula_jpa1.applicacao;

import aula_jpa1.dominio.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Daniel Marques", "daniel@gmail.com");
        Pessoa p2 = new Pessoa(2, "Karol Uemura", "karol@gmail.com");
        Pessoa p3 = new Pessoa(3, "Carlos Alberto", "carlos@gmail.com");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


    }
}
