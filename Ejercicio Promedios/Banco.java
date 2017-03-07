import java.util.ArrayList;

public class Banco{
    ArrayList<CuentaBancaria> cuentas;
    
    public Banco() {
        cuentas = new ArrayList<CuentaBancaria>();
    }
    
    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }
    
    public ArrayList<Medible> getDatos() {
        ArrayList<Medible> c = new ArrayList<Medible>();
        for(CuentaBancaria cuenta:cuentas)
            c.add((Medible)cuenta);
        return c;
    }
}
