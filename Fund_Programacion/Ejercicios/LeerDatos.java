
package Ejercicios;
import java.util.*;

public class LeerDatos {
    public static void main(String[] args) {
        String nombre,domicilio,correo;
        double estatura;
        int edad;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
        nombre=sc.nextLine();
        
        System.out.println("Ingresa tu domicilio");
        domicilio=sc.nextLine();
        
        System.out.println("Ingresa tu correo");
        correo=sc.nextLine();
        
        System.out.println("Ingresa tu Estatura");
        estatura=sc.nextDouble();
        
        System.out.println("Ingresa tu edad");
        edad=sc.nextInt();
        
        System.out.println(correo+"\n\n\n\n\n\n");
        System.out.println(edad);
        System.out.println(domicilio);
        System.out.println(estatura);
        
        
        
        
        
    }
    
}
