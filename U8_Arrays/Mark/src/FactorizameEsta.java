import java.util.Scanner;

public class FactorizameEsta {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        System.out.print("Inserte un número: ");
        int n = xd.nextInt();
        double f = 1;
        if (n < 0) {
            System.out.print("Número no válido.");
            System.exit(0);
        }
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }

        System.out.print("Su factorial es: " + f);
    }
}
