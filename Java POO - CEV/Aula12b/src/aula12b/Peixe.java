package aula12b;

public class Peixe extends Animal{

    protected String corScama;
    
    // metodo da classe
    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }
    
    @Override
    void locomover() {
        System.out.println("Nadando");
    }

    @Override
    void alimentar() {
        System.out.println("Comendo algo");
    }

    @Override
    void emitirSom() {
        System.out.println("Peixe nao faz som");
    }

    //  metodos especiais
    public String getCorScama() {
        return corScama;
    }

    public void setCorScama(String corScama) {
        this.corScama = corScama;
    }
    
}
