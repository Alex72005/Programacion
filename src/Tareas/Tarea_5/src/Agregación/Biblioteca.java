package Tareas.Tarea_5.src.Agregación;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private ArrayList<Libro> libros = new ArrayList<>();
    private ArrayList<Pelicula> peliculas = new ArrayList<>();

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public void agregarLibro(Libro l){
        this.libros.add(l);
    }

    public void agregarPelicula(Pelicula p){
        this.peliculas.add(p);
    }

    @Override
    public String toString() {
        return "Biblioteca [nombre=" + nombre + ", direccion=" + direccion + ", libros=" + libros + ", peliculas="
                + peliculas + "]";
    }
}


