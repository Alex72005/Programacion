package Matriz.Pintar_matrices.Piramides_numeros;

public class Matriz_piramide2 {
    public static void main(String[] args) throws Exception {

        // PINTAR UNA MATRIZ (De izquierda a derecha y de arriba a abajo)

        //   0 1 2 3 4
        // 0 - - - - A      --> j (lateral)
        // 1 - - - B B      |
        // 2 - - C C C      ↓
        // 3 - D D D D      i (abajo)
        // 4 E E E E E

        for (int i = 0; i < 5; i++) { 
            for (int j = 0; j < 5; j++) {
                if (j < 4 - i) { 
                    System.out.print(" ");
                } else {
                    System.out.print(i + 1); 
                }
            }
            System.out.println(); 
        }
    }
}