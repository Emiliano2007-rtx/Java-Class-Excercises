package POO.Unidad2;
import java.util.*;

public class ConvDats {

    public static double convertir(int dato){

    double C = (dato-32)*5/9;

    return C;
    
    }

    public static double convertir(double dato){
        
        double F = (dato*1.8)+32;

        return F;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean seguir = true;
        String dato;
        String sn;
        int di;
        double db;
        double result;

        while (seguir!=false) {
            
            System.out.println("Ingresa un dato:");
            dato=sc.next();

            try {
                di=Integer.parseInt(dato);
                result=convertir(di);
                System.out.println(result+" C");
            } catch (Exception e) {
                try {
                    db=Double.parseDouble(dato);
                    result = convertir(db);
                    System.out.println(result+" F");
                } catch (Exception a) {
                    System.out.println("No hay datos");
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
