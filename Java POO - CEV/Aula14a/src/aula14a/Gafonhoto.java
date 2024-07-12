package aula14a;

public class Gafonhoto extends Pessoa{

    private String login;
    private int totAssistido;

    public Gafonhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
        
    }

    public String getLogin() {
        return login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    

    @Override
    protected void ganharExp() {
    }

    @Override
    public String toString() {
        return "Gafonhoto{" +super.toString() +  "\n login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
}
