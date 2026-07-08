package POO.Unidad2;
import java.util.*;

public class Exam_Uni2 {

    public static void operaciones(int n1, int n2, int n3, int n4 ){
        System.out.println("Resultados:");
        System.out.println("Suma:" + (n1+n2+n3+n4));
        System.out.println("Resta:" + (n1-n2-n3-n4));
        System.out.println("Multiplicación:" + (n1*n2*n3*n4));
        System.out.println("División:" + (n1/n2/n3/n4));
    }

    public static void operaciones(double n1, double n2, double n3, double n4){
        System.out.println("Resultados:");
        System.out.println("Suma: " + (n1+n2+n3+n4));
        System.out.println("Resta: " + (n1-n2-n3-n4));
        System.out.println("Multiplicación: " + (n1*n2*n3*n4));
        System.out.println("División: " + (n1/n2/n3/n4));
    }

    public static void operaciones(int n1, int n2, double n3, double n4){
                System.out.println("Resultados:");
                System.out.println("Suma: " + (n1+n2+n3+n4));
                System.out.println("Resta: " + (n1-n2-n3-n4));
                System.out.println("Multiplicación: " + (n1*n2*n3*n4));
                System.out.println("División: " + (n1/n2/n3/n4));
    }

    public static void operaciones(String s1, String s2){
        System.out.println(s1 + s2);
       }

    public static void operaciones(int n1, double n2){
        System.out.println("Resultados:");
        System.out.println("Suma: " + (n1+n2));
        System.out.println("Resta: " + (n1-n2));
        System.out.println("Multiplicación: " + (n1*n2));
        System.out.println("División: " + (n1/n2));
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("Operaciones:");
            System.out.println("Ingrese 4 datos:");
            
            String v1 = sc.next();
            String v2 = sc.next();
            String v3 = sc.next();
            String v4 = sc.next();

            boolean ya_esta = false;

            try {
                int a = Integer.parseInt(v1);
                int b = Integer.parseInt(v2);
                int c = Integer.parseInt(v3);
                int d = Integer.parseInt(v4);
                operaciones(a,b,c,d);
                ya_esta = true;
            } catch (Exception e1) {
                System.out.println("No todos son enteros pero... puede cumplir otra condición");
            }

            if (!ya_esta) {
                try {
                    double a = Double.parseDouble(v1);
                    double b = Double.parseDouble(v2);
                    double c = Double.parseDouble(v3);
                    double d = Double.parseDouble(v4);
                    operaciones(a,b,c,d);
                    ya_esta = true;
                } catch (Exception e2) {
                    System.out.println("No todos son doubles pero... aún puede cumplir otra condición");
                }
            }

            if (!ya_esta) {
                try {
                    int a = Integer.parseInt(v1);
                    int b = Integer.parseInt(v2);
                    double c = Double.parseDouble(v3);
                    double d = Double.parseDouble(v4);
                    operaciones(a,b,c,d);
                    ya_esta = true;
                } catch (Exception e3) {
                    System.out.println("No corresponden al orden del llamado pero... puede ser la última opción");
                }
            }

            if (!ya_esta) {
                System.out.println("Si llegó hasta aquí... no cumple ninguna condición");
                operaciones(v1,v2);
            }

            System.out.println("¿Desea realizar otra operación? (si/no)");
            opcion = sc.next();

        } while (opcion.equalsIgnoreCase("si"));
    }
}