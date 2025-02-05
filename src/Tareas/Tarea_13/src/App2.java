package Tareas.Tarea_13.src;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
            FileOutputStream fo = new FileOutputStream("src/Tarea13/cifrado.dat");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(fraseCifrada);
            oo.close();
            fo.close();
            System.out.println("La frase cifrada ha sido escrita en el fichero cifrado.dat");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }

    public static void descifrado(int key){ 
        String fraseCifrada = "";
        String fraseDescifrada = "";
        try {
            FileInputStream fi = new FileInputStream("src/Tarea13/cifrado.dat");
            ObjectInputStream oi = new ObjectInputStream(fi);
            fraseCifrada = (String)oi.readObject();
            oi.close();
            fi.close();
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

