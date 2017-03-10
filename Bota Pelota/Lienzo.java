import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Lienzo extends JPanel {
    private Pelota pelota;
    
    public Lienzo() {
        pelota = new Pelota(100, 100, 10);
    }
    
    public void redibuja() {
        pelota.muevete(getBounds());
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLUE);
        pelota.dibuja(g);
    }
}
