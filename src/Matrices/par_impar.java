package Matrices;
public class par_impar {
    public static void main(String[] args) {
        int [][] m = {{1,2,3,4},
                      {5,16,7,30},
                      {9,10,14,18}};

        int pares = 0;
        int impares = 0; 

        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                if (m[i][j] % 2 == 0) {
                    pares++;
                }
                else{
                    impares++;
                }
            }
        }
        System.out.println("Hay " + pares + " números pares en esta matriz");
        System.out.println("Hay " + impares + " números impares en esta matriz");

        int[] arrayPares = new int[pares];
        int[] arrayImpares = new int[impares];

        int indexPar = 0;
        int indexImpar = 0;

        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                if (m[i][j] % 2 == 0) {
                    arrayPares[indexPar++] = m[i][j];
                }
                else{
                    arrayImpares[indexImpar++] = m[i][j];
                }
            }
        }
        System.out.println("Los números pares son: ");
        for (int i = 0; i < arrayPares.length; i++){
            System.out.print(arrayPares[i] + " ");
        }
        System.out.println();
        
        System.out.println("Los numeros impares son: ");
        for (int i = 0; i < arrayImpares.length; i++){
            System.out.print(arrayImpares[i] + " ");
        }
        
        
    }
}
