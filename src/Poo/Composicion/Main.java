package Poo.Composicion;

public class Main {
    public static void main(String[] args) {
        Libro libroProgramacion  = new Libro("Introduccion a Java", 65957869);

        libroProgramacion.agregarPagina(1, "sgkjsgkljfsgoishggh");
        libroProgramacion.agregarPagina(2, "mgnlskjgdfjiggjgjee");

        

        System.out.println(libroProgramacion);




    }
}
