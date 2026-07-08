package ModuloYArgumento;
import java.util.*;

public class Mod_Arg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String re;
        String im;
        double m;
        double ar;
        double real=0;
        double imag=0;
        int opc=0;

                while (opc!=2) {
            
                    System.out.println("CALCULAR MODULO Y ARGUMENTO:");
           
                    System.out.println("Ingresa la parte real:");
                    re=sc.next();
                    System.out.println("Ingresa la parte imaginaria (Omite introducir 'i'):");
                    im=sc.next();

                try {
                    real=Double.parseDouble(re);
                    imag=Double.parseDouble(im);

                    m = Math.sqrt((real*real)+(imag*imag));
                    System.out.println("Modulo: "+m);

                    ar = Math.atan2(imag,real);
                    double ARgrados = ar*(180/Math.PI);

                    if(ARgrados<0){
                        ARgrados=ARgrados*(-1);
                        System.out.println("Argumento: "+ARgrados);
                    }else{
                        System.out.println("Argumento: "+ARgrados);
                    }
                    
                    if(real>0 && imag>0){
                        System.out.println("Cuadrante I");
                    }
                    else if(real<0 && imag>0){
                        System.out.println("Cuadrante II");
                    }
                    else if(real<0 && imag<0){
                        System.out.println("Cuadrante III");
                    }
                    else if(real>0 && imag<0){
                        System.out.println("Cuadrante IV");
                    }
                    
                 System.out.println("Intentar de nuevo?: (1) Si (2) No");
                 opc=sc.nextInt();   
            
                } catch (Exception e) {
                        System.out.println("Valor no valido (Solo numeros)");
                } 
          } 
       }
    }
    

