package Poo.Figura;

public abstract class Figura{
    protected String color;
    protected double grosor;

    public Figura(){
        this.color = "negro";
        this.grosor = 2.5;
    }
    
    public Figura(String c, double g){
        this.color = c;
        this.grosor = g;
    }

    public Figura(Figura f){
        this.color = f.color;
        this.grosor = f.grosor;    
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getGrosor() {
        return grosor;
    }

    public void setGrosor(double grosor) {
        this.grosor = grosor;
    }

    
    public abstract double calcularArea();

    

    @Override
    public String toString() {
        return "Figura [color=" + color + ", grosor=" + grosor + "]";
    }
}