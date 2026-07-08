
package Ejercicios;
import java.util.*;

public class ListaNumeros {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String num="";
        double nImpar=0,Stot=0,tot;
        int npar=0,numI;
        
        for(int i=0;i<=10;i++){
            System.out.println("Ingresa un numero:"+i);
            num=sc.nextLine();
            
            try{
                numI=Integer.parseInt(num);
                
                    if(numI%2==0){
                        npar++;
                    }else{
                        nImpar=nImpar+numI;
                    }
                    Stot=Stot+numI;
                
            }catch(NumberFormatException e){
                System.out.println("No es un numero");
            }
                
          }
        tot=Stot/20;
        System.out.println("Total de pares"+npar);
        System.out.println("Suma de los impares"+nImpar);
        System.out.println("Promedio de numeros ingresados"+tot);
               
    }
    
}
