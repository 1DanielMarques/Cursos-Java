package estrutura_sequencial1;

public class ex05 extends AuxScanner {
    public static void main(String[] args) {
        int p1, p2, q1, q2;
        double v1, v2,resultado;
        System.out.println("Peça 1");
        System.out.print("Código: ");
        p1 = sc.nextInt();
        System.out.print("Quantidade: ");
        q1 = sc.nextInt();
        System.out.print("Valor: ");
        v1 = sc.nextDouble();
        System.out.println("Peça 2");
        System.out.print("Código: ");
        p2 = sc.nextInt();
        System.out.print("Quantidade: ");
        q2 = sc.nextInt();
        System.out.print("Valor: ");
        v2 = sc.nextDouble();

        resultado = (q1*v1) + (q2*v2);
        System.out.printf("Pagar: R$ %.2f%n",resultado);

    }
}
