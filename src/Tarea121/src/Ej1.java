package Tarea121.src;

import java.io.FileWriter;
import java.util.ArrayList;

public class Ej1 {
    public static void main(String[] args) throws Exception {
        Persona p1 = new Persona("Alejandro", "Santos");
        Persona p2 = new Persona("Carlos", "Rodriguez");
        Persona p3 = new Persona("Eduardo", "Gomez");
        Persona p4 = new Persona("Adrian", "Gutierrez");
        Persona p5 = new Persona("Daniel", "Sanchez");

        ArrayList <Persona> personas = new ArrayList<Persona>();

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);

        FileWriter fw = null;

        try {
            fw = new FileWriter("personas.txt");

            for (int i = 0; i < personas.size(); i++) {
                fw.write(personas.get(i).toString() + "\n");
            }
        } catch (Exception e) {
            System.out.println("Error escribiendo el fichero " + e.toString());
            throw new NullPointerException();
        }

        finally{
            try {
                fw.close();
            } catch (Exception e) {
                System.out.println("Error escribiendo el fichero " + e.toString());
                throw new NullPointerException();
            }
        }
    }
}
