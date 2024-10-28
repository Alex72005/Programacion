package Matriz.Pintar_matrices.Piramides;

public class Matriz_piramide3 {
    public static void main(String[] args) throws Exception {

        // PINTAR UNA MATRIZ (De izquierda a derecha y de arriba a abajo)

        //   0 1 2 3 4      
        // 0 * * * * *      --> j (lateral) 
        // 1 * * * * -      |
        // 2 * * * - -      ↓
        // 3 * * - - -      i (abajo)
        // 4 * - - - -

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > 0; j--) {
                
                if (i < j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
        
                
            }

            System.out.println();
        }

    }
}
