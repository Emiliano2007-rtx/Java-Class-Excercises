import java.util.*;
import java.util.regex.*;

public class Match_menu {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int opc=0;

        while (opc!=4) {
            
            System.out.println("");
            System.out.println("1.Validar nombre y apellido");
            System.out.println("2.Remplazar comas por puntos");
            System.out.println("3.Encontrar secuencia numerica en una cadena");
            System.out.println("4.Salir");
            opc=sc.nextInt();

            switch(opc){
                case 1:
                String nombre;
                try{
                    System.out.println("Ingrese un nombre completo:");
                    sc.nextLine();
                    nombre=sc.nextLine();
                    if (nombre.matches("^[A-Z][a-z]+(\s[A-Z][a-z]+)+")) {
                        System.out.println("Nombre escrito correctamente");
                    }else{
                        System.out.println("Error en el nombre");
                    }
                } catch (Exception e) {
                    System.out.println("No valido");
                }
                break;
                case 2:
                    String cadena;
                    System.out.println("Ingrese una cadena:");
                    sc.nextLine();
                    cadena=sc.nextLine();

                    if(cadena.matches("(.*,.*)*")){
                        cadena = cadena.replaceAll(",",".");
                        System.out.println(cadena);
                    }
                    else{
                        System.out.println("Error en la cadena");
                    }
                    
                break;

                case 3:
                    String cadenaTxt;
                    String pattern = "\\d{2,}";
                    int Pcont=0;
                    System.out.println("Ingrese una cadena:");
                    sc.nextLine();
                    cadenaTxt = sc.nextLine();

                    Pattern pat = Pattern.compile(pattern);
                    Matcher compar = pat.matcher(cadenaTxt);

                    while (compar.find()) {
                        Pcont++;
                        System.out.println("Patron:");
                        System.out.println(compar.group());
                    }
                    System.out.println(Pcont);
                break;
            }
        }
    }
}

// Hacerlo aprueba de pendejos (Try Catch)