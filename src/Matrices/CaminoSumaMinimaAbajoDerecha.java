package Matrices;

public class CaminoSumaMinimaAbajoDerecha {

    public static void main(String[] args) {
        // Definir la matriz de ejemplo
        int[][] matriz = {
            {5, 9, 1},
            {4, 7, 2},
            {6, 1, 3}
        };

        int filas = matriz.length;
        int columnas = matriz[0].length;

        System.out.println("Matriz original");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Calcular las sumas mínimas en la misma matriz
        for (int i = 1; i < filas; i++) {
            matriz[i][0] += matriz[i - 1][0]; // Llenar la primera columna
        }
        for (int j = 1; j < columnas; j++) {
            matriz[0][j] += matriz[0][j - 1]; // Llenar la primera fila
        }

        for (int i = 1; i < filas; i++) {
            for (int j = 1; j < columnas; j++) {
                matriz[i][j] += Math.min(matriz[i - 1][j], matriz[i][j - 1]);
            }
        }

        // La suma mínima se encuentra en la esquina inferior derecha
        int sumaMinimaTotal = matriz[filas - 1][columnas - 1];

        // Imprimir la matriz original con las sumas mínimas calculadas
        System.out.println("Matriz con sumas mínimas:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }

        // Mostrar el resultado final de la suma mínima
        System.out.println("\nSuma mínima del camino: " + sumaMinimaTotal);
    }
}
