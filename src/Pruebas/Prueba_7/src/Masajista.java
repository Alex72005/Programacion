package Pruebas.Prueba_7.src;

public abstract class Masajista extends Persona implements Integrante {
    protected String titulacion;

    public Masajista() {
        super();
        this.titulacion = "";
    }

    public Masajista(int i, String n, String ap, String f, double p, double al, String ti) {
        super(i, n, ap, f, p, al);
        this.titulacion = ti;
    }

    public Masajista(Masajista copia) {
        super(copia);
        this.titulacion = copia.titulacion;
    }

    public String getTitulacion() {
        return this.titulacion;
    }

    public void setTitulacion(String tit) {
        this.titulacion = tit;
    }

    @Override
    public String toString() {
        return "Masajista [titulacion=" + titulacion + "]" + super.toString();
    }    
} 