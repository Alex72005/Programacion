public class Autobus extends Vehiculo{
    private double precioKilometro;
    private double kilometrosInicio;
    private double KilometrosFin;

    public Autobus(){
        super();
        this.precioKilometro = 0;
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
        return this.KilometrosFin;
    }

    public void setKilometrosFin(double fin) {
        KilometrosFin = fin;
    }


    @Override
    public void alquilar(){
        super.alquilar();
        this.kilometrosInicio = 60;
    }

    @Override
    public void devolver(){
        super.devolver();
        this.KilometrosFin = 200;
    }

    public double calcularPrecio(){
        return (this.KilometrosFin - this.kilometrosInicio) * this.precioKilometro;
    }

    @Override
    public String toString() {
        return super.toString()+ "Autobus [precioKilometro=" + precioKilometro + ", kilometrosInicio=" + kilometrosInicio
                + ", KilometrosFin=" + KilometrosFin + "]";
    }

    
    
}
