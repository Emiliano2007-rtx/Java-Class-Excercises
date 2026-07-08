package POO.Unidad1.ExamenU1;

import java.util.Scanner;

public class Bidimencional {
    
    public void Bidi(){
    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);
    int opB = 0, x,y,numero,suma = 0;
    int i = 0, j = 0;
    float promedio;
    System.out.println("De cuantas filas sera el arreglo?");
    x = leer.nextInt();
    System.out.println("De cuantas columnas sera el arreglo?");
    y = leer.nextInt();
    int original [][] = new int [x][y];
    while(opB!=5){
        System.out.println("1. Llenar el arreglo (solo con números enteros pares)");
        System.out.println("2. Sumar e imprimir los datos de cada fila");
        System.out.println("3. Sumar e imprimir el total de datos almacenados");
        System.out.println("4. Calcular e imprimir el promedio general de los datos almacenados");
        System.out.println("5. Regresar al menú principal");
        opB = leer.nextInt();
        
        String txt;
        
         
        switch(opB){
            case 1:{
                i=0;
                j=0;

                while (j<x){
                while (i<y) {
                    System.out.println("Ingrese un numero par entero de la posicion "+(i+1)+","+(j+1));
                    txt = leer2.nextLine();

                    //Valida que el dato sea un numero
                    try{
                    numero = Integer.parseInt(txt);

                    //verifica que sea par
                    if (numero%2==0){
                        original [i][j] = numero; //Arreglo original
                        suma += numero; //Suma todos los datos para el promedio
                        j++;
                        if (j==y){
                            i++;
                            if (i<x){
                                j=0;
                            }
                        }

                    }else{
                        System.out.println("No es un numero par");
                    }

                    }catch(NumberFormatException e){
                        System.out.println("No es un numero entero");
                    }
                }
            }
            break;
            }
            case 2:{
                i = 0;
                j = 0;
                int sumfila=0;
                while (i<x){
                    while (j<y){
                        sumfila += original[i][j];
                        j++;
                    }
                    System.out.println("La suma de la fila "+(i+1)+" es: "+sumfila);
                    j=0;
                    i++;
                }
            break;
            }
            case 3:{
                System.out.println("la suma de todos los datos es: "+suma);
            break;
            }
            case 4:{
                promedio = suma / (x*y);
                System.out.println("El promedio es: "+promedio);
            break;
            }
        }
    }
  }
}