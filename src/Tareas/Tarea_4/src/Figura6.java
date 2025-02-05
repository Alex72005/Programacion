package Tareas.Tarea_4.src;

public class Figura6 {
    public static void main(String[] args) {
         // Bucle externo para controlar las filas
         for (int i = 0; i < 10; i++) {
            // Imprime los espacios al principio de cada fila
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Imprime los asteriscos después de los espacios
            for (int j = 0; j < (10 - i); j++) {
                System.out.print("* ");
            }

            // Salto de línea después de cada fila
            System.out.println();
        }
    }
}
