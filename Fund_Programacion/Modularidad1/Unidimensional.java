package Modularidad1;

import java.util.*;

public class Unidimensional {
    public void menu(){
        Scanner sc = new Scanner(System.in);
        int tam;
        System.out.println("Cuantas posiciones quieres el array?");
        tam=sc.nextInt();
        int arr []=new int[tam];
        int opc = 0;
        int aux=0,pos=0;
        int Nmayor=0;

        while (opc!=5) {
            System.out.println("**Submenu Unidimensional");
            System.out.println("1.Llenar array");
            System.out.println("2.Ordenar ascendentemente e imprimir");
            System.out.println("3.Ordenar descendentemente e imprimir");
            System.out.println("4.Obtener el mayor valor del array e imprimir");
            System.out.println("Volver al Menu principal");
            opc=sc.nextInt();

            switch(opc){
                case 1:
                System.out.println("Ingrese los numeros para el array (numeros enteros)");
                for (int i=0;i<tam;i++) {
                    arr[i]=sc.nextInt();
                }
                break;

                case 2:
                aux=0;
                System.out.println("Numeros ordenados ascendentemente:");
                for(int i=0;i<tam;i++){
                    for(int j=0;j<tam;j++){
                        if(arr[i]>arr[j]){
                            aux=arr[i];
                            arr[i]=arr[j];
                            arr[j]=aux;
                        }
                    }
                }
                for(int i=0;i<tam;i++){
                    System.out.println(arr[i]+",");
                }
                break;

                case 3:
                aux=0;
                System.out.println("Numeros ordenados descendentemente:");
                aux=0;
                pos=0;
                for(int i=0;i<tam;i++){
                   if (arr[i]<aux) {
                        aux=arr[i];
                        pos=i;
                   }
                }
                for(int i=0;i<tam;i++){
                    System.out.println(arr[i]+",");
                }break;

                case 4:
                for(int i=0;i<tam;i++){
                    if (arr[i]>Nmayor) {
                    Nmayor=arr[i];
                    }
                }
                System.out.println("Numero mayor: "+Nmayor);
                break;
            }
        }
    }
}
