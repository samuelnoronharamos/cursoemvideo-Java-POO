package aula14a;

public class Aula14a {

    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de php");
        v[2] = new Video("Aula 10 de HTML5");
        
        Gafonhoto g[] = new Gafonhoto[2];
        g[0] = new Gafonhoto("Jubileu",22,"M","juba");
        g[1] = new Gafonhoto("Creuza",18,"F","creuzin");
        
       // System.out.println(g[0].toString());
        
        Vizualizacao vis[] = new Vizualizacao[5];
        vis[0] = new Vizualizacao(g[0],v[2]); 
        vis[0].avaliar(9);
        System.out.println(vis[0].toString()); // jubileu assiste html
        vis[1] = new Vizualizacao(g[0],v[1]);
        System.out.println(vis[1].toString()); // jubileu assiste php
    }
    
}
