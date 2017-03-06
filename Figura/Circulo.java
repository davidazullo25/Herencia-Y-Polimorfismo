import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class Circulo extends Figura{
    private float radio;
    
    public Circulo(int x, int y, int radio) {
        super(x, y);
        this.radio = radio;
        setColor(new Color(127, 127, 255));
    }
    
    public float accedeRadio() {
        return radio;
    }
    
    @Override
    public void calculaArea() {
        area = (float)3.1416*radio*radio;
    }
    
    @Override
    public void dibuja(Graphics g){
        Graphics2D circulo = (Graphics2D) g;
        circulo.fillOval(dimeX(), dimeY(), (int) radio*2, (int) radio*2);
    }
    
    @Override
    public String toString() {
        return "Circulo con area = "+super.toString();
    }
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Circulo)
            return this.accedeRadio() == ((Circulo)o).accedeRadio();
        else return super.equals(o);
    }
}
