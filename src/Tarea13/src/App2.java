package Tarea13.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class App2 {
    private static final String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option = 0;
        String frase = "";
        int key = 0;

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

                    cifrado(frase, key);

                    break;
                
                case 2: 
                    System.out.println("Introduzca la clave númerica");
                    key = sc.nextInt();

                    descifrado(key);

                    break;
                default:
                    break;
            }
            
        } while (option > 0 && option != 3);

        sc.close();

    }

    public static void cifrado(String frase, int key){
        String fraseCifrada = "";
        for (int i = 0; i < frase.length(); i++) {
            int indice = abecedario.indexOf(frase.charAt(i));
            if (indice != -1) {
                int posicion = (indice + key) % abecedario.length();
                fraseCifrada += abecedario.charAt(posicion);
            } else {
                fraseCifrada += frase.charAt(i);
            }
        }
        
        try {
            FileWriter fw = new FileWriter("src/Tarea13/cifrado.txt");
            fw.write(fraseCifrada);
            fw.close();
            System.out.println("La frase cifrada ha sido escrita en el fichero cifrado.txt");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }

    public static void descifrado(int key){ 
        String fraseCifrada = "";
        String fraseDescifrada = "";
        try {
            FileReader fr = new FileReader("src/Tarea13/cifrado.txt");
            BufferedReader br = new BufferedReader(fr);
            fraseCifrada = br.readLine();
            br.close();
            System.out.println("Frase cifrada: " + fraseCifrada);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

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
    }
}
