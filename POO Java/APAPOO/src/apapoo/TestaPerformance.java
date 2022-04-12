
package apapoo;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;

public class TestaPerformance {
    public static void main(String[] args){
        
        System.out.println("Iniciando...");
        
        
        long inicio = System.currentTimeMillis();
        Collection<Integer> teste = new ArrayList<>();
                
        int total = 30000;
        
        for (int i = 0; i < total; i++) {
            teste.add(i);
        }
        for (int i = 0; i < total; i++){
            teste.contains(i);            
        }
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto(ArrayList)-"+total+": "+tempo);
        teste.clear();
        
        inicio=System.currentTimeMillis();
         total=50000;
         
        for (int i=0;i<total;i++){
            teste.add(i);
        }
        for (int i=0;i<total;i++){
            teste.contains(i);
        }

         fim= System.currentTimeMillis();
         tempo=fim-inicio;
        System.out.println("Tempo gasto(ArrayList)-"+total+": "+tempo);
        teste.clear();

        inicio=System.currentTimeMillis();
        total=100000;
        for (int i=0;i<total;i++){
            teste.add(i);
        }
        for (int i=0;i<total;i++){
            teste.contains(i);
        }

        fim= System.currentTimeMillis();
        tempo=fim-inicio;
        System.out.println("Tempo gasto(ArrayList)-"+total+": "+tempo);
        teste.clear();

        inicio=System.currentTimeMillis();
        total=150000;
        for (int i=0;i<total;i++){
            teste.add(i);
        }
        for (int i=0;i<total;i++){
            teste.contains(i);
        }

        fim= System.currentTimeMillis();
        tempo=fim-inicio;
        System.out.println("Tempo gasto(ArrayList)-"+total+": "+tempo);
        teste.clear();

        inicio=System.currentTimeMillis();
        total=200000;
        for (int i=0;i<total;i++){
            teste.add(i);
        }
        for (int i=0;i<total;i++){
            teste.contains(i);
        }

        fim= System.currentTimeMillis();
        tempo=fim-inicio;
        System.out.println("Tempo gasto(ArrayList)-"+total+": "+tempo);
        teste.clear();
        }
    

    //Collection<Integer> teste = new HashSet<>();
    public static void TestHashSet(){
        long inicio=System.currentTimeMillis();
        Collection<Integer> teste=new HashSet<>();

        int total=30000;
        for (int i=0;i<total;i++){
            teste.add(i);
        }
        for (int i=0;i<total;i++){
            teste.contains(i);
        }
               
        
        long fim= System.currentTimeMillis();
        long tempo=fim-inicio;
        System.out.println("Tempo gasto(HashSet)-"+total+": "+tempo);
        teste.clear();

        inicio=System.currentTimeMillis();
        total=50000;
        for (int i=0;i<total;i++){
            teste.add(i);
        }
        for (int i=0;i<total;i++){
            teste.contains(i);
        }

        fim= System.currentTimeMillis();
        tempo=fim-inicio;
        System.out.println("Tempo gasto(HashSet)-"+total+": "+tempo);
        teste.clear();

        inicio=System.currentTimeMillis();
        total=100000;
        for (int i=0;i<total;i++){
            teste.add(i);
        }
        for (int i=0;i<total;i++){
            teste.contains(i);
        }

        fim= System.currentTimeMillis();
        tempo=fim-inicio;
        System.out.println("Tempo gasto(HashSet)-"+total+": "+tempo);
        teste.clear();

        inicio=System.currentTimeMillis();
        total=150000;
        for (int i=0;i<total;i++){
            teste.add(i);
        }
        for (int i=0;i<total;i++){
            teste.contains(i);
        }

        fim= System.currentTimeMillis();
        tempo=fim-inicio;
        System.out.println("Tempo gasto(HashSet)-"+total+": "+tempo);
        teste.clear();

        inicio=System.currentTimeMillis();
        total=200000;
        for (int i=0;i<total;i++){
            teste.add(i);
        }
        for (int i=0;i<total;i++){
            teste.contains(i);
        }

        fim= System.currentTimeMillis();
        tempo=fim-inicio;
        System.out.println("Tempo gasto(HashSet)-" + total + ": "+tempo);
        teste.clear();
    }

    public static void TestArrayList() {    
        long inicio = System.currentTimeMillis();
        Collection<Integer> teste = new ArrayList<>();
                
        int total = 30000;
        
        for (int i = 0; i < total; i++) {
            teste.add(i);
        }
        for (int i = 0; i < total; i++){
            teste.contains(i);            
        }
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + total + tempo);
        teste.clear();
        
        inicio=System.currentTimeMillis();
         total=50000;
         
        for (int i=0;i<total;i++){
            teste.add(i);
        }
        for (int i=0;i<total;i++){
            teste.contains(i);
        }

         fim= System.currentTimeMillis();
         tempo=fim-inicio;
        System.out.println("Tempo gasto(ArrayList)-"+total+": "+tempo);
        teste.clear();

        inicio=System.currentTimeMillis();
        total=100000;
        for (int i=0;i<total;i++){
            teste.add(i);
        }
        for (int i=0;i<total;i++){
            teste.contains(i);
        }

        fim= System.currentTimeMillis();
        tempo=fim-inicio;
        System.out.println("Tempo gasto(ArrayList)-"+total+": "+tempo);
        teste.clear();

        inicio=System.currentTimeMillis();
        total=150000;
        for (int i=0;i<total;i++){
            teste.add(i);
        }
        for (int i=0;i<total;i++){
            teste.contains(i);
        }

        fim= System.currentTimeMillis();
        tempo=fim-inicio;
        System.out.println("Tempo gasto(ArrayList)-"+total+": "+tempo);
        teste.clear();

        inicio=System.currentTimeMillis();
        total=200000;
        for (int i=0;i<total;i++){
            teste.add(i);
        }
        for (int i=0;i<total;i++){
            teste.contains(i);
        }

        fim= System.currentTimeMillis();
        tempo=fim-inicio;
        System.out.println("Tempo gasto(ArrayList)-"+total+": "+tempo);
        teste.clear();
        }
    }



    
    
        
    
        
        

