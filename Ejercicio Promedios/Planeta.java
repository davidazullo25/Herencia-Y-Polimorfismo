import java.util.ArrayList;

public class Planeta {
    ArrayList<Pais> paises;
    
    public Planeta() {
        paises = new ArrayList<Pais>();
    }
    
    public void agregarPais(Pais pais) {
        paises.add(pais);
    }
    
    public float calcularHabitantesPromedio() {
        int suma = 0;
        for(Pais pais:paises)
            suma += pais.getHabitantes();
        return (float)suma/paises.size();
    }
}
