package Poo.Figura;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(){
        super();
        this.base = 0.0;
        this.altura = 0.0;
    }

    public Triangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(Triangulo t){
        super();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return (base * altura) / 2;
    }


    @Override
    public String toString() {
        return "Triangulo [base=" + base + ", altura=" + altura + "]" + super.toString();
    }  
}
