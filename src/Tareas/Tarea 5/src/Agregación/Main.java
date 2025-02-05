package Tarea5.src.Agregación;

public class Main {
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca("Biblioteca Central", "Calle Ronda del Marrubial");
        Libro l1 = new Libro("Hacking web", "Pablo Alonso", 254);
        Libro l2 = new Libro("Introduccion a Java", "Mario Silva", 50);
        Pelicula p1 = new Pelicula("El lobo de Wall Street", "Martin Scorsese");

        b1.agregarLibro(l1);
        b1.agregarLibro(l2);
        b1.agregarPelicula(p1);

        System.out.println(b1);
    }
}
