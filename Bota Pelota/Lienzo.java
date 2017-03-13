import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

public class Lienzo extends JPanel {
    private LinkedList<Pelota> pelotas;
    
    public Lienzo() {
        pelotas = new LinkedList<Pelota>();
        pelotas.add( new Pelota(100, 100, 10) );
        EscuchadorRaton escuchadorRaton = new EscuchadorRaton();
        this.addMouseListener(escuchadorRaton);
    }
    
    public void redibuja() {
        Rectangle r = getBounds();
        for(Pelota pelota:pelotas)
            pelota.muevete(r);
        repaint();
    }
    
    public void redibuja(int incrementoX, int incrementoY) {
        for(Pelota pelota:pelotas) {
            if(incrementoY==1)
                pelota.mueveteArriba();
            if(incrementoY==-1)
                pelota.mueveteAbajo(getBounds());
            if(incrementoX==1)
                pelota.mueveteDerecha(getBounds());
            if(incrementoX==-1)
                pelota.mueveteIzquierda();
        }
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        for(Pelota pelota:pelotas)
            pelota.dibuja(g);
    }
    
    class EscuchadorRaton extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            pelotas.add( new Pelota(e.getX(), e.getY(), (int)(Math.random()*25)+5) );
            repaint();            
        }
    }
}
