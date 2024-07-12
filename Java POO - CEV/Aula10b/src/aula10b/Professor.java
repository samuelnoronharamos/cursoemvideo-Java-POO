package aula10b;


public class Professor extends Pessoa {
    
    private String especialidade;
    private float salario;
/*
    // metodo construtor
    public Professor(String especialidade, float salario, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }
   */ 
    // metodo da classe
    
    public void receberAum(float aumento){
        this.setSalario(this.getSalario() + aumento);
        System.out.println("Com o aumento de " +aumento + " o salario atual eh de " +this.getSalario());
    }
    
    // metodos especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
    
}
