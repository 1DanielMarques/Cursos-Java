package projeto;

/**
 *
 * @author mDanielSE
 */
public class Funcionario {

    private String nome;
    private String cpf;
    private String telefone;
    protected double salario;

    public Funcionario(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getDados() {
        return "Nome: " + this.getNome()
                + "\n Telefone: " + this.getTelefone()
                + "\n Salario: " + String.format("%.2f", this.getSalario()) ;

    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
