import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Lienzo extends JPanel{
    private ArrayList<Figura> figuras;
    
    public Lienzo() {
        figuras = new ArrayList<Figura>();
        Triangulo t1 = new Triangulo(100, 100, 30, 40);
        Circulo c1 = new Circulo(200, 200, 10);
        Cuadrado s1 = new Cuadrado(300, 300, 5);
        figuras.add(t1);
        figuras.add(c1);
        figuras.add(s1);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        for(Figura f:figuras) {
            g2.setColor(f.getColor());
            f.dibuja(g2);
        }
    }
}
