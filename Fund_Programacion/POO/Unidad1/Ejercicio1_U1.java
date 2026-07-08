package POO.Unidad1;

import java.util.Scanner;

public class Ejercicio1_U1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = 0;
    int total = 0;
    int divs;
    int idx = 0;
    int opc = 0;

    int[] primos = new int[10];

    do {
        divs = 0;

        System.out.println("Ingrese un numero primo");
        num = sc.nextInt();

        for (int d = 1; d <= num; d++) {
            if (num % d == 0) {
                divs++;
            }
        }

        if (divs <= 2) {
            primos[idx] = num;
            idx++;
            total++;
        }

    } while (total < 10);

    System.out.println("El arreglo esta lleno");

    do {
        System.out.println("\n*** MENU ***");
        System.out.println("1. Imprimir la lista ordenada de mayor a menor");
        System.out.println("2. Imprimir la lista original de datos ingresados");
        System.out.println("3. Imprimir el mayor elemento almacenado en la lista");
        System.out.println("4. Finalizar ejecucion");
        System.out.print("Seleccione una opcion: ");

        opc = sc.nextInt();

        switch (opc) {

            case 1:
                int[] orden = new int[10];
                int aux;

                for (int i = 0; i < 10; i++) {
                    orden[i] = primos[i];
                }

                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (orden[i] < orden[j]) {
                            aux = orden[i];
                            orden[i] = orden[j];
                            orden[j] = aux;
                        }
                    }
                }

                System.out.println("Array ordenado de mayor a menor:");
                for (int i = 0; i < 10; i++) {
                    System.out.println("Pos: " + (i + 1) + ": " + orden[i]);
                }
                break;

            case 2:
                System.out.println("Array original:");
                for (int i = 0; i < 10; i++) {
                    System.out.println("Pos: " + (i + 1) + ": " + primos[i]);
                }
                break;

            case 3:
                int mayor = primos[0];
                int pos = 0;

                for (int i = 1; i < 10; i++) {
                    if (primos[i] > mayor) {
                        mayor = primos[i];
                        pos = i;
                    }
                }

                System.out.println("Mayor elemento: " + mayor + " | Pos: " + (pos + 1));
                break;
        }

    } while (opc != 4);
}

}
