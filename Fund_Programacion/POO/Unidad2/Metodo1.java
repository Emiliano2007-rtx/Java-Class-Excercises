package POO.Unidad2;

import java.util.*;
public class Metodo1 {

    public static int valida (String mensaje) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        String numero;
        boolean valido = false;

    while (!valido) {
        System.out.println(mensaje);
        numero=sc.next();
        try {
            num=Integer.parseInt(numero);
            valido=true;
        } catch (Exception e) {
            System.out.println("No es entero");
        }
      }
      return num;
    }
    public static void main(String[] args) {
        int a;
        a = valida("Dame un entero");
        System.out.println("Valor entero: "+a);
        
    }
}
