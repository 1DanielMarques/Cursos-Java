package estrutura_condicional;

public class ex04 extends AuxScanner {
    public static void main(String[] args) {
        int inicial, hFinal, duracao=0;
        inicial = sc.nextInt();
        hFinal = sc.nextInt();

        if (hFinal < inicial) {
            duracao = 24 - inicial;
            duracao = duracao + hFinal;
        } else if (hFinal == inicial) {
            duracao = 24;
        } else {
            if(inicial < hFinal){
                duracao = hFinal-inicial;
                if(duracao < 1){
                    System.out.println("Hora miníma invalida");
                    duracao = 0;
                }
            }

        }
        System.out.println(duracao+" horas");

    }
}
