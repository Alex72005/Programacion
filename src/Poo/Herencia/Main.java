package Poo.Herencia;

public class Main {
    public static void main(String[] args) {

        Bulbasur b1 = new Bulbasur("Manolo");
        Charmander c1 = new Charmander("Benito");
        Squirtel s1 = new Squirtel("Pacomer");
        
        c1.defender(true);
        b1.atacar(c1);

       
        c1.atacar(b1);
        System.out.println(b1);
        System.out.println(s1);

    }
}
