package funcionario;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double taxa;
    double liquido;

    public Funcionario() {

    }

    public double salarioLiquido() {
        liquido = this.salarioBruto - this.taxa;
        return liquido;
    }

    public void aumentaSalario(double porcentagem) {
        liquido += (this.salarioBruto * (porcentagem / 100));
    }


}
