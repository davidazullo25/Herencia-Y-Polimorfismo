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
    }
    
    @Override
    public String toString() {
        return "Rombo con area = "+super.toString();
    }
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Rombo)
            return this.diagonalMayor() == ((Rombo)o).diagonalMayor()
                && this.diagonalMenor() == ((Rombo)o).diagonalMenor();
        else return super.equals(o);
    }
}
