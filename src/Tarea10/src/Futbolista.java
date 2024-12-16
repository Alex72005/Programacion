package Tarea10.src;

public class Futbolista extends Persona implements Deportista {
    private int dorsal;
    private String demarcacion;

    public Futbolista(){
        super();
        this.dorsal = 0;
        this.demarcacion = "demarcacion";
    }

    public Futbolista(int i, String n, String ap, String f, double p, double al, int d, String de){
        super(i,n,ap,f,p,al);
        this.dorsal = d;
        this.demarcacion = de;
    }

    public Futbolista(Futbolista copia){
        super(copia);
        this.dorsal = copia.dorsal;
        this.demarcacion = copia.demarcacion;
    }

    public int getDorsal() {
        return this.dorsal;
    }

    public void setDorsal(int dor) {
        this.dorsal = dor;
    }

    public String getDemarcacion() {
        return this.demarcacion;
    }

    public void setDemarcacion(String dem) {
        this.demarcacion = dem;
    }

    @Override
    public void viajar(){
        System.out.println("El futbolista " + getNombre() + " " + getApellidos() + " está viajando");
    }

    @Override
    public boolean tieneSobrepeso(){
        double imc = super.peso / (super.altura * super.altura);
        return imc >= 22;
    }

    @Override
    public void jugarPartido(){
        System.out.println("El futbolista" + getNombre() + " " + getApellidos() + "está jugando el partido");
    }

    @Override
    public void entrenar(){
        System.out.println("El futbolista" + getNombre() + " " + getApellidos() + "está entrenando");
    }

    @Override
    public String toString() {
        return "Futbolista [dorsal=" + dorsal + ", demarcacion=" + demarcacion + " " + super.toString() + "]" ;
    }
}
