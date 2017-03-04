import java.util.ArrayList;

public class Banco {
    ArrayList<CuentaBancaria> cuentas;
    
    public Banco() {
        cuentas = new ArrayList<CuentaBancaria>();
    }
    
    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }
    
    public float calcularSaldoPromedio() {
        int suma = 0;
        for(CuentaBancaria cuenta:cuentas)
            suma += cuenta.getSaldo();
        return (float)suma/cuentas.size();
    }
}
