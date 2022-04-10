package aula10_cadastroescolar;

public class Aula10_CadastroEscolar {
    public static void main(String[] args) {
        
        
        //Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        Visitante v1 = new Visitante();
        v1.setNome("Amanda");
        v1.setIdade(41);
        v1.setSexo("F");
        
        
        Aluno a1 = new Aluno();
        a1.setNome("Paula");
        a1.setIdade(18);
        a1.setMatr(222);
        a1.setSexo("F");
        a1.setCurso("Direito");
        a1.pagarMens();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("João");
        b1.setIdade(25);
        b1.setMatr(333);
        b1.setCurso("Informática");
        b1.fazerAniv();
        b1.pagarMens();
        b1.setBolsa(12.5f);
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Margarida");
        t1.setIdade(35);
        t1.setRegistroProfissional(45);
        t1.praticar();
        t1.pagarMens();       
        
        
       // p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");
        
        //p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);
        
        //System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(v1.toString());
        System.out.println(a1.toString());
        System.out.println(b1.toString());
        System.out.println(t1.toString());
        
        p2.setCurso("Informática");
        p4.setSetor("Estoque");
        p4.mudarTrabalho();
        //p2.cancelarMatr();
        //p3.setSalario(2500,75f);
        //p3.receberAum(550,00f);
        
        
        
        
        
    }
    
}
