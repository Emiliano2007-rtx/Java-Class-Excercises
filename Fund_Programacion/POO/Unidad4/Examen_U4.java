package POO.Unidad4;
import java.util.*;

public class Examen_U4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int opc = 0;

        while (opc!=4) {
            System.out.println("1.Leer un numero y validar que sea double y contenga solo 2 decimales:");
            System.out.println("2.Leer un nombre de usuario y validarlo:");
            System.out.println("3.Leer un domicilio y comprobar que esta leido correctamente:");
            System.out.println("4.Finalizar ejecucion:");
            opc=sc.nextInt();

            switch (opc) {
                case 1:
                    String num;
                    boolean seguir=true;

                while (seguir!=false) {
                    
                    System.out.println("Ingrese un numero:");
                    num=sc.next();
                    
                    try {
                        double ndoub = Double.parseDouble(num);
                        String pat = "-?\\d+\\.\\d{2}$";

                        if (num.matches(pat)) {
                            System.out.println("Valido: " + ndoub);
                            seguir=false;
                        }else{
                            System.out.println("No valido");
                        }

                    } catch (Exception e) {
                        System.out.println("No es un numero double");
                    }

                }     

                break;

                case 2:
                    String user;
                    seguir = true;

                while (seguir!=false) {
                 
                    System.out.println("Ingrese un nombre de usuario: ");
                    user=sc.next();

                    String pat = "^\\@[a-zA-Z0-9_-]+\\#$";

                    if(user.matches(pat)){
                        System.out.println("Usuario valido: " + user);
                        seguir=false;
                    }else{
                        System.out.println("Usuario NO valido");
                    }
                }
                break;

                case 3:
                    String domi;
                    seguir=true;

                while (seguir!=false) {

                    System.out.println("Ingrese un domicilio:");
                    sc.nextLine();
                    domi=sc.nextLine();

                    String pat = "^[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ\\.\\s]+\\s\\#\\s\\d+[A-Z]?$";

                    if(domi.matches(pat)){
                        System.out.println("Domicilio valido: " + domi);
                        seguir=false;
                    }else{
                        System.out.println("Domicilio no valido");
                    }
                }
                break;

            }

        }

    }
}
