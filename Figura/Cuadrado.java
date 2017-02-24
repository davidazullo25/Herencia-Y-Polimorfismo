public class Cuadrado extends Figura{
    private float lado;
    
    public Cuadrado(float lado) {
        this.lado = lado;
    }
    
    public float accedeLado() {
        return lado;
    }
    
    public void calculaArea() {
        area = lado*lado;
    }
    
    @Override
    public String toString() {
        return "Cuadrado con area = "+super.toString();
    }
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Cuadrado)
            return this.accedeLado() == ((Cuadrado)o).accedeLado();
        else return super.equals(o);
    }
}
