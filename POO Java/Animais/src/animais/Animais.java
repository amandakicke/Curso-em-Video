package animais;
public class Animais {
    public static void main(String[] args) {
      //Animal n = new Animal();
      Mamifero m = new Mamifero();
      Reptil r = new Reptil();
      Peixe p = new Peixe();
      Ave a = new Ave();
      Canguru c = new Canguru();
      Cachorro k = new Cachorro();
      Arara a1 = new Arara();
      Goldfish g = new Goldfish();
      Tartaruga t = new Tartaruga();
      
      a1.locomover();
      a1.emitirSom();
      a1.fazerNinho();
      g.alimentar();
      g.setCorEscama("Amarela");
      g.locomover();
      t.locomover();
      t.alimentar();
      
      c.locomover();
      k.locomover();
      
      
      m.setPeso(35.3f);
      m.setCorPelo("Branco");
      m.alimentar();
      m.emitirSom();
      m.locomover();
      
      a.setPeso(2f);
      a.setIdade(1);
      a.setMembros(2);
      a.alimentar();
      a.emitirSom();
      a.fazerNinho();
      a.locomover();
      
      p.setPeso(0.2f);
      p.setMembros(0);
      p.setIdade(1);
      p.alimentar();
      p.emitirSom();
      p.setCorEscama("amarela");
      p.locomover();
      
      r.setIdade(2);
      r.setMembros(4);
      r.setPeso(100f);
      r.locomover();
      r.alimentar();
      r.emitirSom();
      
      
      
      
    }
    
}
