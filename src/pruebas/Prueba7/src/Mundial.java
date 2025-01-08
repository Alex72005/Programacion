package pruebas.Prueba7.src;

import java.util.ArrayList;

public class Mundial {
    private int id;
    private int anyo;
    private ArrayList<SeleccionFutbol> selecciones;  

    public Mundial(){
        this.id = 0;
        this.anyo = 0;
        this.selecciones = new ArrayList<SeleccionFutbol>();
    }

    public Mundial(int i, int a){
        this.id = i;
        this.anyo = a;
        this.selecciones = new ArrayList<SeleccionFutbol>();
        
    }

    public Mundial(Mundial copia){
        this.id = copia.id;
        this.anyo = copia.anyo;
        this.selecciones = copia.selecciones;
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

    public boolean anyadirSeleccion(SeleccionFutbol s){
        for (int i = 0; i < selecciones.size(); i++) {
            if (s.getId() == selecciones.get(i).getId()) {
                return false;
            }   
        }

        selecciones.add(s);
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
        for (int i = 0; i < selecciones.size(); i++) {
            if (id == selecciones.get(i).getId()) {
                return selecciones.get(i);
            }
        }

        return null;
    }

    public void listarSelecciones(){
        for (int i = 0; i < selecciones.size(); i++) {
            System.out.println(selecciones.get(i));
        }
    }

    @Override
    public String toString() {
        return "Mundial [id=" + id + ", anyo=" + anyo + "]";
    }
}
