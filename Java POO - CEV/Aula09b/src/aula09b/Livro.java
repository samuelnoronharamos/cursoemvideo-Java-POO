
package aula09b;

public class Livro implements Publicacao {
    
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // metodo construtor
        public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.leitor = leitor;

    }
    
    // metodos especiais
    public void detalhes(){
        System.out.println("===== Detalhes =====");
        System.out.println("Livro: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de Paginas: " + this.getTotalPaginas());
        System.out.println("Paginas Atual: " + this.getPagAtual());
        System.out.println("O livro esta aberto " + this.getAberto());
        System.out.println("Pertence a " + leitor.getNome());
        System.out.println("Idade: " + leitor.getIdade());
        System.out.println("Sexo: " + leitor.getSexo());
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }


    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    
    // metodos abstratos
    @Override
    public void abrir() {
        this.setAberto(true);
        System.out.println("Livro foi aberto");
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        System.out.println("Livro foi fechado");

    }

    @Override
    public void folhear(int p) {
        if ((this.getAberto() == true) && (p <= this.getTotalPaginas())) {
            this.setPagAtual(p);
            System.out.println("O livro foi folheado " +p +" paginas e a pagina atual eh: " + this.getPagAtual());
        }else{
            System.out.println("Impossivel folhear");
        }

    }

    @Override
    public void avancarPag() {
        if (this.getAberto() == true && (this.getPagAtual() <= this.getTotalPaginas())) {
            this.setPagAtual(this.getPagAtual()+1);
            System.out.println("A pagina foi avancada e a pagina atual eh: " + this.getPagAtual());
        }else
            System.out.println("Impossivel avancar");
    }

    @Override
    public void voltarPag() {
        if (this.getAberto() == true && (this.getPagAtual() <= this.getTotalPaginas())) {
            this.setPagAtual(this.getPagAtual()-1);
            System.out.println("A pagina foi voltada e a pagina atual eh: " + this.getPagAtual());
        }else{
            System.out.println("Impossivel voltar");
        }
    }
    
}
