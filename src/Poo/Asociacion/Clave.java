package Poo.Asociacion;

public class Clave {
    private int codigo;

    public Clave(int c){
        this.codigo = c;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setCodigo(int cod){
        this.codigo = cod;
    }

    public String toString(){
        return "Codigo: " + this.codigo;
    }
}
