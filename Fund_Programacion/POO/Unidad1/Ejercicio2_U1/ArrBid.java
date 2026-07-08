package POO.Unidad1.Ejercicio2_U1;

import java.util.Scanner;

public class ArrBid {
    public void menu2() {
    Scanner sc = new Scanner(System.in);

    int aux, opcion = 0, cols = 0, filas = 0;
    String sopcion = "", scols = "", sfilas = "";
    boolean filasOk = false, colsOk = false;

    do {
        System.out.println("Ingrese el numero de filas");
        sfilas = sc.next();

        System.out.println("Ingrese el numero de columnas");
        scols = sc.next();

        try {
            filas = Integer.parseInt(sfilas);
            filasOk = true;
        } catch (NumberFormatException e) {
            System.out.println("Error: Dato de filas no valido");
        }

        try {
            cols = Integer.parseInt(scols);
            colsOk = true;
        } catch (NumberFormatException e) {
            System.out.println("Error: Dato de columnas no valido");
        }

        if ((filasOk && !colsOk) || (!filasOk && colsOk)) {
            filasOk = false;
            colsOk = false;
        }

    } while (!filasOk && !colsOk);

    int[][] matriz = new int[filas][cols];

    do {
        System.out.println("\n*** MENU ARRAY BIDIMENSIONAL ***");
        System.out.println("1. Llenar el array");
        System.out.println("2. Buscar e imprimir el mayor y menor valor y su posicion");
        System.out.println("3. Volver al menu principal");
        System.out.print("Elige una opcion: ");

        sopcion = sc.next();

        try {
            opcion = Integer.parseInt(sopcion);

            switch (opcion) {

                case 1:
                    int col = 0, fila = 0, num;
                    String snum;

                    do {
                        System.out.println("Fila " + (fila + 1) + " Columna " + (col + 1));
                        System.out.println("Ingrese un numero entero");
                        snum = sc.next();

                        try {
                            num = Integer.parseInt(snum);
                            if (num % 2 == 0) {
                                matriz[fila][col] = num;
                                fila++;
                                if (fila == filas) {
                                    fila = 0;
                                    col++;
                                }
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("No es un numero entero");
                        }

                    } while (col < cols);
                    break;

                case 2:
                    int mayor = matriz[0][0], menor = matriz[0][0];
                    int filaMay = 0, colMay = 0, filaMen = 0, colMen = 0;

                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < cols; j++) {

                            if (matriz[i][j] < menor) {
                                menor = matriz[i][j];
                                filaMen = i;
                                colMen = j;
                            }

                            if (matriz[i][j] > mayor) {
                                mayor = matriz[i][j];
                                filaMay = i;
                                colMay = j;
                            }
                        }
                    }

                    System.out.println("Mayor valor: " + mayor +
                            ". Fila: " + (filaMay + 1) +
                            ", Columna: " + (colMay + 1));

                    System.out.println("Menor valor: " + menor +
                            ". Fila: " + (filaMen + 1) +
                            ", Columna: " + (colMen + 1));
                    break;
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese un dato valido");
        }

    } while (opcion != 3);
}

}
