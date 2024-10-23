package Poo;
public class Persona {
    private String nombre;
    private int edad;

    public Persona(String n,int e){
        this.nombre = n;
        this.edad = e;
    }
    public Persona(){
        this.nombre = "Javi";
        this.edad = 19;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nom){
        this.nombre = nom;

    }
    public void setEdad(int e){
       this.edad = e;
    }

    public int getEdad(){           
        return this.edad;
    }

    public String toString(){
        return "Edad: " + this.edad;
    }
}





