package Tareas.Tarea_5.src.Composicion;

public class Radio {
    private double frecuencia;
    private int volumen;
    
    public Radio(){
        this.frecuencia = 87.5;
        this.volumen = 5;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "Radio [frecuencia=" + frecuencia + ", volumen=" + volumen + "]";
    }
}
