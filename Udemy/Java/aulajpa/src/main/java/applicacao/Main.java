package applicacao;


import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Daniel Marques", "daniel@gmail.com");
        Pessoa p2 = new Pessoa("Karol Uemura", "karol@gmail.com");
        Pessoa p3 = new Pessoa("Carlos Alberto", "carlos@gmail.com");

        EntityManagerFactory eef = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = eef.createEntityManager();

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        System.out.printf("Pronto!");


    }
}
