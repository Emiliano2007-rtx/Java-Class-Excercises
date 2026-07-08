
package Ejercicios;
import java.util.*;
public class AreasFiguras {

    
    public static void main(String[] args) {
        
        double base,altura,radio,lado;
        double arcir,acua,atri,arec;
        
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Base del triangulo");
        base=sc.nextDouble();
        System.out.println("Altura del Triangulo");
        altura=sc.nextDouble();
        atri=base*altura/2;
        System.out.println("El Area es"+atri);
        
        System.out.println("Ingrese el lado");
        lado=sc.nextDouble();
        acua=lado*lado;
        System.out.println("El Area es"+acua);
        
        System.out.println("Base del Rectangulo");
        base=sc.nextDouble();
        System.out.println("Altura del Rectangulo");
        altura=sc.nextDouble();
        arec=base*altura;
        System.out.println("El Area es"+arec);
        
        System.out.println("Radio del circulo");
        radio=sc.nextDouble();
        arcir=3.1416*(radio*radio);
        System.out.println("El Area es"+arcir);
        
        
        

    }
    
}
