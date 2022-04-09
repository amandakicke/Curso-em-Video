
package aula05;
public class ContaBanco {
    public float numConta;
    protected String tipo;
    private String titular;
    private float saldo;
    private boolean estado;  

    public ContaBanco(float numConta, String tipo, String titular, float saldo, boolean estado) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.titular = titular;
        this.saldo = saldo;
        this.estado = estado;
    }

    public float getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setNumConta(float numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
