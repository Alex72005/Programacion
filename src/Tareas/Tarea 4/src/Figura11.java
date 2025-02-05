
public class Figura11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            // Imprimir espacios para centrar el árbol
            for (int j = 9 - i; j > 0; j--) {
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
