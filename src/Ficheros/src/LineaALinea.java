package Ficheros.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineaALinea {
    public static void main(String[] args) throws Exception {

        /*FileReader fr = new FileReader("src/Ficheros/prueba.txt");

        BufferedReader br = new BufferedReader(fr);
        
        String linea;

        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }

        br.close();*/

        try{
            FileReader fr = new FileReader("src/Ficheros/ej.txt");

            BufferedReader br = new BufferedReader(fr);
            
            String linea;
    
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();
        }
        
        catch(IOException e){

            System.out.println("Error leyendo el fichero " + e.toString());
            throw new NullPointerException();
        }
       

      
    }
}
