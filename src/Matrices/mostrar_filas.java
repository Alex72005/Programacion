package Matrices;
import java.util.Scanner;
public class mostrar_filas {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [][] m = new int[3][3];

        System.out.println("Introduce los numeros");

        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int[] fila = new int[3];
        int[] columna = new int[3];
        
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
               fila[j] = m[i][j];
            }
            System.out.println("La fila " + i + " : ");
            for (int j = 0; j < m[i].length; j++){
                System.out.print(fila[j] + " ");
            }
            System.out.println();
        }
        
        for (int j = 0; j < m.length; j++){
            for (int i = 0; i < m[j].length; i++){
               columna[i] = m[i][j];
            }
            System.out.println("La columna " + j + " : ");
            for (int i = 0; i < m[j].length; i++){
                System.out.print(columna[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
