package Tarea10.src;

public class SeleccionFutbol {
    private int id;
    private String nombre;

    public SeleccionFutbol() {
        this.id = 0;
        this.nombre = "";
    }
    
    public SeleccionFutbol(int i, String n) {
        this.id = i;
        this.nombre = n;
    }

    public SeleccionFutbol(SeleccionFutbol copia) {
        this.id = copia.id;
        this.nombre = copia.nombre;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    

    


    @Override
    public String toString() {
        return "SeleccionFutbol [id=" + id + ", nombre=" + nombre + "]";
    }
}
