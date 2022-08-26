package estrutura_sequencial1;

public class ex03 extends AuxScanner {
    public static void main(String[] args) {
        int a, b, c, d;
        System.out.println("Informe 4 numeros");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        a = a * b;
        b = c * d;
        System.out.println("Diferença: " + (a - b));


    }
}
