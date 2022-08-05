package aula06;

/**
 * @author mDanielSE
 */
public class Aluno {
   
    private String nome;
    private String matricula;

    public Aluno(){
        
    }
    
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public String getNome() {
        return nome;
    }

    public String getNome(boolean pNome){
        if(pNome){
            return this.nome.split(" ")[0];
        }else{
            return this.nome;
        }
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
            
    
}
