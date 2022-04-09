package aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setTitular("Jubileu");
        p1.abrirConta("CC");
        p1.getSaldo();
        
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setTitular("Creusa");
        p2.abrirConta("CP");
        p2.getSaldo();
        
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);
        p2.sacar(1000);
        p1.sacar(150);
        p1.fecharConta();
        
        ContaBanco p3 = new ContaBanco();
        p3.setNumConta(3333);
        p3.setTitular("Amanda");
        p3.abrirConta("CP");
        p3.getSaldo();
        
        
        
        p1.estadoAtual();
        p2.estadoAtual();  
        p3.estadoAtual();
        
        
    }
    
}
