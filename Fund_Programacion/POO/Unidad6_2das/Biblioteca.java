
package POO.Unidad6_2das;

import java.io.*;
import java.util.*;

public class Biblioteca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc = 0;

        File arch = new File("POO\\Unidad6_2das\\biblioteca.txt");

        try {
            if (!arch.exists()) {
                arch.createNewFile();
                System.out.println("Archivo creado con exito");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo we");
        }

        while (opc != 5) {

            System.out.println("\nBIBLIOTECA");
            System.out.println("1. Registrar Libros");
            System.out.println("2. Consultar Libros");
            System.out.println("3. Modificar Datos");
            System.out.println("4. Eliminar Datos");
            System.out.println("5. Finalizar Ejecucion");

            try {

                opc = Integer.parseInt(sc.next());

                switch (opc) {

                    case 1:

                        sc.nextLine();

                        String codigoL, titulo, autor, anio, editorial;
                        boolean repetido;

                        FileWriter fw = new FileWriter(arch, true);

                        System.out.println("\nREGISTRO DE LIBROS");

                        while (true) {

                            repetido = false;

                            System.out.print("Codigo del libro (6 digitos): ");
                            codigoL = sc.nextLine();

                            Scanner leer = new Scanner(arch);

                            while (leer.hasNextLine()) {

                                String linea = leer.nextLine();

                                if (!linea.isEmpty()) {

                                    String datos[] = linea.split(",");

                                    if (datos[0].equals(codigoL)) {
                                        repetido = true;
                                        break;
                                    }
                                }
                            }

                            leer.close();

                            if (!codigoL.matches("[0-9]{6}")) {
                                System.out.println("Codigo no valido");
                            } else if (repetido) {
                                System.out.println("Codigo repetido");
                            } else {
                                break;
                            }
                        }

                        while (true) {
                            System.out.print("Titulo: ");
                            titulo = sc.nextLine();

                            if (titulo.matches("[a-zA-Z ]+")) {
                                break;
                            }

                            System.out.println("Titulo no valido");
                        }

                        while (true) {
                            System.out.print("Autor: ");
                            autor = sc.nextLine();

                            if (autor.matches("[a-zA-Z ]+")) {
                                break;
                            }

                            System.out.println("Autor no valido");
                        }

                        while (true) {
                            System.out.print("Año: ");
                            anio = sc.nextLine();

                            if (anio.matches("[0-9]{4}")) {
                                break;
                            }

                            System.out.println("Año no valido");
                        }

                        while (true) {
                            System.out.print("Editorial: ");
                            editorial = sc.nextLine();

                            if (editorial.matches("[a-zA-Z ]+")) {
                                break;
                            }

                            System.out.println("Editorial no valida");
                        }

                        fw.write(codigoL + "," + titulo + "," + autor + "," + anio + "," + editorial + "\n");
                        fw.close();

                        System.out.println("Libro registrado");
                        break;

                    case 2:

                        if (arch.length() == 0) {
                            System.out.println("No hay registros");
                            break;
                        }

                        System.out.println("\n1. Consultar todo");
                        System.out.println("2. Buscar por codigo");

                        int op = sc.nextInt();

                        if (op == 1) {

                            Scanner leer = new Scanner(arch);

                            while (leer.hasNextLine()) {

                                String datos[] = leer.nextLine().split(",");

                                System.out.println("-------------------------");
                                System.out.println("Codigo: " + datos[0]);
                                System.out.println("Titulo: " + datos[1]);
                                System.out.println("Autor: " + datos[2]);
                                System.out.println("Año: " + datos[3]);
                                System.out.println("Editorial: " + datos[4]);
                            }

                            leer.close();

                        } else if (op == 2) {

                            sc.nextLine();

                            System.out.print("Codigo a buscar: ");
                            String codigoBuscar = sc.nextLine();

                            boolean encontrado = false;

                            Scanner leer = new Scanner(arch);

                            while (leer.hasNextLine()) {

                                String datos[] = leer.nextLine().split(",");

                                if (datos[0].equals(codigoBuscar)) {

                                    System.out.println("-------------------------");
                                    System.out.println("Codigo: " + datos[0]);
                                    System.out.println("Titulo: " + datos[1]);
                                    System.out.println("Autor: " + datos[2]);
                                    System.out.println("Año: " + datos[3]);
                                    System.out.println("Editorial: " + datos[4]);

                                    encontrado = true;
                                }
                            }

                            leer.close();

                            if (!encontrado) {
                                System.out.println("Libro no encontrado");
                            }
                        }

                        break;

                    case 3:

                        sc.nextLine();

                        System.out.print("Codigo del libro a modificar: ");
                        String codigoModificar = sc.nextLine();

                        File tempMod = new File("POO\\Unidad6_2das\\temp.txt");

                        Scanner leerMod = new Scanner(arch);
                        FileWriter escribirMod = new FileWriter(tempMod);

                        boolean modificado = false;

                        while (leerMod.hasNextLine()) {

                            String linea = leerMod.nextLine();
                            String datos[] = linea.split(",");

                            if (datos[0].equals(codigoModificar)) {

                                modificado = true;

                                System.out.print("Nuevo titulo: ");
                                String nuevoTitulo = sc.nextLine();

                                System.out.print("Nuevo autor: ");
                                String nuevoAutor = sc.nextLine();

                                System.out.print("Nuevo año: ");
                                String nuevoAnio = sc.nextLine();

                                System.out.print("Nueva editorial: ");
                                String nuevaEditorial = sc.nextLine();

                                escribirMod.write(
                                        codigoModificar + "," +
                                        nuevoTitulo + "," +
                                        nuevoAutor + "," +
                                        nuevoAnio + "," +
                                        nuevaEditorial + "\n");
                            } else {

                                escribirMod.write(linea + "\n");
                            }
                        }

                        leerMod.close();
                        escribirMod.close();

                        arch.delete();
                        tempMod.renameTo(arch);

                        if (modificado) {
                            System.out.println("Registro modificado");
                        } else {
                            System.out.println("Libro no encontrado");
                        }

                        break;

                    case 4:

                        sc.nextLine();

                        System.out.print("Codigo del libro a eliminar: ");
                        String codigoEliminar = sc.nextLine();

                        File tempElim = new File("POO\\Unidad6_2das\\temp.txt");

                        Scanner leerElim = new Scanner(arch);
                        FileWriter escribirElim = new FileWriter(tempElim);

                        boolean eliminado = false;

                        while (leerElim.hasNextLine()) {

                            String linea = leerElim.nextLine();
                            String datos[] = linea.split(",");

                            if (datos[0].equals(codigoEliminar)) {

                                eliminado = true;

                            } else {

                                escribirElim.write(linea + "\n");
                            }
                        }

                        leerElim.close();
                        escribirElim.close();

                        arch.delete();
                        tempElim.renameTo(arch);

                        if (eliminado) {
                            System.out.println("Registro eliminado");
                        } else {
                            System.out.println("Libro no encontrado");
                        }

                        break;

                    default:
                        System.out.println("Opcion no valida");
                }

            } catch (Exception e) {

                System.out.println("Error, ingresa una opcion valida");
                sc.nextLine();
            }
        }

        sc.close();
    }
}

