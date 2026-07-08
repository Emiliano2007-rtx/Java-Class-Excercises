package POO.Unidad4;
import java.util.*;
import java.util.regex.*;

public class Ejer2_u4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String resp = "si";

        while (!resp.equalsIgnoreCase("no")) {
            System.out.println("\n");
            System.out.print("Ingresa una cadena: ");
            String cadena = sc.nextLine().toLowerCase();

            int opcion = 0;

            while (opcion != 5) {
                System.out.println("1. Vocales");
                System.out.println("2. Consonantes");
                System.out.println("3. Comparar");
                System.out.println("4. Buscar 'ola'");
                System.out.println("5. Salir");
                System.out.print("Opcion: ");

                opcion = sc.nextInt();
                sc.nextLine();

                int v = 0, c = 0;

                for (int i = 0; i < cadena.length(); i++) {
                    char x = cadena.charAt(i);
                    if (x >= 'a' && x <= 'z') {
                        if (x=='a'||x=='e'||x=='i'||x=='o'||x=='u') v++;
                        else c++;
                    }
                }

                if (opcion == 1) {
                    System.out.println("Vocales: " + v);
                } else if (opcion == 2) {
                    System.out.println("Consonantes: " + c);
                } else if (opcion == 3) {
                    if (v > c) System.out.println("Son más vocales");
                    else if (c > v) System.out.println("Son más consonantes");
                    else System.out.println("Son iguales");
                } else if (opcion == 4) {
                    int cont = 0;
                    for (int i = 0; i < cadena.length() - 2; i++) {
                        if (cadena.substring(i, i+3).equals("ola")) cont++;
                    }
                    System.out.println("'ola' aparece: " + cont + " veces");
                } else if (opcion == 5) {
                    System.out.println("Fin");
                } else {
                    System.out.println("Error");
                }
            }

            System.out.print("Otra cadena? (si/no): ");
            resp = sc.nextLine();
        }
    }
}
