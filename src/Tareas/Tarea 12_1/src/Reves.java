package Tarea121.src;

import java.io.FileReader;
import java.io.FileWriter;

public class Reves {
    public static void main(String[] args) throws Exception {
        FileReader fr = null;
        FileWriter fw = null;
        String contenido = " ";

        try {
            fr = new FileReader("src/Tarea121/p.txt");

            int caracter = fr.read();

            while (caracter != -1) {
                contenido += (char)caracter;
                caracter = fr.read();

            }

            System.out.println(contenido);

            fw = new FileWriter("reves.txt");

            for (int i = contenido.length() -1; i >= 0; i--) {
                fw.write(contenido.charAt(i));
            }


        } catch (Exception e) {
            System.out.println("Error escribiendo el fichero " + e.toString());
            throw new NullPointerException();
        }

        finally{
            try {
                fr.close();
                fw.close();
            } catch (Exception e) {
                System.out.println("Error escribiendo el fichero " + e.toString());
                throw new NullPointerException();
            }
        }
    }
}
