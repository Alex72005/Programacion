package Arrays;
import java.util.Arrays;
public class arrays {
    public static void main(String[] args) {
        int ej  = 5;
        int[] array = {1,2,3};
        String palabra = "ana";
        int [] li = {4,3,2,1};
        int [] li2 = {100,1,45};
        switch (ej) {
            case 1:
                // minimo array
                System.out.println(min1Array(array));
                break;
            case 2:
                System.out.println(max1Array(array));
                break;
            case 3:
                System.out.println(mediaArray(array));
                break;
            case 4:
                System.out.println(buscarArray(array, 28));
                break;
            case 5:
                System.out.println(Arrays.toString(rotateArrayInt(array, 2)));
                break;
            case 6:
                System.out.println(saberPalindromo(palabra));
                break;
            case 7:
                System.out.println(IsCapicua("161"));
                break;
            case 8:
                int[] array2 = flip(array);
                for (int i = 0; i < array2.length; i++){
                    System.out.print(array2[i]+",");
                }
                break;
            case 9:
                System.out.println(mcm(2, 6));
                break;
            case 10:
                System.out.println(mcd(2, 6));
                break;
            case 11:
                int [] numeros = impares(li);
                for (int i = 0; i < numeros.length; i++){
                    System.out.print(numeros[i]+",");
                }
                break;
            case 12:
                System.out.println(repetidos(li2));
                break;
            case 13:
                System.out.println(orden(li2));
                break;
            case 14:
                System.out.println(Prime(8));
                break;
            case 15:
                int [] n_primos = primos(li);
                for (int i = 0; i < n_primos.length; i++){
                    System.out.print(n_primos[i]+",");
                }
                break;
            case 16: 
                int[] n_ord = ordenados(li);
                for (int i = 0; i < n_ord.length; i++){
                    System.out.print(n_ord[i]+",");
                }
                break;
            case 17:
                int[] num = {3,1,0,2,3,5,0,6};
                char letra = calcularLetraDni(num);
                System.out.println(letra);
                break;
            default:
                break;
        }
    }
    public static int min1Array(int[] x){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= x.length - 1; i++){
            if (x[i] < min){
                min = x[i];
            }
        }
        return min;
    }
    public static int max1Array(int[] y){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i <= y.length - 1; i++){
            if (y[i] > max){
                max = y[i];
            }
        }
        return max;
    }
    public static int mediaArray(int[] z){
        int media = 0;
        for(int i = 0; i <= z.length - 1; i++){
            media = media + z[i];
        }
        return (media / z.length);
    }
    public static boolean buscarArray(int[] x, int a){
        for (int i = 0; i <= x.length - 1; i++){
            if (x[i] == a){
                return true;
            }
        }
        return false;
    }
    public static int buscarYposicionArray(int[] x, int a){
        for (int i = 0; i <= x.length - 1; i++){
            if (x[i] == a){
                return i;
            }
        } 
        return -1;
    }
    public static int[] rotateArrayInt (int[] a, int n) {
        for (int j = 0; j <= n - 1; j++) {
            int t = a[0];
            for (int i = 0; i <= a.length - 2; i++) {
                a[i] = a[i + 1];
            }
            a[a.length - 1] = t;
        }
        return a;
    }
    public static boolean saberPalindromo (String x){
        for (int i = 0; i < x.length() - 1; i++){
            if (x.charAt(i) != x.charAt (x.length() - i -1)) {
                return false;
            }
        }
        return true;
    }
    public static boolean IsCapicua(String x){
        for (int i = 0; i < x.length() - 1; i++){
            if (x.charAt(i) == x.charAt(x.length() - i - 1)) {
                return true;
            }
        }
        return false;
    }
    public static int[] flip (int[] x){
        int [] y = new int[x.length];
        for (int i = 0; i <  x.length; i++){
            y[i] =  x[x.length - i - 1];
        }
        return y;
    }
    public static int mcm(int x , int y){
        if (x == 0 && y == 0){
            return 0;
        }
        return (x * y) / mcd(x, y); 
    }
    public static int mcd(int a, int b){
        while (b != 0 ) {
            int j = b;
            b = a % b;
            a = j;
        }
        return a;
    }
    public static int[] impares(int[] x){
        int cuentaImpares = 0;
        for (int i = 0; i < x.length; i++){
            if (x[i] % 2 != 0) {
                 cuentaImpares++;
            }
        }
        int [] y = new int[cuentaImpares];
        int indice = 0;
        for (int j = 0; j < x.length ; j++){
            if (x[j] % 2 != 0){
                y[indice++] = x[j];
            }
        }
        return y;
    }
    public static boolean repetidos(int[] x){
        for (int i = 0; i < x.length; i++){
            for (int j = i + 1; j < x.length ; j++){
                if (x[i] == x[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean orden(int[] x){
        for (int i = 0; i < x.length; i++){
            for (int j = i + 1; j < x.length; j++){
                if (x[i] > x[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean Prime(int x){
        for(int i = 2; i*i <= x  ; i++){
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int[] primos(int[] x){
        int contador = 0;
        for (int i = 0; i < x.length; i++){
            if (Prime(x[i])) {
                contador++;
            }
        }
        int[] y = new int[contador];
        int index = 0;
        for (int i = 0; i < x.length; i++){
            if (Prime(x[i])) {
                y[index++] = x[i];
            }
        }
        return y;
    }
    
    public static int[] ordenados(int[] x){
        int n = x.length;   
        for (int i = 0; i < n - 1; i++) {               
            for (int j = 0; j < n - i - 1; j++) {      
                if (x[j] > x[j + 1]) {                    // si cambio el signo a < seria para hacer orden descendente.        
                    int z = x[j];                   
                    x[j] = x[j + 1];
                    x[j + 1] = z;                      
                }
            }
        }
        return x;
    }

    public static char calcularLetraDni(int[] x){
        int y = 0;
        for (int i = 0; i < x.length; i++){
            y = y * 10 + x[i];
        }
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int index = y % 23;
        return letras[index];
    }
    
}
