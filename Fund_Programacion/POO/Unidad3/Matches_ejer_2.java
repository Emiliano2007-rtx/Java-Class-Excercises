import java.util.*;

public class Matches_ejer_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese código postal:");
        String cp = sc.nextLine();

        if(cp.matches("^\\d{5}$")){
            System.out.println("Código postal válido");
        }else{
            System.out.println("Código postal inválido");
        }
    }
}

