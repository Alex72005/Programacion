package Matrices;
import java.util.Scanner;
public class mostrar_filas {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [][] m = new int[3][3];

        System.out.println("Introduce los numeros");

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
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

        int[] fila1 = new int[3];
        int[] fila2 = new int[3];

        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
               fila1 = m[j];
               

            }
        }
        System.out.println();

            
        for (int i = 0; i < fila1. length; i++){
            System.out.print(fila1[i] + ",");
        }
        System.out.println();

        for(int i = 0; i < fila2.length; i++){
            System.out.print(fila2[i] + ",");
        }

        sc.close();
    }
    
}
