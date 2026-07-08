package Ejercicios;
import java.util.*;

public class primos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Snum="";
        int n;
        int p=0;


        try {           
            System.out.println("Ingrese un numero entero");
            Snum=sc.nextLine();
            
            n=Integer.parseInt(Snum);

            if(n==0){
                System.out.println("No vale 0");
            }else{
            
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    p++;
                }
            }  
            if(p==2){
                System.out.println("Es primo");
            }else{
                System.out.println("No es primo");
            }
        }
            
        } catch (NumberFormatException e) {
            System.out.println("No es entero");
        }
        
    }
}
