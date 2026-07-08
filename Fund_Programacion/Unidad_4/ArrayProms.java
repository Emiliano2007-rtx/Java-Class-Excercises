package Unidad_4;
import java.util.*;

public class ArrayProms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String noms [] = new String[5];
        double calfs[][] = new double[5][4];
        double proms [] = new double[5];

        System.out.println("Ingresa a los alumnos:");
        for (int i=0; i<5; i++) {
            System.out.println("Ingresa al alumno "+(i+1)+":");
            noms[i]=sc.next();
            for (int j=0; j<4; j++) {
                    System.out.println("Ingresa Calificacion:");
                    calfs[i][j]=sc.nextDouble();
            
                for (int x=0; x<5; x++) {
                    proms[i]+=calfs[i][j];
                }
            }
        }
        for (int i=0; i<5; i++) {
            System.out.println("Promedio: "+proms[i]/4);
        }
    }
}
