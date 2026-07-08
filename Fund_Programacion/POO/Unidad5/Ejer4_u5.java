package POO.Unidad5;

import java.util.*;
import java.io.*;

public class Ejer4_u5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opc = 0;

        while (opc != 14) {

            System.out.println("\n1) Valor imposible de convertir");
            System.out.println("2) Fondos insuficientes");
            System.out.println("3) Archivo no encontrado");
            System.out.println("4) Numero de control duplicado");
            System.out.println("5) Domicilio faltante");
            System.out.println("6) Pregunta con temporizador");
            System.out.println("7) Calificacion fuera de rango");
            System.out.println("8) Verificacion de contraseña");
            System.out.println("9) Producto inexistente");
            System.out.println("10) Habitacion ocupada");
            System.out.println("11) Asiento ocupado");
            System.out.println("12) Carrito vacio");
            System.out.println("13) Deposito negativo");
            System.out.println("14) Salir");
            System.out.print("Opcion: ");

            opc = sc.nextInt();

            switch (opc) {

                case 1:

                    String numS;
                    int num;

                    try {

                        System.out.print("Convertir a entero: ");
                        numS = sc.next();

                        num = Integer.parseInt(numS);

                        System.out.println("Valor convertido: " + num);

                    } catch (Exception e) {

                        System.out.println("Valor imposible de convertir");
                    }

                    break;

                case 2:

                    int lana = 5000;
                    int retirar;

                    try {

                        System.out.print("Retirar: ");
                        retirar = sc.nextInt();

                        if (retirar > lana) {
                            throw new IllegalArgumentException();
                        }

                        lana = lana - retirar;

                        System.out.println("Saldo actual: " + lana);

                    } catch (IllegalArgumentException e) {

                        System.out.println("Fondos insuficientes");
                    }

                    break;

                case 3:

                    try {

                        FileReader leer = new FileReader("Archivo.txt");

                        System.out.println("Archivo encontrado");

                    } catch (FileNotFoundException e) {

                        System.out.println("Archivo no encontrado");
                    }

                    break;

                case 4:

                    ArrayList<String> control = new ArrayList<>();

                    control.add("22110001");
                    control.add("22110002");

                    try {

                        System.out.print("Numero de control: ");
                        String numC = sc.next();

                        if (control.contains(numC)) {
                            throw new IllegalArgumentException();
                        }

                        control.add(numC);

                        System.out.println("Alumno registrado");

                    } catch (IllegalArgumentException e) {

                        System.out.println("Numero de control duplicado");
                    }

                    break;

                case 5:

                    sc.nextLine();

                    try {

                        System.out.print("Domicilio: ");
                        String dom = sc.nextLine();

                        if (dom.isEmpty()) {
                            throw new Exception();
                        }

                        System.out.println("Domicilio registrado");

                    } catch (Exception e) {

                        System.out.println("Domicilio faltante");
                    }

                    break;

                case 6:

                sc.nextLine();

                    try {

                        System.out.println("¿Capital de Mexico?");
                        System.out.println("Tienes 5 segundos");

                        Thread.sleep(5000);

                        System.out.print("Respuesta: ");
                        String resp = sc.nextLine();

                        throw new Exception();

                    } catch (Exception e) {

                        System.out.println("Tiempo agotado");
                    }

                    break;

                case 7:

                    try {

                        System.out.print("Calificacion: ");
                        int cal = sc.nextInt();

                        if (cal < 0 || cal > 100) {
                            throw new IllegalArgumentException();
                        }

                        System.out.println("Calificacion valida");

                    } catch (IllegalArgumentException e) {

                        System.out.println("Calificacion fuera de rango");
                    }

                    break;

                case 8:

                    sc.nextLine();

                    try {

                        System.out.print("Contraseña: ");
                        String pass = sc.nextLine();

                        if (!pass.equals("admin123")) {
                            throw new Exception();
                        }

                        System.out.println("Contraseña correcta");

                    } catch (Exception e) {

                        System.out.println("Contraseña incorrecta");
                    }

                    break;

                case 9:

                    ArrayList<String> lista = new ArrayList<>();

                    lista.add("Mouse");
                    lista.add("Teclado");
                    lista.add("Monitor");

                    sc.nextLine();

                    try {

                        System.out.print("Producto: ");
                        String prod = sc.nextLine();

                        if (!lista.contains(prod)) {
                            throw new Exception();
                        }

                        System.out.println("Producto agregado");

                    } catch (Exception e) {

                        System.out.println("Producto inexistente");
                    }

                    break;

                case 10:

                    int habO = 5;

                    try {

                        System.out.print("Habitacion: ");
                        int hab = sc.nextInt();

                        if (hab == habO) {
                            throw new Exception();
                        }

                        System.out.println("Habitacion reservada");

                    } catch (Exception e) {

                        System.out.println("Habitacion ocupada");
                    }

                    break;

                case 11:

                    int asientoO = 10;

                    try {

                        System.out.print("Asiento: ");
                        int asiento = sc.nextInt();

                        if (asiento == asientoO) {
                            throw new Exception();
                        }

                        System.out.println("Asiento reservado");

                    } catch (Exception e) {

                        System.out.println("Asiento ocupado");
                    }

                    break;

                case 12:

                    ArrayList<String> carrito = new ArrayList<>();

                    try {

                        if (carrito.isEmpty()) {
                            throw new Exception();
                        }

                        System.out.println("Pago realizado");

                    } catch (Exception e) {

                        System.out.println("Carrito vacio");
                    }

                    break;

                case 13:

                    try {

                        System.out.print("Depositar: ");
                        double depo = sc.nextDouble();

                        if (depo < 0) {
                            throw new IllegalArgumentException();
                        }

                        System.out.println("Deposito exitoso");

                    } catch (IllegalArgumentException e) {

                        System.out.println("Deposito negativo");
                    }

                    break;

                case 14:

                    System.out.println("Programa finalizado");
                    break;

                default:

                    System.out.println("Opcion invalida");
            }
        }

    }
}