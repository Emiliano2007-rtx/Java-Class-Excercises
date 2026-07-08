
package Ejercicios;


public class InteresMensual {

   
    public static void main(String[] args) {
        
     double Carlos=200;
     double Pedro = 300*1.10;
     int mes=1;
     while(Carlos<Pedro){
         mes++;
         Pedro=(Pedro+300)*(1.10);
         Carlos=Carlos+200;
         if(mes%2==0){
             Carlos=Carlos*1.25;
         }
     }
        System.out.println("Carlos Tardaria "+mes);
         
    }
    
}
