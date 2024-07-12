package aula12b;

public class Ave extends Animal {

   protected String corPena;
   
   // metodo da classe
   public void fazerNinho(){
       System.out.println("Fazendo ninho");
   }
   
    @Override
    void locomover() {
        System.out.println("Voando");
    }

    @Override
    void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    void emitirSom() {
        System.out.println("Cantando");
    }
    
    //metodos especaisis

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}
