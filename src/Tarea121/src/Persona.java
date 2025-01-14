package Tarea121.src;

public class Persona {
    private String nombre;
    private String apellidos;

    public Persona(String n, String a){
        this.nombre = n;
        this.apellidos = a;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String ape) {
        this.apellidos = ape;
    }

    public String toString(){
        return this.nombre + " " + this.apellidos;
    }

    
}
