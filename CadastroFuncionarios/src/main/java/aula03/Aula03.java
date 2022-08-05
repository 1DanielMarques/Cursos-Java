package aula03;

import java.util.ArrayList;

/**
 * @author mDanielSE
 */
public class Aula03 {

    public static void main(String[] args) {
        /*
        // ponteiros
        int valor = 5;
        int valores[] = new int[10];
        valores[0] = 10;
        valores[1] = 20;

        double valor_d = 10.5;

        boolean maiorIdade = true;

        String nome = "Daniel";
        String nome2 = "Pedro";
        // char nomec[] = new char[20];

        if (nome.equals(nome2)) {
            System.out.println("É igual");
        } else {
            System.out.println("Não igual");
        }

        ArrayList<String> lista = new ArrayList();
        lista.add("daniel");
        lista.add("pedro");
        lista.add("joao");
        for(int i = 0; i < lista.size(); i++){
        
        }
        for (String lista1 : lista) {
            System.out.println(lista1);
        }
         */

        ArrayList<Aluno> listaAlunos = new ArrayList();

        Aluno a1 = new Aluno();
        a1.setNome("daniel");;
        a1.setMatricula("111");
        a1.setTelefone("111123123");
        listaAlunos.add(a1);

        Aluno a2 = new Aluno();
        a2.setNome("pedro");;
        a2.setMatricula("222");
        a2.setTelefone("4234234");
        listaAlunos.add(a2);

        Aluno a3 = new Aluno("Joao", "333", "012394");
        listaAlunos.add(a3);

        listaAlunos.add(new Aluno("Maria", "444", "88888"));

        for (int i = 0; i < listaAlunos.size(); i++) {
            Aluno temp = listaAlunos.get(i);
            System.out.println(temp.getDados());
            //System.out.println(listaAlunos.get(i).getDados());
        }

    }

}
