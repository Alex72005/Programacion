package Poo.ej5;

public class Persona {
    protected String nombre;
    protected String apellidos;
    protected int edad;
    
    public Persona(String n, String a, int e){
        this.nombre = n;
        this.apellidos = a;
        this.edad = e;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }

    public String getApellidos(){
        return this.apellidos;
    }

    public void setApellidos(String ape){
        this.apellidos = ape;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int eda){
        this.edad = eda;
    }

    public String toString(){
        return "Nombre: " + this.nombre + ", apellidos: " + this.apellidos + " y edad: " + this.edad;
    }

}
