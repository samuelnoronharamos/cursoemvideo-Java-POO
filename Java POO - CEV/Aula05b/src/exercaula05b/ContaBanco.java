/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercaula05b;

/**
 *
 * @author Samuel
 */
public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.setStatus(false);
    }


    
    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    // metodos
    
   
    public void abrirConta(String t){
        this.setStatus(true);
        this.setTipo(t);
       
        if ( "CC".equals(this.getTipo())) {
            this.setSaldo(50);
            System.out.println("Conta Aberta com sucesso");
        }else{
            this.setTipo("CP");
            this.setSaldo(150);
            System.out.println("Conta Aberta com sucesso");
        }
        
    }
    
    public void fecharConta(){
       if ( this.getSaldo() == 0) { 
        this.setStatus(false);
           System.out.println("Conta encerrada com sucesso");
        } else if (this.getSaldo() > 0) {
            System.out.println("Erro! Conta com Dinheiro");
        } else if (this.getSaldo() < 0){
            System.out.println("Erro! Conta em débito");
        }
    }
    
    public void depositar(float valorDeposito){
        
        if (this.getStatus() == true){
        this.setSaldo(this.getSaldo() + valorDeposito);
            System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
        }else {
            System.out.println("Impossivel depositar");
        }
    }
    
    public void sacar(float valorSaque){
        if (this.getStatus() == true && this.getSaldo() >= valorSaque) {
        this.setSaldo(this.getSaldo() - valorSaque);
            System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
        }else {
            System.out.println("Saldo Insuficiente na conta de " + this.getDono());
        }     
    }
    
    public void pagarMensal(){
    float v=0; 

            if ("CC".equals(this.getTipo())){
            v = 12f;
            }else if ("CP".equals(this.getTipo())){
            v = 20f;
            }
            if (this.getStatus() == true){ 
                if (this.getSaldo() > v ){
                this.setSaldo(this.getSaldo() - v);
                    System.out.println("Pagamento mensal realizado com sucesso na conta de " + this.getDono() );
                }else{
                    System.out.println("Saldo Insufuciente");
                }
                }
           else{
                 System.out.println("Impossivel pagar");
            }
    }
    
    public void estadoAtual(){
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
     
}

    
