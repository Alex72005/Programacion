package Poo;
public class Persona {
    private String nombre;
    private String fecha;
    public Persona(String n, String f){
        this.nombre = n;
        this.fecha = f;
    }
    public String toString(){
        return this.nombre + " " + this.fecha; 
    }
}
