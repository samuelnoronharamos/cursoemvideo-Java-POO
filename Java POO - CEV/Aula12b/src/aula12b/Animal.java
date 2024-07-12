/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12b;

/**
 *
 * @author Samuel
 */
public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;
    
    abstract void locomover();
    abstract void alimentar();
    abstract void emitirSom();

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

    @Override
    public String toString() {
        return "Animal{" + "peso=" + peso + ", idade=" + idade + ", membros=" + membros + '}';
    }

    
}
