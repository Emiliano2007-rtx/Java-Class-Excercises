package Examen;

import java.util.Scanner;

import Modularidad2.ArrayBidim;
import Modularidad2.ArrayUnid;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Array2 arr2 = new Array2(); 
        Array3x3 arr3 = new Array3x3();

        int opc=0;

        while (opc!=4) {
            
        System.out.println("MENU PRINCIPAL");
        System.out.println("1.Determinar si un numero leido es primo");
        System.out.println("2.Leer numeros hasta completar el llenado de un arreglo de 10 posiciones con datos enteros impares");
        System.out.println("3.Leer numeros hasta completar el llenado de un arreglo 3x3 con datos enteros primos");
        System.out.println("4.Finalizar ejecucion");
        opc=sc.nextInt();
        
        switch (opc) {
          case 1:
            int num;
            int prim=0;
            System.out.println("Ingresa un numero:");
            num=sc.nextInt();

            for(int i=1;i<=num;i++){
                if(num%i==0){
                    prim++;
                }
            }  
            if(prim==2){
                System.out.println("Es primo");
            }else{
                System.out.println("No es primo");
            }
          
          break;

          case 2:
            arr2.Array2();
          break;

          case 3:
            arr3.Array3x3();
          break;

         }

       }

    }
}
