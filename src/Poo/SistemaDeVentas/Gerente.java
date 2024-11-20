package Poo.SistemaDeVentas;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(){
        super();
        this.departamento = "rrhh";
    }

    public Gerente(String n, int e, double s, String d){
        super(n, e, s);
        this.departamento = d;
    }

    public Gerente(Gerente copia){
        super(copia);
        this.departamento = copia.departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String dep) {
        this.departamento = dep;
    }

    @Override
    public double calcularBonificacion(){
        return super.salario * 0.20;
    }

    public String dirigirReunion(){
        return "El gerente " + super.nombre + " está dirigiendo la reunión del departamento " + this.departamento;
    }


    @Override
    public String toString() {
        return "Gerente: " + super.toString() + " departamento: " + this.departamento;
    }
}
