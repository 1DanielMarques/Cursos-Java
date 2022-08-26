package estrutura_sequencial1;

public class ex04 extends AuxScanner{
    public static void main(String[] args) {
        int numero, horas;
        double valorHora, salario;
        System.out.print("Numero: ");
        numero = sc.nextInt();
        System.out.print("Horas: ");
        horas = sc.nextInt();
        System.out.print("Valor p/ hora: ");
        valorHora = sc.nextDouble();
        salario = horas * valorHora;
        System.out.println("Number: " + numero);
        System.out.println("Salary: " + salario);


    }
}
