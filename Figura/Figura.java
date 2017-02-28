import java.awt.Graphics;
import java.awt.Graphics2D;

public abstract class Figura {
    protected float area;
    private int posx;
    private int posy;

    public Figura(int x, int y) {
        posx = x;
        posy = y;
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
    
    abstract public void dibuja();
    
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
