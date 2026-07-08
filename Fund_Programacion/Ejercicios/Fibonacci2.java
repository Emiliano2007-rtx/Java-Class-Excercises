package Ejercicios;

import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
       
       int n1=0,n2=1,lim;
       int cont=0;
       
        System.out.println("Ingrese cuantos terminos desea");
        lim=sc.nextInt();
        
        while(cont<=lim){
            int suma = n1+n2;
            n1=n2;
            n2=suma;
            cont++;
            
        if(cont<=lim){
            System.out.println(n2);    
        }
      }
    }
}
