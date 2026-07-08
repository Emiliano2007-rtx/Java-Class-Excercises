package Unidad_4;
import java.util.*;

public class ArrayString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nom [] = {"Emiliano","Alejandra","Oliveira","Hooker","Jiri"};
        String aux;

        for (int i=0;i<nom.length;i++) {
            for (int j=1;j<nom.length;j++) {
                if (nom[j].compareToIgnoreCase(nom[i])<0){
                    aux=nom[i];
                    nom[i]=nom[j];
                    nom[j]=aux;
                 }
            }
        }

       System.out.println("Nombres ordenados");
       for (int i=0;i<nom.length;i++){
            System.out.println(nom[i]);
       } 
        
        

    }
}
