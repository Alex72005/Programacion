package Matriz.Pintar_matrices.Piramides_numeros;

public class Matriz_piramide4 {
    public static void main(String[] args) throws Exception {

        // PINTAR UNA MATRIZ (De izquierda a derecha y de arriba a abajo)

        //   0 1 2 3 4
        // 0 E E E E E      --> j (lateral)
        // 1 - D D D D      |
        // 2 - - C C C      ↓
        // 3 - - - B B      i (abajo)
        // 4 - - - - A

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < 5; j++) {

                if (i > j) {
                    System.out.print(" ");
                } else {
                    System.out.print((5-i));
                }

            }

            System.out.println();
        }

    }
}
