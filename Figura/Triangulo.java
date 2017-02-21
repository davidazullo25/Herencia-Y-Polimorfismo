public class Triangulo extends Figura {
    private float base;
    private float altura;
    
    public Triangulo(float b, float a) {
        base = b;
        altura = a;
    }
    
    public void calculaArea() {
        area = base*altura/2;
    }
}
