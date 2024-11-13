package Poo.Herencia;

public class Charmander extends Pokemon {
    private int multiplicarDanyo;

    public Charmander(String nombre){
        super(nombre, "fuego");
        this.multiplicarDanyo = 3;
    }

    @Override
    public void atacar(Pokemon otro){
        otro.ps -= (100 * this.multiplicarDanyo);
    }

    @Override
    public String toString() {
        return "Charmander [multiplicarDanyo=" + multiplicarDanyo + "]" + super.toString();
    }
}
