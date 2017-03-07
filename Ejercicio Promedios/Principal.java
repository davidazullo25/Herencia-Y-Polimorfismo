public class Principal {
    public Principal() {
    }
    
    public static void main(String []args) {
        Banco banco = new Banco();
        banco.agregarCuenta(new CuentaBancaria(100));
        banco.agregarCuenta(new CuentaBancaria(200));
        banco.agregarCuenta(new CuentaBancaria(300));
        System.out.println(Utileria.calculaPromedio(banco.getCuentas()));
        
        Planeta planeta = new Planeta();
        planeta.agregarPais(new Pais(25));
        planeta.agregarPais(new Pais(32));
        planeta.agregarPais(new Pais(94));
        System.out.println(Utileria.calculaPromedio(planeta.getPaises()));
    }
}
