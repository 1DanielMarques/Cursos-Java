package contribuintes.entities;

public class PessoaJuridica extends Pessoa {
    private Double gastosSaude;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

}
