package POO.Unidad1.ExamenU1;

import java.util.Scanner;

public class Unidimencional {
     public void Uni(){
      Scanner leer = new Scanner(System.in);
      Scanner sc = new Scanner(System.in);
  int opU=0;
  int tam, z=0;
  System.out.println("Ingresa el tamano del array");
        tam=sc.nextInt();

        int arrU [] = new int[tam];
        int orden [] = new int[tam];

  while(opU!=4){
  System.out.println("1. Llenar el arreglo (con solo números primos)");
      System.out.println("2. Ordenar de mayor a menor e imprimir la lista");
      System.out.println("3. Imprimir el arreglo como originalmente se llenó");
      System.out.println("4. Regresar al menú principal");
      opU = leer.nextInt();
      
      switch(opU){
          
          case 1:{
              String num;
              int numInt;
              int prim;

            System.out.println("Ingresa numeros:");
            while(z<tam){
            num=sc.next();
                try{
                    numInt=Integer.parseInt(num);
                    prim=1;
                    
                if(numInt<=1){
                    prim=0;
                }    

                for(int x=2;x<numInt;x++){
                     if(numInt%x==0){
                        prim=0;
                    }
                }  
                if(prim==1){
                    System.out.println("Es primo");
                    arrU[z]=numInt;
                    orden[z]=numInt;
                    z++;
                }else{
                    System.out.println("No primo");
                }
                
                }catch(Exception e){
                    System.out.println("No es un numero entero");

                }    
           }
            
              break;
            }
          
            case 2: {
              int x,y;
              for (int i = 0; i < tam; i++) {
                  for (int j = 0; j < tam-1; j++) {
                      x = orden[j+1];
                      if(orden[j]<x){
                          y = orden[j];
                          orden[j]=x;
                          orden[j+1]=y;
                      }
                  }
              }
              System.out.println("Arreglo ordenado");
              for (int i = 0; i < tam; i++) {
                  System.out.println(orden[i]);
              }
              break;}
          
          case 3:{
              System.out.println("Arreglo original");
              for (int i = 0; i < tam; i++) {
                  System.out.println(arrU[i]);
              }
              break;
          }
          default:{System.out.println("No es una opcion");}
      }
  
  }
 }
}
