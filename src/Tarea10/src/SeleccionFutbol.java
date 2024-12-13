package Tarea10.src;

import java.util.ArrayList;

public class SeleccionFutbol {
    private int id;
    private String nombre;
    public ArrayList<Persona> personas;
    public ArrayList<Futbolista> jugadores = new ArrayList<>(); 
    public ArrayList<Futbolista> futbolistasSobrepeso; 

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

    public boolean anyadirPersona(Persona p){
        for (int i = 0; i < personas.size(); i++) {
            if(p.getId() == personas.get(i).getId()) {
                return false;
            }
        }

        personas.add(p);
        return true;
    }
    
    public boolean borrarPersona(int id){
        for (int i = 0; i < personas.size(); i++) {
            if (id == personas.get(i).getId()) {
                personas.remove(i);
                return true;
            }
        }

        return false;
    }

    public void listarIntegrantes(){
        for (int i = 0; i < personas.size(); i++){
            System.out.println(personas.get(i));
        }
    }

    public void listarFutbolistasSobrepeso(){
        for (int i = 0; i < personas.size(); i++){
            if (personas.get(i) instanceof Futbolista && ((Futbolista)personas.get(i)).tieneSobrepeso()) {
                futbolistasSobrepeso.add((Futbolista)personas.get(i));
            }
        }

        for (int i = 0; i < futbolistasSobrepeso.size(); i++) {
            System.out.println(futbolistasSobrepeso);
        }
    }

    @Override
    public String toString() {
        return "SeleccionFutbol [id=" + id + ", nombre=" + nombre + "]";
    }
}
