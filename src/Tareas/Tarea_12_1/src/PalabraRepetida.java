package Tareas.Tarea_12_1.src;

import java.io.FileReader;
import java.util.Scanner;

public class PalabraRepetida {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String palabra = " ";
        int cont = 0;

        System.out.println("Introduce una palabra a buscar en el fichero ");
        String palabraABuscar = sc.nextLine();

        FileReader fr = new FileReader("src/Tarea121/ocurrencias.txt");

        int caracter = fr.read();

        while (caracter != -1) {
            
            if ((char)caracter == ' ' || (char)caracter == '\n') {
                if (palabra.equals(palabraABuscar)) {
                    cont++;
                }
                palabra = "";
            }
            
            else{
                palabra += (char)caracter;
            }

            caracter = fr.read();
        }
        System.out.println("Se ha encontrado la palabra " + palabraABuscar + " " + cont + " veces" );

        fr.close();
        sc.close();
    }
}
