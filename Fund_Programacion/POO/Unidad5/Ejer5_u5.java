package POO.Unidad5;
import java.util.*;

import javax.management.RuntimeErrorException;

public class Ejer5_u5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> Saldo = new ArrayList<>();
        Saldo.add(50);
        boolean seg = true;
        int comp=0;
        int htdgs = 10;
        String r = "";

    while (seg!=false) {
        System.out.println("Puesto de Hot Dogs:");
        System.out.println("Cuantos desea comprar?:");
        comp=sc.nextInt();

        htdgs = htdgs*comp;
    
    try{        
        if(htdgs>Saldo.get(0)){
             throw new RuntimeErrorException(null,"Error");
        }else{
           int cambio=0;
           cambio = Saldo.get(0)-htdgs;
           System.out.println("Compra Exitosa:");
           System.out.println("Saldo Restante:"+cambio);
        }

    boolean s = true;
    while (s!=false) {
    try{    
        System.out.println("Desea comprar otro? (Si/No)");
        r=sc.next();
        if(r.equalsIgnoreCase("no")){
            seg=false;
            s=false;
        }else if(r.equalsIgnoreCase("si")){
            s=false;
        }else if(!r.equalsIgnoreCase("si")||!r.equalsIgnoreCase("no")){
            throw new RuntimeErrorException(null);
        }
    }catch(Exception a){
        System.out.println("Valor No Valido");
    }
    }   
    }catch(Exception e){
        throw new RuntimeErrorException(null,"Saldo Insuficiente");
    }

    }

   }
}
