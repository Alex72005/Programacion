package Matrices;
public class suma_media {
    public static void main(String[] args) {

        /*Realiza un programa en Java que cree una matriz de 5 filas por 5 columnas con números enteros positivos comprendidos entre 1 y 50 (ambos incluidos).
        A continuación, el programa debe: 
        Calcular la suma de todos los elementos de la matriz.
        Encontrar la media aritmética de los valores.
        Mostrar la matriz junto con la suma total y la media aritmética. */

        int [][] m = {{1,2,3,4,5},
                      {6,8,10,12,14},
                      {50,7,9,11,13},
                      {15,16,17,18,19},
                      {32,43,26,39,44}};
        int filas = 5;
        int columnas = 5; 
        int contador = 0;

        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                contador += m[i][j];
            }
        }

        double media = contador / (filas * columnas) ;

        for (int i = 0; i < m.length; i++){
            for (int j = 0 ; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("La suma de todos los elementos de la matriz es: " + contador);
        System.out.println("La media aritmética de todos los valores de la matriz es: " + media);
    }
}  
