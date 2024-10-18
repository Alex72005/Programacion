package Arrays;
public class FunctionsLib {
    //Attributes
    //toString array
    public static void outputArray (int[] a) {
        for (int i = 0; i <= a.length -1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(" ");
    }

    //Generate an general array
    public static int[] generateArrayInt (int size, int min, int max) {
        int a[] = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            a[i] = (int) ((Math.random() * (max - min + 1)) + min);
        }
        return a;
    }

    //Return min valor of array
    public static int minimArrayInt (int[] a) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    //Return max valor of array
    public static int maximumArrayInt (int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    //Return a media of all array's valor
    public static int mediaArrayInt (int[] a) {
        int media = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            media += a[i];
        }
        return (media / a.length);
    }

    //Search a valor in a array
    public static boolean thisInArrayInt (int[] a, int n) {
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] == n) {
                return true;
            }
        }
        return false;
    }

    //Search a valor in array and return its position
    public static int positionInArray (int[] a, int n) {
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] == n) {
                return i;
            }
        }
        return -1;
    }

    //Move left the array n times
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
}