package Ejercicios;
import java.util.*;

public class Tienda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total=0;
        int opc=1;
        int Cart=0;
        

        do{
            System.out.println("ABARROTES MI HOGAR");
            System.out.println("1- Azucar $20");
            System.out.println("2- Aceite $58");
            System.out.println("3- Arroz $32");
            System.out.println("4- Frijol $47");
            System.out.println("5- Pasta $12");
            System.out.println("6- Galletas $39");
            System.out.println("7- Finalizar Compra");
            opc=sc.nextInt();

            switch (opc) {
                case 1:
                    Cart++;
                    total=total+20;
                    break;
                case 2:
                    Cart++;
                    total=total+58;
                    break;
                case 3:
                    Cart++;
                    total=total+32;
                    break;
                case 4:
                    Cart++;
                    total=total+47;
                    break;
                case 5:
                    Cart++;
                    total=total+12;
                    break;
                case 6:
                    Cart++;
                    total=total+39;
                    break;
                case 7:
                    default:              
            }

            System.out.println("Cantidad de Articulos"+Cart);
            System.out.println("Total a pagar"+total);

        }while(opc!=7); 




    }
}
