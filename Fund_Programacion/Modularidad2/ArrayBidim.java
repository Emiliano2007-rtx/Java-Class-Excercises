package Modularidad2;
import java.util.*;
public class ArrayBidim {
    public void menuBidim(){
        Scanner sc = new Scanner(System.in);

        int tamF=0;
        int tamC=0;

        System.out.println("Ingresa el numero de filas del Array:");
        tamF=sc.nextInt();

        System.out.println("Ingresa el numero de columnas del Array:");
        tamC=sc.nextInt();

        int nums [][] = new int[tamF][tamC];

        int opc=0;
    

        while (opc!=5) {
            System.out.println("1.Llenar el Array con numeros enteros pares");
            System.out.println("2.Imprimir la suma de los elementos de la diagonal principal");
            System.out.println("3.Imprimir la cantidad de elementos que se rechazaron (numericos y no numericos)");
            System.out.println("4.Promedio General de los elementos almacenados en el Array");
            System.out.println("5.Regresar al menu principal");
            opc=sc.nextInt();

        
            
            
            switch (opc) {

                case 1:
                String num;
                int numInt;

                    System.out.println("Ingresa numeros:");
                    for(int i=0;i<tamF;i++){
                        for(int j=0;j<tamC;j++){
                            num=sc.next();

                        try{
                            numInt=Integer.parseInt(num);
                            if(numInt%2==0){
                                nums[i][j] = numInt;
                            }else{
                                System.out.println("No es par");
                            }
                        }catch(Exception e){
                            System.out.println("No es un numero entero");
                        }    
                        
                        }
                    }

                break;


                case 2:
                     if(tamF == tamC){
                            int Sumdiag=0;

                            for(int i=0;i<tamF;i++){
                                Sumdiag+=nums[i][i];
                            }
                            System.out.println("Suma diagonal: "+Sumdiag);

                        } 
                        else {
                            System.out.println("No hay diagonal");
                        }
                                    
                break;


                case 3:
                int NoNumR=0;
                    for(int i=0;i<tamF;i++){
                        for(int j=0;j<tamC;j++){
                            if(nums[i][j]==0){
                                NoNumR++;
                            }
                        }
                    }

                    System.out.println("Elementos totales rechazados: " + NoNumR);

                break;    

                case 4:
                    double PromTot=0;

                    for(int i=0;i<tamF;i++){
                        for(int j=0;j<tamC;j++){
                            PromTot += nums[i][j];
                        }
                    }
                    
                    System.out.println("Promedio Total: " + PromTot/nums.length);
                break;
            }
        }
    }
}
