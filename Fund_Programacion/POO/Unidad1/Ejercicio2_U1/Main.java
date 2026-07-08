// Escriba un programa que presente un menu con las siguientes opciones:
/*
    1.Crear arreglo unidimensional (el usuario determina el tamano)
    2.Crear arreglo bidimensional (el usuario determina las filas y columnas)
    3.Finalizar ejecucion

    Luego un submenu para cada uno que incluya las opciones de:

    1.Llenar el arreglo
    2.Buscar e imprimir los valores mayor y menor con la posicion que ocupan
    3.Regresar al menu anterior
*/


package POO.Unidad1.Ejercicio2_U1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrUnid arr1 = new ArrUnid();
        ArrBid arr2 = new ArrBid();

        int opc=0;

        while(opc!=3) {

            System.out.println("1.Crear arreglo unidimensional");
            System.out.println("2.Crear arreglo bidimensional");
            System.out.println("3.Finalizar ejecucion");
            opc=sc.nextInt();

            switch (opc){
                case 1:
                    arr1.menu1();
                break;

                case 2:
                    arr2.menu2();
                break;
            }
        }




    }    
}
