
package Ejercicios;
import java.util.*;

public class NumMayorDeTres {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num1,num2,num3;
        
        System.out.println("Ingresa el primer numero");
        num1=sc.nextInt();
        
        System.out.println("Ingresa el segundo numero");
        num2=sc.nextInt();
        
        System.out.println("Ingresa el tercer numero");
        num3=sc.nextInt();
        
        
        if(num1>num2 && num1>num3){
            System.out.println("El mayor es:"+num1);
         }
        if(num2>num1 && num2>num3){
            System.out.println("El mayor es:"+num2);
        }
        if(num3>num2 && num3>num1){
            System.out.println("El mayor es:"+num3);
        }
        
        if(num1<num2&&num1<num3){
            System.out.println("El menor es:"+num1);
        }
        if(num2<num1&&num2<num3){
            System.out.println("El menor es:"+num2);
        }
        if(num3<num1&&num3<num2){
            System.out.println("El menor es:"+num3);
        }
        if(num1==num2&&num2==num3){
            System.out.println("Todos son iguales");
        }
    }
    
}
