package Tarea10.src;

import java.util.ArrayList;

public class SeleccionFutbol {
    private int id;
    private String nombre;
    private ArrayList<Persona> integrantes;
    private ArrayList<Futbolista> futbolistasSobrepeso = new ArrayList<>(); 

    public SeleccionFutbol() {
        this.id = 0;
        this.nombre = "";
    }
    
    public SeleccionFutbol(int i, String n) {
        this.id = i;
        this.nombre = n;
        this.integrantes = new ArrayList<Persona>();
        
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
        for (int i = 0; i < this.integrantes.size(); i++) {
            if(p.getId() == this.integrantes.get(i).getId()) {
                return false;
            }
        }

        this.integrantes.add(p);
        return true;
    }
    
    public boolean borrarPersona(int id){
        for (int i = 0; i < this.integrantes.size(); i++) {
            if (id == this.integrantes.get(i).getId()) {
                this.integrantes.remove(i);
                return true;
            }
        }

        return false;
    }

    public void listarIntegrantes(){
        for (int i = 0; i < this.integrantes.size(); i++){
            System.out.println(this.integrantes.get(i));
        }
    }

    public void listarFutbolistasSobrepeso(){
        for (int i = 0; i < this.integrantes.size(); i++){
            if (this.integrantes.get(i) instanceof Futbolista && ((Futbolista)this.integrantes.get(i)).tieneSobrepeso()) {
                this.futbolistasSobrepeso.add((Futbolista)this.integrantes.get(i));
            }
        }

        for (int i = 0; i < this.futbolistasSobrepeso.size(); i++) {
            System.out.println(this.futbolistasSobrepeso.get(i));
        }
    }

    @Override
    public String toString() {
        return "SeleccionFutbol [id=" + id + ", nombre=" + nombre + "]";
    }
}
