package aula11b;

public class Bolsista extends Aluno{
    
    private float bolsa;
    
    public void RenovarBolsa(){
        System.out.println("Renovoando bolsa de: " + this.nome);
        
    } 
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " eh bolsista! Pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
