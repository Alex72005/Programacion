package Matrices;
public class min_max {
   public static void main(String[] args) {
    /*Realizar un programa que realize un array de 6 filas por 10 columnas con números enteros positivos comprendidos entre 0 y 1000(ambos incluidos).
     A continuación, el programa deberá dar la posición tanto del mínimo como del máximo.*/

    int[][] m = {{1,2,3,5,8,9,2,7,10,56},
                 {4,5,6,9,4,1,23,45,5,6},
                 {7,4,6,18,24,57,9,0,1,2},
                 {1000,1,2,4,6,8,3,5,7,9},
                 {0,1,2,3,4,5,6,7,8,9},
                 {0,1,2,3,4,5,6,7,8,9}};
                 
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int maxFila = 0; 
    int maxColumna = 0;
    int minFila = 0;
    int minColumna = 0; 
    
    for (int i = 0; i < m.length; i++){
        for (int j = 0; j < m[i].length; j++){
            //maximo
            if (m[i][j] > max) {
                max = m[i][j];
                maxFila = i;
                maxColumna = j;
            }
            //minimo
            if (m[i][j] < min) {
                min = m[i][j];
                minFila = i;
                minColumna = j;
            }
        }
    }
    System.out.println("El máximo es: " + max + " y su posición es: " + maxFila + " " + maxColumna);
    System.out.println("El mínimo es: " + min + " y su posición es: " + minFila + " " + minColumna);







   } 
}
