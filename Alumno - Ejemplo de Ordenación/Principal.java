import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
    public static void main(String []args) {
        ArrayList<Alumno> alumnos;
        alumnos = new ArrayList<Alumno>();
        alumnos.add( new Alumno(150) );
        alumnos.add( new Alumno(250) );
        alumnos.add( new Alumno(50) );
        alumnos.add( new Alumno(1150) );
        alumnos.add( new Alumno(15) );
        
        Alumno []arrAlumnos;
        arrAlumnos = new Alumno[alumnos.size()];
        arrAlumnos = alumnos.toArray(arrAlumnos);
        Arrays.sort(arrAlumnos);
        
        for(Alumno alu:alumnos)
            System.out.println(alu);
        for(Alumno alu:arrAlumnos)
            System.out.println(alu);
    }
}
