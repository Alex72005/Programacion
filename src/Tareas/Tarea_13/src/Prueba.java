package Tareas.Tarea_13.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        final String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int option = 0;
        String frase = "";
        int key = 0;
        String fraseCifrada = "";
        String fraseDescifrada = "";

        do {
            System.out.println("Elija la opcion que desee");
            System.out.println("1.Cifrado");
            System.out.println("2.Descifrado");
            System.out.println("3.Salir");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Introduzca la frase que desee cifrar");
                    frase = sc.nextLine().toUpperCase();
                    System.out.println("Introduzca la clave númerica");
                    key = sc.nextInt();

                    for (int i = 0; i < frase.length(); i++) {
                        int indice = abecedario.indexOf(frase.charAt(i));
                        if (indice != -1) {
                            int posicion = (indice + key) % abecedario.length();
                            fraseCifrada += abecedario.charAt(posicion);
                        } else {
                            fraseCifrada += frase.charAt(i);
                        }
                    }

                    FileWriter fw = new FileWriter("src/Tarea13/cifrado.txt");
                    fw.write(fraseCifrada);
                    fw.close();
                    System.out.println("La frase cifrada ha sido escrita en el fichero cifrado.txt");

                    break;

                case 2:
                    System.out.println("Introduzca la clave númerica");
                    key = sc.nextInt();

                    FileReader fr = new FileReader("src/Tarea13/cifrado.txt");
                    BufferedReader br = new BufferedReader(fr);
                    fraseCifrada = br.readLine();
                    br.close();
                    System.out.println("Frase cifrada: " + fraseCifrada);

                    for (int i = 0; i < fraseCifrada.length(); i++) {
                        int indice = abecedario.indexOf(fraseCifrada.charAt(i));
                        if (indice != -1) {
                            int posicion = (indice - key) % abecedario.length();
                            if (posicion < 0) {
                                posicion += abecedario.length();
                            }
                            fraseDescifrada += abecedario.charAt(posicion);
                        } else {
                            fraseDescifrada += fraseCifrada.charAt(i);
                        }
                    }

                    System.out.println("Frase descifrada: " + fraseDescifrada);

                    break;
                default:
                    break;
            }

        } while (option > 0 && option != 3);

        sc.close();
    }
}
