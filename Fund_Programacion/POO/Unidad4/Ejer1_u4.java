package POO.Unidad4;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejer1_u4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String opc="";
        String opc2="";
        int opcin=0;
        String cadena="";


        while (!opc2.equalsIgnoreCase("No")) {
            System.out.println("\n");
            System.out.println("Ingresa una cadena:");
            sc.nextLine();
            cadena=sc.nextLine();

        do{

            System.out.println("1) Imprimir la cadena leida al reves");
            System.out.println("2) Imprimir la cadena sin vocales");
            System.out.println("3) Imprimir la cadena leida sin consonantes");
            System.out.println("4) Calcular la longitud de la cadena leida e imprimir esa cantidad de veces la cadena original");
            System.out.println("5) Salir");
            

        try{
            opc=sc.nextLine();
            opcin=Integer.parseInt(opc);
            
            switch(opcin){

                case 1:
                    char aux;
                    String CadCom="";
                    for(int i=0; i<cadena.length(); i++){
                        aux = cadena.charAt(i);
                        CadCom = aux + CadCom;
                    }
                    System.out.println(CadCom);
                break;

                case 2:
                    String NoVocals = cadena.replaceAll("[aeiou]", "");
                    System.out.println(NoVocals);
                break;

                case 3:
                    String pat = "[bcdfghjklmnpqrstvwxyz - BCDFGHJKLMNPQRSTVWXYZ]";
                    String NoConsonts = cadena.replaceAll(pat, "");
                    System.out.println(NoConsonts);
                break;

                case 4:
                    System.out.println("Longitud: "+cadena.length());
                     for(int i=0; i<cadena.length(); i++){
                        System.out.println(cadena);
                     }
                break;
            }
        }catch(Exception e){
            System.out.println("Opcion no valida");
        }


        }while (opcin!=5);

        System.out.println("Desea intentar de nuevo?: (Si/No)");
        opc2 = sc.next();

        }
    }
}
