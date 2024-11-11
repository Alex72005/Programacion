package Poo.Banco;

public class Cliente {
    private String nombre;
    private CtaCte cuenta;

    public Cliente(String n){
        this.nombre = n;
    }

    public void agregarCuenta(CtaCte cue){
        this.cuenta = cue;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }

    public CtaCte getCuenta(){
        return this.cuenta;
    }

    public void setCuenta(CtaCte c){
        this.cuenta = c;
    }

    public String toString(){
        return "Nombre: " + this.nombre + 
               " y cuenta: " + this.cuenta;
    }
}