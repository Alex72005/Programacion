package Tarea13.src;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import Ficheros.src.Caracter;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*char [] abecedario = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};*/

        ArrayList<Character> abecedario = new ArrayList<Character>();

        for (int i = 65; i < 91; i++) {
            abecedario.add((char)i);
        }

        /*Parte 1: Cifrado */
        System.out.println("Introduzca la frase que desee cifrar");
        String frase = sc.nextLine();

        System.out.println("Introduzca la clave númerica");
        int clave = sc.nextInt();

        FileWriter fw = new FileWriter("src/Tarea13/cifrado.txt");

        FileReader fr = new FileReader("src/Tarea13/cifrado.txt");

        int caracter = fr.read();

        while (caracter != -1) {
            if (abecedario.contains(Character.toUpperCase((char)caracter))) {
                caracter += clave; 
            }
        }
    }
}
