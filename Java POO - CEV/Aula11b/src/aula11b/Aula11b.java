
package aula11b;


public class Aula11b {


    public static void main(String[] args) {
        /*
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setSexo("M");
        v1.setIdade(30);
        System.out.println(v1.toString());
        */
         /*
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setSexo("M");
        a1.setCurso("Informatica");
        a1.setMatr(1111);
        a1.setIdade(16);
        a1.pagarMensalidade();
      //  System.out.println(a1.toString());
        
       Bolsista b1 = new Bolsista();
       b1.setMatr(11112);
       b1.setNome("Jubileu");
       b1.setBolsa(12.5f);
       b1.setSexo("M");
       b1.pagarMensalidade();
      
       Professor p1 = new Professor();
        p1.setNome("Claudio");
        p1.setSexo("M");
        p1.setIdade(43);
        p1.setEspecialidade("Eletrica");
        p1.setSalario(5000f);
        p1.receberAum(50);
        p1.fazerAniv();
        System.out.println(p1.toString() +" especialista em " + p1.getEspecialidade());

 */
         Tecnico t1 = new Tecnico();
        t1.setNome("Wellington");
        t1.setSexo("M");
        t1.setIdade(28);    
        t1.setCurso("Letras");
        t1.setMatr(12150);
        t1.setRegistroProfissional(52410);
        t1.pagarMensalidade();
        t1.fazerAniv();
        t1.praticar();
        System.out.println(t1.toString() +" registro: " + t1.getRegistroProfissional() + " do curso " + t1.getCurso());
        

    }
    
}
