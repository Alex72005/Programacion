package Matrices;
public class matriz {
    public static void main(String[] args) {
        // recorrer matrices
        /*int [][] numeros = {{15,20,25,30},{20,30,40,50},{60,65,70,80}};

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){  // [i] para que al cogerla recorra la fila
                System.out.print(numeros[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        */
        //3
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (i <= j){                              // I<J *****
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
           
        //1
        /*
        for (int i = 0; i < 5 ;i++){
            for (int j = 0; j < 5 ;j++){
                if (i <= j) {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
        
        */
        
        
    }
}    

