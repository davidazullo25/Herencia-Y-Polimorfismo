import java.util.*;
public class Principal {
    public static void main(String [] args) {
        /*Triangulo t1 = new Triangulo(100, 100, 3, 4);
        Circulo c1 = new Circulo(200, 200, 10);
        Cuadrado s1 = new Cuadrado(300, 300, 5);
        Figura []f = new Figura[3];
        f[0] = t1;
        f[1] = c1;
        f[2] = s1;
        
        Triangulo t2 = new Triangulo(100, 200, 5, 8);
        Circulo c2 = new Circulo(200, 300, 12);
        Cuadrado s2 = new Cuadrado(300, 100, 10);
        ArrayList<Figura> a = new ArrayList<Figura>();
        a.add(t2);
        a.add(c2);
        a.add(s2);
        Iterator<Figura> it = a.iterator();
        Figura actual;
        
        for(int i=0;i<f.length;i++) 
            f[i].calculaArea();
        for(int i=0;i<f.length;i++)
            System.out.println(f[i]);
            
        for(Figura i:f)
            i.calculaArea();
        for(Figura i:f)
            System.out.println(i);
            
        while(it.hasNext()) {
            actual=it.next();
            actual.calculaArea();
        }
        it = a.iterator();
        while(it.hasNext()) {
            actual=it.next();
            System.out.println(actual);
        }
        
        for(Figura i:f)
            System.out.println(i);
            
        Triangulo t3 = new Triangulo(0, 0, 5, 10);
        Cuadrado s3 = new Cuadrado(0, 0, 5);    
        Circulo c3 = new Circulo(0, 0, 12);    
        Circulo c4 = new Circulo(0, 0, 12); 
            
        System.out.println(t3.equals(s3));
        System.out.println(c3.equals(c4));
        */
        Ventana vent = new Ventana(400, 400);
        vent.setVisible(true);
    }
}
