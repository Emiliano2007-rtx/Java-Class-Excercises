package POO.Unidad5;
import java.util.*;

public class Ejer2_u5 {
    public static void main(String[] args) {
        
        int array [] = {1,2,3,4,5};
    
        try {
            System.out.println("Posicion: "+array[5]);
        } catch (Exception e) {
            System.out.println("El Array se desbordo :/");
        }
    }
}
