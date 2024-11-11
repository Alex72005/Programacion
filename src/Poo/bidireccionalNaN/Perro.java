package Poo.bidireccionalNaN;

public class Perro {

    private String nombre;
    private Persona propietario;
   
    public Perro(String n){
        this.nombre = n;
    }

    public String getNombre(){
        return this.nombre;
    }

    private void setNombre(String nom){
        this.nombre = nom;
    }

    public Persona getPropietario(){
        return this.propietario;
    }

    public void setPropietario(Persona pe){
        this.propietario = pe;
    }

    public String toString(){
        return "Nombre: " + this.nombre + 
               " Propietario: " + this.propietario;
    }

    public void asignarPropietario(Persona p){
        this.propietario = p;
    }




}
