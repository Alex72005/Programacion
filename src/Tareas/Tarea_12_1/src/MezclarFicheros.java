package Tareas.Tarea_12_1.src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MezclarFicheros {
    public static void main(String[] args) {
        FileReader fr1 = null;
        FileReader fr2 = null;
        FileWriter fr3 = null;
        BufferedReader br1 = null;
        BufferedReader br2 = null;
        BufferedWriter bw = null;
        String ficheroResultado = "ficheroResultado.txt";

        try {
            // Crear los BufferedReader para los dos ficheros de entrada
            fr1 = new FileReader("src/Tarea121/fichero1.txt");
            fr2 = new FileReader("src/Tarea121/fichero2.txt");
            br1 = new BufferedReader(fr1);
            br2 = new BufferedReader(fr2);
            fr3 = new FileWriter(ficheroResultado);
            // Crear un BufferedWriter para el fichero de salida
            bw = new BufferedWriter(fr3);
        
            String linea1 = br1.readLine();
            String linea2 = br2.readLine();
            
            // Mientras haya líneas en al menos uno de los dos ficheros
            while (linea1 != null || linea2 != null) {
                // Escribir la línea del primer fichero si no es null
                if (linea1 != null) {
                    bw.write(linea1);
                    bw.newLine();
                    linea1 = br1.readLine(); // Leer la siguiente línea del primer fichero
                }

                // Escribir la línea del segundo fichero si no es null
                if (linea2 != null) {
                    bw.write(linea2);
                    bw.newLine();
                    linea2 = br2.readLine(); // Leer la siguiente línea del segundo fichero
                }
            }
            

            System.out.println("El contenido de los ficheros se ha mezclado correctamente en: " + ficheroResultado);
        } catch (IOException e) {
            System.out.println("Error al manejar los ficheros: " + e.getMessage());
        }

        finally {
            try {
                bw.close();
                fr3.close();
                br2.close();
                br1.close();
                fr2.close();
                fr1.close();  
            } catch (Exception e) {
                System.out.println("Error al manejar los ficheros: " + e.getMessage());
            }
        }
    }
}

