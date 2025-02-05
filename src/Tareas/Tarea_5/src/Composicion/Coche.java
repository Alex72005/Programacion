package Tareas.Tarea_5.src.Composicion;

public class Coche {
    private String matricula;
    private String marca;
    private String modelo;
    private Motor motor;
    private Radio radio;

    public Coche(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor();
        this.radio = new Radio();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Radio getRadio() {
        return radio;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Coche [matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + ", motor=" + motor
                + ", radio=" + radio + "]";
    }
}
