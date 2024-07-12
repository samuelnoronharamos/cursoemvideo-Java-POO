/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02;

/**
 *
 * @author Samuel
 */
public class Aula02 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Caneta c1 = new Caneta();
        c1.modelo = "BIC CRISTAL";
        c1.cor = "Azul";
        c1.carga = 80;
       // c1.tampada = false;
        c1.tampar();
        c1.status(); 
        c1.rabiscar();
        
        
        
        
        
    }
}