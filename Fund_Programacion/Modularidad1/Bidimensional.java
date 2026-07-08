package Modularidad1;
import java.util.*;

public class Bidimensional {
    public void menuB(){
        Scanner sc = new Scanner(System.in);

        int Nfilas=0;
        int Ncols=0;
        int Nmayor=0;
        int posicion=0;
        int posF=0;
        int posC=0;

        System.out.println("Cuantas Filas quieres?");
        Nfilas=sc.nextInt();

        System.out.println("Cuantas columnas quieres?");
        Ncols=sc.nextInt();

        int nums [][] = new int[Nfilas][Ncols];
        int opc=0;

        while (opc!=5) {
            System.out.println("Submenu Bidimensional:");
            System.out.println("1.Llenar Array");
            System.out.println("2.Buscar el mayor su posicion e imprimir");
            System.out.println("3.Sumar elementos de filas pares por separado e imprimir");
            System.out.println("4.Sumar elementos de columnas impares por separado e imprimir");
            System.out.println("5.Volver al menu principal");

            opc=sc.nextInt();

            switch (opc) {
                case 1:
                for(int i=0;i<Nfilas;i++){
                    for(int j=0;j<Ncols;j++){
                        System.out.println("Llena el Array: ");
                        nums[i][j]=sc.nextInt();
                    }
                }
                break;

                case 2:
                    for(int i=0;i<Nfilas;i++){
                    
                        for(int j=0;j<Ncols;j++){
                        
                            if (nums[i][j]>Nmayor) {
                                 Nmayor=nums[i][j];
                            }
                            if (nums[i][j]==Nmayor) {
                                posF=i;
                                posC=j;
                            }
                      }
            }
                System.out.println("Posicion: "+posF+","+posC);
                System.out.println("Numero mayor: "+Nmayor);
                break;

                case 3:
                    for (int i = 0; i < Nfilas; i++) {
                        if (i % 2 == 0) {
                            int sumF = 0;
                            for (int j = 0; j < Ncols; j++) {
                                sumF += nums[i][j];
                            }
                            System.out.println("Suma fila " + i + ": " + sumF);
                        }
                    }
                break;

                case 4:
                     for (int j = 0; j < Ncols; j++) {
                        if (j % 2 != 0) {
                            int sumC = 0;
                            for (int i = 0; i < Nfilas; i++) {
                                sumC += nums[i][j];
                            }
                            System.out.println("Suma columna " + j + ": " + sumC);
                        }
                    }
                break;
            }
        }
    }
}
