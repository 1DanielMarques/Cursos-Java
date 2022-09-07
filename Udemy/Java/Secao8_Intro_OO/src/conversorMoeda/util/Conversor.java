package conversorMoeda.util;

public class Conversor {
    public static double dolar;
    public static double qtd;
    public static final double taxa = 0.06;

    public static double conversor() {
        return (dolar * qtd) + (dolar * qtd * taxa);
    }


}
