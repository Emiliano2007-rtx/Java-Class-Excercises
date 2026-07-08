package POO.Unidad6;
import java.util.*;

public class Duplicados {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n=0;

        System.out.println("Ingresa la cantidad de numeros:");
        n=sc.nextInt();

        double lista [] = new double[n];
        double lista2 [] = {};

        for(int i=0; i<lista.length; i++){
            lista[i]=sc.nextInt();
        }

        for(int i=0; i<lista.length; i++){
            for(int j=0; j<lista.length; j++){
            if(i!=j && lista[i]==lista[j]){
               lista[i]=0;
            }
          }
        }

        for(int i=0; i<lista.length; i++){
            while (lista[i]!=0) {
                lista2[i]=lista[i];
            }
        }
        
        for(int i=0; i<lista.length; i++){
            System.out.println(lista2[i]);
        }
    }
}
