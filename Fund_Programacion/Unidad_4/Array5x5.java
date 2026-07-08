package Unidad_4;
import java.util.*;

public class Array5x5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int nums [][] = new int[5][5];
        int diag=0;

        System.out.println("Ingresa numeros:");
        for (int j=0; j<5; j++) {
            for (int i=0; i<5; i++) {
                nums[j][i]=sc.nextInt();
            }
        }

        for (int j=0; j<5; j++) { 
            int SmFila=0;
            for (int i=0; i<5; i++) {
                SmFila+=nums[j][i];
            }
            System.out.println("Suma fila "+(j+1)+":"+SmFila);
       }

       for (int j=0; j<5; j++) { 
            int SmCol=0;
            for (int i=0; i<5; i++) {
                SmCol+=nums[i][j];
            }
            System.out.println("Suma Columna "+(j+1)+":"+SmCol);
       }

       System.out.println("Diagonal Principal:");
       for (int i=0; i<5; i++) {
            diag=nums[i][i];
            System.out.println(diag);
       }

    }
}
