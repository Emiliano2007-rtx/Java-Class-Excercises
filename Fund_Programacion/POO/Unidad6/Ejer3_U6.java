package POO.Unidad6;
import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ejer3_U6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String op;
        int opc=0;

        while (opc!=4) {
            System.out.println("1) Crear Archivo");
            System.out.println("2) Almacenar datos en el archivo");
            System.out.println("3) Mostrar datos del archivo");
            System.out.println("4) Salir");

        try {
            op=sc.next();
            opc = Integer.parseInt(op);

            switch(opc){

                case 1:
                    try {
                        FileWriter esc = new FileWriter("POO\\Unidad6\\\\Archivos\\text_p_3.txt");
                        System.out.println("Archivo creado correctamente");
                    } catch (Exception e) {
                        System.out.println("Error al crear el archivo");
                    }
                break;

                case 2:
                    File esc = new File("POO\\Unidad6\\Archivos\\text_p_3.txt");
                    if(esc.exists()){
                    
                    try{    
                        FileWriter alm = new FileWriter("POO\\Unidad6\\Archivos\\text_p_3.txt");

                        String nom;
                        String nctrl;

                        System.out.println("Ingrese nombre:");
                        sc.nextLine();
                        nom=sc.nextLine();
                        System.out.println("Ingrese numero de control");
                        nctrl=sc.nextLine();

                        alm.write("Nombre:"+nom+"\n");
                        alm.write("N.Control"+nctrl);
                        alm.close();
                        
                    }catch(IOException e){
                        System.out.println("Error al modificar el archivo");
                    }    

                    }else{
                        System.out.println("El Archivo no ha sido creado");
                    }
                break;

                case 3:
                    File lesc = new File("POO\\Unidad6\\Archivos\\text_p_3.txt");
                    if(lesc.exists()){
                    try{    
                        String imp = Files.readString(lesc.toPath());
                        System.out.println(imp);
                    }catch(Exception e){
                        System.out.println("Error al leer el archivo");
                    }    
                    }else{
                        System.out.println("El Archivo no ha sido creado");
                    }
                break;
            }



        } catch (Exception e) {
            System.out.println("Opcion Invalida");
        }    

        }
        

    }
}
