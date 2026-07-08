
package Ejercicios;


public class poblacion {

    
    public static void main(String[] args) {
      
        double Pmexico=126000000;
        double Pjapon= 150000000;
        int años = 0;
        
        
        while(Pmexico<Pjapon){
           Pmexico=Pmexico*1.06;
           Pjapon=Pjapon*1.02;
           años++;
           
        }
        System.out.println("Mexico rebasara a Japon en "+años+" años");
      
    }
    
}
