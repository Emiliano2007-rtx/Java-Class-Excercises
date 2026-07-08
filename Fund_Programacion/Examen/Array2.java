package Examen;
import java.util.*;

public class Array2 {
    public void Array2(){
        Scanner sc = new Scanner(System.in);

        int arr [] = new int[10];

        String num;
        int numInt;
        int numsleidos=0;

            System.out.println("Ingresa numeros:");
            for(int i=0;i<10;i++){
            while (true) {
                num=sc.next();
                try{
                    numInt=Integer.parseInt(num);
                    numsleidos++;
                    
                    if(numInt%2!=0){
                        arr[i] = numInt;
                        break;  
                    }else{
                        System.out.println("Solo impares");
                    }

                    }catch(Exception e){
                        System.out.println("No es un numero entero");

                    }    
                        
                }
            }
          
        int opc=0;

        while (opc!=5) {
            System.out.println("1.Imprimir cuantos numeros se leyeron en total");
            System.out.println("2.Imprimir el dato menor almacenado y su posicion");
            System.out.println("3.Imprimir el arreglo ordenado ascendentemente y el original");
            System.out.println("4.Imprimir el factorial del numero mayor");
            System.out.println("5.Regresar al menu principal");
            opc=sc.nextInt();

            switch(opc) {

                case 1:
                    System.out.println("Leidos:"+numsleidos);
                break;

                case 2:
                    int Nmenor=1000000;
                    for(int i=0;i<10;i++){
                        if(arr[i]<Nmenor){
                            Nmenor=arr[i];
                        }
                    }          
                    System.out.println("Numero menor:"+Nmenor);
                break;    

                case 3:
                int aux=0;
                System.out.println("Numeros ordenados ascendentemente:");
                for(int i=0;i<10;i++){
                    for(int j=1;j<10;j++){
                        if(arr[i]>arr[j]){
                            aux=arr[i];
                            arr[i]=arr[j];
                            arr[j]=aux;
                        }
                    }
                }

                for(int i=0;i<10;i++){
                    System.out.println(arr[i]+",");
                }
                break;

                case 4:
                    
                break;   
            }
         }
       }
    }

