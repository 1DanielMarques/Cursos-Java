package produto.entities;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEstoque() {
        return preco * quantidade;
    }

    public void adicionaProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return "[Nome] "+nome+" | [Preço] "+String.format("%.2f",preco)+" | [Quantidade] "+quantidade+" | [Total] "+String.format("%.2f",valorTotalEstoque());

    }

}
