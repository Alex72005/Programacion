package Poo.Figura;

/*import java.util.ArrayList;*/

public class Main {
    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado("blanco",2,4);
        Triangulo t1 = new Triangulo(2,2);

        System.out.println(c1.calcularArea());
        System.out.println(t1.calcularArea());

        /* 
        ArrayList<Figura> figuras = new ArrayList<Figura>();
        figuras.add(c1);
        figuras.add(t1);

        for (int i = 0; i < figuras.size(); i++) {
            System.out.println((figuras.get(i)).calcularArea());   
        }
        */

        Circulo ca1 = new Circulo(2);
        System.out.println(ca1.calcularArea());
    }
}
