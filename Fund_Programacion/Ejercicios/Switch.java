package Ejercicios;
import java.util.*;
// Programa que por un switch presente un menu de opciones,convierta de pesos a dolares,de pesos a yenes,pesos a euros y pesos a bolivares y finalizar la ejecucion.

public class Switch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int opc=1;
        double cant;
        double r;

        while(opc!=5){
        System.out.println("MENU");
        System.out.println("1- Pesos a Dolares");
        System.out.println("2- Pesos a Yen");
        System.out.println("3- Pesos a Euros");
        System.out.println("4- Pesos a Bolivares");
        System.out.println("5- Finalizar Ejecucion");
        System.out.println("Elige una opcion");
        opc=sc.nextInt();
        
        switch(opc){

          case 1:
            System.out.println("Pesos");
            cant=sc.nextDouble();
            r=cant/(18.54);
            System.out.println(cant+" pesos son "+r+" dolares");
            break;
          case 2:
            System.out.println("Pesos");
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
