package pract_c_game;
import java.util.*;

public class Menu {

    public static void Figth(String nom1,String nom2){
        Figther1 f1 = new Figther1();
        Figther2 f2 = new Figther2();
        f1.nombre = nom1;
        f2.nombre = nom2;

    while (true) {
        int dañoAtak = new Random().nextInt(1,5);
        int turno = new Random().nextInt(2);
        int esquive = new Random().nextInt(1,20);
        int dañof1=0;
        int dañof2=0;
        int Golpes_EsquivF1=0;
        int Golpes_EsquivF2=0;

        if (turno==0) {
            if(esquive!=20){
                dañof1 = f2.vida - dañoAtak;
            }else{
                Golpes_EsquivF1++;
            }
        }
        else{
            if (esquive!=20) {
                dañof2 = f1.vida - dañoAtak;
            }
            else{
                Golpes_EsquivF2++;
            }
        }
        if (dañof1==0) {
            System.out.println("El peleador "+f2.nombre+" es el ganador");
            System.out.println("Vida del Ganador: " +dañof2);
            System.out.println("Golpes Esquivados:"+Golpes_EsquivF2);
            break;
        }else if (dañof2==0) {
            System.out.println("El peleador "+f1.nombre+" es el ganador");
            System.out.println("Vida del Ganador: "+dañof1);
            System.out.println("Golpes Esquivados:"+Golpes_EsquivF1);
            break;
        }
    }
      }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int opc=0;
        String fgt1;
        String fgt2;

        while (opc!=2) {
        System.out.println("Iniciar: (1)");
        System.out.println("Salir: (2)");
        opc=sc.nextInt();   

        System.out.println("Ingresa el nombre del primer peleador:");
        fgt1=sc.next();
    
        System.out.println("Ingresa el nombre del segundo peleador:");
        fgt2=sc.next();
        
        Figth(fgt1,fgt2);

        }

    }
}
