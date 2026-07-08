package POO.Unidad4;
import java.util.*;

public class Ejer3_u4 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resp = "";

        do {
            System.out.print("Cadena: ");
            String cadena = sc.nextLine();

            String limpia = limpiar(cadena);

            if (esPalindromo(limpia)) {
                if (esNumero(limpia)) {
                    System.out.println("Es capicua");
                } else {
                    System.out.println("Es palindromo");
                }
            } else {
                System.out.println("No es palindromo ni capicua");
            }

            System.out.print("Otra? ");
            resp = sc.nextLine().toLowerCase();

        } while (resp.equals("si"));
    }

    public static String limpiar(String cadena) {
        cadena = cadena.toLowerCase();

        cadena = cadena.replace('á','a');
        cadena = cadena.replace('é','e');
        cadena = cadena.replace('í','i');
        cadena = cadena.replace('ó','o');
        cadena = cadena.replace('ú','u');

        String nueva = "";

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                nueva += c;
            }
        }

        return nueva;
    }

    public static boolean esPalindromo(String cadena) {
        int i = 0;
        int j = cadena.length() - 1;

        while (i < j) {
            if (cadena.charAt(i) != cadena.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static boolean esNumero(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
