package Pruebas.Prueba_6.src;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class Tractor extends Vehiculo{
    private double precioDia;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;

    public Tractor() {
        super();
        this.precioDia = 1; 
        this.fechaInicio = null;
        this.fechaFin = null;
    }

    public Tractor(String m, double p) {
        super(m);
        this.precioDia = p;
    }

    public Tractor(Tractor copia){
        super(copia);
        this.precioDia = copia.precioDia;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public void alquilar(){
        super.alquilar();
        this.fechaInicio = LocalDateTime.now();
    }

    @Override
    public void devolver(){
       super.devolver();
       this.fechaFin = LocalDateTime.now().plusDays(3);
    }

    public double calcularPrecio(){
        this.fechaInicio = LocalDateTime.now();
        int dias = (int)ChronoUnit.DAYS.between(this.fechaInicio, this.fechaFin);
        return dias * this.precioDia;
    }

    @Override
    public String toString() {
        return  super.toString() + "Tractor [precioDia=" + precioDia + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + "]";
    }
}
