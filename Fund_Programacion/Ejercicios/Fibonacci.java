
package Ejercicios;
import java.util.*;

public class Fibonacci {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int n1=0,n2=1,lim;
       
        System.out.println("Ingrese limite");
        lim=sc.nextInt();
        
        while(n2<=lim){
            int suma = n1+n2;
            n1=n2;
            n2=suma;
            
        if(n2<=lim){
            System.out.println(n2);    
        }
        
            
        }
    }
    
}
