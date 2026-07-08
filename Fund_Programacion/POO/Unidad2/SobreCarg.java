package POO.Unidad2;
import java.util.*;

public class SobreCarg {

    public static void ValidDato(int ents){
        System.out.println("Dato entero: " + ents);
    }

    public static void ValidDato(double doubs){
        System.out.println("Dato Double: " + doubs);
    }

    public static void ValidDato(String strs){
        System.out.println("Dato String: " + strs);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc = 1;

        while (opc != 2) {

            for(int i = 0; i < 3; i++) {

                System.out.println("Ingrese dato:");
                String dato = sc.nextLine();

                try {
                    int entero = Integer.parseInt(dato);
                    ValidDato(entero);

                } catch (NumberFormatException e1) {

                    try {
                        double decimal = Double.parseDouble(dato);
                        ValidDato(decimal);

                    } catch (NumberFormatException e2) {
                        ValidDato(dato);
                    }
                }
            }

            System.out.println("Desea hacerlo de nuevo?");
            System.out.println("1. Si");
            System.out.println("2. No");

            opc = sc.nextInt();
        }

    }
}