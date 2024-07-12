package aula10b;

public class Funcionario extends Pessoa {
    
    private String setor;
    private boolean trabalhando;
    
    /*
    // metodo construtor

    public Funcionario(String setor, boolean trabalhando, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }
*/
    // metodo da classe
    
    private void mudarTrabalho(){
        this.setTrabalhando(!this.getTrabalhando());
    }
    
    // metodos especiais
    public String getSetor() {
        return setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
    
}
