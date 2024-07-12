
package aula10b;

public class Aluno extends Pessoa {
    private boolean matr;
    private String curso;

    // metodo construtor

/*
    public Aluno(boolean matr, String curso, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.matr = matr;
        this.curso = curso;
    }
   
*/
    // metodo da classe
    
    public void cancelarMatr(){
        this.setMatr(false);
        System.out.println("Matricula cancelada");
        
    }
    
    // metodos especiais
    public boolean getMatr() {
        return matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatr(boolean matr) {
        this.matr = matr;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
}
