
package Ejercicios;
import java.util.*;

public class RecFinancieros {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int emp;
        String nom;
        int hrs;
        int pxh;
        int P40hrs;
        int P5hrXtra;
        int Sig5hrXtra;
        int PagoTotal;
        
        System.out.println("PAGO SEMANAL:");
            System.out.println("Elije el empleado\n");
            System.out.println("Empleado: 1 \f");
            System.out.println("Empleado: 2 \f");
            System.out.println("Empleado: 3 \f");
            System.out.println("Empleado: 4 \f");
            System.out.println("Empleado: 5 \f");
            emp=sc.nextInt();
      
    while(emp<=5){        
        
       switch (emp){
           case 1:
               System.out.println("Ingresa el nombre del empleado");
               nom=sc.next();
               System.out.println("Ingresa las horas ");
               hrs=sc.nextInt();
               System.out.println("Ingresa el pago por hora");
               pxh=sc.nextInt();
               P40hrs=pxh*40;
               P5hrXtra=(pxh*5)*2;
               Sig5hrXtra=(pxh*5)*3;
               PagoTotal=P40hrs+P5hrXtra+Sig5hrXtra;
               System.out.println("Empleado: "+nom+" "+PagoTotal);
               break;
           case 2:    
               System.out.println("Ingresa el nombre del empleado");
               nom=sc.next();
               System.out.println("Ingresa las horas ");
               hrs=sc.nextInt();
               System.out.println("Ingresa el pago por hora");
               pxh=sc.nextInt();
               P40hrs=pxh*40;
               P5hrXtra=(pxh*5)*2;
               Sig5hrXtra=(pxh*5)*3;
               PagoTotal=P40hrs+P5hrXtra+Sig5hrXtra;
               System.out.println("Empleado: "+nom+" "+PagoTotal);
               break;
           case 3:
               System.out.println("Ingresa el nombre del empleado");
               nom=sc.next();
               System.out.println("Ingresa las horas ");
               hrs=sc.nextInt();
               System.out.println("Ingresa el pago por hora");
               pxh=sc.nextInt();
               P40hrs=pxh*40;
               P5hrXtra=(pxh*5)*2;
               Sig5hrXtra=(pxh*5)*3;
               PagoTotal=P40hrs+P5hrXtra+Sig5hrXtra;
               System.out.println("Empleado: "+nom+" "+PagoTotal);
               break;
           case 4:
               System.out.println("Ingresa el nombre del empleado");
               nom=sc.next();
               System.out.println("Ingresa las horas ");
               hrs=sc.nextInt();
               System.out.println("Ingresa el pago por hora");
               pxh=sc.nextInt();
               P40hrs=pxh*40;
               P5hrXtra=(pxh*5)*2;
               Sig5hrXtra=(pxh*5)*3;
               PagoTotal=P40hrs+P5hrXtra+Sig5hrXtra;
               System.out.println("Empleado: "+nom+" "+PagoTotal);
               break;
           case 5:
              System.out.println("Ingresa el nombre del empleado");
               nom=sc.next();
               System.out.println("Ingresa las horas ");
               hrs=sc.nextInt();
               System.out.println("Ingresa el pago por hora");
               pxh=sc.nextInt();
               P40hrs=pxh*40;
               P5hrXtra=(pxh*5)*2;
               Sig5hrXtra=(pxh*5)*3;
               PagoTotal=P40hrs+P5hrXtra+Sig5hrXtra;
               System.out.println("Empleado: "+nom+" "+PagoTotal);
               
       }
           
    }
            
    }
    
}
