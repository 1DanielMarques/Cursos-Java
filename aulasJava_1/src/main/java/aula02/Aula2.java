package aula02;

/**
 * @author mDanielSE
 */
public class Aula2 {

    public static void main(String[] args) {

        /* Cadeira c1 = new Cadeira("Marrom", 0.5, 1.20);
        c1.serrar();
        c1.lixar();
        c1.pintar();
        System.out.println(c1.getCor()); 
        c1.setCor("preto");
        System.out.println(c1.getCor()); */
        Aluno a1 = new Aluno("Daniel");
        a1.setTelefone("111111");
        a1.setMatricula("00001");
        Aluno a2 = new Aluno("Pedro");
        a2.setTelefone("222222");
        a2.setMatricula("00002");
        a1.imprimeDados();
        System.out.println("");
        a2.imprimeDados();
        
        System.out.println(a1.media(100, 60));
        System.out.println(Aluno.media(100, 100));

    }

}
