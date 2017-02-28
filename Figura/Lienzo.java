import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Lienzo extends JPanel{
    private ArrayList<Figura> figuras;
    
    public Lienzo() {
        figuras = new ArrayList<Figura>();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
    }
}
