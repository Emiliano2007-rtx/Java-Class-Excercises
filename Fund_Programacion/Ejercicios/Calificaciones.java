
package Ejercicios;
import java.util.*;

public class Calificaciones {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String  A1,A2,A3,A4;
        float   P1,P2,P3,P4;
        int   C1_A1,C2_A1,C3_A1,C1_A2,C2_A2,C3_A2,C1_A3,C2_A3,C3_A3,C1_A4,C2_A4,C3_A4;
       
        
        System.out.println("Alumno:");
        System.out.println("Ingrese al alumno n1");
        A1=sc.next();
        System.out.println("Ingrese la 1er calificacion");
        C1_A1=sc.nextInt();
        System.out.println("Ingrese la 2da calificacion");
        C2_A1=sc.nextInt();
        System.out.println("Ingrese la 3er calificacion");
        C3_A1=sc.nextInt();
        
        System.out.println("Alumno:");
        System.out.println("Ingrese al alumno n2");
        A2=sc.next();
        System.out.println("Ingrese la 1er calificacion");
        C1_A2=sc.nextInt();
        System.out.println("Ingrese la 2da calificacion");
        C2_A2=sc.nextInt();
        System.out.println("Ingrese la 3er calificacion");
        C3_A2=sc.nextInt();
        
        System.out.println("Alumno:");
        System.out.println("Ingrese al alumno n3");
        A3=sc.next();
        System.out.println("Ingrese la 1er calificacion");
        C1_A3=sc.nextInt();
        System.out.println("Ingrese la 2da calificacion");
        C2_A3=sc.nextInt();
        System.out.println("Ingrese la 3er calificacion");
        C3_A3=sc.nextInt();
        
        System.out.println("Alumno:");
        System.out.println("Ingrese al alumno n4");
        A4=sc.next();
        System.out.println("Ingrese la 1er calificacion");
        C1_A4=sc.nextInt();
        System.out.println("Ingrese la 2da calificacion");
        C2_A4=sc.nextInt();
        System.out.println("Ingrese la 3er calificacion");
        C3_A4=sc.nextInt();
        
        P1=(C1_A1+C2_A1+C3_A1)/3;
        P2=(C1_A2+C2_A2+C3_A2)/3;
        P3=(C1_A3+C2_A3+C3_A3)/3;
        P4=(C1_A4+C2_A4+C3_A4)/3;
        
        System.out.println("Alumno: "+A1+" Promedio "+P1);
        System.out.println("Alumno: "+A2+" Promedio "+P2);
        System.out.println("Alumno: "+A3+" Promedio "+P3);
        System.out.println("Alumno: "+A4+" Promedio "+P4);
        
        System.out.println("------------------------------------------------");
        
        if(P1>P2&&P1>P3&&P1>P4){
            System.out.println("El promedio mas alto es de: "+A1+" con "+ P1);
        }
        else if(P2>P1&&P2>P3&&P2>P4){
            System.out.println("El promedio mas alto es de: "+A2+" con "+ P2);
        }
        else if(P3>P1&&P3>P2&&P3>P4){
            System.out.println("El promedio mas alto es de: "+A3+" con "+ P3);
        }
        else if(P4>P1&&P4>P2&&P4>P3){
            System.out.println("El promedio mas alto es de: "+A4+" con "+ P4); 
        }       
        
        if(P1>9.0){
            System.out.println("Excelente "+A1);
        }
        else if(P1<=9.0 && P1>8.0){
            System.out.println("Bien "+A1);
        }
        else if(P1<=8.0&&P1>=7.0){
            System.out.println("Apenas "+A1);
        }
        else if(P1<7.0){
            System.out.println("No Alcanzo "+A1);
        }
        
        
        if(P2>9.0){
            System.out.println("Excelente "+A2);
        }
        else if(P2<=9.0 && P2>8.0){
            System.out.println("Bien "+A2);
        }
        else if(P2<=8.0&&P2>=7.0){
            System.out.println("Apenas "+A2);
        }
        else if(P2<7.0){
            System.out.println("No Alcanzo "+A2);
        }
        
        if(P3>9.0){
            System.out.println("Excelente "+A3);
        }
        else if(P3<=9.0 && P3>8.0){
            System.out.println("Bien "+A3);
        }
        else if(P3<=8.0&&P3>=7.0){
            System.out.println("Apenas "+A3);
        }
        else if(P3<7.0){
            System.out.println("No Alcanzo "+A3);
        }
        
        if(P4>9.0){
            System.out.println("Excelente "+A4);
        }
        else if(P4<=9.0 && P4>8.0){
            System.out.println("Bien "+A4);
        }
        else if(P4<=8.0&&P4>=7.0){
            System.out.println("Apenas "+A4);
        }
        else if(P4<7.0){
            System.out.println("No Alcanzo "+A4);
        }
  }
        
    
}
