
package aula09b;


public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    // construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    

    public void FazerAniver(){
        this.setIdade(this.getIdade() +1);    
        System.out.println("Parabens pelos seus " + this.getIdade());
    }
    
    // metodos especiais 
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    
    
}
