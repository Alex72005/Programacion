package Tareas.Tarea_12_1.src;

import java.io.*;
import java.util.ArrayList;

public class DividirFichero {
    public static void main(String[] args) {
        String ficheroOriginal = "src/Tarea121/fichero1.txt";
        String ficheroPrimeraMitad = "primeraMitad.txt";
        String ficheroSegundaMitad = "segundaMitad.txt";

        BufferedReader br = null;
        BufferedWriter bwPrimeraMitad = null;
        BufferedWriter bwSegundaMitad = null;

        try {
            // Crear el BufferedReader para leer el fichero original
            br = new BufferedReader(new FileReader(ficheroOriginal));

            // Crear los BufferedWriter para los ficheros resultantes
            bwPrimeraMitad = new BufferedWriter(new FileWriter(ficheroPrimeraMitad));
            bwSegundaMitad = new BufferedWriter(new FileWriter(ficheroSegundaMitad));

            // Leer todas las líneas del fichero original y almacenarlas en una lista
            ArrayList<String> lineas = new ArrayList<String>();
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }

            // Calcular el número de líneas de la primera mitad
            int mitad = lineas.size() / 2;

            // Escribir la primera mitad en el primer fichero
            for (int i = 0; i < mitad; i++) {
                bwPrimeraMitad.write(lineas.get(i));
                bwPrimeraMitad.newLine();
            }

            // Escribir la segunda mitad en el segundo fichero
            for (int i = mitad; i < lineas.size(); i++) {
                bwSegundaMitad.write(lineas.get(i));
                bwSegundaMitad.newLine();
            }

            System.out.println("El fichero ha sido dividido correctamente en dos ficheros.");

        } catch (IOException e) {
            System.out.println("Error al manejar los ficheros: " + e.getMessage());
        } finally {
            try {
                // Cerrar los BufferedReader y BufferedWriter si no son null
                if (br != null) {
                    br.close();
                }
                if (bwPrimeraMitad != null) {
                    bwPrimeraMitad.close();
                }
                if (bwSegundaMitad != null) {
                    bwSegundaMitad.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar los ficheros: " + e.getMessage());
            }
        }
    }
}

