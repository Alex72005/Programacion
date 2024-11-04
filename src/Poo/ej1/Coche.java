package Poo.ej1;
public class Coche {
    private String matricula;
    private String modelo;
    private String marca;
    private String color;
    private int velocidadActual;
    private boolean arrancado;

    private final static int velocidadMaxima = 120;

    public Coche(String mat,String mod,String mar,String col){
        this.matricula = mat;
        this.modelo = mod;
        this.marca = mar;
        this.color = col;
        this.velocidadActual = 0;
        this.arrancado = false;
    }

    public String getMatricula(){
        return this.matricula; 
    }
    public void setMatricula(String m){
        this.matricula = m;
    }

    public boolean arrancar(){
        if (this.velocidadActual == 0 && !this.arrancado) {
            this.arrancado = true;
            return true;
        }
        return false;
    }

    public boolean parar(){
        if (this.velocidadActual == 0 && this.arrancado == true) {
            this.arrancado = false;
            return true;
        }

        return false;
    }

    public void acelerar (int vel){
        if(this.arrancado){
            if (this.velocidadActual + vel >= velocidadMaxima) {
                this.velocidadActual = velocidadMaxima;
            }
            else{
                this.velocidadActual += vel;
            }
        }
        
    }
    public String toString(){
        return "Matricula: " + this.matricula + 
               "Marca: " + this.marca + 
               "Modelo: " + this.modelo +
               "Color: " + this.color + 
               "Velocidad Actual: " + this.velocidadActual +
               " Arrancado: " + this.arrancado; 
    }
}
