package Poo.Herencia;

public class Charmander extends Pokemon {
    private int multiplicarDanyo;

    public Charmander(String nombre){
        super(nombre, "fuego");
        this.multiplicarDanyo = 3;
    }

    @Override
    public void atacar(Pokemon otro){
        if (otro instanceof Squirtel) {
            if (!otro.defendiendo) {
                otro.ps -= (100 * multiplicarDanyo);
            }
            else{
                otro.ps -= 50;
            }
        }
        else{
            otro.ps -= (100 * multiplicarDanyo);
        }
    }

    @Override
    public String toString() {
        return "Charmander [multiplicarDanyo=" + multiplicarDanyo + "]" + super.toString();
    }

    
}
