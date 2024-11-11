package Poo.bidireccionalNaN;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Alejandro");
        Perro  pe1 = new Perro("Bobby");
        Perro pe2 = new Perro("Mike");

        p1.agregarMascota(pe1);
        p1.agregarMascota(pe2);

        System.out.println(p1);
    }
}
