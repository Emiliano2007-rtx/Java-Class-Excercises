
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class curpRegex {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String g_Letras;
        String opc="";

        while (!opc.equals("s")) {
            
        System.out.println("Generador de CURP:");  
        System.out.println("Ingrese nombre completo:");
        sc.nextLine();
        g_Letras=sc.nextLine();

            String patron = "[a-zA-Z\\s]+";
            String cadCompleta="";

            if(g_Letras.matches(patron)){
                String iniciales [] = g_Letras.split("\s");
                char ExtIni1;
                char ExtIni2;
                char ExtIni3;
                String Sg_letra;
                String mIni1="",mIni2="",mIni3="";
                char vocal='.';
                String mVocal="";
                
                
                    ExtIni1 = iniciales[2].charAt(0);
                    ExtIni2 = iniciales[3].charAt(0);
                    ExtIni3 = iniciales[0].charAt(0);
                    Sg_letra = iniciales[2];

                    for(int i=1;i<Sg_letra.length();i++){
                        char v = Sg_letra.charAt(i);
                        if (v=='a'||v=='e'||v=='i'||v=='o'||v=='u') {
                            vocal = v;
                            break;
                        }else{
                            vocal='X';
                        }
                    }
                mVocal = mVocal.valueOf(vocal);    
                mIni1 = mIni1.valueOf(ExtIni1);
                mIni2 = mIni2.valueOf(ExtIni2);
                mIni3 = mIni3.valueOf(ExtIni3);    
                cadCompleta = mIni1+mVocal+mIni2+mIni3;
                System.out.println(cadCompleta.toUpperCase());
            }

            String fecha;
            String dia="";
            String mes="";
            String año="";
            boolean seguir = true;
            String fech_comp="";
            
        while(seguir!=false){
            System.out.println("Ingresa fecha de nacimiento (dd/mm/aa):");
            fecha=sc.next();

            Pattern ptf = Pattern.compile("\\d\\d");
            Matcher mtf = ptf.matcher(fecha);
            int cont=0;

        try {
            boolean error = false;
            while(mtf.find()){
                cont++;
                
                    if(cont==1){
                        dia = mtf.group();
                        int diaInt = Integer.parseInt(dia);
                        
                        if(diaInt>31){
                            System.out.println("Error en dia");
                            error=true;
                            if(error){
                                break;
                            }
                        }
                    }

                    if(cont==2){
                        mes = mtf.group();
                        int mesInt = Integer.parseInt(mes);

                         if(mesInt>12){
                            System.out.println("Error en mes");
                            error=true;
                            if(error){
                                break;
                            }
                         }
                    }

                    if(cont==3){
                        año = mtf.group();
                    }
                  }

                if(!error){  
                fech_comp = dia + mes + año;  
                System.out.println(fech_comp);
                seguir=false;
                }
                else{
                    System.out.println("Intenta de nuevo:");
                }
        }catch (Exception e) {
            System.out.println("Fecha no valida");
        }

        }


        boolean sg = true;
        String sexo="";
        while (sg) {
            System.out.println("Ingresa tu sexo");
            sexo=sc.next();

            if(sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M")){
                System.out.println(sexo);
                sg=false;
            }else{
                System.out.println("Intenta de nuevo:");
            }
        }

        String [] estados = {
            "AS","BC","BS","CC","CL","CM","CS","CH","DF","DG",
            "GT","GR","HG","JC","MC","MN","MS","NT","NL","OC",
            "PL","QT","QR","SP","SL","SR","TC","TS","TL","VZ",
            "YN","ZS","NE"
        };

        String[] nomEstados = {
        "aguascalientes","baja california","baja california sur","campeche","coahuila",
        "colima","chiapas","chihuahua","ciudad de mexico","durango",
        "guanajuato","guerrero","hidalgo","jalisco","estado de mexico",
        "michoacan","morelos","nayarit","nuevo leon","oaxaca",
        "puebla","queretaro","quintana roo","san luis potosi","sinaloa",
        "sonora","tabasco","tamaulipas","tlaxcala","veracruz",
        "yucatan","zacatecas","extranjero"
        };

        String estado="";
        String AvEst="";

        sg=true;
        while (sg!=false) {
            System.out.println("Ingresa tu estado:");
            estado=sc.next();
            
            for(int i = 0; i < nomEstados.length; i++){
                if(estado.equalsIgnoreCase(nomEstados[i])){
                    AvEst = estados[i];
                    sg=false;
                }
           }
        }
        
        String CURPcomp="";

        CURPcomp = cadCompleta+fech_comp+sexo+AvEst;
        
        System.out.println(CURPcomp.toUpperCase());

        System.out.println("Desea Continuar?: (S/s)");
        opc=sc.next();


        }


        }
        
    }
