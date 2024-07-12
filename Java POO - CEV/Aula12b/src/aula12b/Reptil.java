package aula12b;

public class Reptil extends Animal {

    protected String corEscama;
    
    @Override
    void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    void alimentar() {
        System.out.println("Comendo Vegetais");
    }

    @Override
    void emitirSom() {
        System.out.println("Som de Reptil");
    }
    
    // metodos especiais 

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
