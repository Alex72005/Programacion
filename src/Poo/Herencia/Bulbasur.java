package Poo.Herencia;

public class Bulbasur extends Pokemon {

    public Bulbasur(String nombre, String tipo){
        super(nombre,tipo);
    }

    
    public void curar(){
        super.ps = super.ps + 50;
    }


    @Override
    public String toString() {
        return "Bulbasur " + super.toString();
    }

    
}
