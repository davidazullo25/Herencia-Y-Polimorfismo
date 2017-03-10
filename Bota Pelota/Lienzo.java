import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Lienzo extends JPanel {
    private Pelota pelota;
    
    public Lienzo() {
        pelota = new Pelota(100, 100, 10);
        EscucharTiempo escuchaTiempo = new EscucharTiempo();
        Timer tiempo = new Timer(50, escuchaTiempo);
        tiempo.start();
    }
    
    class EscucharTiempo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            pelota.muevete(getBounds());
            repaint();
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLUE);
        pelota.dibuja(g);
    }
}
