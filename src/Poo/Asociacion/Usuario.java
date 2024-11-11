package Poo.Asociacion;

public class Usuario {
    private String nombre;
    private Clave clave;

    public Usuario(String n, Clave c){
        this.nombre = n;
        this.clave = c;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }

    public Clave getClave(){
        return this.clave;
    }

    public void setClave(Clave cla){
        this.clave = cla;
    }

    public String toString(){
        return "Nombre: " + this.nombre + 
               " y Clave: " + this.clave;
    }
}
