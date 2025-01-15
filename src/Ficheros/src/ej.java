package Ficheros.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ej {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = null;
        ArrayList<String> texto = new ArrayList<String>();
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fw = new FileWriter("src/Ficheros/ej.txt");
            
            String linea = "";
            System.out.println("Introduce las líneas de texto");
            
            
            while (!linea.equals(" ")) {
                linea = sc.nextLine();
                texto.add(linea);
            }

            for (int i = 0; i < texto.size(); i++) {
                fw.write(texto.get(i) + "\n");
            }

            fr = new FileReader("src/Ficheros/ej.txt");
            br = new BufferedReader(fr);

            String li = "";

            while ((li = br.readLine()) !=  null) {
                System.out.println(li);
            }
        } catch (Exception e) {
            System.out.println("Error leyendo el fichero " + e.toString());
            throw new NullPointerException();
        }

        finally{
            try {
                br.close();
                fr.close();
                fw.close();
                sc.close();
            } catch (Exception e) {
                System.out.println("Error leyendo el fichero " + e.toString());
                throw new NullPointerException();
            }
        }
    }
}
