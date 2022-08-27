package estrutura_condicional;

public class ex01 extends AuxScanner{
    public static void main(String[] args) {
        int numero;
        numero = sc.nextInt();
        if(numero < 0)
            System.out.println("negativo");
        else
            System.out.println("Positivo");

    }
}
