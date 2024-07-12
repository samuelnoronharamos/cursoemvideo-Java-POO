package aula12b;

public class Mamimefero extends Animal {
    
   protected String corPelo; 
    
   // sobreposição
    @Override
    void locomover() {
        System.out.println("Correndo");
    }

    @Override
    void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    void emitirSom() {
        System.out.println("Som de Mamifero");
    }
    // metodos especiais
    
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
    
}
