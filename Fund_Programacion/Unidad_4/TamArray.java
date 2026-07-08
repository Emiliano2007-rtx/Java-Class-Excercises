package Unidad_4;
import java.util.*;

public class TamArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int TamArray;

        System.out.println("Ingrese el tamaño del arreglo");
        TamArray = sc.nextInt();

        int nums[] = new int[TamArray];
        int Nmayor = 0;
        int Nmenor = 0;

        for (int i = 0; i < TamArray; i++) {
            System.out.println("Ingrese el valor " + (i+1));
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < TamArray; i++) {
            if (i == 0) {
                Nmayor = nums[i];
            }
            if (nums[i] > Nmayor) {
                Nmayor = nums[i];
            }
        }

        for (int i = 0; i < TamArray; i++) {
            if (i == 0) {
                Nmenor = nums[i];
            }
            if (nums[i] < Nmenor) {
                Nmenor = nums[i];
            }
        }

        System.out.println("Numero mayor: " + Nmayor);
        System.out.println("Numero menor: " + Nmenor);
        System.out.println("Diferencia: " + (Nmayor - Nmenor));

        System.out.println("Elementos del arreglo:");
        for (int i = 0; i < TamArray; i++) {
            System.out.print(nums[i]);
        }
    }
}