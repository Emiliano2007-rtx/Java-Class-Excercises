package POO.Unidad1.ExamenU1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner gato = new Scanner(System.in);
       Scanner leer = new Scanner(System.in);
       Bidimencional a = new Bidimencional();
       Unidimencional b = new Unidimencional();
       int op=0,x=1;
       String OP;
       
       while(op!=3){
       
        
        while(x<=2){
            
            System.out.println("1. Arreglo Unidimensional");
        System.out.println("2. Arreglo Bidimensional");
        System.out.println("3. Finalizar Ejecución");
        OP = gato.nextLine();
        try{
            op = Integer.parseInt(OP);
            x++;
        }
        catch(NumberFormatException e){System.out.println("No es una opcion");}
        }
        
        switch(op){
            case 2:{
                a.Bidi();
            break;
            }
            
            case 1: {
            b.Uni();
            break;
            }
            default: {System.out.println("No es una opcion");}
        }

            }
        }
    }