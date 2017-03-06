import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class Rombo extends Figura{
    private float diagonalMayor;
    private float diagonalMenor;
    
    public Rombo(int x, int y, float diagonalMayor, float diagonalMenor) {
        super(x, y);
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        setColor(new Color(127, 127, 127));
    }
    
    public float accedeDiagonalMayor() {
        return diagonalMayor;
    }
    
    public float accedeDiagonalMenor() {
        return diagonalMenor;
    }
    
    @Override
    public void calculaArea() {
        area = diagonalMayor*diagonalMenor/2;
    }
    
    @Override
    public void dibuja(Graphics g){
        Graphics2D rombo = (Graphics2D) g;
        int []cX = {dimeX(), dimeX()-(int)diagonalMenor/2, dimeX(), dimeX()+(int)diagonalMenor/2};
        int []cY = {dimeY(), dimeY()+(int)diagonalMayor/2, dimeY()+(int)diagonalMayor, dimeY()+(int)diagonalMayor/2};
        rombo.fillPolygon(cX, cY, 4);
    }
    
    @Override
    public String toString() {
        return "Rombo con area = "+super.toString();
    }
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Rombo)
            return this.accedeDiagonalMayor() == ((Rombo)o).accedeDiagonalMayor()
                && this.accedeDiagonalMenor() == ((Rombo)o).accedeDiagonalMenor();
        else return super.equals(o);
    }
}
