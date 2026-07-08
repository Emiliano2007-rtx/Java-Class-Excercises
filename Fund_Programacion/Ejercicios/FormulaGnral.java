
package Ejercicios;
import java.util.*;

public class FormulaGnral {

    
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in); 
        
       double a,b,c;
       
        System.out.println("Ingresa 'a' ");
        a=sc.nextDouble();
        
        System.out.println("Ingresa 'b' ");
        b=sc.nextDouble();
        
        System.out.println("Ingresa 'c' ");
        c=sc.nextDouble();
        
        double r1=(b-b-b)+Math.sqrt(b*b+4*a*c)/2*a;
        double r2=(b-b-b)-Math.sqrt(b*b+4*a*c)/2*a;
       
        System.out.println("R1"+r1);
        System.out.println("R2"+r2);
       
        
    }
    
}
