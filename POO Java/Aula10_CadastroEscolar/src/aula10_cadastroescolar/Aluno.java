package aula10_cadastroescolar;
public class Aluno extends Pessoa {
    private int matr;
    private String curso;
    
    public void pagarMens(){
        System.out.println("Pagando mensalidade do aluno " + this.nome);        
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
    
    
}
