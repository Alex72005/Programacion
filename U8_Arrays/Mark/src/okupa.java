import java.util.Scanner;

public class okupa {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        int a[] = new int[12];
        int r[] = new int[12];
        for (int i = 0; i <= 11; i++) {
            a[i] = (int) (Math.random() * (200 + 1));
            System.out.print(a[i] + ", ");
        }
        System.out.println("");
        System.out.print("Inserte un número: ");
        int num = xd.nextInt();
        if (num < 0 || num > 200) {
            System.out.print("Número no valido");
            System.exit(0);
        }
        System.out.print("Inserte la posició de insercción: ");
        int pos = xd.nextInt() - 1;
        if (num < 0 || num > 12) {
            System.out.print("Posición no valido");
            System.exit(0);
        }

        for (int j = 0; j <= 11; j++) {
            if (pos == j) {
                r[pos] = num;
            }
            else if (pos < j) {
                r[j] = a[j - 1];
            }
            else if (pos > j) {
                r[j] = a[j];
            }
            System.out.print(r[j] + ", ");
        }


    }
}
