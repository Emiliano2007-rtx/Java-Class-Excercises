package Ejercicios;
import java.util.*;

public class MenuConversiones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opc=1;
        double cant;
        double r;

        while(opc!=5){
        System.out.println("MENU");
        System.out.println("1- Metros a Yardas");
        System.out.println("2- Cm a pulgadas");
        System.out.println("3- Litros a Onzas");
        System.out.println("4- Kilos a Toneladas");
        System.out.println("5- Finalizar ejecucion");
        System.out.println("Elige una opcion");
        opc=sc.nextInt();

        switch(opc){

          case 1:
            System.out.println("Metros");
            cant=sc.nextDouble();
            r=cant/(18.54);
            System.out.println(cant+" metros son "+r+" yardas");
            break;
          case 2:
            System.out.println("Centimetros a yardas");
            cant=sc.nextDouble();
            r=cant/(0.12);
            System.out.println(cant+" pesos son "+r+" Yenes");
            break;
          case 3:
            System.out.println("Pesos");
            cant=sc.nextDouble();
            r=cant/(21.50);
            System.out.println(cant+" pesos son "+r+" euros");
            break;
          case 4:
            System.out.println("Pesos");
            cant=sc.nextDouble();
            r=cant/(10.41);
            System.out.println(cant+" pesos son "+r+" bolivares");
            break;
          case 5:
              default:

        }
     }
    }
}
