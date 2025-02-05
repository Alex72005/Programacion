package Tareas.Tarea_12_1.src;

import java.io.FileWriter;
import java.util.ArrayList;

public class Ej4 {
    public static void main(String[] args) throws Exception {
        Persona p6 = new Persona("Cesar", "Gallego");
        Persona p7 = new Persona("Alvaro", "Villalba");

        ArrayList <Persona> nuevasPersonas = new ArrayList<Persona>();

        nuevasPersonas.add(p6);
        nuevasPersonas.add(p7);

        FileWriter fw = null;

        try {
            fw = new FileWriter("src/Tarea121/personas.txt",true);

            for (int i = 0; i < nuevasPersonas.size(); i++) {
                fw.write(nuevasPersonas.get(i).toString() + "\n");
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
