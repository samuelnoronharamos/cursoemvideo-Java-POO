package aula12b;

public class Canguru extends Mamimefero {
    
    public void usarBolsa(){
        System.out.println("Usando Bolsa");
    }

    @Override
    void locomover() {
        super.locomover();
        System.out.println("Saltando");
    }
    
    
    
}
