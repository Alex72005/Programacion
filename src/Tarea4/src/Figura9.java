package Tarea4.src;
public class Figura9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            // Imprimir el número 'i', 'i' veces
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            // Salto de línea después de cada fila
            System.out.println();
        }
    }
}
