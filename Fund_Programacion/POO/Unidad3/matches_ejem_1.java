import java.util.*;
import java.util.regex.*;

public class matches_ejem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena = "Mi numero es 123456";
        String patron = "\\d+"; 
        Pattern p = Pattern.compile(patron);
        Matcher m = p.matcher(cadena);

        if(m.find()){
            System.out.println("Encontre: "+m.group());
        }
        
    }
}
