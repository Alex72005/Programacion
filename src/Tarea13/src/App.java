package Tarea13.src;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        final String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

      
        /*Parte 1: Cifrado */
        System.out.println("Introduzca la frase que desee cifrar");
        String frase = "HOLA ME LLAMO ALEX";
        frase = frase.toUpperCase();

        System.out.println("Introduzca la clave númerica");
        int clave = 3;

        String fraseCifrada = "";
        
        for (int i = 0; i < frase.length(); i++) {
            int indice = abecedario.indexOf(frase.charAt(i));
            if (indice != -1) {
                int posicion = (indice + clave) % abecedario.length();
                fraseCifrada += abecedario.charAt(posicion);
            }
            else{
                fraseCifrada += frase.charAt(i);
            }
        }

        System.out.println(fraseCifrada);

        FileWriter fw = new FileWriter("src/Tarea13/cifrado.txt");

        fw.write(fraseCifrada);

        fw.close();

        /*Descifrado */

        String fraseDescifrada = "";

        for (int i = 0; i < fraseCifrada.length(); i++) {
            int indice = abecedario.indexOf(fraseCifrada.charAt(i));
            if (indice != -1) {
                int posicion = (indice - clave) % abecedario.length();
                if (posicion < 0 ) {
                    posicion += abecedario.length();
                }
                fraseDescifrada += abecedario.charAt(posicion);
            }
            else{
                fraseDescifrada += fraseCifrada.charAt(i);
            }
        }

        System.out.println(fraseDescifrada);



    }
}
