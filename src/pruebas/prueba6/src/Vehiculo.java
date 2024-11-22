package pruebas.prueba6.src;

import java.time.LocalDateTime;

public class Vehiculo{
    protected String matricula;
    protected boolean estaAlquilado;
    protected LocalDateTime fecha;

    public Vehiculo(){
        this.matricula = "";
        this.estaAlquilado = false;
    }

    public Vehiculo(String m) {
        this.matricula = m;
        this.estaAlquilado = false;
    }

    public Vehiculo(Vehiculo copia){
        this.matricula = copia.matricula;
        this.estaAlquilado = copia.estaAlquilado;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String mat) {
        this.matricula = mat;
    }

    public boolean getSiEstaAlquilado() {
        return this.estaAlquilado;
    }

    public void setSiEstaAlquilado(boolean sie) {
        this.estaAlquilado = sie;
    }

    public boolean siEstaAlquilado(boolean s){
        return this.estaAlquilado = s;
    }

    public void alquilar(){
        if (!estaAlquilado) {
            this.estaAlquilado = true;
            System.out.println("El vehiculo ha sido alquilado");
        }
        else{
           System.out.println("Error");
        }
    }
    
    public void devolver(){
        if (estaAlquilado) {
            this.estaAlquilado = false;
            System.out.println("El vehiculo ha sido devuelto");
        }
        else{
            System.out.println("Error, no se puede devolver porque el vehiculo no ha sido alquilado");
        }
    }

    @Override
    public String toString() {
        return "Matricula: " + this.matricula + " y estado: " + this.estaAlquilado;
    }
}