package Ejercicios;
import java.util.*;

public class NumsDifCero {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        int prim = 0;
        int malos = 0;
        int max = 0;
        int fin = 0;
        String tex;
        int num;

        System.out.println("Ingreas numeros:");

        while (fin == 0) {
            tex = sc.nextLine();
            int valid = 1;
            num = 0;

    try {
                num = Integer.parseInt(tex);

            } catch (Exception e) {

                valid = 0;
            }

              if (valid == 0) {
                malos = malos + 1;

            } else {

                if (num == 0) {
                    fin = 1;
                } else {
                    cont = cont + 1;

            if (num > max) {
                        max = num;
                    }

                    int i = 2;
                    int es = 1;

                    if (num <= 1) {
                        es = 0;
            } else {
                        while (i <= num / 2) {

                            if (num % i == 0) {
                                es = 0;
                            }
                            i = i + 1;
                        }
                    }

                    if (es == 1) {
                        prim = prim + 1;
                    }
                }
            }
        }

        System.out.println("numeros validos: " + cont);
        System.out.println("primos: " + prim);
        System.out.println("no son numeros: " + malos);
        System.out.println("fibonacci hasta " + max);

        int a = 0;
        int b = 1;
        int c = 0;
        int sig = 1;

        if (max >= 0) System.out.print(a + " ");
        if (max >= 1) System.out.print(b + " ");

        while (sig == 1) {
            c = a + b;
            if (c > max) {
                sig = 0;
            } else {
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }

    }
}