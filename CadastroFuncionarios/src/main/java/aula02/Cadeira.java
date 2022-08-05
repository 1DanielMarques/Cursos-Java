package aula02;

/**
 * @author mDanielSE
 */
public class Cadeira {

    private double altura;
    private double alturaAssento;
    private String cor;
   
    public Cadeira(String cor, double altura, double alturaAssento){
        this.cor = cor;
        this.altura = altura;
        this.alturaAssento = alturaAssento;
    }

    void serrar() {
        System.out.println("Serrando a madeira...");
    }

    void lixar() {
        System.out.println("Lixando a madeira...");
    }

    void pintar() {
        System.out.println("Pintando a madeira...");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {

        this.cor = cor;
    }

}
