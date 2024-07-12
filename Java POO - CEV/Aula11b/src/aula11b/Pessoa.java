package aula11b;

public abstract class Pessoa {
    
    protected String nome;
    protected int idade;
    protected String sexo;

    // metodo da classe
    
    public void fazerAniv(){
    this.setIdade(this.getIdade() +1);
        System.out.println("Fez aniversario, a idade de " + this.nome +" eh " + this.idade);
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

    @Override
    public String toString() {
        return "Dados{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }

    
    
}
