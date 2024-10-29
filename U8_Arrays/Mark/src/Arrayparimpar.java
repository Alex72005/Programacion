import java.util.Scanner;

public class Arrayparimpar {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        int a[] = new int[20];
        int par[] = new int[20];
        int imp[] = new int[20];
        int cpar = 0;
        int cimp = 0;
        System.out.print("Array: ");
        for (int i = 0; i <= 19; i++) {
            a[i] = (int) (Math.random() * (100 + 1));
            System.out.print(a[i] + ", ");
        }

        for (int i = 0; i <= 19; i++) {
            if (a[i] % 2 == 0) {
                par[cpar] = a[i];
                cpar++;
            }
            else {
                imp[cimp] = a[i];
                cimp++;
            }
        }
        System.out.println(" ");
        System.out.print("Pares: ");
        for (int i = 0; i < cpar; i++) {
            System.out.print(par[i] + ", ");
        }

        System.out.println(" ");
        System.out.print("Impares: ");
        for (int i = 0; i < cimp; i++) {
            System.out.print(imp[i] + ", ");
        }
    xd.close();
    }
    
}
