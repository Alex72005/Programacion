package examen.ejercicio2;

public class Main {
    public static void main(String[] args) {
        int[] a = ArrayFunctions.createArrayInt(10, 0, 10);

        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");

        int[] b = ArrayFunctions.rotateRightArray(a);

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}

