
package aula09b;


public class Aula09b {


    public static void main(String[] args) {

        Pessoa p[] = new Pessoa [3];
        
        p[0] = new Pessoa("Samuel",29,"Masculino");        
        p[1] = new Pessoa("Jader",30,"Masculino");   
        p[2] = new Pessoa("K9",28,"Masculino");   

        
        Livro l[] = new Livro [5];
        
        l[0] = new Livro("O mestre k9","Hyoran",200,p[2]);
        l[1] = new Livro("O plebeu k9","Ukar",100,p[0]);
        l[2] = new Livro("K9 bom pra cachorro","Utzig",200,p[1]);
        l[3] = new Livro("Familia Adams","JK KJ",100,p[2]);
        l[4] = new Livro("Champions","js",300,p[0]);
        
        //p[0].FazerAniver();


        l[4].abrir();
        l[4].folhear(30);
        l[4].avancarPag();
        l[4].voltarPag();
        l[4].fechar();
        l[4].voltarPag();
        l[4].detalhes();
      //  l[4].voltarPag();
       // l[4].fechar();
       // l[4].avancarPag();
      
        
      
    }
    
}
