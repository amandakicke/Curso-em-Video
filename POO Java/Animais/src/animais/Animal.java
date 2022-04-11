package animais;
public abstract class Animal {
    
    //Atributos de Animal
    protected float peso;
    protected int idade;
    protected int membros;
    
    //Métodos de Animal
    
    public void locomover(){
        
    }
    public void alimentar(){
        
    }
    public void emitirSom(){
        
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
}
