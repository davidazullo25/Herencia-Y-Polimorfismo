public class Cuadrado extends Figura{
    private float lado;
    
    public Cuadrado(float lado) {
        this.lado = lado;
    }
    
    public void calculaArea() {
        area = lado*lado;
    }
}
