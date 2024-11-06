package pruebas.Prueba5.src;

public class Contrato {
    private double salario;
    private String tipoJornada;
    private String claúsulas;

    public Contrato(double s, String tJ, String c) {
        this.salario = s;
        this.tipoJornada = tJ;
        this.claúsulas = c;

        if (this.salario > 0) {
            this.salario = s;
        }
        else{
            this.salario = 0;
        }

        if (this.tipoJornada == "completo" || this.tipoJornada == "parcial") {
            this.tipoJornada = tJ;
        }
        else{
            this.tipoJornada = "Incorrecto";
        }

        if (this.claúsulas.length() <= 500) {
            this.claúsulas = c;
        }
        else{
            this.claúsulas = "Incorrecto";
        }
    }

    public Contrato() {
        this.salario = 0;
        this.tipoJornada = "";
        this.claúsulas = "";
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double sal) {
        if (sal > 0) {
            this.salario = sal;
        }
    }

    public String getTipoJornada() {
        return this.tipoJornada;
    }

    public void setTipoJornada(String tip) {
        if (tip == "completo" || tip == "parcial") {
            this.tipoJornada = tip;
        }
    }

    public String getClaúsulas() {
        return this.claúsulas;
    }

    public void setClaúsulas(String cla) {
        if (cla.length() <= 500) {
            this.claúsulas = cla;
        }
    }

    
    public String toString() {
        return "Salario: " + this.salario + 
               ", el tipo de jornada: " + this.tipoJornada + 
               " y las claúsulas: " + this.claúsulas;
    }

    

    


    
}
