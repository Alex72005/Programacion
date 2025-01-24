package Colecciones.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class sets {
    public static void main(String[] args) throws Exception{

        Integer i = 0;
        HashMap <String,String> mundo = new HashMap<String,String>();  /*Clave,valor */

        mundo.put("España","Madrid");
        mundo.put("Francia","París");
        mundo.put("Portugal","Lisboa");
        
        for (String claves : mundo.keySet()) {
            System.out.println(claves);
            System.out.println(mundo.get(claves));
        }

        ArrayList <Persona> personas = new ArrayList<Persona>();

        Persona p1 = new Persona(1, "paco", "pepe", 50);
        Persona p2 = new Persona(2, "jesus", "manchon", 30);

        personas.add(p1);
        personas.add(p2);
        

        Collections.sort(personas);

        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
