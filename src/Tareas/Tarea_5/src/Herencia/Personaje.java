package Tareas.Tarea_5.src.Herencia;

public class Personaje {
    protected String nivel;
    protected int ps;
    protected boolean defendiendo;
    protected String tecnica;
    protected boolean usarTecnica;

    public Personaje(String nivel, String tecnica) {
        this.nivel = nivel;
        this.ps = 1000;
        this.defendiendo = false;
        this.tecnica = tecnica;
        this.usarTecnica = false;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel; 
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public boolean isDefendiendo() {
        return defendiendo;
    }

    public void setDefendiendo(boolean defendiendo) {
        this.defendiendo = defendiendo;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public boolean getUsarTecnica() {
        return usarTecnica;
    }

    public void setUsarTecnica(boolean usarTecnica) {
        this.usarTecnica = usarTecnica;
    }

    public void siUsaTecnica(boolean r){
        this.usarTecnica = r;
    }
    
    public void atacar(Personaje otro){
        if (!otro.defendiendo) {
            otro.ps -= 200;
        }
    }

    public void defender(boolean estado){
        this.defendiendo = estado;
    }

    @Override
    public String toString() {
        return "Personaje [ nivel=" + nivel + ", ps=" + ps + ", defendiendo=" + defendiendo + "]";
    }
}
