package Poo.Herencia;

public class Bulbasur extends Pokemon {

    public Bulbasur(String nombre){
        super(nombre,"planta");
    }

    
    public void curar(){
        super.ps += 50;
    }


    @Override
    public String toString() {
        return "Bulbasur " + super.toString();
    }

}

