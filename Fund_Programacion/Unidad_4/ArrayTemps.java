package Unidad_4;

import java.util.*;

public class ArrayTemps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String est[] = new String[5];
        int tMen[] = new int[5];
        int tMay[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre del estado " + (i+1));
            est[i] = sc.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Temp menor de " + est[i]);
            tMen[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Temp mayor de " + est[i]);
            tMay[i] = sc.nextInt();
        }

        int men = tMen[0];
        int posMen = 0;

        for (int i = 1; i < 5; i++) {
            if (tMen[i] < men) {
                men = tMen[i];
                posMen = i;
            }
        }

        int may = tMay[0];
        int posMay = 0;

        for (int i = 1; i < 5; i++) {
            if (tMay[i] > may) {
                may = tMay[i];
                posMay = i;
            }
        }

        int sumMen = 0;
        int sumMay = 0;

        for (int i = 0; i < 5; i++) {
            sumMen += tMen[i];
            sumMay += tMay[i];
        }

        System.out.println("Estado con menor temp: " + est[posMen]);
        System.out.println("Estado con mayor temp: " + est[posMay]);
        System.out.println("Promedio menor: " + (sumMen / 5.0));
        System.out.println("Promedio mayor: " + (sumMay / 5.0));
    }
}