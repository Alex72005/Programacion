package Poo.Herencia;

public class Main {
    public static void main(String[] args) {

        Bulbasur b1 = new Bulbasur("Manolo", "planta");
        Charmander c1 = new Charmander("Benito", "fuego", 3);
        
        c1.defender(true);
        b1.atacar(c1);

        b1.defender(true);
        c1.atacar(b1);
        System.out.println(b1);
    }
}
