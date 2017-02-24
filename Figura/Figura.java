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
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Figura)
            return this.accedeArea() == ((Figura)o).accedeArea();
       return false;
    }       
}
