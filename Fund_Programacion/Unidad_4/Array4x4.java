package Unidad_4;
import java.util.*;

public class Array4x4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums [][] = new int [4][4];
        String numero;
        int num;
        int NonumsR=0;
        int datosFuera=0;


        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++) {
               System.out.println("Ingresa un numero");
               numero=sc.next();
            try{
                num=Integer.parseInt(numero);
                if (num%2==0) {
                    nums[i][j]=num;
                }else{
                    datosFuera++;
                }
                
            }catch(Exception e){
                NonumsR++;
            } 
            }
        }
        System.out.println("Datos Numericos rechazados: "+datosFuera);
        System.out.println("Datos NO numericos rechazados: "+NonumsR);
    }
}
