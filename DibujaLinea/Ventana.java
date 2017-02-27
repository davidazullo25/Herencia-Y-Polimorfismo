import javax.swing.JFrame;

public class Ventana extends JFrame {
    private Lienzo lienzo;
    
    public Ventana(int ancho, int alto) {
        super.setSize(ancho, alto);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lienzo = new Lienzo();
        super.add(lienzo);
    }
}
