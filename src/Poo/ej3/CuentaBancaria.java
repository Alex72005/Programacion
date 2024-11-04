package Poo.ej3;

public class CuentaBancaria {
    private String numCuenta;
    private String nombreTitular;
    private double saldo;

    //Constructor por defecto.
    public CuentaBancaria(){
        this.numCuenta = "0000 0000 0000 0000";
        this.nombreTitular = " ";
        this.saldo = 0;
    }
    //Constructor por parámetros.
    public CuentaBancaria(String num, String nombre){
        this.numCuenta = num;
        this.nombreTitular = nombre;
        this.saldo = 0;
    }
    
    public CuentaBancaria(String num, String nombre,double s){
        this.numCuenta = num;
        this.nombreTitular = nombre;
        this.saldo = s;
    }
    //Constructor de copia
    public CuentaBancaria(CuentaBancaria copia){
        this.numCuenta = copia.numCuenta;
        this.nombreTitular = copia.nombreTitular;
        this.saldo = copia.saldo;
    }

    public String getNumCuenta(){
        return this.numCuenta;
    }

    public void setNumCuenta(String nuevo){
        this.numCuenta = nuevo;
    }

    public String getNombreTitular(){
        return this.nombreTitular;
    }

    public void setNombreTitular(String nom){
        this.nombreTitular = nom;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double sal) {
        this.saldo = sal;
    }

    public void sacar(double cantidad){
        this.saldo -= cantidad;
    }

    public void ingresar(double cantidad){
        this.saldo += cantidad;
    }

    public boolean transferir(double cantidad, CuentaBancaria destino){
        if (this.saldo >= cantidad) {
            this.sacar(cantidad);
            destino.ingresar(cantidad);
            return true;
        }

        return false;
    }



    @Override
    public String toString() {
        return "CuentaBancaria [numCuenta=" + numCuenta + ", nombreTitular=" + nombreTitular + ", saldo=" + saldo + "]";
    }

    
    
}
