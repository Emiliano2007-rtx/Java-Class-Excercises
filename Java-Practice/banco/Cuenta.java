package banco;

public class Cuenta {
    int NumDeCuenta;
    String Titular;
    double Saldo;
    
    public Cuenta(int NumDeCuenta,String Titular, double Saldo){
        this.NumDeCuenta = NumDeCuenta;
        this.Titular = Titular;
        this.Saldo = Saldo;
    }

    public int getNumCuenta(){
        return NumDeCuenta;
    }

    public String getTitular(){
        return Titular;
    }

    public double getSaldo(){
        return Saldo;
    }

    public String toString(){
        return NumDeCuenta+"-"+Titular+"-"+Saldo;
    }
}
