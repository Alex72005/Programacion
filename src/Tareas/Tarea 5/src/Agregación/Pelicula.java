package Tarea5.src.Agregación;

public class Pelicula {
    private String nombre;
    private String director;

    public Pelicula(String nombre, String director) {
        this.nombre = nombre;
        this.director = director;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    

    @Override
    public String toString() {
        return "Pelicula [nombre=" + nombre + ", director=" + director + "]";
    }
}
