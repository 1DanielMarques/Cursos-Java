package projeto;

/**
 *
 * @author mDanielSE
 */
public class Vendedor extends Funcionario {

    private int quantVendas;
    private double comissao;

    public Vendedor(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
    }

    @Override
    public double getSalario() {
        return this.salario + (this.quantVendas * this.comissao);
    }

    public int getQuantVendas() {
        return quantVendas;
    }

    public void setQuantVendas(int quantVendas) {
        this.quantVendas = quantVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

}
