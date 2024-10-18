package examen.ejercicio2;

import java.util.Random;

public class ArrayFunctions {
    public static int[] createArrayInt (int size, int minimum, int maximum) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = random.nextInt(minimum, maximum + 1);
        }
        return a;
    }

    /*
    public static int[] flipArrayInt (int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {

        }
    }

     */

    public static int[] rotateRightArray (int[] a) {
        int tempF = a[a.length - 1];
        
        for (int i = a.length - 1; i <= 0; i--) {
            System.out.print(a[i] + " ");
        }
        a[0] = tempF;
        return a;
    }
}
