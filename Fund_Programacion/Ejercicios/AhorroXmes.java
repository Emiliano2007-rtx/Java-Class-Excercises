package Ejercicios;
import java.util.*;

public class AhorroXmes {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String Nom1="",Nom2="",Nom3="",Nom4="",Nom5="";
        double Ahorro1_1=0,Ahorro1_2=0,Ahorro1_3=0,Ahorro1_4=0,Ahorro1_5=0,Ahorro1_6=0,Ahorro1_7=0,Ahorro1_8=0;
        double Ahorro2_1=0,Ahorro2_2=0,Ahorro2_3=0,Ahorro2_4=0,Ahorro2_5=0,Ahorro2_6=0,Ahorro2_7=0,Ahorro2_8=0;
        double Ahorro3_1=0,Ahorro3_2=0,Ahorro3_3=0,Ahorro3_4=0,Ahorro3_5=0,Ahorro3_6=0,Ahorro3_7=0,Ahorro3_8=0;
        double Ahorro4_1=0,Ahorro4_2=0,Ahorro4_3=0,Ahorro4_4=0,Ahorro4_5=0,Ahorro4_6=0,Ahorro4_7=0,Ahorro4_8=0;
        double Ahorro5_1=0,Ahorro5_2=0,Ahorro5_3=0,Ahorro5_4=0,Ahorro5_5=0,Ahorro5_6=0,Ahorro5_7=0,Ahorro5_8=0;
        double Tot1=0,Tot2=0,Tot3=0,Tot4=0,Tot5=0;
        
        for(int i=1;i<=5;i++){
            System.out.println("Ingrese Nombre del cliente: "+i);
            
            switch (i){
                case 1: Nom1=sc.next();break;
                case 2: Nom2=sc.next();break;
                case 3: Nom3=sc.next();break;
                case 4: Nom4=sc.next();break;
                case 5: Nom5=sc.next();break;
            }
            
            for(int x=1;x<=8;x++){
                System.out.println("Ahorro "+x+" del cliente "+i);
                
                switch(i){
                    case 1:
                        switch(x){
                            case 1:Ahorro1_1=sc.nextDouble();break;
                            case 2:Ahorro1_2=sc.nextDouble();break;
                            case 3:Ahorro1_3=sc.nextDouble();break;
                            case 4:Ahorro1_4=sc.nextDouble();break;
                            case 5:Ahorro1_5=sc.nextDouble();break;
                            case 6:Ahorro1_6=sc.nextDouble();break;
                            case 7:Ahorro1_7=sc.nextDouble();break;
                            case 8:Ahorro1_8=sc.nextDouble();break;
                        }break;
                        
                    case 2:
                        switch(x){
                            case 1:Ahorro2_1=sc.nextDouble();break;
                            case 2:Ahorro2_2=sc.nextDouble();break;
                            case 3:Ahorro2_3=sc.nextDouble();break;
                            case 4:Ahorro2_4=sc.nextDouble();break;
                            case 5:Ahorro2_5=sc.nextDouble();break;
                            case 6:Ahorro2_6=sc.nextDouble();break;
                            case 7:Ahorro2_7=sc.nextDouble();break;
                            case 8:Ahorro2_8=sc.nextDouble();break;
                        }break;
                        
                    case 3:
                        switch(x){
                            case 1:Ahorro3_1=sc.nextDouble();break;
                            case 2:Ahorro3_2=sc.nextDouble();break;
                            case 3:Ahorro3_3=sc.nextDouble();break;
                            case 4:Ahorro3_4=sc.nextDouble();break;
                            case 5:Ahorro3_5=sc.nextDouble();break;
                            case 6:Ahorro3_6=sc.nextDouble();break;
                            case 7:Ahorro3_7=sc.nextDouble();break;
                            case 8:Ahorro3_8=sc.nextDouble();break;
                        }break;
                        
                    case 4:
                        switch(x){
                            case 1:Ahorro4_1=sc.nextDouble();break;
                            case 2:Ahorro4_2=sc.nextDouble();break;
                            case 3:Ahorro4_3=sc.nextDouble();break;
                            case 4:Ahorro4_4=sc.nextDouble();break;
                            case 5:Ahorro4_5=sc.nextDouble();break;
                            case 6:Ahorro4_6=sc.nextDouble();break;
                            case 7:Ahorro4_7=sc.nextDouble();break;
                            case 8:Ahorro4_8=sc.nextDouble();break;
                        }break;
                        
                    case 5:
                        switch(x){
                            case 1:Ahorro5_1=sc.nextDouble();break;
                            case 2:Ahorro5_2=sc.nextDouble();break;
                            case 3:Ahorro5_3=sc.nextDouble();break;
                            case 4:Ahorro5_4=sc.nextDouble();break;
                            case 5:Ahorro5_5=sc.nextDouble();break;
                            case 6:Ahorro5_6=sc.nextDouble();break;
                            case 7:Ahorro5_7=sc.nextDouble();break;
                            case 8:Ahorro5_8=sc.nextDouble();break;
                        }break;
                }
            }
        }
        
        Tot1=(Ahorro1_1+Ahorro1_2+Ahorro1_3+Ahorro1_4+Ahorro1_5+Ahorro1_6+Ahorro1_7+Ahorro1_8)*0.09;
        Tot2=(Ahorro2_1+Ahorro2_2+Ahorro2_3+Ahorro2_4+Ahorro2_5+Ahorro2_6+Ahorro2_7+Ahorro2_8)*0.09;
        Tot3=(Ahorro3_1+Ahorro3_2+Ahorro3_3+Ahorro3_4+Ahorro3_5+Ahorro3_6+Ahorro3_7+Ahorro3_8)*0.09;
        Tot4=(Ahorro4_1+Ahorro4_2+Ahorro4_3+Ahorro4_4+Ahorro4_5+Ahorro4_6+Ahorro4_7+Ahorro4_8)*0.09;
        Tot5=(Ahorro5_1+Ahorro5_2+Ahorro5_3+Ahorro5_4+Ahorro5_5+Ahorro5_6+Ahorro5_7+Ahorro5_8)*0.09;
        
        System.out.println("Cliente:"+Nom1+" Ahorro Total "+Tot1);
        System.out.println("Cliente:"+Nom2+" Ahorro Total "+Tot2);
        System.out.println("Cliente:"+Nom3+" Ahorro Total "+Tot3);
        System.out.println("Cliente:"+Nom4+" Ahorro Total "+Tot4);
        System.out.println("Cliente:"+Nom5+" Ahorro Total "+Tot5);
    }
}
