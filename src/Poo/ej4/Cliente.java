package Poo.ej4;

public class Cliente {
    private String nombre;
    private String email;
    private String telefono;

    public Cliente(String n, String e, String t){
        this.nombre = n;
        this.email = e;
        this.telefono = t;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String ema){
        this.email = ema;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public void setTelefono(String tel){
        this.telefono = tel;
    }

    

    public String toString(){
        return "Nombre: " + this.nombre + 
               ", email: " + this.email + 
               " y teléfono: " + this.telefono;
    }
}
