package Tarea8.src;

public class Reloj {
    private Contador horas;
    private Contador minutos;
    private Contador segundos;

    public Reloj(){
        this.horas = new Contador();
        this.minutos = new Contador();
        this.segundos = new Contador();
    }

    public void incrementar(){
        this.segundos.incrementar();        
        if (this.segundos.getNumero() == 60) {
            this.segundos.reset();  
            this.minutos.incrementar();
            if (this.minutos.getNumero() == 60) {
                this.minutos.reset();
                this.horas.incrementar();
                if (this.horas.getNumero() == 24) {
                    this.horas.reset();
                }
            }
        }
    }
    /*
    public String toString() {
        return String.format("%02d:%02d:%02d", this.horas.getNumero(), this.minutos.getNumero(), this.segundos.getNumero());
    }
     */

    public String toString(){
        return this.horas + ":" + this.minutos + ":" + this.segundos;
    }
}
    