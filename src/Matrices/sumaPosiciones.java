package Matrices;
public class sumaPosiciones {
    public static void main(String[] args) {
        int [][] m = {{50,22,87},
                      {34,61,45},
                      {92,12,19}};
        
        int sumaPosicionesImpares = 0;
        int sumaPosicionesPares = 0;
        
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                if (i % 2 != 0 || j % 2 != 0) {
                    sumaPosicionesImpares += m[i][j]; 
                }
                else{
                    sumaPosicionesPares += m[i][j];
                }
            }
        }
        System.out.println("La suma de los valores que ocupan las posiciones pares de la matriz es: " + sumaPosicionesPares);
        System.out.println("La suma de los valores que ocupan las posiciones impares de la matriz es: " + sumaPosicionesImpares);
        
    }
}
