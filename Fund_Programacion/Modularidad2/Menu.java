package Modularidad2;
import java.util.*;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayUnid arr1 = new ArrayUnid(); 
        ArrayBidim arr2 = new ArrayBidim();

        int opc=0;

        while (opc!=3) {
            
        System.out.println("MENU PRINCIPAL");
        System.out.println("1.Crear arreglo unidimensional");
        System.out.println("2.Crear arreglo bidimensional");
        System.out.println("3.Finalizar ejecucion");
        opc=sc.nextInt();
        
        switch (opc) {
          case 1:
          arr1.menuUnid();
          break;
          case 2:
          arr2.menuBidim();
          break;
        }
        

    }
  }
}
