package Tareas.Tarea_5.src.Composicion;

public class Motor {
    private String combustion;
    private int cilindrada;


    public Motor() {
        this.combustion = "gasolina";
        this.cilindrada = 2000;
    }

    public String getCombustion() {
        return combustion;
    }

    public void setCombustion(String combustion) {
        this.combustion = combustion;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Motor [combustion=" + combustion + ", cilindrada=" + cilindrada + "]";
    } 
}
