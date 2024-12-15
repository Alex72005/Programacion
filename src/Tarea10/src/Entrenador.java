package Tarea10.src;

public class Entrenador extends Persona {
    private int idFederacion;

    public Entrenador(){
        super();
        this.idFederacion = 0;
    }

    public Entrenador(int i, String n, String ap, String f, double p, double al, int iF){
        super(i,n,ap,f,p,al);
        this.idFederacion = iF;
    }

    public Entrenador(Entrenador copia){
        super(copia);
        this.idFederacion = copia.idFederacion;
    }

    public int getIdFederacion() {
        return this.idFederacion;
    }

    public void setIdFederacion(int idF) {
        this.idFederacion = idF;
    }

    public void viajar(){
        System.out.println("El entrenador " + getNombre() + getApellidos() + " está viajando");
    }

    public boolean tieneSobrepeso(){
        double imc = super.peso / (super.altura * super.altura);
        if (imc >= 25) {
            return true;
        }

        return false;
    }

    public void entrenar(){
        System.out.println("El entrenador " + getNombre() + " " + getApellidos() + "está entrenando");
    }

    @Override
    public String toString() {
        return "Entrenador [idFederacion=" + idFederacion + super.toString() + "]";
    }
}
    