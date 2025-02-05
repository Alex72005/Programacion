package Tareas.Tarea_5.src.Asociacion;

public class CtaCte {
    private double saldo; 
    private Cliente dueno;

    public CtaCte(double s, Cliente d){
        this.saldo = s;
        this.dueno = d;
        d.setCuenta(this);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double sal){
        this.saldo = sal;
    }

    public Cliente getCliente(){
        return this.dueno;
    }

    public void setCliente(Cliente du){
        this.dueno = du;
    }
    
     
    public String toString(){
        return "Saldo: " + this.saldo;
    }
    

}
