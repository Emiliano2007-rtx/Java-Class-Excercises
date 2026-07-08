package POO.Unidad2;
import java.util.*;


public class TipoDato {

    public static void validE(String dato){
        Scanner sc = new Scanner(System.in);
        int d1;
        double d2;

                System.out.println("Ingrese un dato:");
                dato=sc.nextLine();
                try {
                    d1=Integer.parseInt(dato);
                    System.out.println("Es Entero");
                    
                } catch (Exception e) {
                try {
                    d2=Double.parseDouble(dato);
                    System.out.println("Es Double");
                } catch (Exception a) {
                    System.out.println("Es String");
                }
         }    
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opc="";
        boolean seguir = true;

        while (seguir!=false) {
            System.out.println("Validar tipo de dato");
            validE("Ingrese un dato:");

            System.out.println("Intentar de nuevo?:  Si / No");
            opc=sc.nextLine();

            if(opc.equalsIgnoreCase("no")){
                seguir=false;
            }
            
        }

    }
}
