package Tarea7.src;

import java.util.Objects;

public class Persona {
    private int telefono;
    private String email;
    private String fechaNac;
    private Dni dni;

    public Persona(int tlf, String ema, String fech, String dn){
        this.telefono = tlf;
        this.email = ema;
        this.fechaNac = fech;
        this.dni = new Dni(dn);
    }
    
    public int getTelefono(){
        return this.telefono;
    }
    
    public void setTelefono(int t){
        this.telefono = t;
    }
    
    public String getEmail(){
        return this.email;
    }

    public void setEmail(String e){
        this.email = e;
    }

    public String getFechaNac(){
        return this.fechaNac;
    }

    public void setFechaNac(String f){
        this.fechaNac = f;
    }

    public Dni getDni(){
        return this.dni;
    } 
    public void setDni(String d){
        this.dni = new Dni(d);
    }

    public String toString(){
        return  "teléfono " + telefono +
                ", email " + email + 
                ", fecha de nacimiento " + fechaNac + 
                " y DNI: " + dni;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return  Objects.equals(telefono, persona.telefono) &&
                Objects.equals(email, persona.email) &&
                Objects.equals(fechaNac, persona.fechaNac) &&
                Objects.equals(dni, persona.dni);
    }

    public int hashCode() {
        return Objects.hash(telefono, email, fechaNac, dni);
    }
}
