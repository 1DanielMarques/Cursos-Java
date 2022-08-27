package estrutura_condicional;

public class ex02 extends AuxScanner{
    public static void main(String[] args) {
        int numero;
        numero = sc.nextInt();
        if(numero % 2 ==0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }

    }
}
