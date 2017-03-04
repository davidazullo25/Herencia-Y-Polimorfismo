public class Principal {
    public Principal() {
    }
    
    public static void main(String []args) {
        Banco banco = new Banco();
        banco.agregarCuenta(new CuentaBancaria(100));
        banco.agregarCuenta(new CuentaBancaria(200));
        banco.agregarCuenta(new CuentaBancaria(300));
        System.out.println(banco.calcularSaldoPromedio());
    }
}
