package estrutura_sequencial1;

public class ex02 extends AuxScanner{
    public static void main(String[] args) {
        double raio, area;
        System.out.print("Raio: ");
        raio = sc.nextDouble();
        area = 3.14159 * Math.pow(raio,2);
        System.out.println("Entrada: " + raio);
        System.out.printf("Saída: %.4f%n", area);


    }
}
