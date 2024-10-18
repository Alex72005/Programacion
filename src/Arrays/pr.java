package Arrays;
import java.util.Scanner; 
public class pr {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /*    
        int[] array_de_enteros = new int[5];
        array_de_enteros[1] = 4;

        System.out.println(array_de_enteros[5]);
        
        // recorrer array
        int[] array = {5,3,7,9,6,5,7};
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]); 
        }
        //recorrer array de forma inversa
        //opción 1
        int[] array = {5,3,7,9,6,5,7};
        for (int i = 6; i >= 0; i--){
            System.out.println(array[i]); 
        }
        //opción 2
        int[] array = {5,3,7,9,6,5,7};
        for (int i = array.length - 1; i < array.length; i--){
            System.out.println(array[i]); 
        }
     
        char[] array2 = {'I','N','F','O','R','M','A','T','I','C','A'};
        /*for (int i = 0; i < array2.length; i++ ){
            System.out.println(array2[i]);
        }
       
        for (int i = 0; i < array2.length; i++){
            if (array2[i] == 'M'){
                System.out.print(i);
            }
        }

         sc.close();
         */
        /* 
        int[] array = new int[5];
        for(int number: array){
            System.out.println(number);
        }
        */
        sc.close();
        
        /* int[] array = {1,10,2};
        System.out.println(orden(array));*/ 

        int[] array2 = {9,8,7,6,5,4,3,2,1};
        for (int i = array2.length -1; i >= 0; i--){
            System.out.print(array2[i] + ",");
        }

        


    }      

    public static boolean orden (int[] x){
        for (int i = 0; i < x.length - 1; i++){
            if (x[i] > x[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] ordenados(int[] x){
        int[] y = x.clone();
        int n = y.length;   
        for (int i = 0; i < n - 1; i++) {               // Recorremos todo el array
            for (int j = 0; j < n - i - 1; j++) {       // Comparar e intercambiar elementos adyacentes
                if (y[j] > y[j + 1]) {                  // Si están en el orden incorrecto
                    int temp = y[j];                    // Intercambiar
                    y[j] = y[j + 1];
                    y[j + 1] = temp;
                }
            }
        }
        return y;
    }

    public static char calcularLetraDNI(int numeroDNI) {
        // Array con las letras correspondientes
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        // Calcular el índice de la letra
        int indice = numeroDNI % 23;

        // Retornar la letra correspondiente
        return letras[indice];
    }
}
   