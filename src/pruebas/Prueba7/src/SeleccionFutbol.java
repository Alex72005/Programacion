package pruebas.Prueba7.src;

import java.util.ArrayList;

public class SeleccionFutbol {
    private int id;
    private String nombre;
    private ArrayList<Persona> integrantes;
    private ArrayList<Mundial> mundiales;
    

    public SeleccionFutbol() {
        this.id = 0;
        this.nombre = "";
        this.integrantes = new ArrayList<Persona>();
        this.mundiales = new ArrayList<Mundial>();
    }
    
    public SeleccionFutbol(int i, String n) {
        this.id = i;
        this.nombre = n;
        this.integrantes = new ArrayList<Persona>();
        this.mundiales = new ArrayList<Mundial>();
        
    }

    public SeleccionFutbol(SeleccionFutbol copia) {
        this.id = copia.id;
        this.nombre = copia.nombre;
        this.integrantes = copia.integrantes;
        this.mundiales = copia.mundiales;
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
        for (int i = 0; i < this.integrantes.size(); i++){
            if (p instanceof Entrenador && this.integrantes.get(i) instanceof Entrenador){
                System.out.println("Una seleccion solo puede tener un entrenador");
                return false;
            }

            if (p instanceof Fisioterapeuta && this.integrantes.get(i) instanceof Fisioterapeuta){
                System.out.println("Una seleccion solo puede tener un fisioterapeuta");
                return false;
            }
        }

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
                System.out.println(this.integrantes.get(i));
            }
        }
    }

    public boolean asignarMundial(Mundial m){
        for (int i = 0; i < this.mundiales.size(); i++) {
            if (m.getId() == this.mundiales.get(i).getId()) {
                return false;
            }
        }

        this.mundiales.add(m);
        return true;
    }

    public boolean quitarMundial(int id){
        for (int i = 0; i < this.mundiales.size(); i++) {
            if (id == this.mundiales.get(i).getId()) {
                this.mundiales.remove(i);
                return true;
            }
        }

        return false;
    }

    public Entrenador getEntrenador(){
        for (int i = 0; i < this.integrantes.size(); i++) {
            if (this.integrantes.get(i) instanceof Entrenador){
                return (Entrenador)this.integrantes.get(i);
            }
        }

        return null;
    
    }

    public Fisioterapeuta getFisioterapeuta(){
        for (int i = 0; i < this.integrantes.size(); i++) {
            if (this.integrantes.get(i) instanceof Fisioterapeuta){
                return (Fisioterapeuta)this.integrantes.get(i);
            }
        }

        return null;
    }


    @Override
    public String toString() {
        return "SeleccionFutbol [id=" + id + ", nombre=" + nombre + "]";
    }
}
