/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercaula05b;

/**
 *
 * @author Samuel
 */
public class ExercAula05b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            ContaBanco c1 = new ContaBanco();
            c1.setNumConta(1111111);
            c1.setDono("Jubileu");
            c1.abrirConta("CC");
            c1.depositar(100.0f);
           // c1.sacar(30.0f);
          //  c1.fecharConta();
          
          ContaBanco c2 = new ContaBanco();
            c2.setNumConta(222222);
            c2.setDono("Creusa"); 
            c2.abrirConta("CP");
            c2.depositar(500.0f);         
            c2.sacar(1000.0f);
            
            c1.sacar(150.0f);
            c1.fecharConta();
            
            c1.estadoAtual();
            c2.estadoAtual();
            

    }
    
}
