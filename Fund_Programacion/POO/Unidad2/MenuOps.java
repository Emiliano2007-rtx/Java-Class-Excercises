package POO.Unidad2;

import java.util.*;

public class MenuOps {

    public static int validar(String msg){
        Scanner sc = new Scanner(System.in);
        int num=0;
        String numero;
        boolean valido = false;

    while (!valido) {
        System.out.println(msg);
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

        Scanner sc = new Scanner(System.in);
        int opc=0;   

        while (opc!=5) {
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            opc=sc.nextInt();

            System.out.println("Primer numero:");
            int a;
            a = validar("Dame un numero entero");
            System.out.println("Segundo numero:");
            int b;
            b = validar("Dame un numero entero");

            switch(opc){
                case 1:
                    int sum = a + b;
                    System.out.println(sum);
                break;
                case 2:
                    int rest = a-b;
                    System.out.println(rest);
                break;
                case 3:
                    int mult = a * b;
                    System.out.println(mult);
                break;
                case 4:
                    int div = a / b;
                    System.out.println(div);
                break;
            }

        }

    }    
}
