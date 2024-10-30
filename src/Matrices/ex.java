package Matrices;
import java.util.Scanner;
public class ex {
    public static void main(String[] args) {
        /*Escriba un programa que pida 20 numeros enteros. Estos numeros se deben introducir en un array de 4 filas por 5 columnas. El programa mostrara las 
        sumas parciales de filas y columnas igual que si una hoja de cálculo se tratara*/

        Scanner sc = new Scanner (System.in);

        int [][] m = new int[4][5];
        
        int contadorF = 0; 
        int contadorC = 0;

        System.out.println("Introduce los números");
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

        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                contadorF +=  m[i][j];
            }
            System.out.print("La suma de las filas es: " + contadorF + " ");
            contadorF = 0;
        }
        
        for (int j = 0; j <= m.length;j++){
            for (int i = 0; i < m.length; i++){
                contadorC += m[i][j];
            }
            System.out.println("La suma de la columna es: " + contadorC + " ");
            contadorC = 0;
        }
        
    sc.close();
    
    }
}
