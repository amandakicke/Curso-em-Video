
package aula05;
public class ContaBanco {
    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String titular;
    private float saldo;
    private boolean estado;  
    
    //METODOS PERSONALIZADOS
    
    public void estadoAtual(){
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Estado: " + this.isEstado());
        System.out.println("----------------------------");
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setEstado(true);
        if ("CC".equals(t)){
            this.setSaldo(50);
        }else if ("CP".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser encerrada porque ainda tem dinheiro");
        } else if (this.getSaldo() < 0){
            System.out.println("A conta não pode ser encerrada porque tem débito.");
        } else {
            this.setEstado(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    public void depositar(float v){
        if (this.isEstado()){
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito Realizado na conta de" + this.getTitular());
        } else {
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }
    public void sacar(float v){
        if (this.isEstado()){
            if (this.getSaldo()>= v){
                this.setSaldo((this.getSaldo() - v));
                System.out.println("Saque realizado na conta de " + this.getTitular());
            }else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else{
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;
        } else if ("CP".equals(this.getTipo())){
            v = 20;
        }
        if (this.isEstado()){
           this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por this.getTitular()");
        } else {
            System.out.println("Impossível pagar mensalidade de conta encerrada");
        }
    }
        
        
        //METODOS ESPECIAIS

    public ContaBanco() {
        this.saldo = 0;
        this.estado = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
        
    
    
}       