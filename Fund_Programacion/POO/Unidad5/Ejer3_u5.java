package POO.Unidad5;
import java.util.*;
import java.io.*;

import javax.management.RuntimeErrorException;
import javax.swing.*;

public class Ejer3_u5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int opc=0;

          while (opc!=6) {
            System.out.println("MENU DE EXCEPCIONES:");
            System.out.println("1.NullPointer");
            System.out.println("2.Arithmetic");
            System.out.println("3.FileNotFound");
            System.out.println("4.Runtime");
            System.out.println("5.InputMisMatch");
            System.out.println("6.Salir");
            try {
            opc=sc.nextInt();

            switch(opc){
                case 1:
                    try{
                        int arr [] = null;
                        System.out.println(arr[1]);

                    }catch(NullPointerException e){
                        System.out.println("Error: NullPointerException: No se puede acceder a un valor null");
                    }
                break;

                case 2:
                    try {
                        int x = 1 , y = 0;
                        int div = x/y;
                        System.out.println(div);
                    } catch (Exception e) {
                        System.out.println("Error: ArithmeticException: Operacion matematica imposible de resolver");
                    }
                break;

                case 3:
                    File archivo = new File("C:\\Users\\Emiliano\\Downloads\\github_roles_guide.txt");

                    try {
                        FileReader fr = new FileReader(archivo);
                        System.out.println("Archivo encontrado");
                        System.out.println(fr);
                        
                    } catch (Exception e) {
                        System.out.println("Error: FileNotFound: Archivo no encontrado o no existe");
                    }
                break;

                case 4:
                    String passw="";

                    System.out.println("Ingresa Contraseña:");
                    sc.nextLine();
                    passw=sc.nextLine();

                try{    
                    if(passw.equals("Admin1234")){
                        System.out.println("Accediendo...");
                    }
                    else{
                        throw new RuntimeErrorException(null);
                    }
                }catch(Exception e){
                    System.out.println("Error: RuntimeErrorException: Error de Ejecucion");
                }
                break;

                case 5:
                    String pcr;
                    int cr;
                    try{
                        System.out.println("Leer Numero:");
                        pcr=sc.nextLine();
                        cr = Integer.parseInt(pcr);
                    }catch(InputMismatchException e){
                        System.out.println("Error: InputMismatchException: El tipo de dato no coincide");
                    }
                break;
            }
                
            } catch (Exception e) {
               System.out.println("Ingrese una opcion valida");
            }



          }  

    }
}
