package POO.Unidad2;
import java.util.*;

public class Conv_Binaria {

    public static String convertir(int entero){

        String bin = "";
        int nm;

        if(entero==0){
            System.out.println("Binario: 0");
        }else{
            nm=entero;
            while (nm>0) {
                int resid = nm % 2;
                bin = resid + bin;
                nm = nm/2;
            }
            
        }
        return bin;
    }

    public static String convertir(double dec){
        String oct="";
        double nm;

        if(dec==0){
            System.out.println("Octal: 0");
        }
        else{
            int decEnt=(int)dec;
            nm=decEnt;
            while (nm>0) {
                double resid = nm % 8;
                oct = resid + oct;
                nm = nm/8;
            }
        }
        return oct;
    }

    public static String convertir(String cad){

        return "DATO IMPOSIBLE DE CONVERTIR";
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean seguir = true;
        String dato;
        String sn;
        String ds="";
        String ResS="";
        int di;
        double db;
        String res;

        while (seguir!=false) {
            
            System.out.println("Ingresa un dato:");
            dato=sc.next();

            try {
                di=Integer.parseInt(dato);
                res = convertir(di);
                System.out.println(res);
            } catch (Exception e) {
                try {
                    db=Double.parseDouble(dato);
                    res = convertir(db);
                    System.out.println(res);
                } catch (Exception a) {
                    ResS = convertir(ds);
                    System.out.println(ResS);
                }
            }

            System.out.println("Continuar: S/N");
            sn=sc.next();

            if(sn.equalsIgnoreCase("n")){
                seguir=false;
            }
            
        }
    }
}
