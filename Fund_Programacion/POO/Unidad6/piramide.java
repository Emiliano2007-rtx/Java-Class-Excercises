package POO.Unidad6;
import java.util.*;

public class piramide {
    public static void main(String[] args) {
        
        String ast = "*";
        String col;

        for(int i=0; i<10; i++){
            col=ast.repeat(i);
            System.out.println(" "+col+" ");
        }
    }
}
