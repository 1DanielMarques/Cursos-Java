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

    public Conta(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
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
        return "[Titular] " + this.nome + " [Numero] " + this.numero + " [Saldo] " + this.saldo;
    }

}
