import java.util.Scanner;
public class NoMatematicas {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        int a[] = new int[15];
        int m[] = new int[15];
        for (int i = 0; i <= 14; i++) {
            a[i] = (int) (Math.random() * (500 + 1));
            System.out.print(a[i] + ", ");
        }
        for (int j = 0; j <= 14; j++) {
            while (a[j] % 5 != 0) {
                a[j]++;
            }
            m[j] = a[j];
        }
        System.out.println("");
        for (int k = 0; k <= 14; k++) {
            System.out.print(m[k] + ", ");
        }
    }
}
