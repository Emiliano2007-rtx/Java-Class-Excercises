package Unidad_4;
import java.util.*;

public class VentasFinales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Vend [] = {"David","Alex","Marco","Jorge","Carlos"};
        int Ventas [][] = new int[5][3];
        int Total [] = new int[5];
        int VentasNov=0;
        int Vmayor=0;
        String VendMay="";
        int totTrim=0;

        System.out.println("\n Ventas Trimestrales: \n");
        
        for(int i=0;i<5;i++){
            System.out.println("Ingresa las ventas de: "+Vend[i]);

            for(int j=0;j<3;j++){
                System.out.println("Ingresa ventas del mes: "+(j+1));
                Ventas[i][j]=sc.nextInt();
                Total[i]+=Ventas[i][j];
                VentasNov=VentasNov+Ventas[i][1];
                totTrim+=Total[i];

                if (Total[i]>Vmayor) {
                    Vmayor=Total[i];
                    VendMay=Vend[i];
                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.println("Ventas totales de: "+Vend[i]);
            System.out.println(Total[i]);
        }
         System.out.println("Ventas totales en Noviembre: "+VentasNov);
         System.out.println("Vendedor con mas ventas: "+VendMay);
         System.out.println("Ventas totales del trimestre: "+totTrim);
        
    }
}
