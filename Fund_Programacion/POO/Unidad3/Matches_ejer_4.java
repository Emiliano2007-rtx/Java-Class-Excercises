import java.util.*;
public class Matches_ejer_4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese nombre:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese sexo (H/M):");
        String sexo = sc.nextLine();

        char inicial = Character.toUpperCase(nombre.charAt(0));

        if(sexo.equalsIgnoreCase("M")){
            
            if(inicial >= 'A' && inicial < 'M'){
                System.out.println("Grupo A");
            }else{
                System.out.println("Grupo B");
            }

        }else if(sexo.equalsIgnoreCase("H")){

            if(inicial > 'N' && inicial <= 'Z'){
                System.out.println("Grupo A");
            }else{
                System.out.println("Grupo B");
            }
        }
    }
}
