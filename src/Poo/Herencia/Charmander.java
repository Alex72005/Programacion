package Poo.Herencia;

public class Charmander extends Pokemon {
    private int multiplicarDanyo;

    public Charmander(String nombre, String tipo, int multiplicarDanyo){
        super(nombre, tipo);
        this.multiplicarDanyo = multiplicarDanyo;
    }

    public void atacar(Pokemon otro){
        otro.ps = otro.ps - (100 * this.multiplicarDanyo);
    }
}
