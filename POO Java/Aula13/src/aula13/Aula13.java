package aula13;
public class Aula13 {
    public static void main(String[] args) {
        
        //Animal a = new Animal();
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        Cachorro c1 = new Cachorro();
        
        c1.reagir("Olá");
        c1.reagir("Vai apanhar");
        c1.reagir(11, 45);
        c1.reagir(19, 11);
        c1.reagir(false);
        c1.reagir(true);
        c1.reagir(1, 8f);
        c1.reagir(8, 20f);
        c1.reagir(2, 40);
        
        m.setPeso(5f);
        m.emitirSom();
        
        l.emitirSom();
        c.emitirSom();
        
        
    }
    
}
