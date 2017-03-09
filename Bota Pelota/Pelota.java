import java.awt.Graphics;

public class Pelota {
    private int posx;
    private int posy;
    private int radio;
    
    public Pelota(int x, int y, int r) {
        this.posx = x;
        this.posy = y;
        this.radio = r;
    }
    
    public void dibuja(Graphics g) {
        g.drawOval(posx, posy, radio*2, radio*2);
    }
}
