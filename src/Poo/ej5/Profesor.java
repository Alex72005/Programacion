package Poo.ej5;

public class Profesor extends Persona {
    private String especialidad;

    public Profesor(String nombre, String apellidos, int edad, String especialidad){
        super(nombre, apellidos, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad(){
        return this.especialidad;
    }

    public void setEspecialidad(String esp){
        this.especialidad = esp;
    }

    public String toString(){
        return super.toString() + " Especialidad: " + this.especialidad;
    }
}
