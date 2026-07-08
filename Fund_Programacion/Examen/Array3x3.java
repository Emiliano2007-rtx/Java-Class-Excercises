package Examen;
import java.util.*;

public class Array3x3 {
    public void Array3x3(){
        Scanner sc = new Scanner(System.in);

        int arr [][] = new int[3][3];

        String num;
        int numInt;
        int prim=0;

            System.out.println("Ingresa numeros:");
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                while (true) {
                num=sc.next();
                try{
                    numInt=Integer.parseInt(num);
                    
                for(int x=1;x<=numInt;x++){
                     if(numInt%x==0){
                        prim++;
                    }
                }  
                if(prim==2){
                    System.out.println("Es primo");
                    arr[i][j]=numInt;
                    break;
                }else{
                    System.out.println("No es primo");
                }

                }catch(Exception e){
                    System.out.println("No es un numero entero");

                }    
                        
             }
            }
          }
        }
    }

