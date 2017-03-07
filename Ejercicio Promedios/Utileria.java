import java.util.ArrayList;

public class Utileria{
    static float calculaPromedio(ArrayList<Medible> coleccion) {
        if(coleccion.size()==0) return 0;
        int suma = 0;
        for(Medible obj:coleccion)
            suma += obj.obtenerMedida();
        return (float)suma/coleccion.size();
    }
}
