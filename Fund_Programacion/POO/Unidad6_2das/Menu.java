package POO.Unidad6_2das;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class Menu {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String N_arch = "";
        boolean cont = true;

        while (cont) {
            System.out.println("Ingrese nombre del archivo:");
            N_arch = sc.nextLine();

            if (N_arch.matches("^[a-zA-Z][a-zA-Z0-9]*\\.txt$")) {
                try {
                    String rutaComp = "POO\\Unidad6_2das\\" + N_arch;
                    FileWriter arch = new FileWriter(rutaComp, true);
                    arch.close();
                    System.out.println("Archivo creado con exito");

                    System.out.println("Desea continuar trabajando con el archivo? :");
                    String SN = sc.nextLine();

                    if (SN.equalsIgnoreCase("si")) {
                        cont = false;
                    }
                } catch (Exception e) {
                    System.out.println("Error al crear el archivo");
                } 
            } else {
                System.out.println("Nombre de archivo no valido");
            }    
        }        
   
        int opc = 0;

        while (opc != 5) {
            System.out.println("MENU DE REGISTROS:");
            System.out.println("");
            System.out.println("1.Añadir Registro");
            System.out.println("2.Modificar Registro");
            System.out.println("3.Eliminar Registro");
            System.out.println("4.Consultar");
            System.out.println("5.Finalizar");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    String clave;    
                    String nombre;
                    int edad;
                    float est;
                    char sexo;

                    try {
                        String rutaComp = "POO\\Unidad6_2das\\" + N_arch;
                        FileWriter arch = new FileWriter(rutaComp);
                        PrintWriter esc = new PrintWriter(arch);

                        while (true) {
                            System.out.print("Clave: ");
                            clave = sc.nextLine();
                            if (clave.matches("^[a-zA-Z]{3}\\d{3}$")) {
                                break;
                            }
                            System.out.println("Invalido. Intente de nuevo.");
                        }

                        while (true) {
                            System.out.print("Nombre: ");
                            nombre = sc.nextLine().trim();
                            if (nombre.matches("^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$")) {
                                break;
                            }
                            System.out.println("Invalido. Intente de nuevo.");
                        }

                        while (true) {
                            System.out.print("Edad: ");
                            String edadInput = sc.nextLine();
                            if (edadInput.matches("^\\d{1,2}$")) {
                                edad = Integer.parseInt(edadInput);
                                if (edad >= 1 && edad <= 99) {
                                    break;
                                }
                            }
                            System.out.println("Invalido. Intente de nuevo.");
                        }

                        while (true) {
                            System.out.print("Estatura: ");
                            String estInput = sc.nextLine().replace(',', '.');
                            if (estInput.matches("^\\d\\.\\d{1,2}$")) {
                                est = Float.parseFloat(estInput);
                                if (est >= 1.0f && est <= 2.5f) {
                                    break;
                                }
                            }
                            System.out.println("Invalido. Intente de nuevo.");
                        }

                        while (true) {
                            System.out.print("Sexo: ");
                            String sexoInput = sc.nextLine().trim().toUpperCase();
                            if (sexoInput.matches("^[FM]$")) {
                                sexo = sexoInput.charAt(0);
                                break;
                            }
                            System.out.println("Invalido. Intente de nuevo.");
                        }

                        esc.println(clave);
                        esc.println(nombre);
                        esc.println(edad);
                        esc.println(est);
                        esc.println(sexo);
                        
                        esc.close();
                        arch.close();
                        System.out.println("Guardado.");

                    } catch (Exception e) {
                        System.out.println("Error.");
                    }
                    break;

                case 2:
                    try {
                        File f = new File("POO\\Unidad6_2das\\" + N_arch);
                        if (!f.exists()) {
                            System.out.println("El archivo no existe.");
                            break;
                        }
                        
                        Scanner scn = new Scanner(f);
                        String c = scn.nextLine();
                        String n = scn.nextLine();
                        String ed = scn.nextLine();
                        String es = scn.nextLine();
                        String s = scn.nextLine();
                        scn.close();

                        System.out.println("Datos actuales: " + c + ", " + n);
                        
                        System.out.print("Nuevo Nombre: ");
                        n = sc.nextLine();
                        System.out.print("Nueva Edad: ");
                        ed = sc.nextLine();
                        System.out.print("Nueva Estatura: ");
                        es = sc.nextLine();
                        System.out.print("Nuevo Sexo: ");
                        s = sc.nextLine();

                        FileWriter escritor = new FileWriter(f);
                        PrintWriter pw = new PrintWriter(escritor);
                        pw.println(c);
                        pw.println(n);
                        pw.println(ed);
                        pw.println(es);
                        pw.println(s);
                        pw.close();
                        escritor.close();

                        System.out.println("Modificado.");

                    } catch (Exception e) {
                        System.out.println("Error al modificar.");
                    }
                    break;

                case 3:
                    try {
                        File f = new File("POO\\Unidad6_2das\\" + N_arch);

                        if (f.exists()) {
                            f.delete();
                            System.out.println("Registro eliminado.");
                        } else {
                            System.out.println("No existe el registro.");
                        }

                    } catch (Exception e) {
                        System.out.println("Error al eliminar.");
                    }
                    break;
                case 4:
                    try {
                        File f = new File("POO\\Unidad6_2das\\" + N_arch);

                        if (f.exists()) {
                            Scanner scn = new Scanner(f);
                            System.out.println(" Datos del Archivo ");
                            while (scn.hasNextLine()) {
                                System.out.println(scn.nextLine());
                            }
                            scn.close();
                        } else {
                            System.out.println("El archivo no existe.");
                        }

                    } catch (Exception e) {
                        System.out.println("Error al leer el archivo.");
                    }
                    break;
                
                }
            }
        }
    }