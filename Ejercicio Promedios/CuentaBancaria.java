public class CuentaBancaria implements Medible{
    private int saldo;
    
    public CuentaBancaria(int saldo) {
        this.saldo = saldo;
    }
    
    public int obtenerMedida() {
        return saldo;
    }
}
