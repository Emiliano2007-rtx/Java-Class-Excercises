package Crud_Inventario;

import java.util.*;

public class main {

    static Scanner sc = new Scanner(System.in);

    static String producto[] = new String[100];
    static int cantidad[] = new int[100];
    static int precio[] = new int[100];

    public static void AddProducto() {
        int cantP = 0;
        int salir = 0;

        System.out.println("Cuantos productos deseas agregar ? :");
        cantP = sc.nextInt();

        for (int i = 0; i < cantP; i++) {
            System.out.println("Ingresa producto:");
            producto[i] = sc.next();

            System.out.println("Ingresa cantidad:");
            cantidad[i] = sc.nextInt();

            System.out.println("Ingresa precio:");
            precio[i] = sc.nextInt();

            System.out.println("Salir: (1)  Continuar: (Ingrese cualquier numero)");
            salir = sc.nextInt();

            if (salir == 1) {
                System.out.println("Saliendo...");
                break;
            }
        }
    }

    public static void ReadProducto() {
        for (int i = 0; i < producto.length; i++) {
            System.out.println(producto[i] + ": " + " stock: " + cantidad[i] + " costo: " + precio[i]);

            if (producto[i + 1] == null) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opc = 0;
        System.out.println("Sistema de Inventario");

        while (opc != 5) {
            System.out.println("1.Agregar Producto");
            System.out.println("2.Mostrar Productos");
            System.out.println("3.Buscar Producto");
            System.out.println("4.Editar Producto");
            System.out.println("5.Eliminar Producto");
            opc = sc.nextInt();

            switch (opc) {

                case 1:
                    AddProducto();
                    break;

                case 2:
                    ReadProducto();
                    break;
                case 3:

                    break;
            }
        }
    }
}
