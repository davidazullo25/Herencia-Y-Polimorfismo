import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame implements KeyListener, ActionListener {
    private Lienzo dibujo;
    private boolean pausa;
    private Timer tiempo;
    
    public Ventana(int ancho, int alto) {
        pausa = false;
        this.addKeyListener(this);
        tiempo = new Timer(50, this);        
        tiempo.start();
        this.setSize(ancho, alto);
        dibujo = new Lienzo();
        this.add(dibujo);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void keyReleased(KeyEvent e) {
        if(e.getKeyChar()==' ') {
            pausa = !pausa;
            if(pausa)
                tiempo.stop();
            else tiempo.start();
        }
    }
    
    public void keyPressed(KeyEvent e) {
        if(e.getKeyChar()=='a')
            dibujo.redibuja(-1,0);
        if(e.getKeyChar()=='d')
            dibujo.redibuja(1,0);
        if(e.getKeyChar()=='w')
            dibujo.redibuja(0,1);
        if(e.getKeyChar()=='s')
            dibujo.redibuja(0,-1);
    }
    
    public void keyTyped(KeyEvent e) {
    }
    
    public void actionPerformed(ActionEvent e) {
        dibujo.redibuja();
    }
}
