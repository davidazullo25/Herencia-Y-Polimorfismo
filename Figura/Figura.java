import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public abstract class Figura {
    protected float area;
    private int posx;
    private int posy;
    private Color color;

    public Figura(int x, int y) {
        posx = x;
        posy = y;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
    protected float accedeArea() {
        return area;
    }
    
    protected int dimeX() {
        return posx;
    }
    
    protected int dimeY() {
        return posy;
    }
    
    abstract public void dibuja(Graphics g);
    
    abstract public void calculaArea();
        
    public String toString() {
        return ""+area;
    }
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Figura)
            return this.accedeArea() == ((Figura)o).accedeArea();
       return false;
    }       
}
