package Poo.SistemaDeVentas;

public class Vendedor extends Empleado {
    private double ventas;

    public Vendedor(){
        super();
        this.ventas = 0;
    }

    public Vendedor(String n, int e, double s, double v){
        super(n, e, s);
        this.ventas = v;
    }

    public Vendedor(Vendedor copia){
        super(copia);
        this.ventas = copia.ventas;
    }

    public double getVentas() {
        return this.ventas;
    }

    public void setVentas(double ven) {
        this.ventas = ven;
    }

    @Override
    public double calcularBonificacion(){
        return (super.salario * 0.10 ) + (this.ventas * 0.05);
    }

    public void vender(double total){
        this.ventas += total;
    }

    @Override
    public String toString() {
        return super.toString() + ", ventas: " + ventas;
    }
}
