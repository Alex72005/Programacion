package recursividad;

public class sumarElementosArray{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(suma(array));
    }

    public static int[] array1Menos(int [] x){
        int[] y = new int[x.length - 1];
        for (int i = 1; i < x.length; i++) {
            y[i - 1] = x[i];
        }
        return y;
    }

    public static int suma(int[] arr){
        if (arr.length == 0) return 0;
        if (arr.length == 1) return arr[0];
        int[] aux = array1Menos(arr);
        return arr[0] + suma(aux);
    }
}



