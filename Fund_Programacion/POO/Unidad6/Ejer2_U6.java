package POO.Unidad6;
import java.util.*;
import java.io.*;

public class Ejer2_U6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nom;
        String nc;

    try {
            FileWriter esc = new FileWriter("POO\\Unidad6\\Archivos\\text_p_2.txt");
            System.out.println("Ingresa el nombre:");
            nom=sc.nextLine();
            System.out.println("Ingresa numero de control");
            sc.nextLine();
            nc=sc.nextLine();
            esc.write("Nombre:"+nom+"\n");
            esc.write("Num Control:"+nc);
            esc.close();
            System.out.println("Archivo creado");


    } catch (Exception e) {
            System.out.println("Error al crear el archivo");
    }
  }
}
