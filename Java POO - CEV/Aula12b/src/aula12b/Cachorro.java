package aula12b;
public class Cachorro extends Mamimefero {
    
    // metodos da classe
    public void enterrarOsso(){
        System.out.println("Entenrrando osso");
    }
    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }

    @Override
    void emitirSom() {
        System.out.println("Latindo");
    }
    
    
}
