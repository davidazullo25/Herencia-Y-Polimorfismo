public class Alumno implements Comparable{
    private int creditos;
    
    Alumno(int creditos) {
        this.creditos = creditos;
    }

    public String toString() {
        return "Alumno con "+creditos+" creditos";
    }
    
    @Override
    public int compareTo(Object other) {
        Alumno tmp = (Alumno)other;
        if(this.creditos == tmp.creditos)
            return 0;
        else if(this.creditos < tmp.creditos)
            return -1;
        return 1;
    }
}
