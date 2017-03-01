import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class Triangulo extends Figura {
    private float base;
    private float altura;    
    
    public Triangulo(int x, int y, float b, float a) {
        super(x, y);
        base = b;
        altura = a;
        setColor(new Color(0, 0, 127));
    }
    
    public float accedeBase() {
        return base;
    }
    
    public float accedeAltura() {
        return altura;
    }
    
    @Override
    public void calculaArea() {
        area = base*altura/2;
    }
    
    @Override
    public void dibuja(Graphics g){
    }
    
    @Override
    public String toString() {
        return "Triangulo con area = "+super.toString();
    }
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Triangulo)
            return this.accedeBase() == ((Triangulo)o).accedeBase()
                && this.accedeAltura() == ((Triangulo)o).accedeAltura();
        else return super.equals(o);
    }
}
