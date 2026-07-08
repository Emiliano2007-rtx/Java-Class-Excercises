package banco;
import java.util.*;

public class Banco {

    Scanner sc = new Scanner(System.in);

    public void CrearCuenta(){
        Random r = new Random();
        int NumCuenta = r.nextInt(0000000,1000000); 
        String Titular;
        double Saldo;

        System.out.println("Ingrese el Titular:");
        Titular=sc.nextLine();

        Saldo=0;

        Cuenta c = new Cuenta(NumCuenta, Titular, Saldo);
        System.out.println(c);
    }

    public void Depositar(){

    }
}
