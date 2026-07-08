package banco;
import java.util.*;

public class MainMenu {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int opc=0;

        while (opc!=7) {
            System.out.println("1.Crear Cuenta");
            System.out.println("2.Depositar");
            System.out.println("3.Retirar");
            System.out.println("4.Consultar Saldo");
            System.out.println("5.Mostrar Cuentas");
            System.out.println("6.Eliminar Cuenta");
            System.out.println("7.Salir");
            opc = sc.nextInt();


            switch(opc){
                case 1:
                    Banco ban = new Banco();
                    ban.CrearCuenta();
                break;
            }
        }
    }
}
