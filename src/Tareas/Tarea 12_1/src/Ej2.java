package Tarea121.src;

import java.io.FileReader;

public class Ej2 {
    public static void main(String[] args) throws Exception{

        FileReader fr = null;
        
        try {

            fr = new FileReader("personas.txt");
            int caracter = fr.read();

            while (caracter != -1) {
                System.out.print((char)caracter);
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
        

        


    }
}
