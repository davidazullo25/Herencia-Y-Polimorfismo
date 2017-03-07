import java.util.ArrayList;

public class Planeta{
    ArrayList<Pais> paises;
    
    public Planeta() {
        paises = new ArrayList<Pais>();
    }
    
    public void agregarPais(Pais pais) {
        paises.add(pais);
    }
        
    public ArrayList<Medible> getDatos() {
        ArrayList<Medible> p = new ArrayList<Medible>();
        for(Pais pais:paises)
            p.add((Medible)pais);
        return p;
    }
}
