package POO.Unidad1.Ejercicio2_U1;

import java.util.Scanner;

public class ArrUnid {

    public void menu1() {
    Scanner sc = new Scanner(System.in);

    int opcion = 0, aux, tam = 0, cont;
    String sopcion = "", stam = "";
    boolean tamOk = false;

    do {
        System.out.println("\nIngresa el tamaño del array (numero entero)");
        stam = sc.next();
        try {
            tam = Integer.parseInt(stam);
            tamOk = true;
        } catch (NumberFormatException e) {
            System.out.println("No es un numero entero, intente de nuevo");
        }
    } while (!tamOk);

    int[] nums = new int[tam];

    do {
        System.out.println("\n*** MENU ARRAY UNIDIMENSIONAL ***");
        System.out.println("1. Llenar array");
        System.out.println("2. Buscar e imprimir el mayor y menor valor y su posicion");
        System.out.println("3. Salir al menu principal");
        System.out.print("Elige una opcion: ");

        sopcion = sc.next();

        try {
            opcion = Integer.parseInt(sopcion);

            switch (opcion) {
                case 1:
                    cont = 0;
                    String snum;
                    int num;

                    do {
                        System.out.println("Ingrese un numero entero");
                        snum = sc.next();
                        try {
                            num = Integer.parseInt(snum);
                            nums[cont] = num;
                            cont++;
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Ingrese un numero entero. Intente de nuevo");
                        }
                    } while (cont < tam);
                    break;

                case 2:
                    int mayor = nums[0], menor = nums[0];
                    int posMay = 0, posMen = 0;

                    for (int i = 0; i < tam; i++) {
                        if (nums[i] < menor) {
                            menor = nums[i];
                            posMen = i;
                        }
                        if (nums[i] > mayor) {
                            mayor = nums[i];
                            posMay = i;
                        }
                    }

                    System.out.println("Mayor valor: " + mayor + ", Posicion: " + (posMay + 1));
                    System.out.println("Menor valor: " + menor + ", Posicion: " + (posMen + 1));
                    break;
            }

        } catch (NumberFormatException e) {
            System.out.println("No es una opcion valida, intente de nuevo");
        }

    } while (opcion != 3);
}


}

