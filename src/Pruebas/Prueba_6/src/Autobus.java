package Pruebas.Prueba_6.src;

public class Autobus extends Vehiculo{
    private double precioKilometro;
    private double kilometrosInicio;
    private double kilometrosFin;

    public Autobus(){
        super();
        this.precioKilometro = 0;
        this.kilometrosInicio = 0;
        this.kilometrosFin = 0;
    }

    public Autobus(String m, double p){
        super(m);
        this.precioKilometro = p;
    }

    public Autobus(Autobus copia){
        super(copia);
        this.precioKilometro = copia.precioKilometro;
    }

    public double getPrecioKilometro() {
        return this.precioKilometro;
    }

    public void setPrecioKilometro(double pre) {
        this.precioKilometro = pre;
    }

    public double getKilometrosInicio() {
        return this.kilometrosInicio;
    }

    public void setKilometrosInicio(double ini) {
        this.kilometrosInicio = ini;
    }

    public double getKilometrosFin() {
        return this.kilometrosFin;
    }

    public void setKilometrosFin(double fin) {
        this.kilometrosFin = fin;
    }
 
    public void alquilar(double ki){
        super.alquilar();
        this.kilometrosInicio = ki;
    }

    public void devolver(double kf){
        super.devolver();
        this.kilometrosFin = kf;
    }

    public double calcularPrecio(){
        return (this.kilometrosFin - this.kilometrosInicio) * this.precioKilometro;
    }

    @Override
    public String toString() {
        return super.toString()+ "Autobus [precioKilometro=" + this.precioKilometro + ", kilometrosInicio=" + this.kilometrosInicio
                + ", KilometrosFin=" + this.kilometrosFin + "]";
    }

    
    
}
