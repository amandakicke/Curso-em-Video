package estudodecasopoo;
public class EstudoDeCasoPOO {
    public static void main(String[] args) {
       ContaCorrente c1 = new ContaCorrente(01, 001, 0.0, "Amanda");
       
     
       c1.depositar(150.50);
       c1.sacar(50);
       
       c1.depositar(203.88);
       c1.imprimir();
       
       c1.sacar(400);
    }
    
}
