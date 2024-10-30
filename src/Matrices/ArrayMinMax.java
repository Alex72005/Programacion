package Matrices;
import java.util.Random;
public class ArrayMinMax {
    public static void main(String[] args) {
        int[][] array = new int[6][10];
        Random random = new Random();

        // Llenar el array con números aleatorios entre 0 y 1000
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(1001); // Genera un número entre 0 y 1000
            }
        }

        // Inicializar valores mínimo y máximo como el primer elemento del array. 
        int min = array[0][0];
        int max = array[0][0];
        int minFila = 0;
        int minColumna = 0;
        int maxFila = 0;
        int maxColumna = 0;

        // Recorrer el array para encontrar el mínimo y máximo y sus posiciones
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    minFila = i;
                    minColumna = j;
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxFila = i;
                    maxColumna = j;
                }
            }
        }

        // Imprimir el array y los resultados
        System.out.println("La matriz: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("El mínimo es: " + min + " y está en la posición (" + minFila + ", " + minColumna + ")");
        System.out.println("El máximo es: " + max + " y está en la posición (" + maxFila + ", " + maxColumna + ")");
    }
}
