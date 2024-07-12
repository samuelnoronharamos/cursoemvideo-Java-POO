package aula14a;

public class Vizualizacao {
    
    private Gafonhoto espectador;
    private Video filme;

    public Vizualizacao(Gafonhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }


    
    // metodo sobreposição
    public void avaliar (){
       this.filme.setAvaliacao(5);
    
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
        
    }
    public void avaliar(float porc){
        int tot=0;
        if (porc <= 20) {
            tot = 3;
        }else if (porc <=50){
            tot = 5;
        }else if (porc <=90){
            tot = 8; 
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
// metodos especiais 

    public Gafonhoto getEspectador() {
        return espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setEspectador(Gafonhoto espectador) {
        this.espectador = espectador;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Vizualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    

    
    
    
}
