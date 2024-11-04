package Poo.ej2;

public class Empleado {
    private String nombre;
    private String apellido;
    private double salario;
    private String departamento;

    public Empleado(String n, String a, double s, String d){
        this.nombre = n;
        this.apellido = a;
        this.salario = s;
        this.departamento = d;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String ape){
        this.apellido = ape;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double sal){
        this.salario = sal;
    }

    public String getDepartamento(){
        return this.departamento;
    }

    public void setDepartamento(String dep){
        this.departamento = dep;
    }

    public String toString(){
        return "Nombre: " + this.nombre + 
               ", apellido; " + this.apellido + 
               ", salario: " + this.salario + 
               " y departamento: " + this.departamento;
    }

    public double calcularSalarioAnual(){
        return salario * 12;
    }

    public double aumentarSalario(double porcentaje){
        return salario += salario * (porcentaje / 100);
    }

    
}
