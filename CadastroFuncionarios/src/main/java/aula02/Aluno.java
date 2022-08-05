package aula02;

/**
 *
 * @author mDanielSE
 */
public class Aluno {

    private String nome;
    private String telefone;
    private String matricula;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void imprimeDados() {
        System.out.println("A " + this.getNome());
        System.out.println("A " + this.getTelefone());
        System.out.println("A " + this.getMatricula());
    }
   // static é pra nao criar um objeto inteiro só para
    // fazer alguma coisa, dai no caso chama a classe
    public static double media(double n1, double n2){
        return (n1+n2)/2;
    }
}
