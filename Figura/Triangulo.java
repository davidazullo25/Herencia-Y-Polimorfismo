public class Triangulo extends Figura {
    private float base;
    private float altura;
    
    public Triangulo(float b, float a) {
        base = b;
        altura = a;
    }
    
    public float accedeBase() {
        return base;
    }
    
    public float accedeAltura() {
        return altura;
    }
    
    @Override
    public void calculaArea() {
        area = base*altura/2;
    }
    
    @Override
    public void dibuja(){
    }
    
    @Override
    public String toString() {
        return "Triangulo con area = "+super.toString();
    }
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Triangulo)
            return this.accedeBase() == ((Triangulo)o).accedeBase()
                && this.accedeAltura() == ((Triangulo)o).accedeAltura();
        else return super.equals(o);
    }
}
