package estrutura_sequencial1;

public class ex06 extends AuxScanner{
    public static void main(String[] args) {
        double a,b,c,resultado;
        System.out.println("Informe 3 valores");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        resultado = (a*c)/2;
        System.out.printf("Triângulo %.3f%n",resultado);
        resultado = 3.14159 * Math.pow(c,2);
        System.out.printf("Circulo %.3f%n",resultado);





    }
}
