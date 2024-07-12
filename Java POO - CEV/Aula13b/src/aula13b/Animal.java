package aula13b;
public abstract class Animal {
    
    protected float peso;
    protected int idade;
    protected int membros;
    
    public abstract void emitirSom(); 

    // metodos especiais
    public float getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
    
}
