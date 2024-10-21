package Poo;
public class presentacion {
    public static void main(String[] args) {

        Persona p1 = new Persona("Javi", "20/11/1990");
        Persona p2 = new Persona("Paco","11/09/1985");

        Persona[] personas = {p1,p2};

        for (int i = 0; i < personas.length; i++){
            System.out.println(personas[i]);
        }
        

    }
}
