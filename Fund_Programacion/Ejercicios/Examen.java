/**/

package Ejercicios;
import java.util.*;

public class Examen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int LimInf;
        int LimSup;
        int cont=0;
        int Snums=1;
        int Stotal=0;
        
    
        do{
            System.out.println("Ingresa el limite inferior");
            LimInf=sc.nextInt();

            System.out.println("Ingresa el limite superior");
            LimSup=sc.nextInt();

            if (LimInf>LimSup) {
                System.out.println("El limite inferior no puede ser mayor al superior");
                System.out.println("Intente de nuevo");
            }
            cont++;

        }while(LimInf!=0 && LimSup!=0 && LimInf<LimSup && cont<=0);

        if(LimInf<LimSup){
            while (Snums<LimInf && Snums<LimSup && Snums!=0) {
             
                while (LimInf<LimSup && Snums!=0) {
                    LimInf++;
                    System.out.println("Ingrese numeros dentro del intervalo");
                    Snums=sc.nextInt();
                    Stotal=Stotal+Snums;
                    
                    if (Snums==LimInf || Snums==LimSup) {
                    System.out.println("Numero ingresado igual al limite del intervalo");
                    } 
                   
                }
                 System.out.println("Suma total: "+Stotal);
                
                
                
            
         } 

        }
    }
}
