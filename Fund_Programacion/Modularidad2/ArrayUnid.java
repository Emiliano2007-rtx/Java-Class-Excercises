package Modularidad2;
import java.util.*;


public class ArrayUnid {
    public void menuUnid() {

        Scanner sc = new Scanner(System.in);
        int tam;
        int Nment;

        System.out.println("Cuantos lugares quieres para el array?");
        tam=sc.nextInt();

        int nums [] = new int[tam];
        int opc=0;
        String numero;


        while (opc!=5) {
            System.out.println("1.Llenar array con numeros enteros");
            System.out.println("2.Identificar los datos primos e imprimir la posicion en la que estan");
            System.out.println("3.Identificar el numero mayor almacenado e imprimir su fibonacci");
            System.out.println("4.Ordenar ascendentemente los datos e imprimir: El array ordenado y el original");
            System.out.println("5.Regresar al menu principal");
            opc=sc.nextInt();
        
        switch (opc) {
            
        case 1:
        for(int i=0;i<tam;i++){
            System.out.println("Ingresa numeros enteros: ");
            numero=sc.next();

            try{
                Nment=Integer.parseInt(numero);
                nums[i]=Nment;

            }catch(Exception e){
                System.out.println("El numero no es entero");
            }
        }

        break;

        case 2:
            for(int i=0;i<=nums.length;i++){

                int prim=0;
                int nprim=0;
                int pos=0;
                
            for(int j=1;j<=nums[i];j++){
                if(nums[i]%j==0){
                    prim++;
                    nprim=nums[i];
                } 
               }
              if(prim==2){
                System.out.println("Es primo: "+nprim);

              if(nums[i]==nprim){
                pos=i;
                System.out.println("Posicion: "+i);
               }
              }
           }
       break;

       case 3:
        int suma,n1=0,n2=1;
        int Nmay=0;
          for(int i=0;i<nums.length;i++){
             if(nums[i]>Nmay){
                Nmay=nums[i];
             }
          }
          System.out.println("El mayor es: "+Nmay);

          while (n2<=Nmay) {
            suma=n1+n2;
            n1=n2;
            n2=suma;
            
            if(n2<=Nmay){
               System.out.println(n2);    
            } 
          }

       break;

       case 4:
          int aux=0;

          System.out.println("Array Original:");
          for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
          }

          for (int i=0;i<nums.length;i++) {
            for (int j=1;j<nums.length;j++) {
                if (nums[j]>nums[i]){
                    aux=nums[i];
                    nums[i]=nums[j];
                    nums[j]=aux;
                 }
            }
        }

        for(int i=0;i<nums.length;i++){
          System.out.println("Numeros Ordenados: "+nums[i]);
        }
        break; 
      } 
     }
    }
   }

