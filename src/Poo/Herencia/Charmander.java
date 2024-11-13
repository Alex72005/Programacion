package Poo.Herencia;

public class Charmander extends Pokemon {
    private int multiplicarDanyo;

    public Charmander(String nombre){
        super(nombre, "fuego");
        this.multiplicarDanyo = 3;
    }

    public void atacar(Pokemon otro){
        otro.ps -= (100 * this.multiplicarDanyo);
    }
}
