import java.util.ArrayList;

public class Banco{
    ArrayList<CuentaBancaria> cuentas;
    
    public Banco() {
        cuentas = new ArrayList<CuentaBancaria>();
    }
    
    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }
    
    public ArrayList<CuentaBancaria> getCuentas() {
        return cuentas;
    }
}
