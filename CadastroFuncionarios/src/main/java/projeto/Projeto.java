package projeto;

import java.util.ArrayList;

/**
 * @author mDanielSE
 */
public class Projeto {

    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("Daniel", "111", "123");
        v1.setComissao(10.00);
        v1.setQuantVendas(10);
        v1.setSalario(800);

       // System.out.println(v1.getDados());

        Motorista m1 = new Motorista("Pedro", "222", "456");
        m1.setSalario(800);
       // System.out.println(m1.getDados());

        // Funcionario f1 = m1;
        ArrayList<Funcionario> funcs = new ArrayList();
        funcs.add(v1);
        funcs.add(m1);

        for (int i = 0; i < funcs.size(); i++) {
            System.out.println(funcs.get(i).getDados());
        }

    }

}
