package Poo.Herencia;

public class Main {
    public static void main(String[] args) {

        Bulbasur b1 = new Bulbasur("Manolo");
        Charmander c1 = new Charmander("Benito");
        
        c1.defender(true);
        b1.atacar(c1);

        System.out.println(c1);
    }
}
