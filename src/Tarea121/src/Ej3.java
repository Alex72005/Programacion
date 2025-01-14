package Tarea121.src;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ej3 {
    public static void main(String[] args) throws Exception {
        try {
            FileReader fr = new FileReader("src/Tarea121/personas.txt");

            BufferedReader br = new BufferedReader(fr); /*para leer linea por linea */

            String li;

            while ((li = br.readLine()) != null) {
                System.out.println(li);
            }

            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Error escribiendo el fichero " + e.toString());
            throw new NullPointerException();
        }

        finally{    
            try {
               
            } catch (Exception e) {
                System.out.println("Error escribiendo el fichero " + e.toString());
                throw new NullPointerException();
            }
        }
    }
}
