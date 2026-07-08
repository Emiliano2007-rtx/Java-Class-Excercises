package Unidad_4;

import java.util.*;

public class Array10pos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nums[] = new int[10];
        int copia[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el valor " + (i+1));
            nums[i] = sc.nextInt();
            copia[i] = nums[i];
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println("Ordenado de menor a mayor:");
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("Ordenado de mayor a menor:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\nArreglo original:");
        for (int i = 0; i < 10; i++) {
            System.out.print(copia[i] + " ");
        }
    }
}