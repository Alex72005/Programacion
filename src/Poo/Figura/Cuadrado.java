package Poo.Figura;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(){
        super();
        this.lado = 0;
    }

    public Cuadrado(String c, double g, double l) {
        super(c, g);
        this.lado = l;
    }

    //constructor copia 
    public Cuadrado(Cuadrado cu){
        super(cu);
        this.lado = cu.lado;

    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return this.lado * this.lado;
    }



    
    @Override
    public String toString() {
        return "Cuadrado [lado=" + lado + "]" + super.toString();
    }
}
