import java.util.Scanner;

public class SortKillYourself {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        int a[] = new int[10];
        int count = 0;
        for (int i = 0; i <= 9; i++) {
            a[i] = (int) (Math.random() * (500 + 1));
            System.out.print(a[i] + ", ");
        }

        System.out.print("Insert a number (0 to 500): ");
        int number = xd.nextInt();
        if (number < 0 || number > 500) {
            System.out.print("Not valid number");
            System.exit(0);
        }

        for (int i = 0; i <= 9; i++) {
            if (number == a[i]) {
                count++;
                for (int j = 0; j <= 9; j++) {
                    a[j + 1] = 0;
                }
                a[0] = a[i];
            }
        }
        if (count == 0) {
            System.out.print("The number isn't in array");
            System.exit(0);
        }



    }
}
