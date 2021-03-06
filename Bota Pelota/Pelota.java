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
        int size = 20;
        int azar = (int)(Math.random()*2);
        if(azar==0)
            azar = -1;
        incx = size*azar;
        azar = (int)(Math.random()*2);
        if(azar==0)
            azar = -1;
        incy = size*azar;
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
    
    public void mueveteArriba() {
        if(posy>radio)
            posy -= Math.abs(incy);        
    }
    
    public void mueveteAbajo(Rectangle r) {
        if(posy+radio<r.getHeight())
            posy += Math.abs(incy);        
    } 
    
    public void mueveteIzquierda() {
        if(posx>radio)
            posx -= Math.abs(incx);        
    }
    
    public void mueveteDerecha(Rectangle r) {
        if(posx+radio<r.getWidth())
            posx += Math.abs(incx);        
    } 
}
