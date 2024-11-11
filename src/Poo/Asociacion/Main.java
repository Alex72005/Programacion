package Poo.Asociacion;

public class Main {
    public static void main(String[] args) {
        Clave c1 = new Clave(567342);
        Usuario u1 = new Usuario("Alejandro", c1);

        System.out.println(u1);
    }
}
