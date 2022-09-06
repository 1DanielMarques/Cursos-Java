package retangulo;

public class Retangulo {
    double altura, largura;

    public Retangulo(){

    }

    public double area() {
        return this.largura * this.altura;
    }

    public double perimetro() {
        return (this.largura * 2) + (this.altura * 2);
    }

    public double diagonal() {
        double diagonal = Math.sqrt(Math.pow(this.largura, 2) + Math.pow(this.altura, 2));
        return diagonal;
    }

}
