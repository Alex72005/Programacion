package Tarea5.src.Herencia;

public class Vegeta extends Personaje {
    
    public Vegeta(String nivel, String tecnica) {
        super(nivel,tecnica);
    }

    @Override
    public void atacar(Personaje otro){
        if (!otro.defendiendo && usarTecnica) {
            otro.ps -= 350;
        }
        else{
            otro.ps-= 240;
        }
    }

    @Override
    public String toString() {
        return "Vegeta [tecnica=" + tecnica + "]" + super.toString();
    }
}
