package Poo.Figura;

public class Rectangulo extends Figura {
    private double lado1;
    private double lado2;

    public Rectangulo(){
        super("verde",6.7);
        this.lado1 = 2;
        this.lado2 = 4;
    }

    public Rectangulo(String c, double g, double lado1, double lado2) {
        super(c, g);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Rectangulo(Rectangulo r){
        super(r.color, r.grosor);
        this.lado1 = r.lado1;
        this.lado2 = r.lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea(){
        return this.lado1 * this.lado2;
    }



    @Override
    public String toString() {
        return "Rectangulo [lado1=" + lado1 + ", lado2=" + lado2 + "]" + super.toString();
    }
}
