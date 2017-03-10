import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame implements KeyListener, ActionListener {
    private Lienzo dibujo;
    
    public Ventana(int ancho, int alto) {
        this.addKeyListener(this);
        Timer tiempo = new Timer(50, this);        
        tiempo.start();
        this.setSize(ancho, alto);
        dibujo = new Lienzo();
        this.add(dibujo);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void keyReleased(KeyEvent e) {
        System.out.println("released: "+e.getKeyChar());
    }
    
    public void keyPressed(KeyEvent e) {
        System.out.println("pressed: "+e.getKeyChar());
    }
    
    public void keyTyped(KeyEvent e) {
        System.out.println("typed: "+e.getKeyChar());
    }
    
    public void actionPerformed(ActionEvent e) {
        dibujo.redibuja();
    }
}
