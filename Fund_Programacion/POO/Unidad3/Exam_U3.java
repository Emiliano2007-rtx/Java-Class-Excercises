
import java.util.*;
import java.util.regex.*;

public class Exam_U3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, curp, tel, opc = "S";


        while (opc.equalsIgnoreCase("S")) {

                System.out.println("Ingresa nombre completo:");
                nombre = sc.nextLine();
                Pattern pn = Pattern.compile("[a-zA-Z\\s]+");
                Matcher vn = pn.matcher(nombre);


            if (!vn.matches()) {
                while (!vn.matches()) {
                    System.out.println("Error. Nombre de nuevo:");
                    nombre = sc.nextLine();
                    vn = pn.matcher(nombre);
                }
            }
                    System.out.println("Ingresa tu CURP:");
                    curp = sc.nextLine().toUpperCase();
                    Pattern pc = Pattern.compile("[A-Z]{4}[0-9]{6}[HM][A-Z]{5}[A-Z0-9][0-9]");
                    Matcher vc = pc.matcher(curp);

            if (!vc.matches()) {
                while (!vc.matches()) {
                    System.out.println("Error. CURP de nuevo:");
                    curp = sc.nextLine().toUpperCase();
                    vc = pc.matcher(curp);
                }
            }

                    System.out.println("Ingresa tu numero de telefono:");
                    tel = sc.nextLine();
                    Pattern pt = Pattern.compile("[0-9]{10}");
                    Matcher vt = pt.matcher(tel);


                if (!vt.matches()) {
                    while (!vt.matches()) {
                        System.out.println("Error. Telefono de nuevo:");
                        tel = sc.nextLine();
                        vt = pt.matcher(tel);
                    }
                }



            String[] partes = nombre.split(" ");
            String n = partes[0].toLowerCase();
            String a1 = partes[1].substring(0, 1).toLowerCase();
            String a2 = partes[2].substring(0, 1).toLowerCase();
            String correo = n + "." + a1 + a2 + "@gmail.com";


            String c6 = curp.substring(11, 17);
            String t4 = tel.substring(6, 10);
            String contra = c6 + t4 + "&";


            System.out.println("Correo: " + correo);
            System.out.println("Contrasena: " + contra);
            

            System.out.println("Continuar? (S/N):");
            opc = sc.nextLine();
        }
    }
}
