

import java.util.*;

public class Matches_ejer_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un dato:");
        String dato = sc.nextLine();

        if(dato.matches("^-?\\d+$")){
            System.out.println("Es un número entero válido");
        }else{
            System.out.println("No es un número entero");
        }
    }
}
