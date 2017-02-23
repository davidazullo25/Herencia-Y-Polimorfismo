public class Circulo extends Figura{
    private float radio;
    
    public Circulo(int radio) {
        this.radio = radio;
    }
    
    public void calculaArea() {
        area = (float)3.1416*radio*radio;
    }
    
    @Override
    public String toString() {
        return "Circulo con area = "+super.toString();
    }
}
