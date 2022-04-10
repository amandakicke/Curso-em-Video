package aula09;
public class Aula09 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] b = new Livro[3];
        
        p[0] = new Pessoa("Pedro",22,"M");
        p[1] = new Pessoa("Maria",25,"F");
        
        b[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        b[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
        b[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);
        
        b[1].abrir();
        b[1].folhear(350);
        b[1].avancarPag();
        System.out.println(b[0].detalhes());
        System.out.println(b[1].detalhes());
        System.out.println(b[2].detalhes());
        
        
        
    }
    
}
