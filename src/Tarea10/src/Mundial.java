package Tarea10.src;

import java.util.ArrayList;

public class Mundial {
    private int id;
    private int anyo;
    public ArrayList<SeleccionFutbol> selecciones;  

    public Mundial(){
        this.id = 0;
        this.anyo = 0;
        this.selecciones = new ArrayList<>();
    }

    public Mundial(int i, int a){
        this.id = i;
        this.anyo = a;
        this.selecciones = new ArrayList<>();
    }

    public Mundial(Mundial copia){
        this.id = copia.id;
        this.anyo = copia.anyo;
        this.selecciones = new ArrayList<>();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnyo() {
        return this.anyo;
    }

    public void setAnyo(int an) { 
        this.anyo = an;
    }

    public boolean anyadirSeleccion(int id, String nombre){
        for (int i = 0; i < selecciones.size(); i++) {
            if (id == selecciones.get(i).getId()) {
                return false;
            }   
        }

        SeleccionFutbol seleccion = new SeleccionFutbol(id, nombre);
        selecciones.add(seleccion);
        return true;
    }

    public boolean quitarSeleccion(int id){
        for (int i = 0; i < selecciones.size(); i++) {
            if (id == selecciones.get(i).getId()) {
                selecciones.remove(i);
                return true;
            }
        }
        
        return false;
       
    }

    public SeleccionFutbol getSeleccion(int id){
        SeleccionFutbol s;
        for (int i = 0; i < selecciones.size(); i++) {
            if (id == selecciones.get(i).getId()) {
                s = selecciones.get(i);
            }
        }

        return s;
    }

    @Override
    public String toString() {
        return "Mundial [id=" + id + ", anyo=" + anyo + "]";
    }
}
