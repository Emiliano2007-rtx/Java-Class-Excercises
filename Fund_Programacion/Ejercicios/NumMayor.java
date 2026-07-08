
package Ejercicios;
import java.util.*;


public class NumMayor {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int num1,num2;
        
        System.out.println("Ingresa el primer numero");
        num1=sc.nextInt();
        
        System.out.println("Ingresa el segundo numero");
        num2=sc.nextInt();
        
        if(num1>num2){
            System.out.println("El mayor es:"+num1);
         }
        if(num2>num1){
            System.out.println("El mayor es:"+num2);
        }
    }
    
}
