package Unidad_4;
import java.util.*;

public class ArrayBidimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String noms [] = new String[5];
        double calfs[][] = new double[5][4];
        double proms [] = new double[5];

        for (int x = 0; x < 5; x++) {
            System.out.println("Dame el nombre");
            noms[x]=sc.next();

            for (int y = 0; y < 4; y++) {
                System.out.println("Ingresa su calificacion");
                calfs[x][y]=sc.nextDouble();

                for (int i = 0; i < 5; i++) {
                    proms[i]=proms[i]+calfs[x][y];
                }
            }
        }
        for (int i = 0; i<5; i++) {
             System.out.println("Nombre: "+noms[i]);
        }
        for (int i = 0; i<4; i++) {
             System.out.println("Promedio: "+proms[i]/4);
        }

    }
}
