package Ficheros.src;

import java.io.FileWriter;

public class Escritura {
    public static void main(String[] args) throws Exception{
        FileWriter fw = null;

        try{

            fw = new FileWriter("prueba.txt");

            for (int i = 65; i < 91; i++){
                fw.write((char)i);
            }

           
        }
        
        catch (Exception e) {
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
