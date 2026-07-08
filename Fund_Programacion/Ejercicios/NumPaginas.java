
package Ejercicios;
import java.util.*;

public class NumPaginas {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int NumPaginas;
        int precioBase = 100;
        
        System.out.println("Ingresa el numero de paginas");
        NumPaginas=sc.nextInt();
        
        double precioFinal = precioBase + 100 + 80 + (NumPaginas-200) * 0.50;
       
        System.out.println("El precio final es de:"+precioFinal);
        
    }
    
}
