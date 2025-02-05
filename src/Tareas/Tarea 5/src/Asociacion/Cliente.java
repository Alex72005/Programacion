package Tarea5.src.Asociacion;

public class Cliente {
    private String nombre;
    private String apellidos;
    private CtaCte cuenta;

    public Cliente(String n, String a){
        this.nombre = n;
        this.apellidos = a;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public CtaCte getCuenta(){
        return this.cuenta;
    }

    public void setCuenta(CtaCte c){
        this.cuenta = c;
    }

    public void agregarCuenta(CtaCte cue){
        this.cuenta = cue;
    }

    public String toString(){
        return "Nombre: " + this.nombre + 
               ", Apellidos: " + this.apellidos + 
               " y cuenta: " + this.cuenta;
    }
}