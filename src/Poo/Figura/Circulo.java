package Poo.Figura;

public class Circulo extends Figura {
    private double radio;

    public Circulo( double radio) {
        super();
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * (this.radio * this.radio);
    }


    @Override
    public String toString() {
        return "Circulo [color=" + color + ", radio=" + radio + "]" + super.toString();
    }
}
