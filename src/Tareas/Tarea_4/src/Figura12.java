package Tareas.Tarea_4.src;

public class Figura12 {
    public static void main(String[] args) {
        for (int i = 9; i >= 1; i--) {
            // Imprimir espacios para centrar el árbol invertido
            for (int j = 0; j < 9 - i; j++) {
                System.out.print(" ");
            }
            // Imprimir el número 'i', 'i' veces
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            // Salto de línea después de cada fila
            System.out.println();
        }
    }
    
}
