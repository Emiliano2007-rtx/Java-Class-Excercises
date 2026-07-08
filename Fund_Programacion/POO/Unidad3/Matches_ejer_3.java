import java.util.*;

public class Matches_ejer_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese usuario:");
        String user = sc.nextLine();

        if(user.matches("^[a-zA-Z0-9]{5,10}$")){
            System.out.println("Usuario válido");
        }else{
            System.out.println("Usuario inválido");
        }
    }
}

