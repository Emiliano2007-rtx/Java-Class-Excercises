package Unidad_4;

import java.util.*;

public class ArrayPrimos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pri[] = new int[10];
        int totLeid = 0;
        int rech = 0;
        int sumRech = 0;
        int cont = 0;
        int mayPri = 0;

        while (cont < 10) {

            System.out.println("Ingrese un numero");
            int num = sc.nextInt();

            totLeid++;

            int esPri = 1;

            if (num <= 1) {
                esPri = 0;
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        esPri = 0;
                        break;
                    }
                }
            }

            if (esPri == 1) {

                pri[cont] = num;
                cont++;

                if (num > mayPri) {
                    mayPri = num;
                }

            } else {
                rech++;
                sumRech += num;
            }
        }

        System.out.println("Total leidos: " + totLeid);
        System.out.println("Rechazados: " + rech);
        System.out.println("Mayor primo: " + mayPri);
        System.out.println("Suma rechazados: " + sumRech);
    }
}
