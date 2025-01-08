package Ficheros.src;

import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("src/Ficheros/prueba.txt");

        int dato = fr.read();

        while (dato != -1) {
            System.out.println((char)dato);
            dato = fr.read();
        }

        fr.close();
    }
}
