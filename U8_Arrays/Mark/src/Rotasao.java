import java.util.Scanner;

public class Rotasao {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        int a[] = new int[15];
        int r[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i <= 14; i++) {
            System.out.print("Inserte el valor " + (i + 1) + ": ");
            a[i] = xd.nextInt();
        }
        for (int j = 0; j <= 13; j++) {
            a[j] = r[j+1];
            System.out.print(r[j+1]);
        }
        a[14] = r[0];
        System.out.print("A: ");
        for (int b = 0; b <= 14; b++) {
            System.out.print(a[b] + ", ");
        }
        System.out.println("");
        System.out.print("R: ");
        for (int c = 0; c <= 14; c++) {
            System.out.print(r[c] + ", ");
        }


        }
    }
