package pruebas.Prueba7.src;

public class Fisioterapeuta extends Masajista {
    private int anyosExperiencia;

    public Fisioterapeuta() {
        super();
        this.anyosExperiencia = 0;
    }

    public Fisioterapeuta(int i, String n, String ap, String f, double p, double al, String ti, int anyos) {
        super(i, n, ap, f, p, al, ti);
        this.anyosExperiencia = anyos;
    }

    public Fisioterapeuta(Fisioterapeuta copia) {
        super(copia);
        this.anyosExperiencia = copia.anyosExperiencia;
    }

    public int getAnyosExperiencia() {
        return this.anyosExperiencia;
    }

    public void setAnyosExperiencia(int an) {
        this.anyosExperiencia = an;
    }

    @Override
    public String toString() {
        return "Fisioterapeuta [anyosExperiencia=" + anyosExperiencia + "]" + super.toString();
    }

    @Override
    public void viajar() {
        System.out.println("El fisioterapeuta " + getNombre() + " " + getApellidos() + " está viajando con el equipo");
    }

    @Override
    public void concentrarse() {
        System.out.println("El fisioterapeuta " + getNombre() + " " + getApellidos() + " está en la concentración");
    }

    @Override
    public void comer() {
       System.out.println("El fisioterapeuta está comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El fisioterapeuta está durmiendo");
    }   
}
