import java.awt.Graphics;
import java.awt.Rectangle;

public class Pelota {
    private int posx;
    private int posy;
    private int incx;
    private int incy;
    private int radio;
    
    public Pelota(int x, int y, int r) {
        this.posx = x;
        this.posy = y;
        this.radio = r;
        incx = 5;
        incy = 5;
    }
    
    public void dibuja(Graphics g) {
        g.drawOval(posx, posy, radio*2, radio*2);
    }
    
    public void muevete(Rectangle r) {
        posx += incx;
        posy += incy;
        if(posx<=radio||posx+radio>=r.getWidth())
            incx *= -1;
        if(posy<=radio||posy+radio>=r.getHeight())
            incy *= -1;
    }
}
