package Tarea5.src.Herencia;

public class Goku extends Personaje {
    
    public Goku(String nivel, String tecnica) {
        super(nivel,tecnica);
    }

    @Override
    public void atacar(Personaje otro){
        if (!otro.defendiendo && usarTecnica) {
            otro.ps -= 400;
        }
        else{
            otro.ps-= 300;
        }
    }

    @Override
    public String toString() {
        return "Goku [tecnica=" + tecnica + "]" + super.toString();
    }
}
