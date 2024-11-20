package Poo.SistemaDeVentas;

public class Empleado {
    protected String nombre;
    protected int edad;
    protected double salario;

    public Empleado(){
        this.nombre = "juan";
        this.edad = 0;
        this.salario = 0.0;
    }

    public Empleado(String n, int e, double s){
        this.nombre = n;
        this.edad = e;
        this.salario = s;
    }

    public Empleado(Empleado copia){
        this.nombre = copia.nombre;
        this.edad = copia.edad;
        this.salario = copia.salario;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int eda){
        this.edad = eda;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double sal){
        this.salario = sal;
    }

    public double calcularBonificacion(){
        return salario * 0.10;
    }

    @Override
    public String toString(){
        return "Empleado: Nombre: " + this.nombre + 
               ", edad: " + this.edad + 
               " y salario: " + this.salario;
    }


}
