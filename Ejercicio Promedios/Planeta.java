import java.util.ArrayList;

public class Planeta{
    ArrayList<Pais> paises;
    
    public Planeta() {
        paises = new ArrayList<Pais>();
    }
    
    public void agregarPais(Pais pais) {
        paises.add(pais);
    }
    
    public ArrayList<Pais> getPaises() {
        return paises;
    }
}
