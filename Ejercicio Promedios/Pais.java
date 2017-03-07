public class Pais implements Medible{
    private int habitantes;
    
    public Pais(int habitantes) {
        this.habitantes = habitantes;
    }
    
    public int obtenerMedida(){
        return habitantes;
    }
}
