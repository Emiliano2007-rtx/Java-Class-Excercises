package ModuloYArgumento;

import java.util.*;

public class potencias_de_i {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opc = 0;
        int poten;
        int i2 = -1;
        int res = 1;
        int res2 = i2;

        while (opc != 2) {

            System.out.println("CALCULAR POTENCIA DE 'i' :");

            System.out.println("Ingrese la potencia:");
            poten = sc.nextInt();

            if (poten % 2 == 0) {
                for (int i = 1; i < poten; i++) {
                    res = res * i2;
                }
                System.out.println("Resultado:" + res);
            } else {
                for (int i = 1; i < poten - 1; i++) {
                    res2 = res2 * i2;
                    res2 = res2 * 1;
                    System.out.println("i:" + i);
                }
                if (res == 1) {
                    System.out.println("Resultado: +i");
                } else {
                    System.out.println("Resultado: -i");
                }

            }

            System.out.println("Intentar de nuevo? (1) Si (2) No");
            opc = sc.nextInt();
        }
    }
}
