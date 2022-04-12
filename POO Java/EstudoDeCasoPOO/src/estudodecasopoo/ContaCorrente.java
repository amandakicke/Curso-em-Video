package estudodecasopoo;
public class ContaCorrente {
    private int conta;
    private int agencia;
    private double saldo;
    private String nomeCliente;
    
    public int sacar(double valorSaque){
        if (valorSaque <= saldo){
            saldo = saldo - valorSaque;           
        } else {
            System.out.println("Saldo insuficiente para saque");
        }
        return 1; 
        
    }
    public double depositar(double valorDeposito){
        saldo = saldo + valorDeposito;
        System.out.println("Deposito efetuado no valor de R$ " + valorDeposito);
        return 0;
        
    }
    public double imprimir(){
        System.out.println("Agência: " + this.agencia);
        System.out.println("Conta: " + this.conta);
        System.out.println("Titular: " + this.nomeCliente);
        System.out.println("Saldo atual R$ " + this.saldo);
        return 0;
        
    }

    public ContaCorrente(int conta, int agencia, double saldo, String nomeCliente) {
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = 0;
        this.nomeCliente = nomeCliente;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "conta=" + conta + ", agencia=" + agencia + ", saldo=" + saldo + ", nomeCliente=" + nomeCliente + '}';
    }
    
    
    
    
}
