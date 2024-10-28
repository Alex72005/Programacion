public class Arbolinvertido {
    public static void main(String[] args) throws Exception {

        // PINTAR UNA MATRIZ (De izquierda a derecha y de arriba a abajo)

        //    0 1 2 3 4
        // 0  * * * * *      --> j (lateral)
        // 1   * * * *       |
        // 2    * * *        ↓
        // 3     * *         i (abajo)
        // 4      *      
       

        for (int i = 5; i > 0; i--) {
            
            for (int j = 5 - i; j > 0; j--) {
                System.out.print(" "); 
            }
            
            for (int j = 0; j < i; j++) {
                System.out.print("* "); 
            }
            
            System.out.println();
        }
    }
}