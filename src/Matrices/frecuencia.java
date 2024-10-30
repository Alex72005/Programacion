package Matrices;
public class frecuencia {
    public static void main(String[] args) {
        int [][] m = {{50,22,87,7},
                      {34,61,7,45},
                      {7,92,12,19},
                      {80,7,4,10}};
        
        int sumaElementosFilasPares = 0;
        int sumaElementosFilasImpares= 0;
        int sumaElementosColumnasPares = 0;
        int sumaElementosColumnasImpares = 0;

        int numMasFrecuente = 0;
        int[] frecuencia = new int[93];
        int maxFrecuencia = 0;

        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                if (i % 2 == 0) {
                    sumaElementosFilasPares += m[i][j]; 
                }
                if (i % 2 != 0) {
                    sumaElementosFilasImpares += m[i][j];
                }
                if (j % 2 == 0) {
                    sumaElementosColumnasPares += m[i][j];
                }
                if (j % 2 != 0) {
                    sumaElementosColumnasImpares += m[i][j];
                }
                frecuencia[m[i][j]]++;
            }
        }
        System.out.println("La suma de los elementos de las filas pares es: " + sumaElementosFilasPares);
        System.out.println("La suma de los elementos de las filas impares es: " + sumaElementosFilasImpares);
        System.out.println("La suma de los elementos de las columnas pares es: " + sumaElementosColumnasPares);
        System.out.println("La suma de los elementos de las columnas impares es: " + sumaElementosColumnasImpares);

        //Encontrar el numero mas frecuente y cuantas veces esta ese numero en la matriz

        for (int i = 0; i < frecuencia.length; i++){
            if (frecuencia[i] > maxFrecuencia) {
                maxFrecuencia = frecuencia[i];
                numMasFrecuente = i;
            }
        }

        System.out.println("El numero mas frecuente es: " + numMasFrecuente + " y aparece " + maxFrecuencia + " veces");
    }
}
