package aula10_cadastroescolar;
public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }
    @Override
    public void pagarMens(){
        System.out.println(this.nome + " é bolsista! Pagando mensalidade!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
