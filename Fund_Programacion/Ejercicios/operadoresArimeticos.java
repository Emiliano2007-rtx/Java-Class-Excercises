
package Ejercicios;
import java.util.*;


public class operadoresArimeticos {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double a,b,c,d,e;
        
        System.out.println("Ingrese el valor de 'a' ");
        a = sc.nextDouble();
        
        System.out.println("Ingrese el valor de 'b' ");
        b=sc.nextDouble();
        
        System.out.println("Ingrese el valor de 'c' ");
        c=sc.nextDouble();
        
        System.out.println("Ingrese el valor de 'd' ");        
        d=sc.nextDouble();
        
        System.out.println("Ingrese el valor de 'e' ");
        e=sc.nextDouble();
        
        
        double R1 =  a+b / c*d;
        double R2 = (a+b+c)/(d*e)*(a+b+c)/(d*e);
        double R3 = Math.pow((a*b*c/Math.pow(d+e,2)),2);
        double R4 = R1+R2+R3;
        
        System.out.println("R1="+R1);        
        System.out.println("R2="+R2);
        System.out.println("R3="+R3);
        System.out.println("R4="+R4);


        
    }
    
}
