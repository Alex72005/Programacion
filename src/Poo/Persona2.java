package Poo;
public class Persona2 {
    private int edad;

    public Persona2(int e){
        this.edad = e;
    }
    
    public void setEdad(int e){
        if (e >= 0 && e <= 120) {
            this.edad = e;
        }
    }

    public String toString(){
        return "Edad: " + this.edad;
    }
}
