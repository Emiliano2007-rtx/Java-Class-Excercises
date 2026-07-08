package POO.Unidad6;
import java.util.*;
import java.io.*;

public class Ejer1_U6 {
    public static void main(String[] args) {
        
        try {
            FileWriter esc = new FileWriter("POO\\Unidad6\\Archivos\\texto1.txt");
            esc.write("I hate Niggers");
            esc.close();
            System.out.println("Archivo creado");
        } catch (Exception e) {
            System.out.println("Error al crear el archivo");
        }
    }
}
