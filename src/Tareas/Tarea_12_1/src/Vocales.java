package Tareas.Tarea_12_1.src;

import java.io.FileWriter;
import java.util.ArrayList;

public class Vocales {
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
                String personaString = personas.get(i).toString();
                for (int j = 0; j < personaString.length(); j++) {
                    char caracterPersona = personaString.charAt(j);
                    if (caracterPersona == 'a') {
                        fw.write(caracterPersona);
                    }
                }
                fw.write("\n");
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
