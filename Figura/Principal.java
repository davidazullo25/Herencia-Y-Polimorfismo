public class Principal {
    public static void main(String [] args) {
        Triangulo t1 = new Triangulo(3, 4);
        Circulo c1 = new Circulo(10);
        Cuadrado s1 = new Cuadrado(5);
        
        Figura []f = new Figura[3];
        f[0] = t1;
        f[1] = c1;
        f[2] = s1;
        
        for(int i=0;i<f.length;i++) 
            f[i].calculaArea();
        
        for(int i=0;i<f.length;i++)
            System.out.println(f[i].accedeArea());
            
        for(Figura i:f)
            i.calculaArea();
            
        for(Figura i:f)
            System.out.println(i.accedeArea());
    }
}
