import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lienzo extends JPanel {
    private Pelota pelota;
    
    public Lienzo() {
        pelota = new Pelota(100, 100, 10);
        EscucharTiempo escuchaTiempo = new EscucharTiempo();
        Timer tiempo = new Timer(1000, escuchaTiempo);
        tiempo.start();
    }
    
    class EscucharTiempo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Hola Pelota");
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        pelota.dibuja(g);
    }
}
