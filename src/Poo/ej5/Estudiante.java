package Poo.ej5;

public class Estudiante extends Persona {
    private String nivel;

    public Estudiante(String nombre, String apellidos, int edad, String nivel){
        super(nombre,apellidos,edad);
        this.nivel = nivel;
    }

    public String getNivel(){
        return this.nivel;
    }

    public void setNivel(String niv){
        this.nivel = niv;
    }

    public String toString(){
        return super.toString() + " Nivel: " + this.nivel;
    }

}
