
package aula10b;

public class Aula10b {


    public static void main(String[] args) {
    
     Pessoa p1 = new Pessoa();
     Aluno p2 = new Aluno();
     Professor p3 = new Professor();
     Funcionario p4 = new Funcionario();
     
     p1.setNome("Pedro");
     p2.setNome("Maria");
     p3.setNome("Claudio");
     p4.setNome("Fabiana");
     
     p2.setCurso("Informatica");
     p3.setSalario(2500.65f);
     p4.setSetor("Estoque");
     
     p3.receberAum(50f);
     
     
     p1.setIdade(15);
     p2.setIdade(16);
     p3.setIdade(17);
     p4.setIdade(18);
     
     p1.setSexo("M");
     p2.setSexo("F");
     p3.setSexo("M");
     p4.setSexo("F");
     
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
    
}
