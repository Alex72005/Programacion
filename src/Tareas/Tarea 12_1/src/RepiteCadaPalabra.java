package Tarea121.src;

import java.io.FileReader;
import java.util.ArrayList;

public class RepiteCadaPalabra {
    public static void main(String[] args){

        ArrayList<String> palabras = new ArrayList<String>();
        ArrayList<String> palabrasYa = new ArrayList<String>();
        FileReader fr = null;
        String palabra = "";
        int caracter;

        try {
            fr = new FileReader("src/Tarea121/ocurrencias.txt");
            palabra = "";
            caracter = fr.read();

            while (caracter != -1) {

                if ((char)caracter == ' ' || (char)caracter == '\n') {
                    palabras.add(palabra.toLowerCase());
                    palabra = "";
                }
                    
                else{
                    palabra += (char)caracter;
                }
        
                caracter = fr.read();
            }

            for (int i = 0; i < palabras.size(); i++) {
                String p = palabras.get(i);
                if (!palabrasYa.contains(p)) {
                    int busqueda = buscarPalabra(p);
                    palabrasYa.add(p);
                    System.out.println("La palabra " + p + " ha aparecido " + busqueda + " veces");
                }
            }

        } catch (Exception e) {
            System.out.println("Error escribiendo el fichero " + e.toString());
            throw new NullPointerException();
        }
        
        finally{
            try {
                fr.close();
            } catch (Exception e) {
                System.out.println("Error escribiendo el fichero " + e.toString());
                throw new NullPointerException();
            }
        }

       
    }


    public static int buscarPalabra(String palabraABuscar){
        int cont = 0;
        FileReader fr = null;

        try {
            fr = new FileReader("src/Tarea121/ocurrencias.txt");
            String palabra = "";

            int caracter = fr.read();

            while (caracter != -1) {
            
                if ((char)caracter == ' ' || (char)caracter == '\n') {
                    if (palabra.equals(palabraABuscar)) {
                        cont++;
                        palabra = "";
                    }
                    palabra = "";
                }
                
                else{
                    palabra += (char)caracter;
                }
    
                caracter = fr.read();
            }
        } catch (Exception e) {
            System.out.println("Error escribiendo el fichero " + e.toString());
            throw new NullPointerException();
        }

        finally{
            try {
                fr.close();
            } catch (Exception e) {
                System.out.println("Error escribiendo el fichero " + e.toString());
                throw new NullPointerException();
            }
        }
        return cont;
    }
}
