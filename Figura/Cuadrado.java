import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class Cuadrado extends Figura{
    private float lado;
    
    public Cuadrado(int x, int y, float lado) {
        super(x, y);
        this.lado = lado;
        setColor(new Color(0, 127, 127));
    }
    
    public float accedeLado() {
        return lado;
    }
    
    @Override
    public void calculaArea() {
        area = lado*lado;
    }
    
    @Override
    public void dibuja(Graphics g) {
        Graphics2D cuadrado = (Graphics2D) g;
        cuadrado.fillRect(dimeX(), dimeY(), (int)lado, (int)lado);
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
