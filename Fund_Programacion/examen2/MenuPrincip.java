package examen2;
import java.util.*;

public class MenuPrincip {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrUnid unid = new ArrUnid();
        ArrBidi Bidi = new ArrBidi();

        int opc=0;

        while (opc!=3) {
            System.out.println("**MENU PRINCIPAL**");
            System.out.println("1.Crear array unidimensional");
            System.out.println("2.Crear array bidimensional");
            System.out.println("3.Finalizar Ejecucion");
            System.out.println("Elige una opcion");
            opc=sc.nextInt();

            switch(opc){
                case 1:
                    unid.ArrUnid();
                break;

                case 2:
                    Bidi.ArrBidi();
                break;
            }
        }
    }
}
