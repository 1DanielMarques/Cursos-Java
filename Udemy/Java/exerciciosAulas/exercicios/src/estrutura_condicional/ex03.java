package estrutura_condicional;

public class ex03 extends AuxScanner{
    public static void main(String[] args) {
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a%b==0 || b%a==0){
            System.out.println("Multiplos");
        }else{
            System.out.println("Nao multiplos");
        }

    }
}
