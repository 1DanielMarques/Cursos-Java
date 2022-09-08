package exBanco.entities;

public class Conta {
    private int numero;
    private String nome;
    private double saldo;

    public Conta() {

    }

    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        this.saldo -= valor + 5;
    }

    @Override
    public String toString() {
        return "[Numero] - " + this.numero + " | [Titular] - " + this.nome + " | [Saldo] - R$" + String.format("%.2f", this.saldo);
    }

}
