
package aula11b;

public class Aluno extends Pessoa {
    private int matr;
    private String curso;

    // metodo da classe
    
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade aluno " +this.nome);
    }
    
    // metodos especiais
    public int getMatr() {
        return matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
}