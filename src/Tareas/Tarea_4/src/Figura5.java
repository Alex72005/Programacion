package Tareas.Tarea_4.src;

public class Figura5 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // En un único bucle: imprimimos los espacios y luego los asteriscos
            for (int j = 0; j < 10 + i; j++) {
                if (j < 10 - i - 1) {
                    System.out.print(" "); // Imprime los espacios al principio
                } else {
                    System.out.print("*"); // Imprime los asteriscos separados por un espacio
                }
            }
            // Salto de línea después de cada fila
            System.out.println();
        } 
        
    }
}
