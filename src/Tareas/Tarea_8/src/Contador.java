package Tareas.Tarea_8.src;

public class Contador {
    private int numero;

    public Contador(){
        this.numero = 0;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int num) {
        this.numero = num;
    }

    public void incrementar(){
        numero++;
    }   

    public void decrementar(){
        if (numero > 0) {
            numero--;   
        }
    }

    public void reset(){
        numero = 0;
    }

    
    public String toString() {
        return String.format("%02d", this.numero);
    }
}
