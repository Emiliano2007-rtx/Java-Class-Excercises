package POO.Unidad2;

import java.util.Scanner;

public class Conversion {
    
        public static void convertir(int dato){
          
            double cm;
            double inch;
            double mts;
            double km;
            
            try {
                cm=dato;
                inch=cm/2.54; 
                mts=cm/100;
                km=cm/100000;
                
                System.out.println("Valor en cm: "+cm);
                System.out.println("Valor en pulgadas: "+inch);
                System.out.println("Valor en metros: "+mts);
                System.out.println("Valor en km: "+km);

            } catch (Exception e) {
                System.out.println("Ingrese un dato valido");

            }
        
          }

          public static void convertir(double dato){
    
            double cm;
            double inch;
            double mts;
            double km;
            
            try {
                cm=dato;
                inch=cm/2.54; 
                mts=cm/100;
                km=cm/100000;
                
                System.out.println("Valor en cm: "+cm);
                System.out.println("Valor en pulgadas: "+inch);
                System.out.println("Valor en metros: "+mts);
                System.out.println("Valor en km: "+km);

            } catch (Exception e) {
                System.out.println("Ingrese un dato valido");

            }
          }
        



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String dato;
        int di;
        double dd;
        boolean seguir = true;
        String opc="";

        while (seguir!=false) {
            System.out.println("Menu de Conversion:");
            System.out.println("Ingresa un dato:");
            dato=sc.next();

            try {
                di=Integer.parseInt(dato);
                convertir(di);
            } catch (Exception e) {
                // TODO: handle exception
                dd=Double.parseDouble(dato);
                convertir(dd);
            }

            System.out.println("Intentar de nuevo?:  Si / No");
            opc=sc.next();

            if(opc.equalsIgnoreCase("no")){
                seguir=false;
            }

        }



        
    }

}
