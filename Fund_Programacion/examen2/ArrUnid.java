package examen2;
import java.util.*;

public class ArrUnid {
    public void ArrUnid(){
        Scanner sc = new Scanner(System.in);

        int tam;

        System.out.println("Ingresa el tamano del array");
        tam=sc.nextInt();

        int arr [] = new int[tam];

        String num;
        int numInt;

            System.out.println("Ingresa numeros:");
            for(int i=0;i<arr.length;i++){
            while (true) {
                num=sc.next();
                try{
                    numInt=Integer.parseInt(num);
                    
                    if(numInt%2==0){
                        arr[i] = numInt;
                        break;  
                    }else{
                        System.out.println("No es par");
                    }

                    }catch(Exception e){
                        System.out.println("No es un numero entero");

                    }    
                        
               }
           }

           int opc = 0;

           while (opc!=5) {
                System.out.println("1.Imprimir el array ordenado descendentemente, asi como el array original");
                System.out.println("2.Imprimir el factorial del mayor dato almacenado");
                System.out.println("3.Imprimir el promedio de los datos almacenados");
                System.out.println("4.Imprimir los primos almacenados en el array ordenados de menor a mayor");
                System.out.println("5.Regresar al menu principal");
                opc=sc.nextInt();

                switch(opc){
                    case 1:
                    System.out.println("Array Original:");

                    for(int i=0;i<arr.length;i++){
                        System.out.println(arr[i]);
                    }

                        int aux=0;
                        System.out.println("Numeros ordenados descendentemente");

                        for(int i=0; i<arr.length;i++){
                            for(int j=i+1;j<arr.length;j++){
                                if(arr[i]<arr[j]){
                                    aux=arr[i];
                                    arr[i]=arr[j];
                                    arr[j]=aux;
                                }
                            }
                        }
                        for(int i=0;i<arr.length;i++){
                            System.out.println(arr[i]);
                        }
                    break;

                    case 2:
                        int nmayor=0;
                        for(int i=0; i<arr.length;i++){
                            if (arr[i]>nmayor) {
                                nmayor=arr[i];
                            }
                        }
                        int facto=1;

                        for(int i=1; i<=nmayor;i++){
                            facto=facto*i;
                        }

                        System.out.println("El numero mayor es:"+nmayor);
                        System.out.println("Su factorial es:"+facto);

                    break;

                    case 3:
                        int prom=0;
                        for(int i=0;i<arr.length;i++){
                            prom = prom + arr[i];
                        }

                        System.out.println("Promedio de los datos en el array:"+prom/arr.length);
                    break;

                    
                    case 4:
                        System.out.println("Primos ordenados de menor a mayor:");

                        int nprims [] = new int[arr.length];
                        int cont=0;

                        for(int i=0;i<arr.length;i++){
                            int nume = arr[i];
                            int divs = 0;

                            for(int j=1;j<=nume;j++){
                                if (nume%j==0) {
                                    divs++;
                                }
                            }

                            if (divs==2) {
                                nprims[cont]=nume;
                                cont++;
                            }
                        }

                        int auxi=0;

                        for(int i=0; i<cont;i++){
                            for(int j=i+1;j<cont;j++){
                                if(nprims[i]<nprims[j]){
                                    aux=nprims[i];
                                    nprims[i]=nprims[j];
                                    nprims[j]=aux;
                                }
                            }
                        }
                        for(int i=0;i<cont;i++){
                            System.out.println(nprims[i]);
                        }
                    break;
                }

           }

    }
}
