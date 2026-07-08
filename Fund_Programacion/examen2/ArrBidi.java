package examen2;
import java.util.*;

public class ArrBidi {
    public void ArrBidi(){

        Scanner sc = new Scanner(System.in);

        int nFilas=0;
        int nCols=0;

        System.out.println("Ingresa el numero de filas para su array:");
        nFilas=sc.nextInt();

        System.out.println("Ingresa el numero de columnas para su array:");
        nCols=sc.nextInt();
        
        int arrb [][] = new int[nFilas][nCols];

        String num;
        int numInt;
        int nleidos=0;

            System.out.println("Ingresa numeros:");
            for(int i=0;i<arrb.length;i++){
                for(int j=0;j<arrb.length;j++){

            while (true) {
                num=sc.next();
                nleidos++;
                try{
                    numInt=Integer.parseInt(num);
                    
                    int divs = 0;

                    for(int x=1;x<=numInt;x++){
                        if (numInt%x==0) {
                            divs++;
                        }
                    }
                    if(divs==2){
                        arrb[i][j] = numInt;
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

       int opc=0;

       while (opc!=5) {
            System.out.println("1.Imprimir la suma de los datos almacenados en las filas pares");
            System.out.println("2.Imprimir el promedio de los datos almacenados en las columnas impares");
            System.out.println("3.Imprimir la cantidad total de datos que se leyeron para llenar el array");
            System.out.println("4.Imprimir el dato mayor y el menor almacenado en el arreglo, asi como la su posicion");
            System.out.println("5.Regresar al menu principal");
            opc=sc.nextInt();

            switch(opc){
                case 1:
                    for(int i=0;i<arrb.length;i++){
                        if(i%2==0){
                            int sum=0;
                        
                        for(int j=0;j<arrb[i].length;j++){
                            sum+=arrb[i][j];
                        }
                        System.out.println("Suma de la fila: "+i+" = "+sum);
                      }
                    }
                break;
                case 2:
                    for(int i=0;i<arrb.length;i++){
                        if(i%2!=0){
                            int prom=0;
                        for(int j=0;j<arrb[i].length;j++){
                            prom+=arrb[i][j];
                        }
                    System.out.println("Promedio de la fila: "+i+" = "+prom/arrb[i].length); 
                    } 
                }
                break;

                case 3:
                    System.out.println("Datos totales leidos:"+nleidos);
                break;

                case 4:
                    int nmayor=0;
                    int nmenor=4000000;
                    int posFm=0;
                    int posCm=0;
                    int posF=0;
                    int posC=0;

                    for(int i=0;i<arrb.length;i++){
                        for(int j=0;j<arrb.length;j++){
                        if(arrb[i][j]>nmayor){
                            nmayor=arrb[i][j];

                            if(arrb[i][j]==nmayor){
                                posFm=i;
                                posCm=j;
                            }
                        }

                        if(arrb[i][j]<nmenor){
                            nmenor=arrb[i][j];
                            if(arrb[i][j]==nmenor){
                                posF=i;
                                posC=j;
                            }
                        }
                      }
                    }
                    System.out.println("Numero mayor:"+nmayor);
                    System.out.println("Posicion: "+posFm+","+posCm);
                    System.out.println("Numero menor:"+nmenor);
                    System.out.println("Posicion: "+posF+","+posC);

                break;

            }
       }

  }
}
