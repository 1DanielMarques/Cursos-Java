package exercicio.entities;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto() {

    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double total() {
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return nome + "," + total();
    }
}
