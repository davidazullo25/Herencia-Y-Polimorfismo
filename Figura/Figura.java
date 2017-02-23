public abstract class Figura {
    protected float area;

    public Figura() {
        area = 0;
    }
    
    public float accedeArea() {
        return area;
    }
    
    abstract public void calculaArea();
    
    public String toString() {
        return ""+area;
    }
}
