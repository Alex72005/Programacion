package Poo.bidireccionalNaN;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    public ArrayList<Perro> mascotas = new ArrayList<>();

    public Persona(String n){
        this.nombre = n;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public ArrayList<Perro> getMascotas() {
        return this.mascotas;
    }

    public void setMascotas(ArrayList<Perro> mas) {
        this.mascotas = mas;
    }

    public void agregarMascota(Perro p){
        this.mascotas.add(p);
    }

    @Override
    public String toString() {
        return "Persona [nombre= " + nombre + ", mascotas= " + mascotas + "]";
    }

    
}
